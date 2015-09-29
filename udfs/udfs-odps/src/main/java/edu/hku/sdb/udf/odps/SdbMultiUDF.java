package edu.hku.sdb.udf.odps;

import com.aliyun.odps.udf.UDF;
import edu.hku.sdb.udf.util.UDFHandler;
import edu.hku.sdb.udf.util.TypeCast;

import java.math.BigInteger;

public class SdbMultiUDF extends UDF {

  public String evaluate(String multiplicand, String multiplier, String n) {
    if (multiplicand == null || multiplier == null || n == null) {
      return null;
    }

    BigInteger result = UDFHandler.multi(TypeCast.stringToBigInt(multiplicand),
            TypeCast.stringToBigInt(multiplier), TypeCast.stringToBigInt(n));

    return TypeCast.bigIntToString(result);
  }
}
