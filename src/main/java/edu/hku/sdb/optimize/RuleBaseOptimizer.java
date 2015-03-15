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
import edu.hku.sdb.exec.*;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.UnSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

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
  public PlanNode optimize(ParseNode parseTree) throws UnSupportedException {
    return optimizeInternal(parseTree);
  }

  @Override
  protected PlanNode optimizeSelStmt(SelectStmt selStmt) throws UnSupportedException {

    String query = selStmt.toSql().toLowerCase();
    RowDesc remoteRowDesc = new RowDesc();
    RowDesc localDecryptRowDesc = new RowDesc();

    List<BasicColumnDesc> basicColumnDescList = new ArrayList<BasicColumnDesc>();
    List<BasicColumnDesc> columnDescList = new ArrayList<BasicColumnDesc>();

    for (SelectionItem selectionItem : selStmt.getSelectList().getItemList()){
      String alias = selectionItem.getAlias();
      Expr expr = selectionItem.getExpr();
      //TODO: get column name & clazz
      String columnName = "";
      Class clazz = String.class;
      //Only obtain columnName in case of FieldLiteral
      if (expr instanceof FieldLiteral){
        columnName = ((FieldLiteral) expr).getName();
        if (((FieldLiteral) expr).getType().equals(DataType.INT)){
          clazz = Integer.class;
        }
      }

      BasicColumnDesc basicColumnDesc = new BasicColumnDesc(columnName, alias, clazz);
      basicColumnDescList.add(basicColumnDesc);

      ColumnKey columnKey = expr.getColKey();
      boolean isSensitive = expr.involveSdbEncrytedCol();
      ColumnDesc columnDesc = new ColumnDesc(columnName, alias, clazz, isSensitive, columnKey);
      columnDescList.add(columnDesc);
    }

    remoteRowDesc.setSignature(basicColumnDescList);
    localDecryptRowDesc.setSignature(columnDescList);

    RemoteSQL remoteSQL = new RemoteSQL(query, remoteRowDesc);
    LocalDecrypt localDecrypt = new LocalDecrypt(localDecryptRowDesc);
    localDecrypt.setChild(remoteSQL);
    return localDecrypt;
  }


}
