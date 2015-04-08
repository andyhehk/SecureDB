package edu.hku.sdb.udf;

import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.io.Text;
import junit.framework.TestCase;

import java.math.BigInteger;

public class SDBMultiUDFTest extends TestCase {

	private SDBMultiUDF udf;

	protected void setUp() throws Exception {
		super.setUp();
		udf = new SDBMultiUDF();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEvaluate1() {
		assertEquals(Crypto.getSecureText(new BigInteger("34")),
            udf.evaluate(Crypto.getSecureText(new BigInteger("9")),
                    Crypto.getSecureText(new BigInteger("31")),
                    Crypto.getSecureText(new BigInteger("35"))));
	}

	public void testEvaluate2() {
		assertEquals(Crypto.getSecureText(new BigInteger("8")),
				udf.evaluate(Crypto.getSecureText(new BigInteger("22")),
                Crypto.getSecureText(new BigInteger("29")),
                Crypto.getSecureText(new BigInteger("35"))));
	}

	public void testEvaluate3() {
		assertEquals(Crypto.getSecureText(new BigInteger("224933717167058460147")),
            udf.evaluate(Crypto.getSecureText(new BigInteger("7280564474")),
                    Crypto.getSecureText(new BigInteger("103228925936")),
                    Crypto.getSecureText(new BigInteger("526631133691760337517"))));
	}

	public void testEvaluate4() {
		assertEquals(Crypto.getSecureText(new BigInteger("926244031204465075")),
            udf.evaluate(Crypto.getSecureText(new BigInteger("22493371767")),
                    Crypto.getSecureText(new BigInteger("187342980733")),
                    Crypto.getSecureText(new BigInteger("526631133691760337517"))));
	}
}
