package edu.hku.sdb.udf;

import org.apache.hadoop.io.Text;
import junit.framework.TestCase;

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
		assertEquals(new Text("34"),
				udf.evaluate(new Text("9"), new Text("31"), new Text("35")));
	}

	public void testEvaluate2() {
		assertEquals(new Text("8"),
				udf.evaluate(new Text("22"), new Text("29"), new Text("35")));
	}

	public void testEvaluate3() {
		assertEquals(new Text("224933717167058460147"), udf.evaluate(new Text(
				"7280564474"), new Text("103228925936"), new Text(
				"526631133691760337517")));
	}

	public void testEvaluate4() {
		assertEquals(new Text("926244031204465075"), udf.evaluate(new Text(
				"22493371767"), new Text("187342980733"), new Text(
				"526631133691760337517")));
	}
}
