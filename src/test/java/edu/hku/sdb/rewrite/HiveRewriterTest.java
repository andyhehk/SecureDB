package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.parse.ParseDriver;
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
  private HiveRewriter hiveRewriter;
  private MetaStore metaStore;
  private DBMeta dbMeta;

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

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

    ColumnMeta col1 = new ColumnMeta(dbName, "T1", "id", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col2 = new ColumnMeta(dbName, "T1", "a", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col3 = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col4 = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey(new BigInteger("1"), new BigInteger("3")));
    ColumnMeta col5 = new ColumnMeta(dbName, "T2", "c");

    cols.add(col1);
    cols.add(col2);
    cols.add(col3);
    cols.add(col4);
    cols.add(col5);

    metaStore = new MetaStore(dbName, pm);
    metaStore.addCols(cols);


    testObj = new SemanticAnalyzer(metaStore);
    parser = new ParseDriver();
//    hiveRewriter = new HiveRewriter(metadb);

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testRewrite() throws Exception {

  }
}