package edu.hku.sdb.udf;

import org.apache.hadoop.io.Text;

import junit.framework.TestCase;

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
		assertEquals(new Text("25"),
				udf.evaluate(new Text("9"), new Text("16"), new Text("35")));
	}

}
