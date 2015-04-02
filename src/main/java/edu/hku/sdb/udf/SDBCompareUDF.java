package edu.hku.sdb.udf;

import edu.hku.sdb.crypto.UDFHandler;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.math.BigInteger;

/**
 * Created by Eric Haibin Lin on 2/4/15.
 */
public class SDBCompareUDF extends UDF {

  public int evaluate(Text a, Text b) {
    if (a == null || b == null) {
      return 0;
    }

    int result = UDFHandler.compare( new BigInteger(a.toString()), new BigInteger(b.toString()));

    return result;
  }
}
