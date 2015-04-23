package edu.hku.sdb.crypto;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.parse.SecureIntLiteral;
import edu.hku.sdb.utility.ProfileUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.List;
import java.util.Random;

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
//
//    BigInteger g = Crypto.generatePositiveRand(p, q);
//    BigInteger totient = Crypto.evaluateTotient(p, q);
//
//    BigInteger ma = Crypto.generatePositiveRand(p, q);
//    BigInteger xa = Crypto.generatePositiveRand(p, q);
//
//    long total = 0;
//    int i;
//    for (i = 0; i < 1000; i ++){
//
//      BigInteger rowId = Crypto.generatePositiveRandExShort(p, q);
//      BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, rowId, g, n, totient, p, q);
//      BigInteger plaintext = Crypto.generatePositiveRand(p, q);
//      BigInteger ae = Crypto.encrypt(plaintext,ak, n);
//
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      ak = Crypto.generateItemKeyOp2(ma, xa, rowId, g, n, totient, p, q);
//      BigInteger aDecrypted = Crypto.decrypt(ae,ak,n);
//      total += profileUtil.getDuration();
//
//      assertEquals(plaintext, aDecrypted);
//    }
//
//    System.out.println(total / (i * 1000000) + "ms");
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

	public void testPlaceHolder(){

//    assertEquals(2, Crypto.splitExponent(new BigInteger("129")).size());
//
//    long totalOp = 0;
//    long totalOld = 0;
//    BigInteger q = Crypto.generateRandPrime();
//    BigInteger p = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger g = Crypto.generatePositiveRand(p, q);
//    BigInteger totient = Crypto.evaluateTotient(p, q);
//
//    BigInteger base = Crypto.generatePositiveRand(p, q);
//
//    ProfileUtil profileUtil1 = new ProfileUtil();
//    Crypto.modPowMapInit(base, p, q);
//    System.out.println(profileUtil1.getDuration());
//
//    int i;
//    for (i = 0; i < 200; i++){
//      BigInteger r = Crypto.generatePositiveRand(p, q, 32);
//
//      ProfileUtil profileUtil = new ProfileUtil(true);
//      Crypto.modPow(base, r, p, q);
//      totalOp += profileUtil.getDuration();
//
//      ProfileUtil profileUtil2 = new ProfileUtil(true);
//      Crypto.modPowInternal(base, r, p, q);
//      totalOld += profileUtil2.getDuration();
//    }
//
//    System.out.println(totalOp / (i * 1000000.0) + "ms");
//    System.out.println(totalOld / (i * 1000000.0) + "ms");




	}


  public boolean testPowerPerformance(){
    long totalModPow = 0;
    long totalPow = 0;
//    BigInteger q = Crypto.generateRandPrime();
//    BigInteger p = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger g = Crypto.generatePositiveRand(p, q);
//    BigInteger totient = Crypto.evaluateTotient(p, q);
//
//    BigInteger base = Crypto.generatePositiveRand(p, q);
//
//    BigInteger nMinusOneOverTwo = n.subtract(BigInteger.ONE).divide(new BigInteger("2"));

    int i;
    int j;

    boolean k = false;
    for (i = 0; i < 100000000; i++){
      j = new Random().nextInt();
      int m = 100;
      //BigInteger r = Crypto.generatePositiveRand(p, q);
      //int intVal = r.intValue();

      ProfileUtil profileUtil = new ProfileUtil(true);
//      base.modPow(r, n);
//      UDFHandler.compare(r, nMinusOneOverTwo);
      m = m - j;
      k = m > 0;
      totalModPow += profileUtil.getDuration();


//      ProfileUtil profileUtil2 = new ProfileUtil(true);
//      base.pow(100);
//      totalPow += profileUtil2.getDuration();
    }

    //Java.modPow 3.51, 20000
    //Crypto.modPow 2.4, 5000
    //sdb_compare 0.0018, 5000
    //a - b > 0 0.05 microseconds, 100000000

    System.out.println(totalModPow / (i * 1000.0) + "microseconds");
//    System.out.println(totalPow / (i * 1000000.0) + "ms");
    return true;

  }
