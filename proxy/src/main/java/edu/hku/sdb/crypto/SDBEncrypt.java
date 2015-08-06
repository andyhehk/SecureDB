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

package edu.hku.sdb.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;

import thep.paillier.EncryptedInteger;
import thep.paillier.PrivateKey;
import thep.paillier.PublicKey;
import thep.paillier.exceptions.BigIntegerClassNotValid;

public class SDBEncrypt {

  public static int defaultCertainty = 100;
  public static int FIVE_HUNDRED_AND_TWELVE = 512;
  public static int ONE_THOUSAND_TWENTY_FOUR = 1024;
  public static int EIGHTY = 80;
  public static int THIRTY_TWO = 32;

  public static int defaultPrimeLength = FIVE_HUNDRED_AND_TWELVE;
  public static int defaultRandLengthShort = EIGHTY;
  public static int defaultRandLength = ONE_THOUSAND_TWENTY_FOUR;

  public static HashMap<String, BigInteger> modPowMap = new HashMap<String,
          BigInteger>();

  /**
   * @return a random prime number with bit length = 512, certainty = 10
   */
  public static BigInteger generateRandPrime() {
    return generateRandPrime(defaultPrimeLength);
  }

  public static BigInteger generateRandPrime(int length) {
    return BigInteger.probablePrime(length, new SecureRandom());
  }

  /**
   * @param p
   * @param q
   * @return the totient of p and q
   */
  public static BigInteger evaluateTotient(BigInteger p, BigInteger q) {
    return (p.subtract(BigInteger.ONE))
            .multiply(q.subtract(BigInteger.ONE));
  }

  /**
   * @param numBits
   * @return a positive random number with specified number of bits
   */
  private static BigInteger generatePositiveRand(int numBits) {
    return new BigInteger(numBits, new SecureRandom());
  }

  /**
   * Generates a positive random number of 2048 bits, which is less than n,
   * and co-prime with both n and totient(n).
   *
   * @param p
   * @param q
   * @return a random positive big integer co-prime with p,q & totient(p,q)
   */
  public static BigInteger generatePositiveRand(BigInteger p, BigInteger q) {
    return generatePositiveRandInternal(p, q, defaultRandLength);
  }

  public static BigInteger generatePositiveRand(BigInteger p, BigInteger q,
                                                int numBits) {
    return generatePositiveRandInternal(p, q, numBits);
  }

  /**
   * Generates a positive random number of 2048 bits, which is less than n,
   * and co-prime with both n and totient(n).
   *
   * @param p
   * @param q
   * @return a random positive big integer co-prime with p,q & totient(p,q)
   */
  public static BigInteger generatePositiveRandShort(BigInteger p, BigInteger
          q) {
    return generatePositiveRandInternal(p, q, defaultRandLengthShort);
  }

  public static BigInteger generatePositiveRandExShort(BigInteger p,
                                                       BigInteger q) {
    return generatePositiveRandInternal(p, q, THIRTY_TWO);
  }

  private static BigInteger generatePositiveRandInternal(BigInteger p,
                                                         BigInteger q, int
                                                                 numBits) {
    BigInteger n = p.multiply(q);
    BigInteger totient = SDBEncrypt.evaluateTotient(p, q);
    BigInteger r = null;
    while (true) {
      r = generatePositiveRand(numBits);
      try {
        BigInteger rReverseN = r.modInverse(n);
        BigInteger rReverseTotient = r.modInverse(totient);
      } catch (ArithmeticException e) {
        //r is not co-prime with n or totient(n)
        continue;
      }
      //r is less than n and positive
      if (r.compareTo(BigInteger.ZERO) == 1 && r.compareTo(n) == -1) break;
    }
    return r;
  }


