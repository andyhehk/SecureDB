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

package edu.hku.sdb.parse;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SemanticAnalyzerTest {

  private SemanticAnalyzer testObj;
  private ParseDriver parser;
  
  @Before
  public void setUp() {
    testObj = new SemanticAnalyzer();
    parser = new ParseDriver();
  }
  
  @After
  public void tearDown() {
    
  }
  
  @Test
  public void testAnalyze() throws ParseException {
    String command = "SELECT a + b FROM T1 JOIN T2 ON T1.id = T2.id;";
    
    ASTNode tree = parser.parse(command);
  }
  
}
