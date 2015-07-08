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

package edu.hku.sdb.udf.hive;

import edu.hku.sdb.udf.util.TypeCast;
import junit.framework.TestCase;

import java.math.BigInteger;

public class SdbKeyUpdateUDFTest extends TestCase {

  private SdbKeyUpdateUDF udf;

  protected void setUp() throws Exception {
    super.setUp();
    udf = new SdbKeyUpdateUDF();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
  }

  public void testEvaluate1() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("21")), udf.evaluate(
            TypeCast.bigIntToText(new BigInteger("9")),
            TypeCast.bigIntToText(new BigInteger("23")),
            TypeCast.bigIntToText(new BigInteger("4")),
            TypeCast.bigIntToText(new BigInteger("14")),
            TypeCast.bigIntToText(new BigInteger("35"))));
  }

  public void testEvaluate2() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("496849390869414279802")),
            udf.evaluate(TypeCast.bigIntToText(new BigInteger("22493371767")),
                    TypeCast.bigIntToText(new BigInteger("2451")),
                    TypeCast.bigIntToText(new BigInteger("4")),
                    TypeCast.bigIntToText(new BigInteger("134211")),
                    TypeCast.bigIntToText(new BigInteger("526631133691760337517"))));
  }

}
