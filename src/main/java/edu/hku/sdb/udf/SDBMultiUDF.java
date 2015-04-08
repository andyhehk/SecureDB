package edu.hku.sdb.udf;

import java.math.BigInteger;

import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import edu.hku.sdb.crypto.UDFHandler;

public final class SDBMultiUDF extends UDF {

	public Text evaluate(Text multiplicand, Text multiplier, Text n) {
		if (multiplicand == null || multiplier == null || n == null) {
			return null;
		}

		BigInteger result = UDFHandler.multi(Crypto.getSecureBigInt(multiplicand),
            Crypto.getSecureBigInt(multiplier), Crypto.getSecureBigInt(n));

    return Crypto.getSecureText(result);
	}

}
