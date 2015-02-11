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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

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

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

  /**
   * Prepare a in-memory database for testing
   */
  @Before
  public void prepareTestDB() {
    try {
      Class.forName(driver).newInstance();
    } catch (InstantiationException | IllegalAccessException
        | ClassNotFoundException e) {
      e.printStackTrace();
    }

    Properties properties = new Properties();
    properties.setProperty("javax.jdo.option.ConnectionURL",
        "jdbc:derby:memory:test_db;create=true");
    properties.setProperty("javax.jdo.option.ConnectionDriverName",
        "org.apache.derby.jdbc.EmbeddedDriver");
    properties.setProperty("javax.jdo.option.ConnectionUserName", "");
    properties.setProperty("javax.jdo.option.ConnectionPassword", "");
    properties.setProperty("datanucleus.schema.autoCreateSchema", "true");
    properties.setProperty("datanucleus.schema.autoCreateTables", "true");
    properties.setProperty("datanucleus.schema.validateTables", "false");
    properties.setProperty("datanucleus.schema.validateConstraints", "false");

    pmf = JDOHelper.getPersistenceManagerFactory(properties);
    pm = pmf.getPersistenceManager();

    String dbName = "dummy_db";
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

    metadb = new MetaStore(dbName, pm);
    metadb.addCols(cols);

    testObj = new SemanticAnalyzer(metadb);
    parser = new ParseDriver();
  }

  /**
   * Drop the in-memory database after test.
   */
  @After
  public void clearTestDB() {
    try {
      pm.close();
      DriverManager.getConnection("jdbc:derby:memory:test_db;drop=true");
    } catch (SQLException se) {
      if (!se.getSQLState().equals("08006")) {
        // SQLState 08006 indicates a success
        se.printStackTrace();
      }
    }
  }

  /**
   * Prepare a selection statement with a single join operator.
   * 
   * @return
   */
  private ParseNode prepareAnsJoin() {
    SelectStmt selStmt = new SelectStmt();

    SelectionList selectList = new SelectionList();
    List<TableRef> tableRefs = new ArrayList<TableRef>();
    Expr whereClause = new NormalBinPredicate(BinOperator.GT, new FieldLiteral(
        "T1", "a", DataType.INT, true, new ColumnKey("1", "3")),
        new FloatLiteral("1.0"));

    NormalArithmeticExpr arithExpr = new NormalArithmeticExpr(Operator.ADD);
    FieldLiteral a = new FieldLiteral("T1", "a", DataType.INT, true,
        new ColumnKey("1", "3"));
    FieldLiteral b = new FieldLiteral("T2", "b", DataType.INT, true,
        new ColumnKey("1", "3"));
    arithExpr.addChild(a);
    arithExpr.addChild(b);
    selectList.getItemList().add(new SelectionItem(arithExpr, ""));

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

  @Test
  public void testAnalyzeJoin() throws ParseException {
    String command = "SELECT a + b FROM T1 JOIN T2 ON T1.id = T2.id WHERE a > 1.0";

    ASTNode astTree = parser.parse(command);

    ParseNode resultTree;
    try {
      ParseNode ansTree = prepareAnsJoin();
      resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (SemanticException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Test
  public void testAnalyzeJoinGroupby() throws ParseException {

  }

  @Test
  public void testAnalyzeNested() throws ParseException {

  }

}
