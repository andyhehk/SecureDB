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

package edu.hku.sdb.udf.hive;

import edu.hku.sdb.udf.util.TypeCast;
import edu.hku.sdb.udf.util.UDFHandler;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.Text;

public class SdbLeUDF extends UDF {

  public BooleanWritable evaluate(Text value, Text halfN) {
    if (value == null || halfN == null) {
      return new BooleanWritable(false);
    }

    if (UDFHandler.lessThan(TypeCast.textToBigInt(value), TypeCast
            .textToBigInt(halfN)))
      return new BooleanWritable(true);

    if (UDFHandler.equal(TypeCast.textToBigInt(value)))
      return new BooleanWritable(true);

    return new BooleanWritable(false);
  }
}

