package edu.hku.sdb.crypto;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.LongWritable;

public class AutoIncrement extends UDF {
    public LongWritable evaluate(final LongWritable n) {
        if (n == null) {
            return null;
        } else {
            n.set(n.get() + 1);
        }
        return n;
    }
}