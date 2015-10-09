package edu.hku.sdb.udf.odps;

import com.aliyun.odps.io.Writable;
import com.aliyun.odps.io.Text;
import com.aliyun.odps.udf.Aggregator;
import com.aliyun.odps.udf.UDFException;
import com.aliyun.odps.udf.annotation.Resolve;
import edu.hku.sdb.udf.util.TypeCast;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by andy on 9/22/15.
 */
@Resolve({"string,string->string"})
public class SdbSumUDF extends Aggregator {

  private static class SumBuffer implements Writable {

    private String sum = "0";
    private String n;

    @Override
    public void write(DataOutput out) throws IOException {
      out.writeUTF(sum);
      out.writeUTF(n);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
      sum = in.readUTF();
      n = in.readUTF();
    }
  }

  @Override
  public Writable newBuffer() {
    return new SumBuffer();
  }

  @Override
  public void iterate(Writable buffer, Writable[] args) throws UDFException {
    String value = ((Text) args[0]).toString();
    String n = ((Text) args[1]).toString();
    SumBuffer buf = (SumBuffer) buffer;
    if(value != null && n != null) {
      buf.n = n;
      buf.sum = TypeCast.bigIntToString(TypeCast.stringToBigInt(buf.sum).
              add(TypeCast.stringToBigInt(value)).mod(TypeCast.stringToBigInt(n)));
    }

  }

  @Override
  public Writable terminate(Writable buffer) throws UDFException {
    return new Text(((SumBuffer) buffer).sum);
  }

  @Override
  public void merge(Writable buffer, Writable partial) throws UDFException {
    SumBuffer buf = (SumBuffer) buffer;
    SumBuffer p = (SumBuffer) partial;

    buf.sum = TypeCast.bigIntToString(TypeCast.stringToBigInt(buf.sum).
            add(TypeCast.stringToBigInt(p.sum)).mod(TypeCast.stringToBigInt(p.n)));
  }


}
