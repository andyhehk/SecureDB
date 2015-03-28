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

package edu.hku.sdb.optimize;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.exec.*;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.UnSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static edu.hku.sdb.catalog.DataType.*;

public class RuleBaseOptimizer extends Optimizer {

  private static final Logger LOG = LoggerFactory
          .getLogger(RuleBaseOptimizer.class);

  /**
   * 
   */
  public RuleBaseOptimizer() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.optimize.Optimizer#optimize(edu.hku.sdb.parse.ParseNode)
   */
  public PlanNode optimize(ParseNode parseTree, Connection connection, MetaStore metaStore) throws UnSupportedException {
    return optimizeInternal(parseTree, connection, metaStore);
  }

  @Override
  protected PlanNode optimizeCreateStmt(CreateStmt createStmt, Connection connection, MetaStore metaStore) throws UnSupportedException {

    String query = createStmt.toSql().toLowerCase();
    RowDesc localCreateRowDesc = new RowDesc();
    List<BasicColumnDesc> columnDescList = new ArrayList<BasicColumnDesc>();
    TableName tableName = null;

    for (BasicFieldLiteral fieldLiteral: createStmt.getFieldList()){
      if (fieldLiteral.isSen()){
        tableName = fieldLiteral.getTableName();
        String columnName = fieldLiteral.getName();
        Class clazz = Integer.class;
        String alias = "";
        ColumnKey columnKey = fieldLiteral.getColumnKey();
        ColumnDesc columnDesc = new ColumnDesc(columnName, alias, clazz, true, columnKey);
        columnDescList.add(columnDesc);
      }
    }
    localCreateRowDesc.setSignature(columnDescList);

    RemoteUpdate remoteUpdate = new RemoteUpdate(query, connection);
    LocalCreate localCreate = new LocalCreate(metaStore, tableName);
    CreateTbl createTbl = new CreateTbl(remoteUpdate, localCreate);
    return createTbl;
  }

  @Override
  protected PlanNode optimizeSelStmt(SelectStmt selStmt, Connection connection, MetaStore metaStore) throws UnSupportedException {

    String query = selStmt.toSql().toLowerCase();
    RowDesc remoteRowDesc = new RowDesc();
    RowDesc localDecryptRowDesc = new RowDesc();

    List<BasicColumnDesc> basicColumnDescList = new ArrayList<BasicColumnDesc>();
    List<BasicColumnDesc> columnDescList = new ArrayList<BasicColumnDesc>();

    for (SelectionItem selectionItem : selStmt.getSelectList().getItemList()){

      // default columnName is ""
      String columnName = "";
      // default column clazz is Integer
      Class clazz = Integer.class;
      String alias = selectionItem.getAlias();
      Expr expr = selectionItem.getExpr();
      // obtain columnName in case of FieldLiteral
      if (expr instanceof FieldLiteral){
        columnName = ((FieldLiteral) expr).getName();
        // obtain clazz information
        switch (((FieldLiteral) expr).getType()){
          case CHAR: clazz = String.class; break;
          case INT:
          default:  clazz = Integer.class;
        }
      }
      // create column desc for remoteSQL
      BasicColumnDesc basicColumnDesc = new BasicColumnDesc(columnName, alias, clazz);
      basicColumnDescList.add(basicColumnDesc);

      // get column keys for sensitive columns for localDecrypt
      ColumnKey columnKey = expr.getColKey();
      boolean isSensitive = expr.involveSdbEncrytedCol();
      // add column descriptor for localDecrypt
      ColumnDesc columnDesc = new ColumnDesc(columnName, alias, clazz, isSensitive, columnKey);
      columnDescList.add(columnDesc);
    }

    // create remoteSQL Node
    remoteRowDesc.setSignature(basicColumnDescList);
    RemoteQuery remoteQuery = new RemoteQuery(query, connection, remoteRowDesc);

    // create localDecrypt Node
    localDecryptRowDesc.setSignature(columnDescList);
    LocalDecrypt localDecrypt = new LocalDecrypt(localDecryptRowDesc);
    localDecrypt.setChild(remoteQuery);
    localDecrypt.setCredential(selStmt.getP(), selStmt.getQ(), selStmt.getN(), selStmt.getG());
    return localDecrypt;
  }

}
