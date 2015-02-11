/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.catalog;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the MetaStore using derby.
 */
public class MetaStoreTest {

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

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
  }

  /**
   * Drop the in-memory database after test.
   */
  @After
  public void clearTestDB() {
    try {
      pm.close();
      DriverManager.getConnection("jdbc:derby:memory:test_db;drop=true");
    } catch (SQLException se) {
      if (!se.getSQLState().equals("08006")) {
        // SQLState 08006 indicates a success
        se.printStackTrace();
      }
    }
  }

  @Test
  public void testInsertDB() {
    MetaStore metaDB = new MetaStore(pm);

    String dbName1 = "dummy_db1";
    String dbName2 = "dummy_db2";

    DBMeta db1 = new DBMeta(dbName1);
    DBMeta db2 = new DBMeta(dbName2.toUpperCase());

    metaDB.addDB(db1);
    metaDB.addDB(db2);

    assertEquals(db1, metaDB.getDB(dbName1.toUpperCase()));
    assertEquals(db2, metaDB.getDB(dbName2));

    String tblName1 = "dummy_tbl1";
    String tblName2 = "dummy_tbl2";

    TableMeta tbl1 = new TableMeta(dbName1, tblName1.toUpperCase());
    TableMeta tbl2 = new TableMeta(dbName2.toUpperCase(), tblName2);

    metaDB.addTbl(tbl1);
    metaDB.addTbl(tbl2);

    assertEquals(tbl1, metaDB.getTbl(dbName1.toUpperCase(), tblName1));
    assertEquals(tbl2, metaDB.getTbl(dbName2, tblName2.toUpperCase()));

    String colName1 = "dummy_col1";
    String colName2 = "dummy_col2";

    ColumnMeta col1 = new ColumnMeta(dbName1.toUpperCase(),
        tblName1.toUpperCase(), colName1);
    ColumnMeta col2 = new ColumnMeta(dbName2, tblName2.toUpperCase(),
        colName2.toUpperCase());

    metaDB.addCol(col1);
    metaDB.addCol(col2);

    assertEquals(col1,
        metaDB.getCol(dbName1, tblName1.toUpperCase(), colName1.toUpperCase()));
    assertEquals(col2,
        metaDB.getCol(dbName2.toUpperCase(), tblName2.toUpperCase(), colName2));

  }

}