  /**
   * Generates an item key based on columnKey<m,x> and row-id.
   *
   * @param m m value of columnKey whose value is less than (p * q)
   * @param x x value of columnKey whose value is less than (p * q)
   * @param r row-id, whose value is less than (p * q)
   * @param g
   * @param p
   * @param q
   * @return item key based on m, x, r, g, p, q
   */
  private static BigInteger generateItemKey(BigInteger m, BigInteger x,
                                            BigInteger r, BigInteger g,
                                            BigInteger p, BigInteger q) {

    BigInteger n = p.multiply(q);
    BigInteger totient = SDBEncrypt.evaluateTotient(p, q);
    BigInteger power = r.multiply(x).mod(totient);
    BigInteger grx = g.modPow(power, n);

    return (m.multiply(grx)).mod(n);
  }

  public static BigInteger generateItemKeyOp2(BigInteger m, BigInteger x,
                                              BigInteger rowID, BigInteger g,
                                              BigInteger n, BigInteger
                                                      totient, BigInteger prime1,
                                              BigInteger prime2) {

    String key = g.toString() + "::" + x.toString() + "::" + n.toString();
    BigInteger gx;
    if (!modPowMap.containsKey(key)) {
      gx = g.modPow(x.mod(totient), n);
      modPowMap.put(key, gx);
    } else {
      gx = modPowMap.get(key);
    }
    BigInteger power = rowID.mod(totient);
    BigInteger grx = SDBEncrypt.modPow(gx, power, prime1, prime2);

    return (m.multiply(grx)).mod(n);
  }


  public static BigInteger modPow(BigInteger base, BigInteger power,
                                  BigInteger p, BigInteger q) {
    BigInteger basePowerModQ = base.modPow(power, q);
    BigInteger basePowerModP = base.modPow(power, p);
    BigInteger pInverseQ = p.modInverse(q);

    BigInteger result = (basePowerModQ.subtract(basePowerModP).multiply
            (pInverseQ)).mod(q).multiply(p).add(basePowerModP);
    return result;
  }

  /**
   * Encrypt a plaintext with its itemKey using secret sharing
   *
   * @param plainText plaintext to be encrypted
   * @param itemKey   an itemKey with value less than n
   * @param n
   * @return encrypted value based on plainText, itemKey and n
   */
  public static BigInteger encrypt(BigInteger plainText, BigInteger itemKey,
                                   BigInteger n) {
    BigInteger keyInverse = itemKey.modInverse(n);
    return (plainText.multiply(keyInverse)).mod(n);
  }

  /**
   * Decrypt a ciphertext with its itemKey using secret sharing
   *
   * @param ciphertext ciphertext to be decrypted, whose value < n
   * @param itemKey    an itemKey                , whose value < n
   * @param n
   * @return decrypted value based on cipherText, itemKey and n
   */
  public static BigInteger decrypt(BigInteger ciphertext, BigInteger itemKey,
                                   BigInteger n) {
    return (ciphertext.multiply(itemKey)).mod(n);
  }

  /**
   * (DEPRECATED due to poor performance of open source package) Encrypt a
   * plaintext with Pailier Encryption algorithm. Adopted from thep.paillier
   * package
   *
   * @param plaintext
   * @param n
   * @return encrypted value using Paillier encryption
   */
  private static BigInteger PaillierEncrypt(BigInteger plaintext, BigInteger
          n) {
    try {
      return new EncryptedInteger(plaintext, new PublicKey(defaultRandLength,
              n)).getCipherVal();
    } catch (BigIntegerClassNotValid e) {
      e.printStackTrace();
    }
    return null;
  }

  private static BigInteger paillierEncrypt(BigInteger plaintext, BigInteger
          n, BigInteger nPlusOne, BigInteger nSquared) {
    BigInteger r = generatePositiveRand(defaultRandLengthShort);
    BigInteger cipherText = nPlusOne.modPow(plaintext, nSquared);
    BigInteger x = r.modPow(n, nSquared);
    cipherText = cipherText.multiply(x).mod(nSquared);

    return cipherText;
  }

