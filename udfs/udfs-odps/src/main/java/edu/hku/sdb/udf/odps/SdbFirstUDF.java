/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.udf.odps;

import com.aliyun.odps.io.Writable;
import com.aliyun.odps.io.Text;
import com.aliyun.odps.udf.Aggregator;
import com.aliyun.odps.udf.UDFException;
import com.aliyun.odps.udf.annotation.Resolve;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Resolve({"string->string"})
public class SdbFirstUDF extends Aggregator {

  private static class FirstBuffer implements Writable {

    private String first = "";

    @Override
    public void write(DataOutput out) throws IOException {
      out.writeUTF(first);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
      first = in.readUTF();
    }
  }

  @Override
  public Writable newBuffer() {
    return new FirstBuffer();
  }

  @Override
  public void iterate(Writable buffer, Writable[] args) throws UDFException {
    FirstBuffer buf = (FirstBuffer) buffer;
    if(buf.first.equals("") ) {
      String value = ((Text) args[0]).toString();
      buf.first = value;
    }
  }

  @Override
  public Writable terminate(Writable buffer) throws UDFException {
    return new Text(((FirstBuffer) buffer).first);
  }

  @Override
  public void merge(Writable buffer, Writable partial) throws UDFException {
    FirstBuffer buf = (FirstBuffer) buffer;
    FirstBuffer p = (FirstBuffer) partial;

    buf.first = p.first;
  }



}