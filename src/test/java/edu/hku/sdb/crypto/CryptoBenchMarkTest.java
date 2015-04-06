package edu.hku.sdb.crypto;

import edu.hku.sdb.utility.ProfileUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigInteger;

/**
 * Unit test for simple Crypto functions.
 */
public class CryptoBenchMarkTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public CryptoBenchMarkTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CryptoBenchMarkTest.class);
	}

//	public void testPailierEncryptDecrypt() {
//		BigInteger p = Crypto.generateRandPrime();
//		BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger nPlusOne = n.add(BigInteger.ONE);
//    BigInteger nSquared = n.multiply(n);
//
//    long total = 0;
//    int i;
//    for (i = 0; i < 1000; i ++){
//      BigInteger plainText1 = Crypto.generatePositiveRandShort(p, q);
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      BigInteger cipherText1 = Crypto.paillierEncrypt(plainText1, n, nPlusOne, nSquared);
//      BigInteger cipherText2 = Crypto.paillierEncryptOp(plainText1, n, nPlusOne, nSquared);
//
//      total += profileUtil.getDuration();
////      assertEquals(plainText1, Crypto.PaillierDecrypt(cipherText1, p, q));
//      assertEquals(cipherText1, cipherText2);
//    }
//
//    System.out.println(total / (i * 1000.0));
//
//  }


//  public void testModPowOptimize(){
//    BigInteger p = Crypto.generateRandPrime();
//		BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//
//    long total = 0;
//    int i;
//    for (i = 0; i < 5000; i ++){
//      BigInteger base = Crypto.generatePositiveRand(p, q);
//      BigInteger power = Crypto.generatePositiveRand(p, q);
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      Crypto.modPowOptimize(base, power, p, q);
////      base.modPow(power, n);
//      total += profileUtil.getDuration();
////    assertEquals( base.modPow(power, n),
////            Crypto.modPowOptimize(base, power, p, q));
//    }
//    System.out.println(total / (i * 1000.0));
//  }

//  public void testSDBEncryptDecrypt(){
//    BigInteger p = Crypto.generateRandPrime();
//    BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger r = Crypto.generatePositiveRand(p, q);
//    BigInteger g = Crypto.generatePositiveRand(p, q);
//    BigInteger totient = Crypto.evaluateTotient(p, q);
//
//    BigInteger ma = Crypto.generatePositiveRand(p, q);
//    BigInteger xa = Crypto.generatePositiveRand(p, q);
//
//    long total = 0;
//    int i;
//    for (i = 0; i < 6000; i ++){
//
//      BigInteger plaintext = Crypto.generatePositiveRand(p, q);
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      BigInteger ak = Crypto.generateItemKeyOp(ma,xa,r,g,n,totient);
//      total += profileUtil.getDuration();
//      BigInteger ae = Crypto.encrypt(plaintext,ak, n);
//      assertEquals(plaintext, Crypto.decrypt(ae,ak,n));
//
//    }
//
//    System.out.println(total / (i * 1000.0));
//
//  }



//  public void testSIESEncrypt(){
//    BigInteger p = Crypto.generateRandPrime();
//    BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//
//    BigInteger ma = Crypto.generatePositiveRand(p, q);
//    BigInteger xa = Crypto.generatePositiveRand(p, q);
//
//    long total = 0;
//    int i;
//    for (i = 0; i < 30000; i ++){
//
//      BigInteger plaintext = Crypto.generatePositiveRandShort(p, q);
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      BigInteger cipherText = Crypto.SIESEncrypt(plaintext, ma, xa, n);
//      total += profileUtil.getDuration();
//      assertEquals(plaintext, Crypto.SIESDecrypt(cipherText, ma, xa, n));
//
////      BigInteger plaintext2 = Crypto.generatePositiveRand(p, q);
////      BigInteger cipherText2 = Crypto.SIESEncrypt(plaintext2, ma, xa, n);
////      assertEquals(plaintext.add(plaintext2).mod(n), Crypto.SIESDecrypt(cipherText.add(cipherText2).mod(n), ma, xa.add(xa), n));
//    }
//
//    System.out.println(total / (i * 1000.0));
//  }

}