  /**
   * Decrypt a plaintext with Pailier Decryption algorithm. Adopted from thep
   * .paillier package
   *
   * @param ciphertext
   * @param p
   * @param q
   * @return decrypted value using Paillier encryption
   */
  private static BigInteger PaillierDecrypt(BigInteger ciphertext,
                                            BigInteger p, BigInteger q) {
    PrivateKey privateKey = new PrivateKey(defaultRandLength, p, q);
    try {
      return new EncryptedInteger(ciphertext).decrypt(privateKey);
    } catch (BigIntegerClassNotValid e) {
      e.printStackTrace();
    }
    return null;
  }

  public static BigInteger SIESEncrypt(BigInteger plainText, BigInteger m,
                                       BigInteger x, BigInteger n) {
    BigInteger result = m.multiply(plainText).add(x).mod(n);
    return result;
  }

  public static BigInteger SIESDecrypt(BigInteger cipherText, BigInteger m,
                                       BigInteger x, BigInteger n) {
    BigInteger KInverse = m.modInverse(n);
    BigInteger result = (cipherText.subtract(x).mod(n)).multiply(KInverse)
            .mod(n);
    return result;
  }

  /**
   * Return the auxiliary value for performing cartesian product.
   *
   * @param xa
   * @param xs
   * @param totient
   * @return
   */
  public static BigInteger cartesianAuxiliaryP(BigInteger xa, BigInteger xs, BigInteger totient) {

    return xs.modInverse(totient).multiply(xa).mod(totient);
  }

  /**
   * Update the column key of a Column after doing cartesian product.
   *
   * @return
   */
  public static BigInteger[] cartesianUpdateColyKey(BigInteger ma, BigInteger xa, BigInteger ms, BigInteger p, BigInteger n) {
    BigInteger targetM = ma.multiply(ms.modPow(p, n)).mod(n);

    BigInteger [] colKey = {targetM, xa};
    return colKey;
  }


  /**
   * Update column A with target columnKey<mc,mx> and plaintext [a]
   *
   * @param ma m value of original columnKey A, whose value < (p * q)
   * @param mc m value of target columnKey C,   whose value < (p * q)
   * @param ms m value of columnKey S,          whose value < (p * q)
   * @param xa x value of original columnKey A, whose value < (p * q)
   * @param xc x value of target columnKey C,   whose value < (p * q)
   * @param xs x value of columnKey S,          whose value < (p * q)
   * @param prime1
   * @param prime2
   * @return [new_p, new_q] pair generated by SDB KeyUpdate client protocol
   */
  public static BigInteger[] keyUpdateClient(BigInteger ma, BigInteger mc,
                                             BigInteger ms, BigInteger xa,
                                             BigInteger xc, BigInteger xs,
                                             BigInteger prime1, BigInteger prime2) {
    BigInteger[] pq = new BigInteger[2];
    BigInteger totient = SDBEncrypt.evaluateTotient(prime1, prime2);
    BigInteger n = prime1.multiply(prime2);

    //prepare numbers for p
    BigInteger xsInverse = xs.modInverse(totient);
    BigInteger xcMinusXa = xc.subtract(xa).mod(totient);
    BigInteger p = (xsInverse.multiply(xcMinusXa)).mod(totient);

    //prepare numbers for q
    BigInteger msp = SDBEncrypt.modPow(ms, p, prime1, prime2);
    BigInteger mcInverse = mc.modInverse(n);
    BigInteger q = ((ma.mod(n)).multiply(msp).multiply(mcInverse)).mod(n);

    pq[0] = p;
    pq[1] = q;

    return pq;
  }

  public static BigInteger getSecureBigInt(String cipherString) {
    return new BigInteger(cipherString, Character.MAX_RADIX);
  }


  public static String getSecureString(BigInteger cipherString) {
    return cipherString.toString(Character.MAX_RADIX);
  }


}
