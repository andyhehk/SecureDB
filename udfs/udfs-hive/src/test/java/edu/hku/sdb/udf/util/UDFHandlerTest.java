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

package edu.hku.sdb.udf.util;

import java.math.BigInteger;

import edu.hku.sdb.udf.util.UDFHandler;
import junit.framework.TestCase;


public class UDFHandlerTest extends TestCase {

  protected void setUp() throws Exception {
    super.setUp();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
  }

  public void testMultiHandler1() {
    BigInteger result = UDFHandler.multi(new BigInteger("9"),
            new BigInteger("31"), new BigInteger("35"));
    assertEquals(new BigInteger("34"), result);
  }

  public void testMultiHandler2() {
    BigInteger result = UDFHandler.multi(new BigInteger("22"),
            new BigInteger("29"), new BigInteger("35"));
    assertEquals(new BigInteger("8"), result);
  }

  public void testMultiHandler3() {
    BigInteger result = UDFHandler.multi(new BigInteger("7280564474"),
            new BigInteger("103228925936"), new BigInteger(
                    "526631133691760337517"));
    assertEquals(new BigInteger("224933717167058460147"), result);
  }

  public void testMultiHandler4() {
    BigInteger result = UDFHandler.multi(new BigInteger("22493371767"),
            new BigInteger("187342980733"), new BigInteger(
                    "526631133691760337517"));
    assertEquals(new BigInteger("926244031204465075"), result);
  }

  public void testKeyUpdateHandler1() {
    BigInteger result = UDFHandler.keyUpdate(new BigInteger("9"),
            new BigInteger("23"), new BigInteger("4"),
            new BigInteger("14"), new BigInteger("35"));
    assertEquals(new BigInteger("21"), result);
  }

  public void testKeyUpdateHandler2() {
    BigInteger result = UDFHandler.keyUpdate(new BigInteger("16"),
            new BigInteger("23"), new BigInteger("9"),
            new BigInteger("11"), new BigInteger("35"));
    assertEquals(new BigInteger("8"), result);
  }

  public void testKeyUpdateHandler3() {
    BigInteger result = UDFHandler.keyUpdate(
            new BigInteger("103228925936"), new BigInteger("24521"),
            new BigInteger("5"), new BigInteger("391847"), new BigInteger(
                    "526631133691760337517"));
    assertEquals(new BigInteger("336611475552112482890"), result);
  }

  public void testKeyUpdateHandler4() {
    BigInteger result = UDFHandler.keyUpdate(new BigInteger("10322836"),
            new BigInteger("2451"), new BigInteger("5"), new BigInteger(
                    "391147"), new BigInteger("526631133691760337517"));
    assertEquals(new BigInteger("23621196976797516602"), result);
  }

  public void testKeyUpdateHandler5() {
    BigInteger result = UDFHandler.keyUpdate(new BigInteger("22493371767"),
            new BigInteger("2451"), new BigInteger("4"), new BigInteger(
                    "134211"), new BigInteger("526631133691760337517"));
    assertEquals(new BigInteger("496849390869414279802"), result);
  }



}
