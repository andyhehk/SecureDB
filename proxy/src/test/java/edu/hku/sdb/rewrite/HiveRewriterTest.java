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

package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseNode;
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

public class HiveRewriterTest {

  private SemanticAnalyzer testObj;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private MetaStore metaStore;
  private DBMeta dbMeta;

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;

  private String simpleSQL1 = "SELECT b FROM T2";
  private String simpleSQLMulEE = "SELECT b * id AS C FROM T2";
  private String simpleSQLMulEC = "SELECT b * 10 AS C FROM T2";
  private String simpleSQLAddEE = "SELECT b + id AS C FROM T2";

  private String simpleSQLSubEC = "SELECT b - 10 AS C FROM T2";
  private String simpleSQLWhereSubEC = "SELECT b - 10 AS C FROM T2 WHERE b < 1 and 1 = 1";
  private String countQuery = "SELECT count(b) FROM T2 WHERE b < 1";


  private String simpleCreate = "CREATE TABLE employee (id INT, name VARCHAR(20), salary INT ENC, age INT)";
  private String simpleLoad = "LOAD DATA LOCAL INPATH '/User/Yifan/employee.txt' OVERWRITE INTO TABLE test_create_1";

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

    String dbName = "default";
    dbMeta = new DBMeta(dbName);

    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    dbMeta.setN(n.toString());
    dbMeta.setPrime1(p.toString());
    dbMeta.setPrime2(q.toString());
    dbMeta.setG(g.toString());


    List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

    String tableName = "T2";
    ColumnMeta col3 = new ColumnMeta(dbName, "T2", "id", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col4 = new ColumnMeta(dbName, "T2", "b", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col5 = new ColumnMeta(dbName, "T2", "c");
    ColumnMeta col6 = new ColumnMeta(dbName, "T2", "s", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));
    ColumnMeta col7 = new ColumnMeta(dbName, "T2", "r", DataType.INT, true,
            new ColumnKey(Crypto.generatePositiveRand(p, q), Crypto.generatePositiveRand(p, q)));

    cols.add(col3);
    cols.add(col4);
    cols.add(col5);
    cols.add(col6);
    cols.add(col7);

    TableMeta tableMeta = new TableMeta(dbName, tableName);
    tableMeta.setCols(cols);
    List<TableMeta> tbls = new ArrayList<TableMeta>();
    tbls.add(tableMeta);
    dbMeta.setTbls(tbls);

    metaStore = new MetaStore(dbName, pm);
    metaStore.addCols(cols);
    metaStore.addDB(dbMeta);

    testObj = new SemanticAnalyzer(metaStore);
    parser = new ParseDriver();
    sdbSchemeRewriter = new SdbSchemeRewriter(dbMeta);
  }

  @After
  public void tearDown() throws Exception {

  }

  //@Test
  public void testRewrite() throws Exception {
    ParseNode parseNode = testObj.analyze(parser.parse(simpleSQL1));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLMulEE));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLMulEC));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleSQLAddEE));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

  }

  @Test
  public void testRewriteComparison() throws Exception {
    ParseNode parseNode = testObj.analyze(parser.parse(simpleSQLSubEC));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

//    parseNode = testObj.analyze(parser.parse(simpleSQLWhereSubEC));
//    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(countQuery));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

  }


  //@Test
  public void testRewriteCreate() throws Exception {
    ParseNode parseNode = testObj.analyze(parser.parse(simpleCreate));
    sdbSchemeRewriter.rewrite(parseNode);
//    System.out.println(parseNode.toSql());

    parseNode = testObj.analyze(parser.parse(simpleLoad));
//    System.out.println(parseNode.toSql());
  }

}