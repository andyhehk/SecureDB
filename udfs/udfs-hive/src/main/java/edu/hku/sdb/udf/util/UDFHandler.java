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

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

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
   * Simple BigInteger addition for row ID.
   *
   * @param rowID1
   * @param rowID2
   * @return rowID1 + rowID2
   */
  public static BigInteger integerAdd(BigInteger rowID1, BigInteger rowID2, BigInteger n) {
    return rowID1.add(rowID2).mod(n);
  }


  /**
   * Returns true if value is less than halfN, false if value is greater than or equal to halfN.
   *
   * (1) value less than halfN means that a > b
   * (2) value greater or equal to halfN means that a < b.
   * @param value
   * @param halfN
   * @return
   */
  public static boolean greatThan(BigInteger value, BigInteger halfN) {
    int result = halfN.compareTo(value);

    if(result > 0)
      return true;
    else {
      return false;
    }
  }

  /**
   * Return true is value is zero.
   *
   * @param value
   * @return
   */
  public static boolean equal(BigInteger value) {
    return value.equals(BigInteger.ZERO);
  }

  /**
   * Returns true if value is greater than or equal to halfN, false if value is less than halfN.
   *
   * (1) value less than halfN means that a > b
   * (2) value greater or equal to halfN means that a < b.
   * @param value
   * @param halfN
   * @return
   */
  public static boolean lessThan(BigInteger value, BigInteger halfN) {
    int result = halfN.compareTo(value);

    if(result <= 0)
      return true;
    else
      return false;
  }

}
