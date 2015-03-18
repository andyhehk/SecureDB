package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.connect.ResultSet;
import edu.hku.sdb.connect.SdbResultSet;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.ASTNode;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SemanticAnalyzer;
import edu.hku.sdb.rewrite.SdbSchemeRewriter;
import edu.hku.sdb.upload.UploadHandler;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import static org.junit.Assert.*;

public class ExecutorTest {

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private static String HiveDriverName = "org.apache.hive.jdbc.HiveDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;
  private UploadHandler uploadHandler;
  private DBMeta db1;
  private BigInteger n;
  private BigInteger g;
  private BigInteger p;
  private BigInteger q;

  private MetaStore metaDB;
  private SemanticAnalyzer semanticAnalyzer;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private Optimizer optimizer;
  private Executor executor;
  private String simpleSelectQuery = "select salary from t2";
  private String simpleMultipleSelectQuery = "select id from t2";


  @Before
  public void setUp(){
    prepareTestDB();
    try {
//      prepareMetaDB();
    } catch (Exception e) {
      e.printStackTrace();
    }

    assertNotNull(metaDB.getAllDBs().get(0));
  }

  private void prepareTestDB() {
    try {
      Class.forName(driver).newInstance();
    } catch (InstantiationException | IllegalAccessException
            | ClassNotFoundException e) {
      e.printStackTrace();
    }

    Properties properties = new Properties();
    properties.setProperty("javax.jdo.option.ConnectionURL",
            "jdbc:derby:metastore_db;create=true");

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
    metaDB = new MetaStore(pm);
  }

  public void prepareMetaDB() throws Exception {
    p = Crypto.generateRandPrime();
    q = Crypto.generateRandPrime();
    n = p.multiply(q);
    g = Crypto.generatePositiveRand(p ,q);

    uploadHandler = new UploadHandler();
    uploadHandler.setHDFS_URL("file:///");
    String homeDir = System.getenv("HOME");
    uploadHandler.setSourceFile("src/test/resources/upload/employee.txt");
    uploadHandler.setHDFS_FILE_PATH("file://"+homeDir+"/employee.txt");
    uploadHandler.setLocalMode(true);

    String dbName1 = "default";
    db1 = new DBMeta(dbName1);

    db1.setN(n.toString());
    db1.setG(g.toString());
    db1.setP(p.toString());
    db1.setQ(q.toString());

    metaDB.addDB(db1);

    String tblName1 = "t2";
    TableMeta tbl1 = new TableMeta(dbName1, tblName1.toUpperCase());
    tbl1.setDbMeta(db1);
    metaDB.addTbl(tbl1);
    assertEquals(tbl1, metaDB.getTbl(dbName1.toUpperCase(), tblName1));

    db1.getTbls().add(tbl1);
    metaDB.addDB(db1);

    String colName1 = "id";
    String colName2 = "name";
    String colName3 = "salary";
    String colName4 = "rowId";
    String colName5 = "R";
    String colName6 = "S";

    ColumnMeta col1 = new ColumnMeta(dbName1.toUpperCase(),
            tblName1.toUpperCase(), colName1);
    ColumnMeta col2 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName2.toUpperCase());
    ColumnMeta col3 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName3.toUpperCase());
    ColumnMeta col4 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName4.toUpperCase());
    ColumnMeta col5 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName5.toUpperCase());
    ColumnMeta col6 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName6.toUpperCase());

    col1.setType(DataType.INT);
    col2.setType(DataType.CHAR);
    col3.setType(DataType.INT);
    col4.setType(DataType.INT);
    col5.setType(DataType.INT);
    col6.setType(DataType.INT);

    col3.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    col4.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    col5.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    col6.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));

    col1.setSensitive(false);
    col2.setSensitive(false);
    col3.setSensitive(true);
    col4.setSensitive(true);
    col5.setSensitive(true);
    col6.setSensitive(true);

    col1.setTableMeta(tbl1);
    col2.setTableMeta(tbl1);
    col3.setTableMeta(tbl1);
    col4.setTableMeta(tbl1);
    col5.setTableMeta(tbl1);
    col6.setTableMeta(tbl1);

    metaDB.addCol(col1);
    metaDB.addCol(col2);
    metaDB.addCol(col3);
    metaDB.addCol(col4);
    metaDB.addCol(col5);
    metaDB.addCol(col6);

    tbl1.getCols().add(col1);
    tbl1.getCols().add(col2);
    tbl1.getCols().add(col3);
    tbl1.getCols().add(col4);
    tbl1.getCols().add(col5);
    tbl1.getCols().add(col6);

    metaDB.addTbl(tbl1);

    uploadHandler.setMetaStore(metaDB);
    testUploadIntegrated();
  }

  public void testUploadIntegrated(){
    uploadHandler.upload();
  }


  @Test
  public void testServerConnection() throws Exception{

    // Parse & analyse
    System.out.println("Parsing " + simpleSelectQuery);
    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
    ASTNode parsedNode = parser.parse(simpleSelectQuery);
    ParseNode analyzedNode  = semanticAnalyzer.analyze(parsedNode);

    // Rewrite
    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDB.getAllDBs().get(0));
    sdbSchemeRewriter.rewrite(analyzedNode);

    // Optimize
    System.out.println("Optimizing " + analyzedNode.toSql());
    Connection connection = getHiveConnection();
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = optimizer.optimize(analyzedNode, connection);

    // Execute
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);

    while (resultSet.next()){
      System.out.println(resultSet.getInteger(1));
    }

  }

  private Connection getHiveConnection() throws SQLException {
    try {
      Class.forName(HiveDriverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "Yifan", "3199130E");
    Statement stmt = con.createStatement();
    String tableName = "t2";
    java.sql.ResultSet res;

    // register UDFs
    stmt.execute("add jar SDB-0.1-SNAPSHOT.jar");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.SDBIntAddUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'edu.hku.sdb.udf.SDBAddUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.SDBIntAddUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'edu.hku.sdb.udf.SDBKeyUpdateUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'edu.hku.sdb.udf.SDBMultiUDF'");

    // test simple UDF
    String sql = "select sdb_intadd(bin(t2.id), '1', '11'),bin(t2.id)  from t2";

    System.out.println("Testing UDF " + sql);
    res = con.createStatement().executeQuery(sql);

//    while (res.next()) {
//      System.out.println(res.getString(1) + " " + res.getString(2));
//    }
    return con;
  }


}