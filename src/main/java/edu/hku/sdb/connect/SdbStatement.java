/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.connect;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.ConnectionConf;
import edu.hku.sdb.exec.ExecutionState;
import edu.hku.sdb.exec.Executor;
import edu.hku.sdb.exec.PlanNode;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.SdbSchemeRewriter;
import edu.hku.sdb.rewrite.UnSupportedException;
import edu.hku.sdb.upload.UploadHandler;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.sql.Connection;
import java.util.Random;

public class SdbStatement extends UnicastRemoteObject implements Statement,
    Serializable {

  private static final long serialVersionUID = 427L;

  private SemanticAnalyzer semanticAnalyzer;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private Optimizer optimizer;
  private Executor executor;
  private SdbResultSet sdbResultSet;
  private SDBProfiler sdbProfiler;

  private MetaStore metaDb;
  private Connection serverConnection;

  public SdbStatement(MetaStore metaDb, Connection serverConnection) throws RemoteException{
    super();
    setMetaDb(metaDb);
    setServerConnection(serverConnection);
  }


  @Override
  public ResultSet executeQuery(String query) throws RemoteException  {

    sdbProfiler = new SDBProfiler();
    // get execution start time
    long startTimeStamp = System.currentTimeMillis();

    // Parse & analyse
    ParseNode analyzedNode = getParseNode(query);

    if (analyzedNode instanceof LoadStmt){

      // another programme encrypts & uploads the data
      TableName tableName = ((LoadStmt) analyzedNode).getTableName();
      UploadHandler uploadHandler = new UploadHandler(metaDb, tableName);
      String sourceFilePath = ((LoadStmt) analyzedNode).getFilePath();
      uploadHandler.setSourceFile(sourceFilePath);

      //TODO should read from config file instead of hard code
      String serverFilePath = "/user/yifan/" + tableName.getName() + new Random().nextInt(60000) + ".txt";
      uploadHandler.setHDFS_URL("hdfs://localhost:9000");
      uploadHandler.setHDFS_FILE_PATH("hdfs://localhost:9000" + serverFilePath);

      uploadHandler.upload();

      ((LoadStmt) analyzedNode).setFilePath(serverFilePath);
      String loadQuery = analyzedNode.toSql();
      System.out.println(loadQuery);
      try {
        java.sql.Statement statement = serverConnection.createStatement();
        statement.executeUpdate(loadQuery);
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return null;

    } else {

      long rewriteStartTimestamp = System.currentTimeMillis();
      // Rewrite
      rewriteNode(analyzedNode);

      // Optimize
      PlanNode planNode = getPlanNode(analyzedNode);

      long rewriteEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientRewriteTime(rewriteEndTimestamp - rewriteStartTimestamp);


      // Execute
      sdbResultSet = getSdbResultSet(planNode);

      // get execution end time
      setExecutionTime(startTimeStamp);

      System.out.println(sdbProfiler.toString());

      return sdbResultSet;
    }
  }

  private void setExecutionTime(long startTimeStamp) {
    long endTimeStamp = System.currentTimeMillis();
    long totalTime = endTimeStamp - startTimeStamp;
    sdbProfiler.setTotalTime(totalTime);
    try {
      long serverTotalTime = sdbResultSet.getServerTotalTime();
      sdbProfiler.setServerTotalTime(serverTotalTime);
      sdbProfiler.setClientTotalTime(totalTime - serverTotalTime);
      sdbProfiler.setClientExecuteTime(sdbProfiler.getExecuteTime() - sdbResultSet.getServerTotalTime());
      sdbResultSet.setSdbProfiler(sdbProfiler);
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }

  private PlanNode getPlanNode(ParseNode analyzedNode) throws RemoteException {
    System.out.println("Optimizing " + analyzedNode.toSql());
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = null;
    try {
      planNode = optimizer.optimize(analyzedNode, serverConnection, metaDb);
    } catch (UnSupportedException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    }
    System.out.println("Plan Node generated.\n");
    return planNode;
  }

  private SdbResultSet getSdbResultSet(PlanNode planNode) throws RemoteException {
    System.out.println("Executing ..." );
    long executeStartTimestamp = System.currentTimeMillis();
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);
    long executeEndTimestamp = System.currentTimeMillis();
    sdbProfiler.setExecuteTime(executeEndTimestamp - executeStartTimestamp);
    System.out.println("Execution Done.");
    return resultSet;
  }

  private void rewriteNode(ParseNode analyzedNode) throws RemoteException {

    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDb.getAllDBs().get(0));
    try {
      sdbSchemeRewriter.rewrite(analyzedNode);

    } catch (UnSupportedException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    }
  }

  private ParseNode getParseNode(String query) throws RemoteException {
    System.out.println("Parsing " + query);

    long parseStartTimestamp = System.currentTimeMillis();

    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDb);
    ASTNode parsedNode = null;
    ParseNode analyzedNode = null;
    try {
      parsedNode = parser.parse(query);
      long parseEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientParseTime(parseEndTimestamp - parseStartTimestamp);
      analyzedNode = semanticAnalyzer.analyze(parsedNode);
      long analyseEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientAnalyseTime(analyseEndTimestamp - parseEndTimestamp);
    } catch (ParseException e) {
      e.printStackTrace();
    } catch (SemanticException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    }
    return analyzedNode;
  }

  public void close() {

  }

  @Override
  public Profiler getProfiler() throws RemoteException {
    return (Profiler) sdbResultSet;
  }

  public MetaStore getMetaDb() {
    return metaDb;
  }

  public void setMetaDb(MetaStore metaDb) {
    this.metaDb = metaDb;
  }

  public Connection getServerConnection() {
    return serverConnection;
  }

  public void setServerConnection(Connection serverConnection) {
    this.serverConnection = serverConnection;
  }
}
