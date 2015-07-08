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

package edu.hku.sdb.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;
import edu.hku.sdb.parse.NormalArithmeticExpr.Operator;

public class TestQuery {

  public static String dbName = "dummy_db";


  public static List<ColumnMeta> createColMetaT1Simple() {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta t1ID = new ColumnMeta(dbName, "T1", "id", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t1A = new ColumnMeta(dbName, "T1", "a", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t1RowID = new ColumnMeta(dbName, "T1", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t1R = new ColumnMeta(dbName, "T1", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("2"), new BigInteger("4")));
    ColumnMeta t1S = new ColumnMeta(dbName, "T1", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("2"), new BigInteger("4")));

    cols.add(t1ID);
    cols.add(t1A);
    cols.add(t1S);
    cols.add(t1R);
    cols.add(t1RowID);

    return cols;
  }

  public static List<ColumnMeta> createColMetaT2Simple() {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta t2ID = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t2B = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t2C = new ColumnMeta(dbName, "T2", "c", DataType.INT, false,
            null);
    ColumnMeta t2RowID = new ColumnMeta(dbName, "T2", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t2R = new ColumnMeta(dbName, "T2", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("3"), new BigInteger("5")));
    ColumnMeta t2S = new ColumnMeta(dbName, "T2", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("3"), new BigInteger("5")));

    cols.add(t2ID);
    cols.add(t2B);
    cols.add(t2C);
    cols.add(t2S);
    cols.add(t2R);
    cols.add(t2RowID);

    return cols;
  }

