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

package edu.hku.sdb.catalog;

import edu.hku.sdb.utility.TypeNameCast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeNameCastTest {


  @Test
  public void testCastString2Type() {
    String primitiveINT = "INT";
    String primitiveCHAR = "CHAR(10)";
    String primitiveVARCHAR = "VARCHAR(10)";
    String primitiveDECIMAL = "DECIMAL(9,0)";

    assertEquals(Type.INT, TypeNameCast.castString2Type(primitiveINT));
    assertEquals(ScalarType.createCharType(10), TypeNameCast.castString2Type(primitiveCHAR));
    assertEquals(ScalarType.createVarcharType(10), TypeNameCast.castString2Type(primitiveVARCHAR));
    assertEquals(ScalarType.createDecimalType(9, 0), TypeNameCast.castString2Type(primitiveDECIMAL));
  }
}
