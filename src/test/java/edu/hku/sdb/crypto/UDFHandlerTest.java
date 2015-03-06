package edu.hku.sdb.crypto;

import java.math.BigInteger;

import junit.framework.TestCase;

public class UDFHandlerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMultiHandler1() {
		BigInteger result = UDFHandler.multi(new BigInteger("9"),
				new BigInteger("31"), new BigInteger("35"));
		assertEquals(new BigInteger("34"), result);
	}

	public void testMultiHandler2() {
		BigInteger result = UDFHandler.multi(new BigInteger("22"),
				new BigInteger("29"), new BigInteger("35"));
		assertEquals(new BigInteger("8"), result);
	}

	public void testMultiHandler3() {
		BigInteger result = UDFHandler.multi(new BigInteger("7280564474"),
				new BigInteger("103228925936"), new BigInteger(
						"526631133691760337517"));
		assertEquals(new BigInteger("224933717167058460147"), result);
	}

	public void testMultiHandler4() {
		BigInteger result = UDFHandler.multi(new BigInteger("22493371767"),
				new BigInteger("187342980733"), new BigInteger(
						"526631133691760337517"));
		assertEquals(new BigInteger("926244031204465075"), result);
	}

	public void testKeyUpdateHandler1() {
		BigInteger result = UDFHandler.keyUpdate(new BigInteger("9"),
				new BigInteger("23"), new BigInteger("4"),
				new BigInteger("14"), new BigInteger("35"));
		assertEquals(new BigInteger("21"), result);
	}

	public void testKeyUpdateHandler2() {
		BigInteger result = UDFHandler.keyUpdate(new BigInteger("16"),
				new BigInteger("23"), new BigInteger("9"),
				new BigInteger("11"), new BigInteger("35"));
		assertEquals(new BigInteger("8"), result);
	}

	public void testKeyUpdateHandler3() {
		BigInteger result = UDFHandler.keyUpdate(
				new BigInteger("103228925936"), new BigInteger("24521"),
				new BigInteger("5"), new BigInteger("391847"), new BigInteger(
						"526631133691760337517"));
		assertEquals(new BigInteger("336611475552112482890"), result);
	}

	public void testKeyUpdateHandler4() {
		BigInteger result = UDFHandler.keyUpdate(new BigInteger("10322836"),
				new BigInteger("2451"), new BigInteger("5"), new BigInteger(
						"391147"), new BigInteger("526631133691760337517"));
		assertEquals(new BigInteger("23621196976797516602"), result);
	}

	public void testKeyUpdateHandler5() {
		BigInteger result = UDFHandler.keyUpdate(new BigInteger("22493371767"),
				new BigInteger("2451"), new BigInteger("4"), new BigInteger(
						"134211"), new BigInteger("526631133691760337517"));
		assertEquals(new BigInteger("496849390869414279802"), result);
	}

  public void testKeyUpdateHandlerLarge(){
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = q.multiply(p);

    BigInteger new_p = Crypto.generatePositiveRand(1024, n);
    BigInteger new_q = Crypto.generatePositiveRand(1024, n);
    BigInteger ae = Crypto.generatePositiveRand(1024, n);
    BigInteger se = Crypto.generatePositiveRand(1024, n);

    assertEquals( ( (new_q.mod(n)).multiply (ae.mod(n)).multiply (se.modPow(new_p, n)) ).mod(n) , UDFHandler.keyUpdate(ae,se,new_p,new_q,n));
  }

	public void testAddHandler1() {
		BigInteger result = UDFHandler.add(new BigInteger("9"), new BigInteger(
				"16"), new BigInteger("23"), new BigInteger("4"),
				new BigInteger("14"), new BigInteger("9"),
				new BigInteger("11"), new BigInteger("35"));
		assertEquals(new BigInteger("29"), result);
	}

	public void testAddHandler2() {
		BigInteger result = UDFHandler.add(new BigInteger("10322836"),
				new BigInteger("22493371767"), new BigInteger("2451"),
				new BigInteger("5"), new BigInteger("391147"), new BigInteger(
						"4"), new BigInteger("134211"), new BigInteger(
						"526631133691760337517"));
		assertEquals(new BigInteger("520470587846211796404"), result);
	}


}
