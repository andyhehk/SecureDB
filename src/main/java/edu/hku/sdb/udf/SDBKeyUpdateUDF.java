package edu.hku.sdb.udf;

import java.math.BigInteger;

import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import edu.hku.sdb.crypto.UDFHandler;

public class SDBKeyUpdateUDF extends UDF {

	public Text evaluate(Text a, Text s, Text p, Text q, Text n) {
		if (a == null || s == null || p == null || q == null || n == null) {
			return null;
		}

		BigInteger result = UDFHandler.keyUpdate(Crypto.getSecureBigInt(a),
            Crypto.getSecureBigInt(s), Crypto.getSecureBigInt(p),
            Crypto.getSecureBigInt(q), Crypto.getSecureBigInt(n));

		return Crypto.getSecureText(result);
	}

}