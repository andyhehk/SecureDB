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

package edu.hku.sdb.optimize;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.Type;
import edu.hku.sdb.exec.*;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.UnSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * The current optimizer assume that the whole query can be executed by the server.
 * It is not the case in reality. We need to consider split client/server execution
 * in the future.
 */
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
  public PlanNode optimize(ParseNode parseTree, Connection connection, DBMeta
          dbMeta) throws UnSupportedException {
    return optimizeInternal(parseTree, connection, dbMeta);
  }

  @Override
  protected PlanNode optimizeSelStmt(SelectStmt selStmt, Connection connection,
                                     DBMeta dbMeta) throws UnSupportedException {
    return  generatePlan(selStmt, connection, dbMeta);
  }

  private PlanNode generatePlan(SelectStmt selStmt, Connection connection,  DBMeta dbMeta) {
    String query = selStmt.toSql();
    RowDesc remoteRowDesc = new RowDesc();
    RowDesc localDecryptRowDesc = new RowDesc();

    List<ColumnDesc> remoteColDescList = new ArrayList<ColumnDesc>();
    List<ColumnDesc> localColDescList = new ArrayList<ColumnDesc>();

    SelectionItem rowID = selStmt.getSelectList().getRowID();

    for (SelectionItem selectionItem : selStmt.getSelectList().getItemList()) {
      LOG.debug("Creating decryption info for column: " + selectionItem.toString());
      // default columnName is ""
      String colName = "";
      String alias = selectionItem.getAlias();
      Expr expr = selectionItem.getExpr();
      Type type = expr.getType();
      // obtain columnName in case of FieldLiteral
      if (expr instanceof FieldLiteral) {
        colName = ((FieldLiteral) expr).getName();
      } else if (expr instanceof SdbArithmeticExpr) {
        colName = alias;
      } else if (expr instanceof NormalArithmeticExpr) {
        colName = expr.toSql();
      }

      //TODO fix alias
      if (alias.equals("")) {
        alias = colName;
      }

      // get column keys for sensitive columns
      ColumnKey colKey = expr.getColKey();
      boolean isSensitive = expr.involveSdbEncrytedCol();

      // create column desc for remoteSQL
      ColumnDesc remoteColDesc = new ColumnDesc(colName, alias, type, isSensitive,
              colKey);
      remoteColDescList.add(remoteColDesc);

      // create column desc for local decryption
      ColumnDesc localColDesc = new ColumnDesc(colName, alias, type, isSensitive,
              colKey);
      localColDescList.add(localColDesc);
    }

    // insert Row ID if involved encrypted column.
    if (selStmt.involveSdbEncrytedCol()){
      if(rowID == null) {
      LOG.error("No rowID return by the server query");
      return null;
      } else {
        remoteColDescList.add(new ColumnDesc(ColumnDefinition.ROW_ID_COLUMN_NAME,
                ColumnDefinition.ROW_ID_COLUMN_NAME, Type.INT, true, rowID.getExpr().getColKey()));
      }
    }

    // create remoteSQL Node
    remoteRowDesc.setSignature(remoteColDescList);
    RemoteQuery remoteQuery = new RemoteQuery(query, connection, remoteRowDesc);

    // create localDecrypt Node
    localDecryptRowDesc.setSignature(localColDescList);
    LocalDecrypt localDecrypt = new LocalDecrypt(localDecryptRowDesc);
    localDecrypt.setChild(remoteQuery);
    localDecrypt.setCredential(new BigInteger(dbMeta.getPrime1()), new BigInteger
            (dbMeta.getPrime2()), new BigInteger(dbMeta.getN()), new BigInteger
            (dbMeta.getG()));
    return localDecrypt;
  }

}
