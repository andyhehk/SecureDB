/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.connect;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.DbConf;
import edu.hku.sdb.exec.*;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.RewriteException;
import edu.hku.sdb.rewrite.SdbSchemeRewriter;
import edu.hku.sdb.rewrite.UnSupportedException;
import edu.hku.sdb.upload.UploadHandler;
import edu.hku.sdb.utility.ProfileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SdbStatement extends UnicastRemoteObject implements Statement,
        Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(SdbStatement.class);

  private static final long serialVersionUID = 427L;

  private SemanticAnalyzer semanticAnalyzer;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private Optimizer optimizer;
  private Executor executor;
  private SdbResultSet sdbResultSet;
  private SDBProfiler sdbProfiler;

  private MetaStore metaDB;
  private Connection serverConnection;
  private DBMeta dbMeta;

  public SdbStatement(MetaStore metaDB, Connection serverConnection, DBMeta dbMeta) throws RemoteException {
    super();
    this.dbMeta = dbMeta;
    setMetaDB(metaDB);
    setServerConnection(serverConnection);
  }


  @Override
  public ResultSet executeQuery(String query) throws RemoteException {

    LOG.info("Executing query: " + query);

    sdbProfiler = new SDBProfiler();
    // get execution start time
    long startTimeStamp = System.currentTimeMillis();

    // Parse & analyse
    ParseNode analyzedNode = getParseNode(query);

    if (analyzedNode instanceof LoadStmt) {
      // another programme encrypts & uploads the data
      TableName tableName = ((LoadStmt) analyzedNode).getTableName();
      UploadHandler uploadHandler = new UploadHandler(metaDB, tableName);
      String sourceFilePath = ((LoadStmt) analyzedNode).getFilePath();
      uploadHandler.setSourceFile(sourceFilePath);

      //TODO should read from config file instead of hard code
      String serverFilePath = "/user/andy/" + tableName.getName() + new Random().nextInt(60000) + ".txt";
      String hdfsURL = "hdfs://localhost:9000";
      uploadHandler.setHDFS_URL(hdfsURL);
      uploadHandler.setHDFS_FILE_PATH(hdfsURL + serverFilePath);

      LOG.info("Loading data from "  + sourceFilePath + " to server " + hdfsURL);

      ProfileUtil profileUtil = new ProfileUtil();
      uploadHandler.upload();
      LOG.info("Upload time: " + profileUtil.getDuration());

      ((LoadStmt) analyzedNode).setFilePath(hdfsURL + serverFilePath);
      String loadQuery = analyzedNode.toSql();
      LOG.info(loadQuery);
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
      long rewriteEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientRewriteTime(rewriteEndTimestamp - rewriteStartTimestamp);

      PlanNode planNode;

      // No need to optimize a create stmt
      if(analyzedNode instanceof CreateStmt) {
        planNode = getCreateStmtPkanNode((CreateStmt) analyzedNode, serverConnection, metaDB);
      }
      else {
        // Optimize
        planNode = getPlanNode(analyzedNode);

      }

      // Execute
      sdbResultSet = getSdbResultSet(planNode);

      // get execution end time
      setExecutionTime(startTimeStamp);

      LOG.info(sdbProfiler.toString());

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
    LOG.info("Optimizing query");
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = null;
    try {
      planNode = optimizer.optimize(analyzedNode, serverConnection, dbMeta);
    } catch (UnSupportedException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    }
    LOG.info("Finish optimizing query");
    return planNode;
  }

  private SdbResultSet getSdbResultSet(PlanNode planNode) throws RemoteException {
    LOG.info("Executing query");
    long executeStartTimestamp = System.currentTimeMillis();
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);
    long executeEndTimestamp = System.currentTimeMillis();
    sdbProfiler.setExecuteTime(executeEndTimestamp - executeStartTimestamp);
    LOG.info("Finishing query");
    return resultSet;
  }

  private void rewriteNode(ParseNode analyzedNode) throws RemoteException {

    LOG.info("Rewriting query: " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(dbMeta);
    try {
      sdbSchemeRewriter.rewrite(analyzedNode);
      LOG.info("The finial ewritten query: " + analyzedNode.toSql());
    } catch (UnSupportedException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    } catch (RewriteException e) {
      e.printStackTrace();
    }
  }

  private ParseNode getParseNode(String query) throws RemoteException {
    LOG.info("Parsing " + query);

    long parseStartTimestamp = System.currentTimeMillis();

    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
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

  public MetaStore getMetaDB() {
    return metaDB;
  }

  public void setMetaDB(MetaStore metaDB) {
    this.metaDB = metaDB;
  }

  public Connection getServerConnection() {
    return serverConnection;
  }

  public void setServerConnection(Connection serverConnection) {
    this.serverConnection = serverConnection;
  }

  protected PlanNode getCreateStmtPkanNode(CreateStmt createStmt, Connection connection, MetaStore metaStore) {

    String query = createStmt.toSql().toLowerCase();
    RowDesc localCreateRowDesc = new RowDesc();
    List<BasicColumnDesc> columnDescList = new ArrayList<BasicColumnDesc>();
    TableName tableName = null;

    for (BasicFieldLiteral fieldLiteral : createStmt.getFieldList()) {
      BasicColumnDesc basicColumnDesc = null;
      Class clazz = null;
      tableName = fieldLiteral.getTableName();
      String columnName = fieldLiteral.getName();
      String alias = "";
      boolean isSen = fieldLiteral.isSen();
      if (isSen) {
        clazz = Integer.class;
        ColumnKey columnKey = fieldLiteral.getColumnKey();
        basicColumnDesc = new ColumnDesc(columnName, alias, clazz, true, columnKey);
      } else {
        switch (fieldLiteral.getType().getDataType()) {
          case INT:
            clazz = Integer.class;
            break;
          default:
            clazz = String.class;
        }
        basicColumnDesc = new BasicColumnDesc(columnName, alias, clazz);
      }
      columnDescList.add(basicColumnDesc);

    }
    localCreateRowDesc.setSignature(columnDescList);

    RemoteUpdate remoteUpdate = new RemoteUpdate(query, connection);
    LocalCreate localCreate = new LocalCreate(metaStore, tableName, localCreateRowDesc);
    CreateTbl createTbl = new CreateTbl(remoteUpdate, localCreate);
    return createTbl;
  }
}
