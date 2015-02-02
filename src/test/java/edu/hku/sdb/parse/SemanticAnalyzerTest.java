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

package edu.hku.sdb.parse;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.ColumnMeta;
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.TableMeta;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;
import edu.hku.sdb.parse.NormalArithmeticExpr.Operator;

public class SemanticAnalyzerTest {

  private SemanticAnalyzer testObj;
  private ParseDriver parser;
  private MetaStore metadb;

  @Before
  public void setUp() {

    // Prepare a test metastore
    metadb = new MetaStore("test");

    DBMeta dbmeta = new DBMeta("test");
    TableMeta tblmeta1 = new TableMeta("T1");
    TableMeta tblmeta2 = new TableMeta("T2");

    // All columns are sensitive

    tblmeta1.getCols().add(
        new ColumnMeta("id", DataType.INT, true, new ColumnKey(new BigInteger(
            "1"), new BigInteger("3"))));
    tblmeta1.getCols().add(
        new ColumnMeta("a", DataType.INT, true, new ColumnKey(new BigInteger(
            "1"), new BigInteger("3"))));

    tblmeta2.getCols().add(
        new ColumnMeta("id", DataType.INT, true, new ColumnKey(new BigInteger(
            "1"), new BigInteger("3"))));
    tblmeta2.getCols().add(
        new ColumnMeta("b", DataType.INT, true, new ColumnKey(new BigInteger(
            "1"), new BigInteger("3"))));

    dbmeta.getTbls().add(tblmeta1);
    dbmeta.getTbls().add(tblmeta2);

    metadb.getDbs().add(dbmeta);

    testObj = new SemanticAnalyzer(metadb);
    parser = new ParseDriver();
  }

  @After
  public void tearDown() {

  }

  private ParseNode prepareAnsJoin() {
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();

    NormalArithmeticExpr arithExpr = new NormalArithmeticExpr(Operator.ADD);
    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
        new ColumnKey("1", "3"));
    arithExpr.addChild(a);
    arithExpr.addChild(b);
    selectList.getItemList().add(new SelectionItem(arithExpr, null));

    BaseTableRef tbl1 = new BaseTableRef("T1", null);
    BaseTableRef tbl2 = new BaseTableRef("T2", null);

    tbl2.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setLeftTblRef(tbl1);
    NormalBinPredicate onClause = new NormalBinPredicate(BinOperator.EQ);
    FieldLiteral id1 = new FieldLiteral("T1", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral id2 = new FieldLiteral("T2", "id", DataType.INT, true,
        new ColumnKey("1", "3"));
    onClause.addChild(id1);
    onClause.addChild(id2);
    tbl2.setOnClause(onClause);
    tableRefs.add(tbl1);
    tableRefs.add(tbl2);

    selStmt.setSelectList(selectList);
    selStmt.setTableRefs(tableRefs);

    return selStmt;
  }

  @Test
  public void testAnalyzeJoin() throws ParseException {
    String command = "SELECT a + b FROM T1 JOIN T2 ON T1.id = T2.id";

    ASTNode astTree = parser.parse(command);

    ParseNode parseTree = testObj.analyze(astTree);
    ParseNode ansTree = prepareAnsJoin();

    assertEquals(parseTree, ansTree);

  }

}
