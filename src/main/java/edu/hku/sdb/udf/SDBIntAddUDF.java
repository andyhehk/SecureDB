package edu.hku.sdb.udf;

import java.math.BigInteger;

import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import edu.hku.sdb.crypto.UDFHandler;

public class SDBIntAddUDF extends UDF {

	public Text evaluate(Text a, Text b, Text n) {
		if (a == null || b == null) {
			return null;
		}

		BigInteger result = UDFHandler.integerAdd(Crypto.getSecureBigInt(a),
            Crypto.getSecureBigInt(b), Crypto.getSecureBigInt(n));

		return Crypto.getSecureText(result);
	}
}