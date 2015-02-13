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

	/**
	 * Rigourous Test :-)
	 */
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

}
