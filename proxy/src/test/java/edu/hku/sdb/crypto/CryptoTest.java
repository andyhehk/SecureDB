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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Crypto functions.
 */
public class CryptoTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public CryptoTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(CryptoTest.class);
  }


  public void testgeneratePositiveRandPrimeShouldNotEqual() {
    BigInteger firstPrime = Crypto.generateRandPrime();
    BigInteger secondPrime = Crypto.generateRandPrime();
    assertTrue(!firstPrime.equals(secondPrime));
  }

  public void testevaluateTotient1() {
    BigInteger totient = Crypto.evaluateTotient(new BigInteger("5"),
            new BigInteger("7"));
    assertEquals(totient, new BigInteger("24"));
  }

  public void testevaluateTotient2() {
    BigInteger totient = Crypto.evaluateTotient(new BigInteger("107"),
            new BigInteger("17"));
    assertEquals(totient, new BigInteger("1696"));
  }

  public void testevaluateTotient3() {
    BigInteger totient = Crypto.evaluateTotient(new BigInteger(
            "20686139707"), new BigInteger("25458163831"));

    assertEquals(totient, new BigInteger("526631133645616033980"));
  }

  public void testevaluateTotient4() {
    BigInteger totient = Crypto.evaluateTotient(new BigInteger(
            "-4294967296122"), new BigInteger("3949673333612"));
    assertEquals(totient, new BigInteger("-16963717798228352405890153"));
  }

  public void testgeneratePositiveRandShouldNotEqual() {
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger firstRand = Crypto.generatePositiveRand(p, q);
    BigInteger secondRand = Crypto.generatePositiveRand(p, q);
    assertTrue(!firstRand.equals(secondRand));
  }

  public void testEncrypt1() {

    BigInteger cipherText = Crypto.encrypt(new BigInteger("4"),
            new BigInteger("32"), new BigInteger("35"));
    assertEquals(new BigInteger("22"), cipherText);
  }

  public void testEncrypt3() {
    BigInteger cipherText = Crypto
            .encrypt(
                    new BigInteger("20686139707"),
                    new BigInteger(
                            "83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
                    new BigInteger(
                            "91056390710389826661362945896125780562083120966028947466819744421480611063788891569681707503066914102268385452352368991831195586814279365402707955380475412720505658218035093486944255102433792593309438648993776412638716311098144165230321872380587410143867387942045612725519865341003363677330210531214120466111"));
    assertEquals(
            new BigInteger(
                    "40870081171282830036419899383381257632049978678992607574997430529949742823087577192233511408144692015947301475184502467724150762868280683517282246740392304400281975465348931710599462200475793078032465916373673267276591714688255352812876413139242500075515787843517783389449586351104283866307778172508927390700"),
            cipherText);
  }

  public void testDecrypt1() {
    BigInteger plainText = Crypto.decrypt(new BigInteger("22"),
            new BigInteger("32"), new BigInteger("35"));

    assertEquals(new BigInteger("4"), plainText);
  }

  public void testDecrypt4() {
    BigInteger plainText = Crypto
            .decrypt(
                    new BigInteger(
                            "40870081171282830036419899383381257632049978678992607574997430529949742823087577192233511408144692015947301475184502467724150762868280683517282246740392304400281975465348931710599462200475793078032465916373673267276591714688255352812876413139242500075515787843517783389449586351104283866307778172508927390700"),
                    new BigInteger(
                            "83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
                    new BigInteger(
                            "91056390710389826661362945896125780562083120966028947466819744421480611063788891569681707503066914102268385452352368991831195586814279365402707955380475412720505658218035093486944255102433792593309438648993776412638716311098144165230321872380587410143867387942045612725519865341003363677330210531214120466111"));
    assertEquals(new BigInteger("20686139707"), plainText);
  }


  public void testSDBEncryptDecrypt() {
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    BigInteger totient = Crypto.evaluateTotient(p, q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    BigInteger plaintext = Crypto.generatePositiveRand(p, q);
    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
    BigInteger ae = Crypto.encrypt(plaintext, ak, n);
    assertEquals(plaintext, Crypto.decrypt(ae, ak, n));
  }

  public void testSIESEncryptDecrypt() {
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    BigInteger plaintext = Crypto.generatePositiveRandShort(p, q);
    BigInteger ae = Crypto.SIESEncrypt(plaintext, ma, xa, n);
    assertEquals(plaintext, Crypto.SIESDecrypt(ae, ma, xa, n));
  }

  public void testSIESAddtiveHomomorphic() {
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);
    BigInteger xb = Crypto.generatePositiveRand(p, q);
    BigInteger totient = Crypto.evaluateTotient(p, q);

    BigInteger plaintext1 = Crypto.generatePositiveRandShort(p, q);
    BigInteger plaintext2 = Crypto.generatePositiveRandShort(p, q);

    BigInteger ae1 = Crypto.SIESEncrypt(plaintext1, ma, xa, n);
    BigInteger ae2 = Crypto.SIESEncrypt(plaintext2, ma, xb, n);

    System.out.println(plaintext1.add(plaintext2));
    System.out.println(Crypto.SIESDecrypt(ae1.add(ae2).mod
            (n), ma, xa.add(xb).mod(totient), n));

    assertEquals(plaintext1.add(plaintext2), Crypto.SIESDecrypt(ae1.add(ae2).mod
            (n), ma, xa.add(xb), n));
  }

  public void testKeyUpdateClient() {
    //A prime number p
    BigInteger p = new BigInteger("5");
    //A prime number q
    BigInteger q = new BigInteger("7");

    //column key for column A
    BigInteger ma = new BigInteger("2");
    BigInteger xa = new BigInteger("2");

    //column key for additional column S
    BigInteger ms = new BigInteger("4");
    BigInteger xs = new BigInteger("5");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("6");
    BigInteger xc = new BigInteger("4");

    //generate new p, q for column A's keyUpdate operation, target column key
    // is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    //p = 5 * ( 4 - 2 ) | mod 24 = 5 * 2 | mod 24 = 10 mod 24 = 10
    //q = 2 * 4^10 * 6 | mod 35 = (2 mod 35) * (11) * (6 mod 35) | mod 35 =
    // 132 mod 35 = 27
    assertEquals(new BigInteger("10"), pq_a[0]);
    assertEquals(new BigInteger("27"), pq_a[1]);
  }

  public void testKeyUpdateClientLarge() {
    //A prime number p
    BigInteger p = Crypto.generateRandPrime();
    //A prime number q
    BigInteger q = Crypto.generateRandPrime();
    //n = p * q
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    //new column key C for key update operation
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    //generate new p, q for column A's keyUpdate operation, target column key
    // is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    assertEquals(xs.modInverse(totient).multiply((xc.subtract(xa)).mod
            (totient)).mod(totient), pq_a[0]);
    assertEquals(((ma.mod(n)).multiply(ms.modPow(pq_a[0], n)).multiply(mc
            .modInverse(n))).mod(n), pq_a[1]);
  }


}