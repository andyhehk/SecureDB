package edu.hku.sdb.udf.odps;

import com.aliyun.odps.io.DoubleWritable;
import com.aliyun.odps.io.Writable;
import com.aliyun.odps.io.Text;
import com.aliyun.odps.udf.Aggregator;
import com.aliyun.odps.udf.UDFException;
import edu.hku.sdb.udf.util.TypeCast;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by andy on 9/22/15.
 */
public class SdbSumUDF extends Aggregator {

  private static class SumBuffer implements Writable {

    private Text sum;
    private Text n;

    @Override
    public void write(DataOutput out) throws IOException {
      out.writeChars(sum.toString());
      out.writeChars(n.toString());
    }

    @Override
    public void readFields(DataInput in) throws IOException {
      sum = new Text(in.readLine());
      n = new Text(in.readLine());
    }
  }

  @Override
  public Writable newBuffer() {
    return new SumBuffer();
  }

  @Override
  public void iterate(Writable buffer, Writable[] args) throws UDFException {
    Text value = (Text) args[0];
    Text n = (Text) args[1];
    SumBuffer buf = (SumBuffer) buffer;
    if (value != null && n != null) {
      buf.n = n;
      buf.sum = TypeCast.bigIntToText(TypeCast.textToBigInt(buf.sum).
              add(TypeCast.textToBigInt(value)).mod(TypeCast.textToBigInt(buf.n)));
    }
  }

  @Override
  public Writable terminate(Writable buffer) throws UDFException {
    return ((SumBuffer) buffer).sum;
  }

  @Override
  public void merge(Writable buffer, Writable partial) throws UDFException {
    if (partial == null)
      return;

    SumBuffer buf = (SumBuffer) buffer;
    SumBuffer p = (SumBuffer) partial;

    buf.sum = TypeCast.bigIntToText(TypeCast.textToBigInt(buf.sum).
            add(TypeCast.textToBigInt(p.sum)).mod(TypeCast.textToBigInt(buf.n)));
  }


}
