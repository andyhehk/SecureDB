package edu.hku.sdb.udf;

import org.apache.hadoop.io.Text;
import junit.framework.TestCase;

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
		assertEquals(new Text("21"), udf.evaluate(new Text("9"),
				new Text("23"), new Text("4"), new Text("14"), new Text("35")));
	}

	public void testEvaluate2() {
		assertEquals(new Text("496849390869414279802"), udf.evaluate(new Text(
				"22493371767"), new Text("2451"), new Text("4"), new Text(
				"134211"), new Text("526631133691760337517")));
	}

}
