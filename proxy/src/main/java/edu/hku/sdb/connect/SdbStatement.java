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

import edu.hku.sdb.catalog.*;
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
      sdbResultSet = executeLoadStmt((LoadStmt) analyzedNode);

    }
    else if (analyzedNode instanceof ShowTBLsStmt) {
      sdbResultSet = executeShowTBLsStmt((ShowTBLsStmt) analyzedNode);
    }
    else if (analyzedNode instanceof DescribeStmt) {
      sdbResultSet = executeDescribeStmt((DescribeStmt) analyzedNode);
    }
    else if (analyzedNode instanceof DropTblStmt) {
      sdbResultSet = executeDropTblStmt((DropTblStmt) analyzedNode);
    }
    else {

      long rewriteStartTimestamp = System.currentTimeMillis();
      // Rewrite
      rewriteNode(analyzedNode);
      long rewriteEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientRewriteTime(rewriteEndTimestamp - rewriteStartTimestamp);

      PlanNode planNode;

      // No need to optimize a create stmt
      if(analyzedNode instanceof CreateStmt) {
        planNode = getCreateStmtPlanNode((CreateStmt) analyzedNode,
                serverConnection, metaDB);
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

    }
    return sdbResultSet;
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
      LOG.info("The finial rewritten query: " + analyzedNode.toSql());
    } catch (UnSupportedException e) {
      e.printStackTrace();
      throw new RemoteException(e.getMessage());
    } catch (RewriteException e) {
      e.printStackTrace();
    }
  }

  private ParseNode getParseNode(String query) throws RemoteException  {
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
      throw new RemoteException(e.getMessage());
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
    return sdbResultSet;
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

  protected PlanNode getCreateStmtPlanNode(CreateStmt createStmt, Connection
          connection, MetaStore metaStore) {

    String query = createStmt.toSql();
    RowDesc localCreateRowDesc = new RowDesc();
    List<ColumnDesc> columnDescList = new ArrayList<ColumnDesc>();
    TableName tableName = null;

    for (ColumnDefinition colDefinition : createStmt.getColumnDefinitions()) {
      ColumnDesc columnDesc;
      Type type;
      tableName = colDefinition.getTableName();
      String columnName = colDefinition.getName();
      String alias = "";
      boolean isSen = colDefinition.isSDBEncrypted();
      type = colDefinition.getOriginType();
      SdbColumnKey sdbColumnKey = colDefinition.getSDBColumnKey();
      SearchColumnKey searchColumnKey = colDefinition.getSearchColKey();
      // Only support encryption for scalar type.
      if(type instanceof ScalarType) {
        switch (((ScalarType) type).getType()) {
          case INT:
          case TINYINT:
          case BIGINT:
          case SMALLINT:
          case DECIMAL:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen, sdbColumnKey);
            break;
          case CHAR:
          case VARCHAR:
          case STRING:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen, searchColumnKey);
            break;
          default:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen, null);
            break;
        }
      }
      else
        columnDesc = new ColumnDesc(columnName, alias, type, isSen, null);
      columnDescList.add(columnDesc);
    }
    localCreateRowDesc.setSignature(columnDescList);

    RemoteUpdate remoteUpdate = new RemoteUpdate(query, connection);
    LocalCreate localCreate = new LocalCreate(metaStore, tableName, localCreateRowDesc);
    CreateTbl createTbl = new CreateTbl(remoteUpdate, localCreate);
    return createTbl;
  }

  public SdbResultSet executeLoadStmt(LoadStmt loadStmt) throws RemoteException {
    // another programme encrypts & uploads the data
    TableName tableName = loadStmt.getTableName();
    UploadHandler uploadHandler = new UploadHandler(metaDB, tableName);
    String sourceFilePath = loadStmt.getFilePath();
    uploadHandler.setSourceFile(sourceFilePath);

    final String hdfsURL = System.getenv("HDFS_URL");
    final String userDIR = System.getenv("HDFS_USER_DIR");

    if(hdfsURL == null) {
      LOG.error("Please specify the HDFS URL!");
      System.exit(1);
    }

    if(userDIR == null) {
      LOG.error("Please specify the user directory in HDFS!");
      System.exit(1);
    }

    String serverFilePath = userDIR + "/" + tableName.getName() + new Random().nextInt(60000) + ".txt";
    uploadHandler.setHDFS_URL(hdfsURL);
    uploadHandler.setHDFS_FILE_PATH(hdfsURL + serverFilePath);

    LOG.info("Loading data from "  + sourceFilePath + " to server " + hdfsURL);

    ProfileUtil profileUtil = new ProfileUtil();
    uploadHandler.upload();
    LOG.info("Upload time: " + profileUtil.getDuration());

    loadStmt.setFilePath(serverFilePath);
    String loadQuery = loadStmt.toSql();
    LOG.info(loadQuery);
    try {
      java.sql.Statement statement = serverConnection.createStatement();
      statement.executeUpdate(loadQuery);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public SdbResultSet executeShowTBLsStmt(ShowTBLsStmt showTBLsStmt) throws RemoteException {
    RowDesc rowDesc = new RowDesc();
    List<ColumnDesc> columnDescs = new ArrayList<>();

    ColumnDesc columnDesc = new ColumnDesc("Table Name", "", null, false, null);
    columnDescs.add(columnDesc);
    rowDesc.setSignature(columnDescs);

    PlanNode localShowTBLs = new LocalShowTBLs(dbMeta, rowDesc);

    return getSdbResultSet(localShowTBLs);
  }

  public SdbResultSet executeDescribeStmt(DescribeStmt describeStmt) throws RemoteException {
    RowDesc rowDesc = new RowDesc();
    List<ColumnDesc> columnDescs = new ArrayList<>();

    ColumnDesc columnDesc = new ColumnDesc("Column Name", "", null, false, null);
    columnDescs.add(columnDesc);
    columnDesc = new ColumnDesc("Data Type", "", null, false, null);
    columnDescs.add(columnDesc);
    columnDesc = new ColumnDesc("Sensitive", "", null, false, null);
    columnDescs.add(columnDesc);
    rowDesc.setSignature(columnDescs);

    String tblName = describeStmt.getTblName();

    TableMeta tblMeta = metaDB.getTbl(dbMeta.getName(), tblName);

    PlanNode localDescTBL = new LocalDescTBL(tblMeta, rowDesc);

    return getSdbResultSet(localDescTBL);
  }

  public SdbResultSet executeDropTblStmt(DropTblStmt dropTblStmt) throws RemoteException {
    String tblName = dropTblStmt.getTblName();

    PlanNode localDropTBL = new LocalDropTBL(metaDB,dbMeta.getName(), tblName, null);

    RemoteUpdate remoteUpdate = new RemoteUpdate(dropTblStmt.toSql(), serverConnection);

    localDropTBL.addChild(remoteUpdate);

    return getSdbResultSet(localDropTBL);
  }
}
