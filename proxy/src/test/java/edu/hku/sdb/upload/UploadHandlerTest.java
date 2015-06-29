/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.TableName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.math.BigInteger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
  private BigInteger totient;

  ColumnKey columnKeySalary;
  ColumnKey columnKeyRowId;

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
    g = Crypto.generatePositiveRand(p, q);
    totient = Crypto.evaluateTotient(p, q);

    MetaStore metaDB = new MetaStore(pm);

    String dbName1 = DBMeta.defaultDbName;
    db1 = new DBMeta(dbName1);

    db1.setN(n.toString());
    db1.setG(g.toString());
    db1.setPrime1(p.toString());
    db1.setPrime2(q.toString());

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

    columnKeySalary = new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q));
    col3.setColkey(columnKeySalary);
    columnKeyRowId = new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q));
    col4.setColkey(columnKeyRowId);
    col5.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    col6.setColkey(new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));

    col1.setSensitive(false);
    col2.setSensitive(false);
    col3.setSensitive(true);
    col4.setSensitive(true);
    col5.setSensitive(true);
    col6.setSensitive(true);

    List<ColumnMeta> columnMetaList = new ArrayList<>();

    columnMetaList.add(col1);
    columnMetaList.add(col2);
    columnMetaList.add(col3);
    columnMetaList.add(col4);
    columnMetaList.add(col5);
    columnMetaList.add(col6);

    metaDB.addCols(columnMetaList);
    tbl1.setCols(columnMetaList);
    db1.add(tbl1);

    metaDB.addTbl(tbl1);
    metaDB.addDB(db1);

    TableName tableName = new TableName();
    tableName.setName(tblName1);

    uploadHandler = new UploadHandler(metaDB, tableName);
    uploadHandler.setHDFS_URL("file:///");
    String homeDir = System.getenv("HOME");
    uploadHandler.setHDFS_FILE_PATH("file://" + homeDir + "/employee_test_mid.txt");
//    uploadHandler.setHDFS_URL("hdfs://localhost:9000");
//    uploadHandler.setHDFS_FILE_PATH("hdfs://localhost:9000/user/yifan/employee.txt");

    uploadHandler.setSourceFile("src/test/resources/upload/employee_mid.txt");
    uploadHandler.setLocalMode(true);

  }

//  @Test
//     public void testUploadIntegrated(){
//    uploadHandler.upload();
//  }

  @Test
  public void testUpload() {
    String encryptedLine = (uploadHandler.processLineForTest("1|James|4"));
    String[] columnValues = encryptedLine.split(";");
    BigInteger r = Crypto.SIESDecrypt(Crypto.getSecureBigInt(columnValues[3]), columnKeyRowId.getM(), columnKeyRowId.getX(), new BigInteger(db1.getPrime1()).multiply(new BigInteger(db1.getPrime2())));
    BigInteger itemKey = Crypto.generateItemKeyOp2(columnKeySalary.getM(), columnKeySalary.getX(), r, g, n, totient, p, q);
    BigInteger salaryDecrypted = Crypto.decrypt(Crypto.getSecureBigInt(columnValues[2]), itemKey, n);
    assertEquals(new BigInteger("4"), salaryDecrypted);
  }

}