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

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.parse.ASTNode;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseNode;

import edu.hku.sdb.parse.SemanticAnalyzer;
import edu.hku.sdb.util.TestQuery;
import edu.hku.sdb.util.TestUtility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for the rewriter based on sdb encryption scheme.
 */
public class SdbSchemeRewriterTest {

  private AbstractRewriter testObj;
  private SemanticAnalyzer analyzer;
  private ParseDriver parser;

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

    Properties properties = TestUtility.createProperty();

    pmf = JDOHelper.getPersistenceManagerFactory(properties);
    pm = pmf.getPersistenceManager();

    DBMeta dbMeta = TestQuery.createDBMeta();
    metadb = new MetaStore(dbMeta.getName(), pm);
    metadb.addDB(dbMeta);

    return metadb;
  }

  /**
   * Prepare an in-memory database for testing
   */
  @Before
  public void prepare() {
    MetaStore metadb = prepareTestDB();
    testObj = new SdbSchemeRewriter(metadb.getDB(TestQuery.dbName));
    analyzer = new SemanticAnalyzer(metadb);
    parser = new ParseDriver();
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
  public void testRewriteJoin() {
    String command = "SELECT a + c FROM T1 JOIN T2 ON T1.id = T2.id WHERE c > 1.0 AND b < 10";
    try {
      // Parse
      ASTNode astTree = parser.parse(command);
      // Analyze
      ParseNode candidate = analyzer.analyze(astTree);
      // Rewrite
      testObj.rewrite(candidate);
      System.out.println(candidate.toSql());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testRewriteCreate() throws Exception{
    //"CREATE TABLE employee (id INT, name VARCHAR(20), salary INT ENC, age INT)";
    try {
      ParseNode candidate = TestQuery.prepareCreateStmtAnalyzed();
      String ansQuery = TestQuery.prepareCreateStmtRewritten();
      testObj.rewrite(candidate);
      assertEquals(ansQuery, candidate.toSql());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}