//  public void testAddEP() throws Exception{
//  //    A prime number p
//    BigInteger p = Crypto.generateRandPrime();
//    //A prime number q
//    BigInteger q = Crypto.generateRandPrime();
//    //n = p * q
//    BigInteger n = p.multiply(q);
//
//    BigInteger totient = Crypto.evaluateTotient(p,q);
//    BigInteger r = Crypto.generatePositiveRand(p, q);
//    BigInteger g = Crypto.generatePositiveRand(p, q);
//
//    //column key for column A
//    BigInteger ma = Crypto.generatePositiveRand(p, q);
//    BigInteger xa = Crypto.generatePositiveRand(p, q);
//
//    //column key for additional column S
//    BigInteger ms = Crypto.generatePositiveRand(p, q);
//    BigInteger xs = Crypto.generatePositiveRand(p, q);
//
//    //new column key C for key update operation
//    BigInteger mc = Crypto.generatePositiveRand(p, q);
//    BigInteger xc = Crypto.generatePositiveRand(p, q);
//
//    //item key for A,C,S
//    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
//    BigInteger ck = Crypto.generateItemKeyOp2(mc, xc, r, g, n, totient, p, q);
//    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, r, g, n, totient, p, q);
//
//    //Encrypt A, S column
//    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);
//    BigInteger a = Crypto.encrypt(new BigInteger("999"),ak, n);
//    BigInteger plain = new BigInteger("123");
//
//    BigInteger mp_n = Crypto.generatePositiveRand(p, q);
//    BigInteger xp_n = Crypto.generatePositiveRand(p, q);
//    BigInteger pk_n = Crypto.generateItemKeyOp2(mp_n, xp_n, r, g, n, totient, p, q);
//
//    BigInteger[] pqp_n = Crypto.keyUpdateClient(new BigInteger("1"), mp_n, ms, new BigInteger("0"), xp_n, xs, p, q);
//    BigInteger pk_n_updated = UDFHandler.keyUpdate(plain, s, pqp_n[0], pqp_n[1], n);
//
//    BigInteger pDerypted = Crypto.decrypt(pk_n_updated, pk_n, n);
//    assertEquals(plain, pDerypted);
//
//    BigInteger mpn_i = n.subtract(BigInteger.ONE).multiply(mp_n).mod(n);
//    BigInteger xpn_i = xp_n;
//    BigInteger pk_n_i = Crypto.generateItemKeyOp2(mpn_i, xpn_i, r, g, n, totient, p, q);
//    assertEquals(BigInteger.ZERO, Crypto.decrypt(pk_n_updated, pk_n_i, n).add(plain).mod(n));
//
//
//    BigInteger[] pqa_c = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
//    BigInteger pa_c = pqa_c[0];
//    BigInteger qa_c = pqa_c[1];
//
//    BigInteger[] pqn_i_c = Crypto.keyUpdateClient(mpn_i, mc, ms, xpn_i, xc, xs, p, q);
//    BigInteger ppn_i_c = pqn_i_c[0];
//    BigInteger qpn_i_c = pqn_i_c[1];
//
//    BigInteger result = UDFHandler.add(a, pk_n_updated, s, pa_c, qa_c, ppn_i_c, qpn_i_c, n);
//    BigInteger decryptedResult = Crypto.decrypt(result, ck, n);
//
//  //  assertEquals(a.subtract(plain), decryptedResult);
//
//  }

  public void testRSA() throws Exception{

    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
    keyGen.initialize(1024);
    KeyPair key = keyGen.generateKeyPair();
    // get an RSA cipher object and print the provider
    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");


    int i;
    long totalDuration = 0;
    for (i = 0; i < 5000 * 1.01; i++) {
      int rand = new Random().nextInt(10000);
      byte[] plainText = String.valueOf(rand).getBytes();

      // encrypt the plaintext using the public key
      cipher.init(Cipher.ENCRYPT_MODE, key.getPublic());
      byte[] cipherText = cipher.doFinal(plainText);


      ProfileUtil profileUtil = new ProfileUtil(true);
      // decrypt the ciphertext using the private key
      cipher.init(Cipher.DECRYPT_MODE, key.getPrivate());
      byte[] newPlainText = cipher.doFinal(cipherText);
      //System.out.println(new String(newPlainText, "UTF8"));
      totalDuration += profileUtil.getDuration();

    }

    System.out.println(totalDuration / (1000000.0) + "ms");
    System.out.println(totalDuration / (i * 1000000.0) + "ms");
  }

}