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

public class UDFHandler {
  /**
   * Returns (ae * be) mod n according to SDB Multiplication (EE Mode) protocol
   *
   * @param multiplicand ae, whose value < n
   * @param multiplier   be, whose value < n
   * @param n
   * @return
   */
  public static BigInteger multi(BigInteger multiplicand,
                                 BigInteger multiplier, BigInteger n) {
    return (multiplicand.multiply(multiplier)).mod(n);
  }

  /**
   * Calculates the ciphertext ce according to updated p, q values during A's keyUpdate operation.
   *
   * @param a the ciphertext of A, whose value < n
   * @param s the ciphertext of helper S, whose value < n
   * @param p the new p generated in A's keyUpdate operation
   * @param q the new q generated in A's keyUpdate operation
   * @param n
   * @return
   */
  public static BigInteger keyUpdate(BigInteger a, BigInteger s,
                                     BigInteger p, BigInteger q, BigInteger n) {

    BigInteger sp = s.modPow(p, n);
    return (q.multiply(a).multiply(sp)).mod(n);
  }

  /**
   * Returns (ae + be) mod n according to SDB Addition (EE Mode) protocol
   *
   * @param a  ae, whose value < n
   * @param b  be, whose value < n
   * @param n
   * @return
   */
  public static BigInteger add(BigInteger a, BigInteger b, BigInteger n) {
    return (a.add(b)).mod(n);
  }

  //TODO: test cartesianProduct UDF
  /* this function is not tested yet */
  public static BigInteger cartesianProduct(BigInteger a, BigInteger s, BigInteger p, BigInteger n) {
    return s.modPow(p, n).multiply(a).mod(n);
  }

  /**
   * Simple BigInteger addition.
   *
   * @param a
   * @param b
   * @return a + b
   */
  public static BigInteger integerAdd(BigInteger a, BigInteger b, BigInteger n) {
    return a.add(b).mod(n);
  }


  /**
   * returns -1 if a is greater than b, 1 if a is less than b.
   *
   * @param a
   * @param b
   * @return either -1, 0 or 1.
   */
  public static int compare(BigInteger a, BigInteger b) {
    if (a.equals(BigInteger.ZERO)) {
      return 0;
    }
    return b.compareTo(a);
  }
}
