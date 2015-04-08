package edu.hku.sdb.udf;

import java.math.BigInteger;

import edu.hku.sdb.crypto.Crypto;
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

		BigInteger result = UDFHandler.add(Crypto.getSecureBigInt(a),
            Crypto.getSecureBigInt(b), Crypto.getSecureBigInt(s),
            Crypto.getSecureBigInt(pa), Crypto.getSecureBigInt(qa),
            Crypto.getSecureBigInt(pb), Crypto.getSecureBigInt(qb),
            Crypto.getSecureBigInt(n));

		return Crypto.getSecureText(result);
	}

}