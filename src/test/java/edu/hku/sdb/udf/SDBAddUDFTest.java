package edu.hku.sdb.udf;

import org.apache.hadoop.io.Text;

import junit.framework.TestCase;

public class SDBAddUDFTest extends TestCase {

	private SDBAddUDF udf;

	protected void setUp() throws Exception {
		super.setUp();
		udf = new SDBAddUDF();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEvaluate1() {
		assertEquals(new Text("29"), udf.evaluate(new Text("9"),
				new Text("16"), new Text("23"), new Text("4"), new Text("14"),
				new Text("9"), new Text("11"), new Text("35")));
	}

	public void testEvaluate2() {
		assertEquals(new Text("520470587846211796404"), udf.evaluate(new Text(
				"10322836"), new Text("22493371767"), new Text("2451"),
				new Text("5"), new Text("391147"), new Text("4"), new Text(
						"134211"), new Text("526631133691760337517")));
	}

}
