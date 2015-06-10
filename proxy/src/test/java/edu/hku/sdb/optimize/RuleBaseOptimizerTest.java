//package edu.hku.sdb.optimize;
//
//import edu.hku.sdb.catalog.ColumnKey;
//import edu.hku.sdb.catalog.DBMeta;
//import edu.hku.sdb.catalog.DataType;
//import edu.hku.sdb.connect.SdbResultSet;
//import edu.hku.sdb.crypto.Crypto;
//import edu.hku.sdb.exec.*;
//import edu.hku.sdb.parse.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.math.BigInteger;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class RuleBaseOptimizerTest {
//
//  SelectStmt selectStmt = new SelectStmt();
//  Optimizer optimizer = new RuleBaseOptimizer();
//  public static LocalDecrypt localDecrypt;
//  Connection connection;
//  DBMeta dbMeta;
//  BigInteger p;
//  BigInteger q;
//  BigInteger n;
//  BigInteger g;
//
//  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
//  private static String dbURL = "jdbc:derby:memory:test_db;create=true";
//
//  public void prepareTestDBConnection() {
//    try {
//      Class.forName(driver).newInstance();
//      connection = DriverManager.getConnection(dbURL);
//      java.sql.Statement statement = connection.createStatement();
//      statement.executeUpdate("CREATE TABLE t2 (ID VARCHAR(2048) , ROW_ID VARCHAR(2048))");
//      statement.executeUpdate("INSERT INTO t2 VALUES ('100', '1')");
//      statement.executeUpdate("INSERT INTO t2 VALUES ('200', '2')");
//    } catch (Exception except){
//      except.printStackTrace();
//    }
//  }
//
//  @Before
//  public void setUp() throws Exception {
//    prepareDbMeta();
//    prepareParseTree();
//    preparePlanTree();
//  }
//
//  private void prepareDbMeta() {
//    dbMeta = new DBMeta("sdbclient");
//    p = Crypto.generateRandPrime();
//    q = Crypto.generateRandPrime();
//    n = p.multiply(q);
//    g = Crypto.generatePositiveRand(p, q);
//
//    dbMeta.setP(p.toString());
//    dbMeta.setQ(q.toString());
//    dbMeta.setN(n.toString());
//    dbMeta.setG(g.toString());
//  }
//
//  private void preparePlanTree(){
//    RemoteSQL remoteSQL = getRemoteSQL();
//    prepareLocalDecrypt(remoteSQL);
//  }
//
//  private void prepareLocalDecrypt(RemoteSQL remoteSQL) {
//    // prepare row descriptor for local decrypt
//    List<BasicColumnDesc> columnDescListLocalDecrypt = new ArrayList<BasicColumnDesc>();
//
//    // column descriptor for id
//    ColumnKey columnKey = new ColumnKey("2", "2");
//    ColumnDesc columnDescId = new ColumnDesc("id", "", Integer.class, true, columnKey);
//    columnDescListLocalDecrypt.add(columnDescId);
//    // column descriptor for row_id
//    ColumnKey columnKeyRowId = new ColumnKey("3", "3");
//    ColumnDesc columnDescRowId = new ColumnDesc("row_id", "", Integer.class, true, columnKeyRowId);
//    columnDescListLocalDecrypt.add(columnDescRowId);
//
//    // set column signature for rowDesc
//    RowDesc rowDesc2 = new RowDesc();
//    rowDesc2.setSignature(columnDescListLocalDecrypt);
//
//    // prepare local decrypt plan node
//    localDecrypt = new LocalDecrypt(rowDesc2);
//    localDecrypt.setCredential(p, q, n, g);
//    localDecrypt.setChild(remoteSQL);
//  }
//
//  private RemoteSQL getRemoteSQL() {
//    // prepare row descriptor for remote SQL plan node
//    List<BasicColumnDesc> columnDescList1 = new ArrayList<BasicColumnDesc>();
//    // column descriptor for id
//    BasicColumnDesc columnDescId = new BasicColumnDesc("id", "", Integer.class);
//    columnDescList1.add(columnDescId);
//    // column descriptor for row_id
//    BasicColumnDesc columnDescRowId = new BasicColumnDesc("row_id", "", Integer.class);
//    columnDescList1.add(columnDescRowId);
//
//    //set rowDescriptor column signatures
//    RowDesc rowDesc1 = new RowDesc();
//    rowDesc1.setSignature(columnDescList1);
//
//    // prepare remoteSQL plan node
//    prepareTestDBConnection();
//    String query = "SELECT t2.id, t2.row_id\n" +
//            "from t2";
//    RemoteSQL remoteSQL = new RemoteQuery(query.toLowerCase(), connection, rowDesc1);
//    return remoteSQL;
//  }
//
//  private void prepareParseTree() {
//    // setup selection list
//    SelectionList selectionList = new SelectionList();
//    List<SelectionItem> selectionItemList = new ArrayList<SelectionItem>();
//
//
//    // t2.id field
//    ColumnKey columnKey1 = new ColumnKey("2", "2");
//    Expr exprId = new FieldLiteral("t2", "id", DataType.INT, true, columnKey1);
//    SelectionItem selectionItemId = new SelectionItem();
//    selectionItemId.setExpr(exprId);
//
//    // t2.row-id field
//    ColumnKey columnKeyRowId = new ColumnKey("3", "3");
//    Expr exprRow = new FieldLiteral("t2", "row_id", DataType.INT, true, columnKeyRowId);
//    SelectionItem selectionItemRowId = new SelectionItem();
//    selectionItemRowId.setExpr(exprRow);
//
//    // add field literals to selectionList
//    selectionItemList.add(selectionItemId);
//    selectionItemList.add(selectionItemRowId);
//
//    // set [fieldLiteral, fieldLiteral] as selectionList
//    selectionList.setItemList(selectionItemList);
//    // set selectList for select statement
//    selectStmt.setSelectList(selectionList);
//    selectStmt.setP(p);
//    selectStmt.setQ(q);
//    selectStmt.setN(n);
//    selectStmt.setG(g);
//
//    // t2 tableref field
//    List<TableRef> tableRefList = new ArrayList<TableRef>();
//    //@See SelectStatement#toSql
//    TableRef tableRef1 = new BaseTableRef("t2 ", "");
//    tableRefList.add(tableRef1);
//    // set tableRef for select statement
//    selectStmt.setTableRefs(tableRefList);
//
//    selectStmt.setWhereClause(null);
//  }
//
//  @After
//  public void tearDown() throws Exception {
//
//  }
//
//  @Test
//  public void testOptimizeSimple() throws Exception {
//    //Test optimizer
//    PlanNode planNode = optimizer.optimize(selectStmt, connection, null);
//    assertEquals(localDecrypt, planNode);
//  }
//
//
//}
