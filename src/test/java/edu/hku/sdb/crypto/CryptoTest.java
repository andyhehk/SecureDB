package edu.hku.sdb.crypto;

import java.math.BigInteger;
import java.util.Random;

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
	 * @param testName
	 *            name of the test case
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

  //This method is deprecated.
//	public void testGenerateItemKey1() {
//		assertEquals(new BigInteger("32"), Crypto.generateItemKey(
//				new BigInteger("2"), new BigInteger("2"), new BigInteger("8"),
//				new BigInteger("2"), new BigInteger("5"), new BigInteger("7")));
//	}

  //This method is deprecated.
//	public void testGenerateItemKey3() {
//		BigInteger itemKey = Crypto
//				.generateItemKey(
//						new BigInteger("20686139707"),
//						new BigInteger("3949673333612"),
//						new BigInteger("25458163831"),
//						new BigInteger("526631133645616033980"),
//						new BigInteger(
//								"13381418623214727587437247106170095945191359410765179156151809065341458743599113643820767819224626539634002433392648336651723690747518211610218927601568823"),
//						new BigInteger(
//								"6804688895422554648792548642105479511973881515271617258279580587887409482982376538544184457823535138084697746276682826853000739663322061212950993288918457"));
//
//		assertEquals(
//				new BigInteger(
//						"83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
//				itemKey);
//	}

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


  //This method is deprecated.
