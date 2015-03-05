package edu.hku.sdb.udf;

import java.math.BigInteger;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import edu.hku.sdb.crypto.UDFHandler;

public class SDBCartProdUDF extends UDF {

	public Text evaluate(Text a, Text s, Text p, Text n) {
		if (a == null || s == null || p == null || n == null) {
			return null;
		}

		BigInteger result = UDFHandler.cartesianProduct(
				new BigInteger(a.toString()), new BigInteger(s.toString()),
				new BigInteger(p.toString()), new BigInteger(n.toString()));

		return new Text(result.toString());
	}

}
