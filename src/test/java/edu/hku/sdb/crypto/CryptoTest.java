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
		BigInteger firstRand = Crypto.generatePositiveRand(512);
		BigInteger secondRand = Crypto.generatePositiveRand(512);
		assertTrue(!firstRand.equals(secondRand));
	}

	public void testGenerateItemKey1() {
		assertEquals(new BigInteger("32"), Crypto.generateItemKey(
				new BigInteger("2"), new BigInteger("2"), new BigInteger("8"),
				new BigInteger("2"), new BigInteger("5"), new BigInteger("7")));
	}

	public void testGenerateItemKey2() {
		assertEquals(new BigInteger("8"), Crypto.generateItemKey(
				new BigInteger("2"), new BigInteger("2"), new BigInteger("1"),
				new BigInteger("2"), new BigInteger("5"), new BigInteger("7")));
	}

	public void testGenerateItemKey3() {

		BigInteger itemKey = Crypto
				.generateItemKey(
						new BigInteger("20686139707"),
						new BigInteger("3949673333612"),
						new BigInteger("25458163831"),
						new BigInteger("526631133645616033980"),
						new BigInteger(
								"13381418623214727587437247106170095945191359410765179156151809065341458743599113643820767819224626539634002433392648336651723690747518211610218927601568823"),
						new BigInteger(
								"6804688895422554648792548642105479511973881515271617258279580587887409482982376538544184457823535138084697746276682826853000739663322061212950993288918457"));

		assertEquals(
				new BigInteger(
						"83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
				itemKey);
	}

	public void testEncrypt1() {

		BigInteger cipherText = Crypto.encrypt(new BigInteger("4"),
				new BigInteger("32"), new BigInteger("35"));
		assertEquals(new BigInteger("22"), cipherText);
	}

	public void testEncrypt2() {

		BigInteger cipherText = Crypto.encrypt(new BigInteger("2"),
				new BigInteger("8"), new BigInteger("35"));
		assertEquals(new BigInteger("9"), cipherText);
	}

	public void testEncrypt3() {

		// n is taken from testGenerateItemKey3()
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

	public void testDecrypt2() {
		BigInteger plainText = Crypto.decrypt(new BigInteger("9"),
				new BigInteger("8"), new BigInteger("35"));

		assertEquals(new BigInteger("2"), plainText);
	}

	public void testDecrypt3() {
		BigInteger plainText = Crypto.decrypt(new BigInteger("34"),
				new BigInteger("32"), new BigInteger("35"));
		assertEquals(new BigInteger("3"), plainText);
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

	public void testPailierEncrypt() {
		BigInteger plainText = Crypto.generatePositiveRand(1023);
		BigInteger p = new BigInteger(
				"13381418623214727587437247106170095945191359410765179156151809065341458743599113643820767819224626539634002433392648336651723690747518211610218927601568823");
		BigInteger q = new BigInteger(
				"6804688895422554648792548642105479511973881515271617258279580587887409482982376538544184457823535138084697746276682826853000739663322061212950993288918457");

		BigInteger cipherText = Crypto.PailierEncrypt(plainText, p, q);
		assertEquals(plainText, Crypto.PailierDecrypt(cipherText, p, q));
	}

  public void testEncryptDecrypt(){
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger r = Crypto.generatePositiveRand(1024, n);
    BigInteger g = Crypto.generatePositiveRand(1024, n);

    BigInteger ma = Crypto.generatePositiveRand(1024, n);
    BigInteger xa = Crypto.generatePositiveRand(1024, n);

    BigInteger plaintext = new BigInteger("100");
    BigInteger ak = Crypto.generateItemKey(ma,xa,r,g,p,q);
    BigInteger ae = Crypto.encrypt(plaintext,ak, n);
    assertEquals(plaintext, Crypto.decrypt(ae,ak,n));
  }

  public void testKeyUpdateSimple(){
    //    BigInteger p = Crypto.generateRandPrime();
//    BigInteger q = Crypto.generateRandPrime();
//    BigInteger n = p.multiply(q);
//    BigInteger r = Crypto.generatePositiveRand(1024, n);
//    BigInteger g = Crypto.generatePositiveRand(1024, n);
//
//    BigInteger ma = Crypto.generatePositiveRand(1024, n);
//    BigInteger xa = Crypto.generatePositiveRand(1024, n);
//
//    BigInteger ms = Crypto.generatePositiveRand(1024, n);
//    BigInteger xs = Crypto.generatePositiveRand(1024, n);
//
//    BigInteger mc = Crypto.generatePositiveRand(1024, n);
//    BigInteger xc = Crypto.generatePositiveRand(1024, n);

//    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
//    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
//    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

//    BigInteger a = Crypto.encrypt(new BigInteger("400"),ak, n);
//    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);

//    BigInteger mb = new BigInteger("1");
//    BigInteger xb = new BigInteger("3");
//    BigInteger b = Crypto.encrypt(new BigInteger("9"),Crypto.generateItemKey(mb,xb,r,g,p,q), n);
//    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);
//    BigInteger bUpdated = keyUpdate(b, s, pb, qb, n);
//    BigInteger result = aUpdated.add(bUpdated).mod(n);

//    BigInteger aPlusB = UDFHandler.add(a, b, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
//    assertEquals(Crypto.decrypt(aPlusB, Crypto.generateItemKey(mc, xc, r, g, p, q), n), new BigInteger("22"));
  }

  public void testKeyUpdateClient(){
    //A big prime number
    BigInteger p = new BigInteger("13381418623214727587437247106170095945191359410765179156151809065341458743599113643820767819224626539634002433392648336651723690747518211610218927601568823");
    //Another big prime number
    BigInteger q = new BigInteger("6804688895422554648792548642105479511973881515271617258279580587887409482982376538544184457823535138084697746276682826853000739663322061212950993288918457");
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = new BigInteger("2");
    BigInteger g = new BigInteger("2");

    //column key for column A
    BigInteger ma = new BigInteger("2");
    BigInteger xa = new BigInteger("2");

    //column key for additional column S
    BigInteger ms = new BigInteger("4");
    BigInteger xs = new BigInteger("2");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("6");
    BigInteger xc = new BigInteger("4");

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

    //Encrypt A & S column
    BigInteger a = Crypto.encrypt(new BigInteger("3400000"),ak, n);
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);
    System.out.println("se : " + s);

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    System.out.println("pa : " + pq_a[0]);
    System.out.println("qa : " + pq_a[1]);

    //the new encrypted value with C's columnKey
    BigInteger aUpdated = UDFHandler.keyUpdate(a, s, pq_a[0], pq_a[1], n);

    //abbreviation for numbers in the key update proof
    BigInteger grxc = g.modPow(r.multiply(xc).mod(totient),n).mod(n);
    BigInteger msp = ms.modPow(pq_a[0],n).mod(n);
    BigInteger msInverse = xs.modInverse(n).mod(n);

    System.out.println("\nPrint the value in the proof line by line");
    System.out.println("Ce * Ck");
    System.out.println("1  : " + aUpdated.multiply(ck).mod(n));
    System.out.println("3  : " + ma.multiply(msp).multiply(a).multiply(s.modPow(pq_a[0], n)).multiply(grxc).mod(n));
    System.out.println("4  : " + ma.multiply(msp).multiply(a).multiply(sk.modInverse(n).modPow(pq_a[0], n)).multiply(grxc).mod(n));
    System.out.println("6  : " + ma.multiply(msp).multiply(a).multiply(ms.multiply(g.modPow(r.multiply(xs).mod(totient), n)).modInverse(n).modPow(pq_a[0], n)).multiply(grxc).mod(n));

    System.out.println("7  : " + ma.multiply(a).multiply(g.modPow(r.multiply(xs).mod(totient), n).modInverse(n).modPow(pq_a[0], n)).multiply(grxc).mod(n));
    System.out.println("8a : " + ma.multiply(a).multiply(g.modPow(r.multiply(xs.multiply(msInverse)).multiply(xc.subtract(xa)).mod(totient), n).modInverse(n)).multiply(grxc).mod(n));
    System.out.println("8b : " + ma.multiply(a).multiply(g.modPow(r.multiply(xs.multiply(msInverse).mod(n)).multiply(xc.subtract(xa)).mod(totient), n).modInverse(n)).multiply(grxc).mod(n));
    System.out.println("8c : " + ma.multiply(a).multiply(g.modPow(r.                                         multiply(xc.subtract(xa)).mod(totient), n).modInverse(n)).multiply(grxc).mod(n));
    System.out.println("Ae * (ma * grxa) ");
    System.out.println("9  : " + a.multiply(ma).mod(n).multiply( g.modPow(r.multiply(xa).mod( totient ), n)).mod(n));

    System.out.println("decrypt ae       : " + Crypto.decrypt(a, ak, n));
    System.out.println("decrypt updated a: " + Crypto.decrypt(aUpdated, ck, n));

    assertEquals(Crypto.decrypt(a, ak, n), Crypto.decrypt(aUpdated, ck, n));

  }

}
