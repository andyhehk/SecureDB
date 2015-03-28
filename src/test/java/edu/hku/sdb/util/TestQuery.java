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

package edu.hku.sdb.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.ColumnMeta;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;
import edu.hku.sdb.parse.NormalArithmeticExpr.Operator;

public class TestQuery {

  public static String dbName = "dummy_db";
  
  public static List<ColumnMeta> createColMeta() {
    
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta col1 = new ColumnMeta(dbName, "T1", "id", DataType.INT, true,
        new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col2 = new ColumnMeta(dbName, "T1", "a", DataType.INT, true,
        new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col3 = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
        new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col4 = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
        new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    
    cols.add(col1);
    cols.add(col2);
    cols.add(col3);
    cols.add(col4);
    
    return cols;
  }
  
  /**
   * Prepare a selection statement with a single join operator.
   * 
   * @return
   */
  public static ParseNode prepareAnsJoin() {
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();

    NormalArithmeticExpr arithExpr = new NormalArithmeticExpr(Operator.ADD);
    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
        new ColumnKey("1", "3"));
    a.setUp2date(true);
    b.setUp2date(true);
    arithExpr.addChild(a);
    arithExpr.addChild(b);
    selectList.getItemList().add(new SelectionItem(arithExpr, ""));

    Expr whereClause = new NormalBinPredicate(BinOperator.GT, a,
        new FloatLiteral("1.0"));

    BaseTableRef tbl1 = new BaseTableRef("T1", "");
    BaseTableRef tbl2 = new BaseTableRef("T2", "");

    tbl1.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setLeftTblRef(tbl1);
    NormalBinPredicate onClause = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral id1 = new FieldLiteral("T1", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral id2 = new FieldLiteral("T2", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    id1.setUp2date(true);
    id2.setUp2date(true);
    onClause.addChild(id1);
    onClause.addChild(id2);
    tbl2.setOnClause(onClause);
    tableRefs.add(tbl1);
    tableRefs.add(tbl2);

    selStmt.setSelectList(selectList);
    selStmt.setTableRefs(tableRefs);
    selStmt.setWhereClause(whereClause);

    return selStmt;
  }
  
  
  /**
   * Prepare a selection statement with a single join and a group-by.
   * 
   * @return
   */
  public static ParseNode prepareAnsJoinGroupBy() {
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();
    List<Expr> groupingExprs = new ArrayList<Expr>();

    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    a.setUp2date(true);
    
    FunctionCallStarExpr func = new FunctionCallStarExpr("count");
    
    selectList.getItemList().add(new SelectionItem(a, ""));
    selectList.getItemList().add(new SelectionItem(func, ""));

    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
        new ColumnKey("1", "3"));
    b.setUp2date(true);
    Expr whereClause = new NormalBinPredicate(BinOperator.GT, b,
        new FloatLiteral("1.0"));

    BaseTableRef tbl1 = new BaseTableRef("T1", "");
    BaseTableRef tbl2 = new BaseTableRef("T2", "");

    tbl1.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setLeftTblRef(tbl1);
    NormalBinPredicate onClause = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral id1 = new FieldLiteral("T1", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral id2 = new FieldLiteral("T2", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    id1.setUp2date(true);
    id2.setUp2date(true);
    onClause.addChild(id1);
    onClause.addChild(id2);
    tbl2.setOnClause(onClause);
    tableRefs.add(tbl1);
    tableRefs.add(tbl2);
    
    FieldLiteral group_a = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    group_a.setReferedExpr(a);
    group_a.setUp2date(true);
    groupingExprs.add(group_a);

    selStmt.setSelectList(selectList);
    selStmt.setTableRefs(tableRefs);
    selStmt.setWhereClause(whereClause);
    selStmt.setGroupingExprs(groupingExprs);

    return selStmt;
  }
  
  /**
   * Prepare a selection statement with a nested query.
   * 
   * @return
   */
  public static ParseNode prepareAnsNested() {

    // Prepare the sub_query first
    BaseTableRef sub_tbl = new BaseTableRef("T1", "");
    SelectStmt sub_selStmt = new SelectStmt();

    SelectionList sub_selectList = new SelectionList();
    List<TableRef> sub_tableRefs = new ArrayList<TableRef>();

    FieldLiteral sub_id = new FieldLiteral("T1", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    sub_id.setUp2date(true);

    NormalArithmeticExpr sub_arithExpr = new NormalArithmeticExpr(
        Operator.MULTIPLY);
    FieldLiteral sub_a1 = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral sub_a2 = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    sub_a1.setUp2date(true);
    sub_a2.setUp2date(true);
    sub_arithExpr.addChild(sub_a1);
    sub_arithExpr.addChild(sub_a2);

    sub_selectList.getItemList().add(new SelectionItem(sub_id, ""));
    sub_selectList.getItemList().add(new SelectionItem(sub_arithExpr, "a"));

    sub_tableRefs.add(sub_tbl);

    sub_selStmt.setSelectList(sub_selectList);
    sub_selStmt.setTableRefs(sub_tableRefs);

    InLineViewRef view = new InLineViewRef("temp1", sub_selStmt);

    // Prepare the outer query
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();

    FieldLiteral a = new FieldLiteral("temp1", "a", DataType.UNKNOWN, false,
        null);
    a.setReferedExpr(sub_arithExpr);
    Expr whereClause = new NormalBinPredicate(BinOperator.GT, a,
        new FloatLiteral("1.0"));

    NormalArithmeticExpr arithExpr = new NormalArithmeticExpr(Operator.ADD);
    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
        new ColumnKey("1", "3"));
    b.setUp2date(true);
    arithExpr.addChild(a);
    arithExpr.addChild(b);
    selectList.getItemList().add(new SelectionItem(arithExpr, ""));

    BaseTableRef tbl = new BaseTableRef("T2", "");

    view.setJoinOp(JoinOperator.INNER_JOIN);
    tbl.setJoinOp(JoinOperator.INNER_JOIN);
    tbl.setLeftTblRef(view);
    NormalBinPredicate onClause = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral id1 = new FieldLiteral("temp1", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    id1.setReferedExpr(sub_id);
    id1.setUp2date(true);
    FieldLiteral id2 = new FieldLiteral("T2", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    id2.setUp2date(true);
    onClause.addChild(id1);
    onClause.addChild(id2);
    tbl.setOnClause(onClause);
    tableRefs.add(view);
    tableRefs.add(tbl);

    selStmt.setSelectList(selectList);
    selStmt.setTableRefs(tableRefs);
    selStmt.setWhereClause(whereClause);

    return selStmt;
  }

  static public CreateStmt prepareCreateStmtAnalysed(){
    CreateStmt createStmt = new CreateStmt();

    //set table name
    TableName tableName = new TableName();
    tableName.setName("employee");
    createStmt.setTableName(tableName);

    //set basic field literals
    List<BasicFieldLiteral> literalList = new ArrayList<>();
    BasicFieldLiteral idField = new BasicFieldLiteral("id", new ColumnType(DataType.INT));
    ColumnType columnType = new ColumnType(DataType.VARCHAR);
    columnType.setLength(20);
    BasicFieldLiteral nameField = new BasicFieldLiteral("name", columnType);
    BasicFieldLiteral salaryField = new BasicFieldLiteral("salary", new ColumnType(DataType.INT), tableName, true, null);
    BasicFieldLiteral ageField = new BasicFieldLiteral("age", new ColumnType(DataType.INT));

    idField.setTableName(tableName);
    nameField.setTableName(tableName);
    salaryField.setTableName(tableName);
    ageField.setTableName(tableName);

    literalList.add(idField);
    literalList.add(nameField);
    literalList.add(salaryField);
    literalList.add(ageField);

    createStmt.setFieldList(literalList);

    return createStmt;
  }

  static public CreateStmt prepareCreateStmtRewritten(){
    CreateStmt createStmt = new CreateStmt();

    //set table name
    TableName tableName = new TableName();
    tableName.setName("employee");
    createStmt.setTableName(tableName);

    //prepare column types
    ColumnType nameColumnType = new ColumnType(DataType.VARCHAR);
    nameColumnType.setLength(20);
    ColumnType sensitiveColumnType = new ColumnType(DataType.VARCHAR);
    sensitiveColumnType.setLength(Crypto.TWO_THOUSAND_FORTY_EIGHT);

    //set basic field literals
    List<BasicFieldLiteral> literalList = new ArrayList<>();
    BasicFieldLiteral idField = new BasicFieldLiteral("id", new ColumnType(DataType.INT));
    BasicFieldLiteral nameField = new BasicFieldLiteral("name", nameColumnType);
    BasicFieldLiteral salaryField = new BasicFieldLiteral("salary", sensitiveColumnType, tableName, true, new ColumnKey("1", "1"));
    BasicFieldLiteral ageField = new BasicFieldLiteral("age", new ColumnType(DataType.INT));
    BasicFieldLiteral rowIdField = new BasicFieldLiteral(BasicFieldLiteral.ROW_ID_COLUMN_NAME, sensitiveColumnType, tableName, true, new ColumnKey("1", "1"));
    BasicFieldLiteral rField = new BasicFieldLiteral(BasicFieldLiteral.R_COLUMN_NAME, sensitiveColumnType, tableName, true, new ColumnKey("1", "1"));
    BasicFieldLiteral sField = new BasicFieldLiteral(BasicFieldLiteral.S_COLUMN_NAME, sensitiveColumnType, tableName, true, new ColumnKey("1", "1"));

    idField.setTableName(tableName);
    nameField.setTableName(tableName);
    salaryField.setTableName(tableName);
    ageField.setTableName(tableName);

    literalList.add(idField);
    literalList.add(nameField);
    literalList.add(salaryField);
    literalList.add(ageField);
    literalList.add(rowIdField);
    literalList.add(rField);
    literalList.add(sField);

    createStmt.setFieldList(literalList);

    TableRowFormat tableRowFormat = new TableRowFormat();
    tableRowFormat.setRowFieldFormat(";");

    createStmt.setTableRowFormat(tableRowFormat);

    return createStmt;
  }
}
