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

import edu.hku.sdb.util.TestQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateStmtTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testCreateStmt() throws Exception {
    CreateStmt createStmt1 = TestQuery.prepareCreateStmtAnalysed();
    CreateStmt createStmt2 = TestQuery.prepareCreateStmtAnalysed();
    assertEquals(createStmt1, createStmt2);
    //CREATE TABLE t2 (id INT, name VARCHAR(20), salary VARCHAR(2048), row_id VARCHAR(2048), r VARCHAR(2048), s VARCHAR(2048)) ROW FORMAT DELIMITED FIELDS TERMINATED BY ';';
    System.out.println(createStmt1.toSql());
  }
}