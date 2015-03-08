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

import static org.junit.Assert.*;

import org.junit.Test;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;

public class BaseTableRefTest {

  @Test
  public void testEqual() {
    BaseTableRef tbl1 = new BaseTableRef("T1", "a");
    FieldLiteral left = new FieldLiteral("T1", "id", DataType.INT, true, new ColumnKey("1", "2"));
    FieldLiteral right = new FieldLiteral("T2", "id", DataType.INT, true, new ColumnKey("2", "3"));
    Expr onClause = new NormalBinPredicate(BinOperator.EQ, left, right);
    
    BaseTableRef tbl2 = new BaseTableRef("T2", "b");
    tbl2.setJoinOp(JoinOperator.INNER_JOIN);
    tbl2.setLeftTblRef(tbl1);
    tbl2.setOnClause(onClause);
    
    BaseTableRef tbl3 = new BaseTableRef("T2", "b");
    tbl3.setJoinOp(JoinOperator.INNER_JOIN);
    tbl3.setLeftTblRef(tbl1);
    tbl3.setOnClause(onClause);
    
    // Same left table
    assertEquals(tbl2, tbl3);

    BaseTableRef tbl4 = new BaseTableRef("T4", "");
    tbl3.setLeftTblRef(tbl4);

    // Different left table
    assertNotEquals(tbl2, tbl3);
  }
}
