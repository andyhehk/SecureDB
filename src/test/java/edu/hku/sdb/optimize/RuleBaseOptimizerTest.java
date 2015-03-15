package edu.hku.sdb.optimize;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.connect.SdbResultSet;
import edu.hku.sdb.exec.*;
import edu.hku.sdb.parse.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RuleBaseOptimizerTest {

  SelectStmt selectStmt = new SelectStmt();
  Optimizer optimizer = new RuleBaseOptimizer();
  LocalDecrypt localDecrypt;
  Connection connection;

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private static String dbURL = "jdbc:derby:memory:test_db;create=true";


  public void prepareTestDBConnection() {
    try {
      Class.forName(driver).newInstance();
      connection = DriverManager.getConnection(dbURL);
      java.sql.Statement statement = connection.createStatement();
      statement.executeUpdate("CREATE TABLE t2 (ID INT)");
      statement.executeUpdate("INSERT INTO t2 VALUES (100)");
      statement.executeUpdate("INSERT INTO t2 VALUES (200)");
      ResultSet resultSet = statement.executeQuery("select id from t2");
      if (resultSet.next()){
        assert(resultSet.getInt(1) < 300);
      }

    } catch (Exception except){
      except.printStackTrace();
    }
  }

  @Before
  public void setUp() throws Exception {
    prepareParseTree();
    preparePlanTree();
  }

  private void preparePlanTree(){

    // prepare row descriptor for remote SQL plan node
    List<BasicColumnDesc> columnDescList1 = new ArrayList<BasicColumnDesc>();
    BasicColumnDesc columnDesc1 = new BasicColumnDesc("id", "", Integer.class);
    columnDescList1.add(columnDesc1);
    RowDesc rowDesc1 = new RowDesc();
    rowDesc1.setSignature(columnDescList1);

    // prepare remoteSQL plan node
    prepareTestDBConnection();
    String query = "SELECT t2.id \n" +
            "from t2";
    RemoteSQL remoteSQL = new RemoteSQL(query.toLowerCase(), rowDesc1);
    remoteSQL.setConnection(connection);


    // prepare row descriptor for local decrypt
    List<BasicColumnDesc> columnDescList2 = new ArrayList<BasicColumnDesc>();
    ColumnKey columnKey = new ColumnKey("2", "2");
    ColumnDesc columnDesc2 = new ColumnDesc("id", "", Integer.class, true, columnKey);
    columnDescList2.add(columnDesc2);
    RowDesc rowDesc2 = new RowDesc();
    rowDesc2.setSignature(columnDescList2);

    // prepare local decrypt plan node
    localDecrypt = new LocalDecrypt(rowDesc2);
    localDecrypt.setChild(remoteSQL);

  }

  private void prepareParseTree() {
    // setup selection list
    SelectionList selectionList = new SelectionList();
    List<SelectionItem> selectionItemList = new ArrayList<SelectionItem>();

    // t2.id field
    ColumnKey columnKey1 = new ColumnKey("2", "2");
    Expr expr1 = new FieldLiteral("t2", "id", DataType.INT, true, columnKey1);
    String alias1 = "";
    SelectionItem selectionItem1 = new SelectionItem();
    selectionItem1.setExpr(expr1);
    selectionItemList.add(selectionItem1);

    // set [fieldLiteral] as selectionList
    selectionList.setItemList(selectionItemList);
    // set selectList for select statement
    selectStmt.setSelectList(selectionList);


    // t2 tableref field
    List<TableRef> tableRefList = new ArrayList<TableRef>();
    //@See SelectStatemetn#toSql
    TableRef tableRef1 = new BaseTableRef("t2 ", "");
    tableRefList.add(tableRef1);
    // set tableRef for select statement
    selectStmt.setTableRefs(tableRefList);

    selectStmt.setWhereClause(null);
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testOptimize() throws Exception {
    //Test optimizer
    PlanNode planNode = optimizer.optimize(selectStmt, connection);
    assertEquals(localDecrypt, planNode);

    //Test executor
    Executor executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);

    while (resultSet.next()){
      System.out.println(resultSet.getInteger(1));
    }

  }
}