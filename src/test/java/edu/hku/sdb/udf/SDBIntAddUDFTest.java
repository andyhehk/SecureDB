package edu.hku.sdb.udf;

import edu.hku.sdb.crypto.Crypto;

import junit.framework.TestCase;

import java.math.BigInteger;

public class SDBIntAddUDFTest extends TestCase {

	private SDBIntAddUDF udf;

	protected void setUp() throws Exception {
		super.setUp();
		udf = new SDBIntAddUDF();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEvaluate1() {
		assertEquals(Crypto.getSecureText(new BigInteger("25")),
            udf.evaluate(Crypto.getSecureText(new BigInteger("9")),
                    Crypto.getSecureText(new BigInteger("16")),
                    Crypto.getSecureText(new BigInteger("35"))));
	}

}