  public static List<ColumnMeta> createColMetaT3Simple() {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();
    ColumnMeta t3ID1 = new ColumnMeta(dbName, "T3", "id1", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t3ID2 = new ColumnMeta(dbName, "T3", "id2", DataType.INT, false,
            null);
    ColumnMeta t3D = new ColumnMeta(dbName, "T3", "d", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t3RowID = new ColumnMeta(dbName, "T3", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta t3R = new ColumnMeta(dbName, "T3", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("4"), new BigInteger("6")));
    ColumnMeta t3S = new ColumnMeta(dbName, "T3", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey(new BigInteger("4"), new BigInteger("6")));

    cols.add(t3ID1);
    cols.add(t3ID2);
    cols.add(t3D);

    cols.add(t3S);
    cols.add(t3R);
    cols.add(t3RowID);

    return cols;
  }


  public static List<TableMeta> createTableMetasSimple() {
    List<TableMeta> tblMetas = new ArrayList<>();

    TableMeta t1 = new TableMeta(dbName, "T1");
    TableMeta t2 = new TableMeta(dbName, "T2");
    TableMeta t3 = new TableMeta(dbName, "T3");

    t1.setCols(createColMetaT1Simple());
    t2.setCols(createColMetaT2Simple());
    t3.setCols(createColMetaT3Simple());

    tblMetas.add(t1);
    tblMetas.add(t2);
    tblMetas.add(t3);

    return tblMetas;
  }

  public static DBMeta createDBMetaSimple() {
    DBMeta dbMeta = new DBMeta(dbName);
    // No secret keys

    dbMeta.setTbls(createTableMetasSimple());

    return dbMeta;
  }

  public static List<ColumnMeta> createColMetaT1(BigInteger prime1, BigInteger prime2) {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta t1ID = new ColumnMeta(dbName, "T1", "id", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t1A = new ColumnMeta(dbName, "T1", "a", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t1C = new ColumnMeta(dbName, "T1", "c", DataType.INT, false,
            null);
    ColumnMeta t1RowID = new ColumnMeta(dbName, "T1", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t1R = new ColumnMeta(dbName, "T1", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2), Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t1S = new ColumnMeta(dbName, "T1", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));

    cols.add(t1ID);
    cols.add(t1A);
    cols.add(t1C);
    cols.add(t1S);
    cols.add(t1R);
    cols.add(t1RowID);

    return cols;
  }

  public static List<ColumnMeta> createColMetaT2(BigInteger prime1, BigInteger prime2) {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta t2ID = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2), Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t2B = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2), Crypto.generatePositiveRand(prime1, prime2)));

    ColumnMeta t2RowID = new ColumnMeta(dbName, "T2", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t2R = new ColumnMeta(dbName, "T2", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t2S = new ColumnMeta(dbName, "T2", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));

    cols.add(t2ID);
    cols.add(t2B);
    cols.add(t2S);
    cols.add(t2R);
    cols.add(t2RowID);

    return cols;
  }


  public static List<ColumnMeta> createColMetaT3(BigInteger prime1, BigInteger prime2) {
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();
    ColumnMeta t3ID1 = new ColumnMeta(dbName, "T3", "id1", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t3ID2 = new ColumnMeta(dbName, "T3", "id2", DataType.INT, false,
            null);
    ColumnMeta t3D = new ColumnMeta(dbName, "T3", "d", DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t3RowID = new ColumnMeta(dbName, "T3", BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t3R = new ColumnMeta(dbName, "T3", BasicFieldLiteral.R_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));
    ColumnMeta t3S = new ColumnMeta(dbName, "T3", BasicFieldLiteral.S_COLUMN_NAME,
            DataType.INT, true,
            new ColumnKey( Crypto.generatePositiveRand(prime1, prime2),  Crypto.generatePositiveRand(prime1, prime2)));

    cols.add(t3ID1);
    cols.add(t3ID2);
    cols.add(t3D);

    cols.add(t3S);
    cols.add(t3R);
    cols.add(t3RowID);

    return cols;
  }


  public static List<TableMeta> createTableMetas(BigInteger prime1, BigInteger prime2) {
    List<TableMeta> tblMetas = new ArrayList<>();

    TableMeta t1 = new TableMeta(dbName, "T1");
    TableMeta t2 = new TableMeta(dbName, "T2");
    TableMeta t3 = new TableMeta(dbName, "T3");

    t1.setCols(createColMetaT1(prime1, prime2));
    t2.setCols(createColMetaT2(prime1, prime2));
    t3.setCols(createColMetaT3(prime1, prime2));

    tblMetas.add(t1);
    tblMetas.add(t2);
    tblMetas.add(t3);

    return tblMetas;
  }

  public static DBMeta createDBMeta() {
    DBMeta dbMeta = new DBMeta(dbName);

    BigInteger prime1 = Crypto.generateRandPrime();
    BigInteger prime2 = Crypto.generateRandPrime();
    BigInteger n = prime1.multiply(prime2);
    BigInteger g = Crypto.generatePositiveRand(prime1, prime2);

    dbMeta.setN(n.toString());
    dbMeta.setG(g.toString());
    dbMeta.setPrime1(prime1.toString());
    dbMeta.setPrime2(prime2.toString());

    dbMeta.setTbls(createTableMetas(prime1, prime2));

    return dbMeta;

  }

  /**
   * Prepare a complex query that is nested and contains join, group by, having,
   * order by, and limit
   */
  public static ParseNode prepareAnsComplexAnalyzed() {
    // Prepare the sub_query first
    BaseTableRef tblT1 = new BaseTableRef("T1", "");
    BaseTableRef tblT2 = new BaseTableRef("T2", "");
    BaseTableRef tblT3 = new BaseTableRef("T3", "");

    SelectStmt subSelStmt = new SelectStmt();

    SelectionList subSelectList = new SelectionList();
    List<TableRef> subTableRefs = new ArrayList<TableRef>();

    FieldLiteral t1ID = new FieldLiteral("T1", "id", DataType.INT, true,
            new ColumnKey("1", "3"));
    t1ID.setUp2date(true);

    NormalArithmeticExpr subArithExpr = new NormalArithmeticExpr(
            Operator.MULTIPLY);
    FieldLiteral t1A = new FieldLiteral("T1", "a", DataType.INT, true,
            new ColumnKey("1", "3"));
    t1A.setUp2date(true);
    subArithExpr.addChild(t1A);
    subArithExpr.addChild(t1A);

    FieldLiteral t3D = new FieldLiteral("T3", "d", DataType.INT, true,
            new ColumnKey("1", "3"));
    t3D.setUp2date(true);

    subSelectList.getItemList().add(new SelectionItem(t1ID, "id"));
    subSelectList.getItemList().add(new SelectionItem(subArithExpr, "a"));
    subSelectList.getItemList().add(new SelectionItem(t3D, ""));

    // Prepare join

    NormalBinPredicate subOnClause1 = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral t2ID = new FieldLiteral("T2", "id", DataType.INT, true,
            new ColumnKey("1", "3"));
    t2ID.setUp2date(true);
    subOnClause1.addChild(t1ID);
    subOnClause1.addChild(t2ID);

    tblT1.setJoinOp(JoinOperator.RIGHT_OUTER_JOIN);
    tblT2.setJoinOp(JoinOperator.RIGHT_OUTER_JOIN);
    tblT2.setLeftTblRef(tblT1);
    tblT2.setOnClause(subOnClause1);

    CompoundPredicate subOnClause2 = new CompoundPredicate(CompoundPredicate
            .CompoundOperator.AND);
    NormalBinPredicate pred1 = new NormalBinPredicate(BinOperator.EQ);
    NormalBinPredicate pred2 = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral t3ID1 = new FieldLiteral("T3", "id1", DataType.INT, true,
            new ColumnKey("1", "3"));
    t3ID1.setUp2date(true);
    FieldLiteral t3ID2 = new FieldLiteral("T3", "id2", DataType.INT, false,
            null);
    t3ID2.setUp2date(true);

    pred1.addChild(t1ID);
    pred1.addChild(t3ID1);

    pred2.addChild(t2ID);
    pred2.addChild(t3ID2);

    subOnClause2.addChild(pred1);
    subOnClause2.addChild(pred2);

    tblT3.setJoinOp(JoinOperator.INNER_JOIN);
    tblT3.setLeftTblRef(tblT2);
    tblT3.setOnClause(subOnClause2);

    subTableRefs.add(tblT1);
    subTableRefs.add(tblT2);
    subTableRefs.add(tblT3);

    subSelStmt.setSelectList(subSelectList);
    subSelStmt.setTableRefs(subTableRefs);

    InLineViewRef view = new InLineViewRef("temp1", subSelStmt);

    // Prepare the outer query
    SelectStmt selStmt = new SelectStmt();

    // Prepare selection list
    SelectionList selectList = new SelectionList();


    FieldLiteral temp1ID = new FieldLiteral("temp1", "id", DataType.INT, true,
            new ColumnKey("1", "3"));
    temp1ID.setReferedExpr(t1ID);
    temp1ID.setUp2date(true);

    FieldLiteral temp1A = new FieldLiteral("temp1", "a", DataType.UNKNOWN, false,
            null);
    temp1A.setReferedExpr(subArithExpr);

    FieldLiteral temp1D = new FieldLiteral("temp1", "d", DataType.INT, true,
            new ColumnKey("1", "3"));
    temp1D.setReferedExpr(t3D);
    temp1D.setUp2date(true);

    Expr whereClause = new NormalBinPredicate(BinOperator.EQ, temp1D,
            new FloatLiteral("1.0"));

    FunctionCallExpr countFunc = new FunctionCallExpr(new FunctionName(("count")));
    List<Expr> exprs = new ArrayList<Expr>();
    exprs.add(temp1A);
    FunctionCallExpr sumFunc = new FunctionCallExpr(new FunctionName("sum"), new
            FunctionParams(exprs));

    selectList.getItemList().add(new SelectionItem(temp1ID, ""));
    selectList.getItemList().add(new SelectionItem(countFunc, "count"));
    selectList.getItemList().add(new SelectionItem(sumFunc, "sum"));

    BaseTableRef tbl = new BaseTableRef("T2", "");

    // Prepare join
    view.setJoinOp(JoinOperator.INNER_JOIN);
    tbl.setJoinOp(JoinOperator.INNER_JOIN);
    tbl.setLeftTblRef(view);
    NormalBinPredicate onClause = new NormalBinPredicate(BinOperator.EQ);
    onClause.addChild(temp1ID);
    onClause.addChild(t2ID);
    tbl.setOnClause(onClause);

    List<TableRef> tableRefs = new ArrayList<TableRef>();

    tableRefs.add(view);
    tableRefs.add(tbl);

    // Prepare group by
    List<Expr> groupingExpr = new ArrayList<>();
    FieldLiteral groupby = new FieldLiteral("temp1", "id", DataType.INT, true, new
            ColumnKey("1", "3"));
    groupby.setReferedExpr(temp1ID);
    temp1ID.addReferredBy(groupby);
    groupby.setUp2date(true);
    groupingExpr.add(groupby);

    Expr having = new NormalBinPredicate(BinOperator.GT);
    FieldLiteral count = new FieldLiteral("", "count", DataType.UNKNOWN, false,
            null);
    count.setReferedExpr(countFunc);
    countFunc.addReferredBy(count);
    having.addChild(count);
    having.addChild(new IntLiteral("10"));

    // Prepare order by

    List<OrderByElement> orderByElements = new ArrayList<>();
    FieldLiteral sum = new FieldLiteral("", "sum", DataType.UNKNOWN, false, null);
    sum.setReferedExpr(sumFunc);
    sumFunc.addReferredBy(sum);
    OrderByElement orderByElement = new OrderByElement(sum, false);
    orderByElements.add(orderByElement);

    IntLiteral limit = new IntLiteral("10");
    LimitElement limitElement = new LimitElement(limit);

    selStmt.setSelectList(selectList);
    selStmt.setTableRefs(tableRefs);
    selStmt.setWhereClause(whereClause);
    selStmt.setGroupingExprs(groupingExpr);
    selStmt.setHavingExpr(having);
    selStmt.setOrderByElements(orderByElements);
    selStmt.setLimitElement(limitElement);

    return selStmt;
  }


  /**
   * Prepare a selection statement with a single join operator.
   *
   * @return
   */
  public static ParseNode prepareAnsJoinAnalyzed() {
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
   * Prepare a selection statement with a single join operator with both
   * sensitive columns and insensitive columns.
   *
   * @return
   */
  public static ParseNode prepareAnsJoinMixSenAnalyzed() {
    //SELECT a + c FROM T1 JOIN T2 ON T1.id = T2.id WHERE c > 1.0 AND b < 10
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();

    NormalArithmeticExpr arithExpr = new NormalArithmeticExpr(Operator.ADD);
    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
            new ColumnKey("1", "3"));
    FieldLiteral c = new FieldLiteral("T2", "c", DataType.INT, false,
            null);
    a.setUp2date(true);
    c.setUp2date(true);
    arithExpr.addChild(a);
    arithExpr.addChild(c);
    selectList.getItemList().add(new SelectionItem(arithExpr, ""));

    CompoundPredicate whereClause = new CompoundPredicate(CompoundPredicate
            .CompoundOperator.AND);
    Expr predicate1 = new NormalBinPredicate(BinOperator.GT, c,
            new FloatLiteral("1.0"));

    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
            new ColumnKey("1", "3"));
    b.setUp2date(true);
    Expr predicate2 = new NormalBinPredicate(BinOperator.LT, b,
            new IntLiteral("10"));
    whereClause.setLeftPred(predicate1);
    whereClause.setRightPred(predicate2);

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
   * Prepare rewritten query for @see edu.hku.sdb.util.TestQuery
   * .prepareAnsJoinMixSenAnalyzed() .
   *
   * @return
   */
  public static String prepareAnsJoinMixSenRewritten() {
    SelectStmt selStmt = new SelectStmt();

    return selStmt.toSql();
  }

  /**
   * Prepare a selection statement with a single join and a group-by.
   *
   * @return
   */
  public static ParseNode prepareAnsJoinGroupByAnalyzed() {
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();
    List<Expr> groupingExprs = new ArrayList<Expr>();

    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
            new ColumnKey("1", "3"));
    a.setUp2date(true);

    FunctionCallExpr func = new FunctionCallExpr(new FunctionName("count"));

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
  public static ParseNode prepareAnsNestedAnalyzed() {

    // Prepare the sub_query first
    BaseTableRef tblT1 = new BaseTableRef("T1", "");
    SelectStmt subSelStmt = new SelectStmt();

    SelectionList subSelectList = new SelectionList();
    List<TableRef> subTableRefs = new ArrayList<TableRef>();

    FieldLiteral t1ID = new FieldLiteral("T1", "id", DataType.INT, true,
            new ColumnKey("1", "3"));
    t1ID.setUp2date(true);

    NormalArithmeticExpr subArithExpr = new NormalArithmeticExpr(
            Operator.MULTIPLY);
    FieldLiteral t1A = new FieldLiteral("T1", "a", DataType.INT, true,
            new ColumnKey("1", "3"));
    t1A.setUp2date(true);
    subArithExpr.addChild(t1A);
    subArithExpr.addChild(t1A);

    subSelectList.getItemList().add(new SelectionItem(t1ID, ""));
    subSelectList.getItemList().add(new SelectionItem(subArithExpr, "a"));

    tblT1.setJoinOp(JoinOperator.NULL_JOIN);
    subTableRefs.add(tblT1);

    subSelStmt.setSelectList(subSelectList);
    subSelStmt.setTableRefs(subTableRefs);

    InLineViewRef view = new InLineViewRef("temp1", subSelStmt);

    // Prepare the outer query
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();

    FieldLiteral a = new FieldLiteral("temp1", "a", DataType.UNKNOWN, false,
            null);
    a.setReferedExpr(subArithExpr);
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
    id1.setReferedExpr(t1ID);
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


  static public CreateStmt prepareCreateStmtAnalyzed() {
    CreateStmt createStmt = new CreateStmt();

    //set table name
    TableName tableName = new TableName();
    tableName.setName("employee");
    createStmt.setTableName(tableName);

    //set basic field literals
    List<BasicFieldLiteral> literalList = new ArrayList<>();
    BasicFieldLiteral idField = new BasicFieldLiteral("id", new ColumnType
            (DataType.INT));
    ColumnType columnType = new ColumnType(DataType.VARCHAR);
    columnType.setLength(20);
    BasicFieldLiteral nameField = new BasicFieldLiteral("name", columnType);
    BasicFieldLiteral salaryField = new BasicFieldLiteral("salary", new
            ColumnType(DataType.INT), tableName, true, null);
    BasicFieldLiteral ageField = new BasicFieldLiteral("age", new ColumnType
            (DataType.INT));

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

  static public String prepareCreateStmtRewritten() {
    CreateStmt createStmt = new CreateStmt();

    //set table name
    TableName tableName = new TableName();
    tableName.setName("employee");
    createStmt.setTableName(tableName);

    //prepare column types
    ColumnType nameColumnType = new ColumnType(DataType.VARCHAR);
    nameColumnType.setLength(20);
    ColumnType sensitiveColumnType = new ColumnType(DataType.VARCHAR);
    sensitiveColumnType.setLength(Crypto.defaultRandLength);

    //set basic field literals
    List<BasicFieldLiteral> literalList = new ArrayList<>();
    BasicFieldLiteral idField = new BasicFieldLiteral("id", new ColumnType
            (DataType.INT));
    BasicFieldLiteral nameField = new BasicFieldLiteral("name", nameColumnType);
    BasicFieldLiteral salaryField = new BasicFieldLiteral("salary",
            sensitiveColumnType, tableName, true, new ColumnKey("1", "1"));
    BasicFieldLiteral ageField = new BasicFieldLiteral("age", new ColumnType
            (DataType.INT));
    BasicFieldLiteral rowIdField = new BasicFieldLiteral(BasicFieldLiteral
            .ROW_ID_COLUMN_NAME, sensitiveColumnType, tableName, true, new
            ColumnKey("1", "1"));
    BasicFieldLiteral rField = new BasicFieldLiteral(BasicFieldLiteral
            .R_COLUMN_NAME, sensitiveColumnType, tableName, true, new
            ColumnKey("1", "1"));
    BasicFieldLiteral sField = new BasicFieldLiteral(BasicFieldLiteral
            .S_COLUMN_NAME, sensitiveColumnType, tableName, true, new
            ColumnKey("1", "1"));

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

    return createStmt.toSql();
  }
}
