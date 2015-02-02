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
import java.util.Set;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

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
      DriverManager.getConnection("jdbc:derby:memory:test_db;drop=true");
    } catch (SQLException se) {
      if (!se.getSQLState().equals("08006")) {
        // SQLState 08006 indicates a success
        se.printStackTrace();
      }
    }
  }

  /**
   * Insert 1. a "test" database; 2. a "test" table; 3. a "test" column
   */
  @Test
  public void testInsertDB() {
    Transaction tx = pm.currentTransaction();
    String name = "test";
    try {
      tx.begin();
      MetaStore metadb = new MetaStore(name);

      DBMeta db = new DBMeta(name);
      TableMeta tblMeta = new TableMeta(name);
      ColumnMeta colMeta = new ColumnMeta(name);

      tblMeta.getCols().add(colMeta);
      db.getTbls().add(tblMeta);
      metadb.getDbs().add(db);

      pm.makePersistent(metadb);
      tx.commit();

      MetaStore testmetadb = pm.getObjectById(MetaStore.class, name);
      Set<DBMeta> testdbs = testmetadb.getDbs();

      assertEquals(testdbs.size(), 1);
      for (DBMeta testdb : testdbs) {
        assertEquals(testdb.getTbls().size(), 1);
        assertEquals(testdb.getName(), name);
        for (TableMeta testtbl : testdb.getTbls()) {
          assertEquals(testtbl.getCols().size(), 1);
          assertEquals(testtbl.getName(), name);
          for (ColumnMeta testcol : testtbl.getCols()) {
            assertEquals(testcol.getName(), name);
          }
        }
      }
    } finally {
      if (tx.isActive()) {
        tx.rollback();
      }
      pm.close();
    }
  }

}
