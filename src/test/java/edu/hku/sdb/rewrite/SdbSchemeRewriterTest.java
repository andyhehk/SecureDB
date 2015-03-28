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

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.ASTNode;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SemanticAnalyzer;
import edu.hku.sdb.upload.UploadHandler;
import edu.hku.sdb.util.TestQuery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    String dbName = "default";

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

    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger g = Crypto.generatePositiveRand(p ,q);


    DBMeta db1 = new DBMeta(dbName);
    db1.setN(n.toString());
    db1.setG(g.toString());
    db1.setP(p.toString());
    db1.setQ(q.toString());

    metadb = new MetaStore(dbName, pm);
    metadb.addCols(cols);
    metadb.addDB(db1);
    
    return metadb;
  }
  
  /**
   * Prepare an in-memory database for testing
   */
  @Before
  public void prepare() {
    MetaStore metadb = prepareTestDB();
    testObj = new SdbSchemeRewriter(metadb.getAllDBs().get(0));
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

  //@Test
  public void testRewriteJoinGroupBy() {
    ParseNode candidateTree = TestQuery.prepareAnsJoinGroupBy();
    try {
      testObj.rewrite(candidateTree);
    } catch (UnSupportedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testRewriteCreate() throws Exception{
    //"CREATE TABLE employee (id INT, name VARCHAR(20), salary INT ENC, age INT)";
    try {
      ParseNode tree = TestQuery.prepareCreateStmtAnalysed();
      ParseNode ansTreeRewritten = TestQuery.prepareCreateStmtRewritten();
      testObj.rewrite(tree);
      System.out.println(tree.toSql());
      assertEquals(ansTreeRewritten.toSql(), tree.toSql());

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}