//	public void testPailierEncryptDecrypt() {
//		BigInteger p = Crypto.generateRandPrime();
//		BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger nPlusOne = n.add(BigInteger.ONE);
//    BigInteger nSquared = n.multiply(n);
//
//    BigInteger plainText1 = Crypto.generatePositiveRand(p, q);
//		BigInteger cipherText1 = Crypto.paillierEncrypt(plainText1, n, nPlusOne, nSquared);
//		assertEquals(plainText1, Crypto.PaillierDecrypt(cipherText1, p, q));
//
//    BigInteger plainText2 = Crypto.generatePositiveRand(p, q);
//    BigInteger cipherText2 = Crypto.paillierEncrypt(plainText2, n, nPlusOne, nSquared);
//    assertEquals(plainText1.add(plainText2).mod(n), Crypto.PaillierDecrypt(cipherText1.multiply(cipherText2), p, q));
//  }


  public void testSDBEncryptDecrypt(){
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
    BigInteger ae = Crypto.encrypt(plaintext,ak, n);
    assertEquals(plaintext, Crypto.decrypt(ae,ak,n));
  }

  public void testKeyUpdateAdd(){
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    BigInteger totient = Crypto.evaluateTotient(p, q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    BigInteger mb = Crypto.generatePositiveRand(p, q);
    BigInteger xb = Crypto.generatePositiveRand(p, q);

    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
    BigInteger bk = Crypto.generateItemKeyOp2(mb, xb, r, g, n, totient, p, q);
    BigInteger ck = Crypto.generateItemKeyOp2(mc, xc, r, g, n, totient, p, q);
    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, r, g, n, totient, p, q);

    BigInteger a = Crypto.encrypt(new BigInteger("400"),ak, n);
    BigInteger b = Crypto.encrypt(new BigInteger("9"),bk, n);
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);

    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    BigInteger aPlusB = UDFHandler.add(a, b, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    assertEquals(Crypto.decrypt(aPlusB, ck, n), new BigInteger("409"));
  }

  public void testKeyUpdateClient(){
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

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    //p = 5 * ( 4 - 2 ) | mod 24 = 5 * 2 | mod 24 = 10 mod 24 = 10
    //q = 2 * 4^10 * 6 | mod 35 = (2 mod 35) * (11) * (6 mod 35) | mod 35 = 132 mod 35 = 27
    assertEquals(new BigInteger("10"), pq_a[0]);
    assertEquals(new BigInteger("27"), pq_a[1]);
  }

  public void testKeyUpdateClientLarge(){
    //A prime number p
    BigInteger p = Crypto.generateRandPrime();
    //A prime number q
    BigInteger q = Crypto.generateRandPrime();
    //n = p * q
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p,q);

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    //new column key C for key update operation
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    assertEquals(xs.modInverse(totient).multiply( (xc.subtract(xa)).mod(totient) ).mod(totient) , pq_a[0]);
    assertEquals(((ma.mod(n)).multiply(  ms.modPow(pq_a[0],n) ).multiply( mc.modInverse(n) )).mod(n), pq_a[1]);
  }

  public void testKeyUpdateSimple(){
    //A big prime number
    BigInteger p = new BigInteger("7");
    //Another big prime number
    BigInteger q = new BigInteger("13");
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = new BigInteger("2");
    BigInteger g = new BigInteger("2");

    //column key for column A
    BigInteger ma = new BigInteger("3");
    BigInteger xa = new BigInteger("17");

    //column key for additional column S
    BigInteger ms = new BigInteger("5");
    BigInteger xs = new BigInteger("19");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("11");
    BigInteger xc = new BigInteger("11");

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
    BigInteger ck = Crypto.generateItemKeyOp2(mc, xc, r, g, n, totient, p, q);
    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, r, g, n, totient, p, q);

    //Encrypt S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    for (int i = 1; i < 35; i++){
      //Encrypt A column
      BigInteger a = Crypto.encrypt(new BigInteger(String.valueOf(i)),ak, n);
      //the new encrypted value with C's columnKey
      BigInteger aUpdated = UDFHandler.keyUpdate(a, s, pq_a[0], pq_a[1], n);
      assertEquals(Crypto.decrypt(a, ak, n), Crypto.decrypt(aUpdated, ck, n));
    }
  }


  public void testAddEESimple() throws Exception{
    //A big prime number
    BigInteger p = new BigInteger("7");
    //Another big prime number
    BigInteger q = new BigInteger("13");
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = new BigInteger("2");
    BigInteger g = new BigInteger("2");

    //column key for column A
    BigInteger ma = new BigInteger("3");
    BigInteger xa = new BigInteger("17");

    //column key for additional column S
    BigInteger ms = new BigInteger("5");
    BigInteger xs = new BigInteger("19");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("11");
    BigInteger xc = new BigInteger("11");

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
    BigInteger ck = Crypto.generateItemKeyOp2(mc, xc, r, g, n, totient, p, q);
    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, r, g, n, totient, p, q);

    //Encrypt A, S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"), sk, n);
    BigInteger a = Crypto.encrypt(new BigInteger("9"), ak, n);


    BigInteger mb = ms;
    BigInteger xb = xs;

    //execute key update client protocol
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    BigInteger cUpdated = UDFHandler.add(a, s, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    BigInteger cDerypted = Crypto.decrypt(cUpdated, ck, n);
    assertEquals(new BigInteger("10"), cDerypted);
  }

  public void testAddEELarge() throws Exception{
//    A prime number p
    BigInteger p = Crypto.generateRandPrime();
    //A prime number q
    BigInteger q = Crypto.generateRandPrime();
    //n = p * q
    BigInteger n = p.multiply(q);

    BigInteger totient = Crypto.evaluateTotient(p,q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    //new column key C for key update operation
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, r, g, n, totient, p, q);
    BigInteger ck = Crypto.generateItemKeyOp2(mc, xc, r, g, n, totient, p, q);
    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, r, g, n, totient, p, q);

    //Encrypt A, S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);
    BigInteger a = Crypto.encrypt(new BigInteger("9"),ak, n);

    BigInteger mb = ms;
    BigInteger xb = xs;

    //execute key update client protocol
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    BigInteger cUpdated = UDFHandler.add(a, s, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    BigInteger cDerypted = Crypto.decrypt(cUpdated, ck, n);
    assertEquals(new BigInteger("10"), cDerypted);
  }

  public void testCompareLarge() throws Exception{
    //A big prime number
    BigInteger p = Crypto.generateRandPrime();
    //Another big prime number
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger row_id = Crypto.generatePositiveRandShort(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger mr = Crypto.generatePositiveRand(p, q);
    BigInteger xr = Crypto.generatePositiveRand(p, q);

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKeyOp2(ma, xa, row_id, g, n, totient, p, q);
    BigInteger sk = Crypto.generateItemKeyOp2(ms, xs, row_id, g, n, totient, p, q);
    BigInteger rk = Crypto.generateItemKeyOp2(mr, xr, row_id, g, n, totient, p, q);

    //A PLAINTEXT
    BigInteger aPlaintext = Crypto.generatePositiveRandShort(p, q);
    System.out.println(aPlaintext);

    //Encrypt A, S, R column
    BigInteger s = Crypto.encrypt(new BigInteger("1"), sk, n);
    BigInteger a = Crypto.encrypt(aPlaintext, ak, n);
    BigInteger r = Crypto.encrypt(Crypto.generatePositiveRandShort(p, q), rk, n);

    BigInteger u = aPlaintext.subtract(new BigInteger("0"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.subtract(new BigInteger("100000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.subtract(new BigInteger("1000000000000000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.subtract(new BigInteger("500000000000000000000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.subtract(new BigInteger("80000000000000000000000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.add(new BigInteger("100"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.add(new BigInteger("1000000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);

    u = aPlaintext.add(new BigInteger("100000000000000000"));
    testCompareInternal(p, q, n, ma, xa, ms, xs, s, a, u, mr, xr, r);
  }

  private void testCompareInternal(BigInteger p, BigInteger q, BigInteger n, BigInteger ma, BigInteger xa, BigInteger ms,
                                   BigInteger xs, BigInteger s, BigInteger a, BigInteger u, BigInteger mr, BigInteger xr,
                                   BigInteger r) {
    //rewrite subtract EC => A - S * u
    BigInteger msu = ms.multiply(u);
    BigInteger xsu = xs;

    BigInteger msu_i = n.subtract(BigInteger.ONE).multiply(msu).mod(n);
    BigInteger xsu_i = xsu;

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    BigInteger[] pqa_c = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pa_c = pqa_c[0];
    BigInteger qa_c = pqa_c[1];

    BigInteger[] pqsu_i_c = Crypto.keyUpdateClient(msu_i, mc, ms, xsu_i, xc, xs, p, q);
    BigInteger psu_i_c = pqsu_i_c[0];
    BigInteger qsu_i_c = pqsu_i_c[1];


    BigInteger aMinusUCipherText = UDFHandler.add(a, s, s, pa_c, qa_c, psu_i_c, qsu_i_c, n);

    BigInteger mrc = mr.multiply(mc).mod(n);
    BigInteger xrc = xr.add(xc).mod(Crypto.evaluateTotient(p, q));
    BigInteger[] pqrc_z = Crypto.keyUpdateClient(mrc, new BigInteger("1"), ms, xrc, new BigInteger("0"), xs, p, q);
    BigInteger rTimesaMinusUCipherText = UDFHandler.multi(r, aMinusUCipherText, n);

    BigInteger result = UDFHandler.keyUpdate(rTimesaMinusUCipherText, s, pqrc_z[0], pqrc_z[1], n);
    BigInteger halfN = n.subtract(BigInteger.ONE).divide(new BigInteger("2"));
    //System.out.println("testCompareLarge: " + result.compareTo(halfN) + "  " + result + " with u = " + u);
  }

  public void testCompare() {
    assertTrue(UDFHandler.compare(new BigInteger("100"), new BigInteger("128")) > 0);
    assertTrue(UDFHandler.compare(new BigInteger("0"), new BigInteger("128")) == 0);
  }



}