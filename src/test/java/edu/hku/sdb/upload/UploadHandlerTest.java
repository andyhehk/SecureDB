package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import static org.junit.Assert.*;

public class UploadHandlerTest {


  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;
  private UploadHandler uploadHandler;
  private DBMeta db1;
  private BigInteger n;
  private BigInteger g;
  private BigInteger p;
  private BigInteger q;
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
            "jdbc:derby:memory:sdbclient;create=true");
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

    try {
      prepareMetaDB();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Drop the in-memory database after test.
   */
  @After
  public void clearTestDB() {
    try {
      pm.close();
      DriverManager.getConnection("jdbc:derby:memory:sdbclient;drop=true");
    } catch (SQLException se) {
      if (!se.getSQLState().equals("08006")) {
        // SQLState 08006 indicates a success
        se.printStackTrace();
      }
    }
  }

  public void prepareMetaDB() throws Exception {

    p = Crypto.generateRandPrime();
    q = Crypto.generateRandPrime();
    n = p.multiply(q);
    g = Crypto.generatePositiveRand(p ,q);

    uploadHandler = new UploadHandler();
    uploadHandler.setHDFS_URL("file:///");
    String homeDir = System.getenv("HOME");
    uploadHandler.setHDFS_FILE_PATH("file://"+homeDir+"/employee.txt");

//    uploadHandler.setHDFS_URL("hdfs://localhost:9000");
//    uploadHandler.setHDFS_FILE_PATH("hdfs://localhost:9000/user/yifan/employee.txt");

    uploadHandler.setSourceFile("src/test/resources/upload/employee.txt");
    uploadHandler.setLocalMode(true);

    MetaStore metaDB = new MetaStore(pm);

    String dbName1 = "sdbclient";
    db1 = new DBMeta(dbName1);

    db1.setN(n.toString());
    db1.setG(g.toString());
    db1.setP(p.toString());
    db1.setQ(q.toString());

    metaDB.addDB(db1);

    String tblName1 = "employeeName";
    TableMeta tbl1 = new TableMeta(dbName1, tblName1.toUpperCase());
    metaDB.addTbl(tbl1);
    assertEquals(tbl1, metaDB.getTbl(dbName1.toUpperCase(), tblName1));

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

    metaDB.addCol(col1);
    metaDB.addCol(col2);
    metaDB.addCol(col3);
    metaDB.addCol(col4);
    metaDB.addCol(col5);
    metaDB.addCol(col6);

    uploadHandler.setMetaStore(metaDB);

  }

//  @Test
//  public void testUpload() throws Exception {
//    String encryptedLine = (uploadHandler.processLineForTest("1;James;4"));
//    String[] columnValues = encryptedLine.split(";");
//    BigInteger r = Crypto.PailierDecrypt(new BigInteger(columnValues[3]), new BigInteger(db1.getP()) , new BigInteger(db1.getQ()));
//    BigInteger itemKey = Crypto.generateItemKey(m1, x1, r, g,p,q);
//    BigInteger salaryDecrypted =  Crypto.decrypt(new BigInteger(columnValues[2]), itemKey, n);
//    assertEquals(new BigInteger("4"), salaryDecrypted);
//  }

  @Test
  public void testUploadIntegrated(){
    uploadHandler.upload();
  }


}