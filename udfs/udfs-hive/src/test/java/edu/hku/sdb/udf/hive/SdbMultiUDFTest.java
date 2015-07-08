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

public class SdbMultiUDFTest extends TestCase {

  private SdbMultiUDF udf;

  protected void setUp() throws Exception {
    super.setUp();
    udf = new SdbMultiUDF();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
  }

  public void testEvaluate1() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("34")),
            udf.evaluate(TypeCast.bigIntToText(new BigInteger("9")),
                    TypeCast.bigIntToText(new BigInteger("31")),
                    TypeCast.bigIntToText(new BigInteger("35"))));
  }

  public void testEvaluate2() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("8")),
            udf.evaluate(TypeCast.bigIntToText(new BigInteger("22")),
                    TypeCast.bigIntToText(new BigInteger("29")),
                    TypeCast.bigIntToText(new BigInteger("35"))));
  }

  public void testEvaluate3() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("224933717167058460147")),
            udf.evaluate(TypeCast.bigIntToText(new BigInteger("7280564474")),
                    TypeCast.bigIntToText(new BigInteger("103228925936")),
                    TypeCast.bigIntToText(new BigInteger("526631133691760337517"))));
  }

  public void testEvaluate4() {
    assertEquals(TypeCast.bigIntToText(new BigInteger("926244031204465075")),
            udf.evaluate(TypeCast.bigIntToText(new BigInteger("22493371767")),
                    TypeCast.bigIntToText(new BigInteger("187342980733")),
                    TypeCast.bigIntToText(new BigInteger("526631133691760337517"))));
  }
}
