package edu.hku.sdb.udf;

import java.math.BigInteger;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import edu.hku.sdb.crypto.UDFHandler;

public class SDBIntAddUDF extends UDF {

	public Text evaluate(Text a, Text b) {
		if (a == null || b == null) {
			return null;
		}

		BigInteger result = UDFHandler.integerAdd(new BigInteger(a.toString()),
				new BigInteger(b.toString()));

		return new Text(result.toString());
	}
}