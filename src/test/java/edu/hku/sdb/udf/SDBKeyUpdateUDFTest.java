package edu.hku.sdb.udf;

import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.io.Text;
import junit.framework.TestCase;

import java.math.BigInteger;

public class SDBKeyUpdateUDFTest extends TestCase {

	private SDBKeyUpdateUDF udf;

	protected void setUp() throws Exception {
		super.setUp();
		udf = new SDBKeyUpdateUDF();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEvaluate1() {
		assertEquals(Crypto.getSecureText(new BigInteger("21")), udf.evaluate(
            Crypto.getSecureText(new BigInteger("9")),
            Crypto.getSecureText(new BigInteger("23")),
            Crypto.getSecureText(new BigInteger("4")),
            Crypto.getSecureText(new BigInteger("14")),
            Crypto.getSecureText(new BigInteger("35"))));
	}

	public void testEvaluate2() {
		assertEquals(Crypto.getSecureText(new BigInteger("496849390869414279802")),
            udf.evaluate(Crypto.getSecureText(new BigInteger("22493371767")),
                    Crypto.getSecureText(new BigInteger("2451")),
                    Crypto.getSecureText(new BigInteger("4")),
                    Crypto.getSecureText(new BigInteger("134211")),
                    Crypto.getSecureText(new BigInteger("526631133691760337517"))));
	}

}
