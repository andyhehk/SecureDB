package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.*;
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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

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

    uploadHandler = new UploadHandler();
    uploadHandler.setHDFS_URL("hdfs://localhost:9000");
    uploadHandler.setHDFS_FILE_PATH("hdfs://localhost:9000/user/yifan/test.txt");
    uploadHandler.setSourceFile("src/test/resources/upload/employee.txt");

    MetaStore metaDB = new MetaStore(pm);

    String dbName1 = "sdbclient";
    DBMeta db1 = new DBMeta(dbName1);
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
    col1.setSensitive(false);
    ColumnMeta col2 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName2.toUpperCase());
    col2.setSensitive(false);
    ColumnMeta col3 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName3.toUpperCase());
    col3.setSensitive(true);
    col3.setType(DataType.INT);
    //TODO: test with a sample column key
    col3.setColkey(new ColumnKey("1", "1"));
    ColumnMeta col4 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName4.toUpperCase());

    col4.setSensitive(true);
    col4.setType(DataType.INT);
    col4.setColkey(new ColumnKey("1", "1"));
    ColumnMeta col5 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName5.toUpperCase());
    col5.setSensitive(true);
    col5.setType(DataType.INT);
    col5.setColkey(new ColumnKey("1", "1"));
    ColumnMeta col6 = new ColumnMeta(dbName1, tblName1.toUpperCase(),
            colName6.toUpperCase());
    col6.setSensitive(true);
    col6.setType(DataType.INT);
    col6.setColkey(new ColumnKey("1", "1"));

    metaDB.addCol(col1);
    metaDB.addCol(col2);
    metaDB.addCol(col3);
    metaDB.addCol(col4);
    metaDB.addCol(col5);
    metaDB.addCol(col6);

    uploadHandler.setMetaStore(metaDB);

  }
//  @Test
  public void testGetBufferedReader() throws Exception {
    String sourceFile = ("src/test/resources/upload/employee.txt");
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFile));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = line;
        assertNotNull(newLine);
      }
      bufferedReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
}