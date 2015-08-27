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

import edu.hku.sdb.util.TestUtility;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for parser.
 */
public class ParserTest
{

  private ParseDriver parseDriver;
  private String stmtArraySimple;
  private String stmtArrayOneLevel;
  private String createTableQuery = "CREATE TABLE employee (id INT, name VARCHAR(20), salary DECIMAL(10,2) ENC, age INT ENC)";

  @Before
  public void prepare() {
    parseDriver = new ParseDriver();
  }

  @Test
  public void testCreateTable() {
    try {
      ASTNode createStatement = parseDriver.parse(createTableQuery);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testNestedQuery() {
    String command = "SELECT a FROM (SELECT a FROM test) test";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testStringSearch() {
    String command = "SELECT a FROM test WHERE b like \"%hello%\"";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testShowDBsStmt() {
    String command = "SHOW DATABASES";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testShowTBLsStmt() {
    String command = "SHOW TABLES";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testDescribeTblStmt() {
    String command = "DESCRIBE test";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testDropTblStmt() {
    String command = "DROP TABLE test";
    try {
      ASTNode createStatement = parseDriver.parse(command);
      System.out.println(TestUtility.visualize(createStatement));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}