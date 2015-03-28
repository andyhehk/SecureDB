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
package edu.hku.sdb.parse;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import edu.hku.sdb.parse.ASTNode;
import edu.hku.sdb.parse.ParseDriver;
import edu.hku.sdb.parse.ParseException;
import edu.hku.sdb.util.TestUtility;

/**
 * Unit test for simple App.
 */
public class ParserTest extends TestCase

{

  private ParseDriver parseDriver;
  private String stmtArraySimple;
  private String stmtArrayOneLevel;
  private String showTableQuery = "CREATE TABLE employee (id INT, name VARCHAR(20), salary INT ENC, age INT)";

  /**
   * Create the test case
   * 
   * @param testName
   *          name of the test case
   */
  public ParserTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(ParserTest.class);
  }

  public void setUp() {
    this.parseDriver = new ParseDriver();

    this.stmtArraySimple = " ";
    this.stmtArrayOneLevel = "select id, sum(price*quantity) from (select id, price, quantity from A JOIN B ) t group by id;";

    try {
      printVizTree(new ParseDriver().parse(showTableQuery));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  /**
   * Rigourous Test :-)
   */
  public void testParserSimple() {
    String[] stmts = stmtArraySimple.split(";");
    for (String stmt : stmts)
      try {
        doPrettyPrint(stmt);
      } catch (ParseException e) {
        System.out.println(e.getMessage());
      }
    assertTrue(true);
  }

  public void testParserOneLevel() {
    String[] stmts = stmtArrayOneLevel.split(";");
    for (String stmt : stmts)
      try {
        doPrettyPrint(stmt);
      } catch (ParseException e) {
        System.out.println(e.getMessage());
      }
    assertTrue(true);
  }

  private void printVizTree(ASTNode tree) {
    TestUtility testUtility = new TestUtility(tree);
    System.out.println(testUtility.visualize());
  }

  private void doPrettyPrint(String stmt) throws ParseException {
    ASTNode tree = parseDriver.parse(stmt.trim());
    System.out.println("Input SQL: " + stmt);
    System.out.println("Output SQL: " + tree.prettyPrint());
  }

}