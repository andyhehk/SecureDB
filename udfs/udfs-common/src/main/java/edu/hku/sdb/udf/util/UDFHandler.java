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

import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class UDFHandler {

  private static final String SCHEME = "AES/ECB/PKCS5Padding";

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
    BigInteger result = (multiplicand.multiply(multiplier)).mod(n);
    return result;
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
   * (1) value less than halfN means that a > b, return true
   * (2) value greater or equal to halfN means that a < b, return false
   * @param value
   * @param halfN
   * @return
   */
  public static boolean greatThan(BigInteger value, BigInteger halfN) {
    if(value.equals(BigInteger.ZERO))
      return false;

    int result = value.compareTo(halfN);

    if(result < 0)
      return true;
    else
      return false;
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
   * (1) value less than halfN means that a > b, return false
   * (2) value greater or equal to halfN means that a < b, return true
   * @param value
   * @param halfN
   * @return
   */
  public static boolean lessThan(BigInteger value, BigInteger halfN) {
    int result = value.compareTo(halfN);

    if(result < 0)
      return false;
    else
      return true;
  }

  public static boolean match(ArrayList<String> text, String keyword, String publicKey) {

    SecretKey prkey = new SecretKeySpec(Base64.decodeBase64(publicKey), "AES");

    boolean match = false;
    for(String t : text) {
      if(search(Base64.decodeBase64(t), keyword, prkey))
        match = true;
    }

    return match;
  }

  private static boolean search(byte[] encrypted, String keyword, SecretKey prkey) {
    byte[] keywordbyte = keyword.getBytes();
    if (keywordbyte.length != encrypted.length) {
      return false;
    }
    byte[] diff1 = new byte[keywordbyte.length-1];
    for (int i = 0;i < diff1.length;i++) {
      diff1[i] = (byte) (encrypted[i]^keywordbyte[i]);
    }
    byte diff2 = (byte) (encrypted[diff1.length]^keywordbyte[diff1.length]);
    // get diff = word xor encrypted
    // if it is a match, first part of diff generates second part of diff using pseudo random function

    try {
      // pseudorandom cipher
      Cipher prCipher = Cipher.getInstance(SCHEME);
      prCipher.init(Cipher.ENCRYPT_MODE, prkey);

      // si is chopped with the desired length

      byte[] fksi = prCipher.doFinal(diff1);
      // fksi is F_k(S_i) in the searchable encryption
      // we use the same AES cipher for simplicity

      return fksi[0] == diff2;
    } catch (NoSuchAlgorithmException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (BadPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return false;
  }

}
