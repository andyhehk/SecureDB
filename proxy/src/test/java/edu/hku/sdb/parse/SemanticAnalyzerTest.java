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

package edu.hku.sdb.parse;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import edu.hku.sdb.catalog.DBMeta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.util.TestQuery;
import edu.hku.sdb.util.TestUtility;

public class SemanticAnalyzerTest {

  private SemanticAnalyzer testObj;
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

    DBMeta dbMeta = TestQuery.createDBMetaSimple();
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
    testObj = new SemanticAnalyzer(metadb);
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
  public void testAnalyzeJoin() {
    String command = "SELECT a + b FROM T1 JOIN T2 ON T1.id = T2.id WHERE a >" +
            " 1.0";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareAnsJoinAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testAnalyzeJoinGroupby() {
    String command = "SELECT a, count(*) FROM T1 JOIN T2 ON T1.id = T2.id " +
            "WHERE b > 1.0 GROUP BY a";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareAnsJoinGroupByAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Test
  public void testAnalyzeNested() {
    String command = "SELECT a + b FROM (SELECT id, a*a as a FROM T1) temp1 "
            + "JOIN T2 ON temp1.id = T2.id WHERE a > 1.0";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareAnsNestedAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testAnalyzeJoinMixSen() {
    String command = "SELECT a + c FROM T1 JOIN T2 ON T1.id = T2.id WHERE c > 1.0 AND b < 10";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareAnsJoinMixSenAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testCreateStmt() {
    String command = "CREATE TABLE employee (id INT, name VARCHAR(20), salary" +
            " INT ENC, age INT)";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareCreateStmtAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testAnalyzeComplexQuery() {
    String command = "SELECT temp1.id, count(*) as count, sum(a) as sum FROM " +
            "(SELECT T1.id as id, a*a as a, d FROM T1 RIGHT OUTER JOIN T2 ON T1.id = " +
            "T2.id JOIN T3 on T1.id = T3.id1 AND T2.id = T3.id2) temp1 " +
            "JOIN T2 ON temp1.id = T2.id WHERE d = 1.0 " +
            "GROUP BY temp1.id HAVING count > 10 ORDER BY sum DESC LIMIT 10";

    try {
      ASTNode astTree = parser.parse(command);

      ParseNode ansTree = TestQuery.prepareAnsComplexAnalyzed();
      ParseNode resultTree = testObj.analyze(astTree);

      assertEquals(ansTree, resultTree);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
