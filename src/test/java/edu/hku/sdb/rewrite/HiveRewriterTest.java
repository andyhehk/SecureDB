package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SemanticAnalyzer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

public class HiveRewriterTest {

  private SemanticAnalyzer testObj;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private MetaStore metaStore;
  private DBMeta dbMeta;

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

  private String simpleSQL1 = "SELECT b FROM T2";
  private String simpleSQLMulEE = "SELECT b * id AS C FROM T2";
  private String simpleSQLMulEC = "SELECT b * 10 AS C FROM T2";
  private String simpleSQLAddEE = "SELECT b + id AS C FROM T2";
  private String simpleCreate = "CREATE TABLE employee (id INT, name VARCHAR(20), salary INT ENC, age INT)";

  /**
   * Prepare a in-memory database for testing
   */
  @Before
  public void setUp() throws Exception {
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

    String dbName = "default";
    dbMeta = new DBMeta(dbName);

    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    dbMeta.setN(n.toString());
    dbMeta.setP(p.toString());
    dbMeta.setQ(q.toString());
    dbMeta.setG(g.toString());


    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta col1 = new ColumnMeta(dbName, "T2", "s", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col3 = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col4 = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col5 = new ColumnMeta(dbName, "T2", "c");

    cols.add(col1);
    cols.add(col3);
    cols.add(col4);
    cols.add(col5);

    String tableName = "T2";
    TableMeta tableMeta = new TableMeta(dbName, tableName);
    tableMeta.setCols(cols);
    List<TableMeta> tbls = new ArrayList<TableMeta>();
    tbls.add(tableMeta);
    dbMeta.setTbls(tbls);

    metaStore = new MetaStore(dbName, pm);
    metaStore.addCols(cols);
    metaStore.addDB(dbMeta);

    testObj = new SemanticAnalyzer(metaStore);
    parser = new ParseDriver();
    sdbSchemeRewriter = new SdbSchemeRewriter(dbMeta);
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testRewrite() throws Exception {
    ParseNode parseNode = testObj.analyze(parser.parse(simpleSQL1));
    sdbSchemeRewriter.rewrite(parseNode);
    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLMulEE));
    sdbSchemeRewriter.rewrite(parseNode);
    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLMulEC));
    sdbSchemeRewriter.rewrite(parseNode);
    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLAddEE));
    sdbSchemeRewriter.rewrite(parseNode);
    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleCreate));
    sdbSchemeRewriter.rewrite(parseNode);
    System.out.println(parseNode.toSql());
  }

}