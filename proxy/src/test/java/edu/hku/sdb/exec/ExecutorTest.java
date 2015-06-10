package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.connect.ResultSetMetaData;
import edu.hku.sdb.connect.SdbResultSet;
import edu.hku.sdb.connect.SdbStatement;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.SdbSchemeRewriter;
import edu.hku.sdb.rewrite.UnSupportedException;
import edu.hku.sdb.upload.UploadHandler;
import edu.hku.sdb.utility.ProfileUtil;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;

import static org.junit.Assert.*;

public class ExecutorTest {

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private static String HiveDriverName = "org.apache.hive.jdbc.HiveDriver";
  private String serverConnectionURL = "jdbc:hive2://galaxy046:10000/default";
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
  private Connection connection;

  private String targetTableName = "lineitem_1000000_enc_64_" + new Random().nextInt(100);
  private String simpleCreateQuery = "CREATE TABLE " + targetTableName + " (L_ORDERKEY    INT,\n" +
          "                             L_PARTKEY     INT,\n" +
          "                             L_SUPPKEY     INT,\n" +
          "                             L_LINENUMBER  INT,\n" +
          "                             L_QUANTITY    INT ENC,\n" +
          "                             L_EXTENDEDPRICE  INT ENC,\n" +
          "                             L_DISCOUNT    INT ENC,\n" +
          "                             L_TAX         INT,\n" +
          "                             L_RETURNFLAG  VARCHAR(1),\n" +
          "                             L_LINESTATUS  VARCHAR(1),\n" +
          "                             L_SHIPDATE    VARCHAR(11),\n" +
          "                             L_COMMITDATE  VARCHAR(11),\n" +
          "                             L_RECEIPTDATE VARCHAR(11),\n" +
          "                             L_SHIPINSTRUCT VARCHAR(25),\n" +
          "                             L_SHIPMODE     VARCHAR(10),\n" +
          "                             L_COMMENT      VARCHAR(44))";

  private String simpleSelectWhereQuery = "select L_LINENUMBER from " + targetTableName + " where L_QUANTITY > 49";
  private String selectFromDemoEE = "select a, b, c, d from demo where a < b";
  private String EPSubtractDemoEE = "select count(a) from demo_table where a < 620";


  private String benchEC = "select count(a) from demo";


  private String simpleLoadQuery = "LOAD DATA LOCAL INPATH 'src/test/resources/upload/lineitem_200k.txt' OVERWRITE INTO TABLE " + targetTableName;
  private String simpleMultipleMultiECQuery = "select L_ORDERKEY from " + targetTableName;

  @Before
  public void setUp(){
    prepareTestDB();
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

    String dbName = "default";
    DBMeta dbMeta = new DBMeta(dbName);

    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    dbMeta.setN(n.toString());
    dbMeta.setP(p.toString());
    dbMeta.setQ(q.toString());
    dbMeta.setG(g.toString());

    metaDB.addDB(dbMeta);

    try {
      connection = getHiveConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void testSimpleSelect() throws Exception{

//      String testQuery = selectFromDemoEE;
      String testQuery = EPSubtractDemoEE;

    // Parse & analyse
    System.out.println("Parsing " + testQuery);
    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
    ASTNode parsedNode = parser.parse(testQuery);
    ParseNode analyzedNode  = semanticAnalyzer.analyze(parsedNode);

    // Rewrite
    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDB.getAllDBs().get(0));
    sdbSchemeRewriter.rewrite(analyzedNode);

    // Optimize
    System.out.println("Optimizing " + analyzedNode.toSql());
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = optimizer.optimize(analyzedNode, connection, null);

    // Execute
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);

    ResultSetMetaData sdbMetaData = resultSet.getResultSetMetaData();
    System.out.println(sdbMetaData.getColumnName(1));
    while (resultSet.next()){
      System.out.println(resultSet.getLong(1));
    }
  }

  private Connection getHiveConnection() throws SQLException {
    try {
      Class.forName(HiveDriverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://galaxy046:10000/default", "Yifan", "*");
    Statement stmt = con.createStatement();

    // register UDFs
    //stmt.execute("add jar SDB-0.1-SNAPSHOT.jar");
    //stmt.execute("add jar file:///home/haibin/apache/spark/lib/SDB-0.1-SNAPSHOT.jar");
//    stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'SDBIntAddUDF'");
//    stmt.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'SDBAddUDF'");
//    stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'SDBKeyUpdateUDF'");
//    stmt.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'SDBMultiUDF'");
//    stmt.execute("CREATE TEMPORARY FUNCTION sdb_compare AS 'SDBCompareUDF'");


    return con;
  }


  @Test
  public void testExecuteCreate() throws Exception{
    testCreateInternal();
//    testLoadInternal();
//    testSimpleSelect();
    ;
  }

  private void testCreateInternal() throws ParseException, SemanticException, UnSupportedException, SQLException, RemoteException {

    String testQuery = simpleCreateQuery;

    // Parse & analyse
    System.out.println("Parsing " + testQuery);
    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
    ASTNode parsedNode = parser.parse(testQuery);
    ParseNode analyzedNode  = semanticAnalyzer.analyze(parsedNode);

    // Rewrite
    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDB.getAllDBs().get(0));
    sdbSchemeRewriter.rewrite(analyzedNode);

    // Optimize
    System.out.println("Optimizing " + analyzedNode.toSql());
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = optimizer.optimize(analyzedNode, connection, metaDB);

    // Execute
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);
  }

  private void testLoadInternal() throws ParseException, SemanticException, UnSupportedException, SQLException, RemoteException {
    String testQuery = simpleLoadQuery;

    SdbStatement sdbStatement = new SdbStatement(metaDB, connection);
    sdbStatement.executeQuery(testQuery);
  }

}