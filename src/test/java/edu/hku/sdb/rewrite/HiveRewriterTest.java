package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.*;
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
  private SemanticAnalyzer semanticAnalyzer;

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

  private String simpleSQL1 = "SELECT b FROM T2";
  private String simpleSQLMulEE = "SELECT b * id AS C FROM T2";
  private String simpleSQLMulEC = "SELECT b * 10 AS C FROM T2";

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

    String dbName = "dummy_db";
    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    ColumnMeta col3 = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey(new BigInteger("2"), new BigInteger("2")));
    ColumnMeta col4 = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col5 = new ColumnMeta(dbName, "T2", "c");

    cols.add(col3);
    cols.add(col4);
    cols.add(col5);

    String tableName = "T2";
    TableMeta tableMeta = new TableMeta(dbName, tableName);
    tableMeta.setCols(cols);
    List<TableMeta> tbls = new ArrayList<TableMeta>();
    tbls.add(tableMeta);

    dbMeta = new DBMeta(dbName);
    dbMeta.setTbls(tbls);
    dbMeta.setN("35");
    dbMeta.setP("5");
    dbMeta.setQ("7");
    dbMeta.setG("2");

    metaStore = new MetaStore(dbName, pm);
    metaStore.addCols(cols);

    testObj = new SemanticAnalyzer(metaStore);
    parser = new ParseDriver();
    sdbSchemeRewriter = new SdbSchemeRewriter(dbMeta);
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testRewrite() throws Exception {

  }
}