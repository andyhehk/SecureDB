package edu.hku.sdb.udf;

import java.math.BigInteger;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import edu.hku.sdb.crypto.UDFHandler;

public class SDBAddUDF extends UDF {

	public Text evaluate(Text a, Text b, Text s, Text pa, Text qa, Text pb,
			Text qb, Text n) {
		if (a == null || b == null || s == null || pa == null || qa == null
				|| pb == null || qb == null || n == null) {
			return null;
		}

		BigInteger result = UDFHandler.add(new BigInteger(a.toString()),
				new BigInteger(b.toString()), new BigInteger(s.toString()),
				new BigInteger(pa.toString()), new BigInteger(qa.toString()),
				new BigInteger(pb.toString()), new BigInteger(qb.toString()),
				new BigInteger(n.toString()));

		return new Text(result.toString());
	}

}