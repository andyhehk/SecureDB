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
 *    
 *******************************************************************************/
package edu.hku.sdb.rewrite;

import java.math.BigInteger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.ColumnMeta;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SemanticAnalyzer;
import edu.hku.sdb.util.TestQuery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the rewriter based on sdb encryption scheme.
 */
public class SdbSchemeRewriterTest {

  private AbstractRewriter testObj;
  
  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

  public MetaStore prepareTestDB() {
    MetaStore metadb;
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

    cols.add(col1);
    cols.add(col2);
    cols.add(col3);
    cols.add(col4);

    metadb = new MetaStore(dbName, pm);
    metadb.addCols(cols);
    
    return metadb;
  }
  
  /**
   * Prepare an in-memory database for testing
   */
  @Before
  public void prepare() {
    MetaStore metadb = prepareTestDB();
    testObj = new SdbSchemeRewriter(metadb.getDB("dummy_db"));
  }

  /**
   * Drop the in-memory database after test.
   */
  @After
  public void clearup() {
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
  public void testRewriteJoinGroupBy() {
    ParseNode candidateTree = TestQuery.prepareAnsJoinGroupBy();
    try {
      testObj.rewrite(candidateTree);
    } catch (UnSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}