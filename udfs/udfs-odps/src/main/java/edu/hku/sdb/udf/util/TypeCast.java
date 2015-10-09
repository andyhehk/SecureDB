package edu.hku.sdb.udf.util;

import java.math.BigInteger;
import com.aliyun.odps.io.Text;

/**
 * Created by andy on 9/22/15.
 */
public class TypeCast {

  public static BigInteger textToBigInt(Text text) {
    return stringToBigInt(text.toString());
  }

  public static Text bigIntToText(BigInteger bigNum) {
    return new Text(bigIntToString(bigNum));
  }

  public static BigInteger stringToBigInt(String str) {
    return new BigInteger(str, Character.MAX_RADIX);
  }

  public static String bigIntToString(BigInteger bigNum) {
    return bigNum.toString(Character.MAX_RADIX);
  }
}
