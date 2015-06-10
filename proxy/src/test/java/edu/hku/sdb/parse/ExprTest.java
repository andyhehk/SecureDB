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

import org.junit.Test;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;

/**
 * Test equality of the values of two expressions.
 * Null pointer is not tested.
 */
public class ExprTest {

  @Test
  public void testIntLiteralEqual() {
    IntLiteral int1 = new IntLiteral(10);
    IntLiteral int2 = new IntLiteral(10);

    assertEquals(int1, int2);

    IntLiteral int3 = new IntLiteral(1);
    assertNotEquals(int1, int3);
  }

  @Test
  public void testFloatLiteralEqual() {
    FloatLiteral float1 = new FloatLiteral(10.0f);
    FloatLiteral float2 = new FloatLiteral(10.0f);

    assertEquals(float1, float2);

    FloatLiteral float3 = new FloatLiteral(9.0f);
    assertNotEquals(float1, float3);
  }

  @Test
  public void testStringLiteralEqual() {
    StringLiteral str1 = new StringLiteral("test");
    StringLiteral str2 = new StringLiteral("test");

    assertEquals(str1, str2);

    StringLiteral str3 = new StringLiteral("nottest");
    assertNotEquals(str1, str3);
  }

  @Test
  public void testBoolLiteralEqual() {
    BoolLiteral bool1 = new BoolLiteral(true);
    BoolLiteral bool2 = new BoolLiteral(true);

    assertEquals(bool1, bool2);

    BoolLiteral bool3 = new BoolLiteral(false);
    assertNotEquals(bool1, bool3);
  }

  @Test
  public void testFieldLiteralEqual() {
    FieldLiteral field1 = new FieldLiteral("test", "test", DataType.INT, true,
            new ColumnKey("1", "2"));
    FieldLiteral field2 = new FieldLiteral("test", "test", DataType.INT, true,
            new ColumnKey("1", "2"));

    assertEquals(field1, field2);

    FieldLiteral field3 = new FieldLiteral("nottest", "test", DataType.INT,
            true, new ColumnKey("1", "2"));
    assertNotEquals(field1, field3);

    FieldLiteral field4 = new FieldLiteral("test", "nottest", DataType.INT,
            true, new ColumnKey("1", "2"));
    assertNotEquals(field1, field4);

    FieldLiteral field5 = new FieldLiteral("test", "test", DataType.CHAR, true,
            new ColumnKey("1", "2"));
    assertNotEquals(field1, field5);

    FieldLiteral field6 = new FieldLiteral("test", "test", DataType.INT, false,
            new ColumnKey("1", "2"));
    assertNotEquals(field1, field6);

    FieldLiteral field7 = new FieldLiteral("test", "test", DataType.INT, true,
            new ColumnKey("1", "3"));
    assertNotEquals(field1, field7);

    FieldLiteral field8 = new FieldLiteral("test", "test", DataType.INT);
    FieldLiteral field9 = new FieldLiteral("test", "test", DataType.INT);
    assertEquals(field8, field9);
    assertNotEquals(field1, field8);

  }
}
