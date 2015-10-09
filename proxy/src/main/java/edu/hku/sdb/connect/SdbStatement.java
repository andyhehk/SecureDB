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
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.conf.ServerType;
import edu.hku.sdb.exec.*;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.*;
import edu.hku.sdb.upload.Uploader;
import edu.hku.sdb.upload.UploaderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class SdbStatement extends UnicastRemoteObject implements Statement,
        Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(SdbStatement.class);

  private static final long serialVersionUID = 427L;

  private SemanticAnalyzer semanticAnalyzer;
  private ParseDriver parser;
  private AbstractRewriter rewriter;
  private Optimizer optimizer;
  private Executor executor;
  private SdbResultSet sdbResultSet;
  private SDBProfiler sdbProfiler;

  private MetaStore metaDB;
  private ServerConnection serverConnection;
  private DBMeta dbMeta;
  private ServerConf serverConf;
  private String serverDBName;

  public SdbStatement(MetaStore metaDB, ServerConnection serverConnection, String
          serverDBName, ServerConf serverConf) throws RemoteException {
    super();
    this.serverDBName = serverDBName;
    this.dbMeta = metaDB.getDB(serverDBName);
    this.serverConf = serverConf;
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
      sdbResultSet = getSdbResultSet(getLoadPlanNode((LoadStmt) analyzedNode));

    } else if (analyzedNode instanceof ShowTBLsStmt) {
      sdbResultSet = getSdbResultSet(getShowTblsPlanNode((ShowTBLsStmt)
              analyzedNode));
    } else if (analyzedNode instanceof DescribeStmt) {
      sdbResultSet = getSdbResultSet(getDescribeTblPlanNode((DescribeStmt)
              analyzedNode));
    } else if (analyzedNode instanceof DropTblStmt) {
      sdbResultSet = getSdbResultSet(getDropTblPlanNode((DropTblStmt) analyzedNode));
    } else {

      long rewriteStartTimestamp = System.currentTimeMillis();
      // Rewrite
      rewriteNode(analyzedNode);
      long rewriteEndTimestamp = System.currentTimeMillis();
      sdbProfiler.setClientRewriteTime(rewriteEndTimestamp - rewriteStartTimestamp);

      PlanNode planNode;

      // No need to optimize a create stmt
      if (analyzedNode instanceof CreateStmt) {
        planNode = getCreateTblPlanNode((CreateStmt) analyzedNode,
                serverConnection, metaDB);
      } else {
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
      sdbProfiler.setClientExecuteTime(sdbProfiler.getExecuteTime() - sdbResultSet
              .getServerTotalTime());
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
    if (serverConf.getType() == ServerType.HIVE)
      rewriter = new SdbSchemeRewriter(dbMeta, new HiveRewriter(dbMeta));
    else if (serverConf.getType() == ServerType.ODPS)
      rewriter = new SdbSchemeRewriter(dbMeta, new ODPSRewriter(dbMeta));
    else {
      LOG.error("Unsupported server type: " + serverConf.getType());
      System.exit(-1);
    }
    try {
      rewriter.rewrite(analyzedNode);
      LOG.info("The finial rewritten query: " + analyzedNode.toSql());
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
    semanticAnalyzer = new SemanticAnalyzer(metaDB.getDB(serverDBName));
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

  public ServerConnection getServerConnection() {
    return serverConnection;
  }

  public void setServerConnection(ServerConnection serverConnection) {
    this.serverConnection = serverConnection;
  }

  private PlanNode getCreateTblPlanNode(CreateStmt createStmt, ServerConnection
          connection, MetaStore metaStore) {

    String query = createStmt.toSql();
    RowDesc localCreateRowDesc = new RowDesc();
    List<ColumnDesc> columnDescList = new ArrayList<ColumnDesc>();

    for (ColumnDefinition colDefinition : createStmt.getColumnDefinitions()) {
      ColumnDesc columnDesc;
      Type type;
      String columnName = colDefinition.getName();
      String alias = "";
      boolean isSen = colDefinition.isSDBEncrypted();
      type = colDefinition.getOriginType();
      SdbColumnKey sdbColumnKey = colDefinition.getSDBColumnKey();
      SearchColumnKey searchColumnKey = colDefinition.getSearchColKey();
      // Only support encryption for scalar type.
      if (type instanceof ScalarType) {
        switch (((ScalarType) type).getType()) {
          case INT:
          case TINYINT:
          case BIGINT:
          case SMALLINT:
          case DECIMAL:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen,
                    sdbColumnKey);
            break;
          case CHAR:
          case VARCHAR:
          case STRING:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen,
                    searchColumnKey);
            break;
          default:
            columnDesc = new ColumnDesc(columnName, alias, type, isSen, null);
            break;
        }
      } else
        columnDesc = new ColumnDesc(columnName, alias, type, isSen, null);
      columnDescList.add(columnDesc);
    }
    localCreateRowDesc.setSignature(columnDescList);

    RemoteUpdate remoteUpdate = new RemoteUpdate(query, connection);
    LocalCreate localCreate = new LocalCreate(metaStore, serverDBName, createStmt
            .getTableName(),
            localCreateRowDesc);
    localCreate.addChild(remoteUpdate);
    return localCreate;
  }

  private PlanNode getLoadPlanNode(LoadStmt loadStmt) throws RemoteException {
    // another programme encrypts & uploads the data
    String tableName = loadStmt.getTableName();
    Uploader uploader = UploaderFactory.getUploader(metaDB, tableName, serverConf);
    String sourceFilePath = loadStmt.getFilePath();
    uploader.setSourceFilePath(sourceFilePath);
    uploader.upload();

    // Point it to the file created by uploader.
    String loadQuery = null;
    String serverFilePath = uploader.getServerFilePath();
    if(serverFilePath != null) {
      loadStmt.setFilePath(uploader.getServerFilePath());
      loadQuery = loadStmt.toSql();
      LOG.info(loadQuery);
    } else {
      LOG.info("No load statement executed on Server");
    }

    RemoteUpdate remoteUpdate = new RemoteUpdate(loadQuery, serverConnection);

    return remoteUpdate;
  }

  private PlanNode getShowTblsPlanNode(ShowTBLsStmt showTBLsStmt) throws
          RemoteException {
    RowDesc rowDesc = new RowDesc();
    List<ColumnDesc> columnDescs = new ArrayList<>();

    ColumnDesc columnDesc = new ColumnDesc("Table Name", "", null, false, null);
    columnDescs.add(columnDesc);
    rowDesc.setSignature(columnDescs);

    PlanNode localShowTBLs = new LocalShowTBLs(dbMeta, rowDesc);

    return localShowTBLs;
  }

  private PlanNode getDescribeTblPlanNode(DescribeStmt describeStmt) throws
          RemoteException {
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

    return localDescTBL;
  }

  private PlanNode getDropTblPlanNode(DropTblStmt dropTblStmt) throws
          RemoteException {
    String tblName = dropTblStmt.getTblName();

    PlanNode localDropTBL = new LocalDropTBL(metaDB, dbMeta.getName(), tblName,
            null);

    RemoteUpdate remoteUpdate = new RemoteUpdate(dropTblStmt.toSql(),
            serverConnection);

    localDropTBL.addChild(remoteUpdate);

    return localDropTBL;
  }
}
