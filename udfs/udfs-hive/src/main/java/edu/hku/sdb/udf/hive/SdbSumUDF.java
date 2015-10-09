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
import org.apache.hadoop.hive.ql.exec.UDAF;
import org.apache.hadoop.hive.ql.exec.UDAFEvaluator;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.io.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class SdbSumUDF extends UDAF {

  public static class SdbSumEvaluator implements UDAFEvaluator {

    private static final Logger LOG = LoggerFactory.getLogger(SdbSumEvaluator.class);

    public static class Sum {
      Text sum;
      Text n;
    }

    private Sum sumItem = null;

    public SdbSumEvaluator() {
      super();
      sumItem = new Sum();
      init();
    }

    @Override
    public void init() {
      sumItem.sum = new Text("0");
    }

    /**
     * function: iterate
     * This function is called for every individual record of a group
     * @param value
     * @return
     * @throws HiveException
     */
    public boolean iterate(Text value, Text n) throws HiveException {
      if(value == null) {
        sumItem.n = n;
        return true;
      }

      sumItem.n = n;
      sumItem.sum = TypeCast.bigIntToText(TypeCast.textToBigInt(sumItem.sum).
              add(TypeCast.textToBigInt(value)).mod(TypeCast.textToBigInt(sumItem.n)));
      return true;
    }

    /**
     * function: terminate
     * this function is called after the last record of the group has been streamed
     * @return
     */
    public Text terminate(){
      return sumItem.sum;
    }

    /**
     * function: terminatePartial
     * this function is called on the mapper side and
     * returns partially aggregated results.
     * @return
     */
    public Sum terminatePartial(){
      return sumItem;
    }

    /**
     * function: merge
     * This function is called two merge two partially aggregated results
     * @param another
     * @return
     */
    public boolean merge(Sum another){
      if(another == null)
        return true;

      BigInteger n;
      if (sumItem.n != null)
        n = TypeCast.textToBigInt(sumItem.n);
      else if (another.n != null)
        n = TypeCast.textToBigInt(another.n);
      else {
        LOG.error("The public key is null!");
        return false;
      }

      sumItem.sum = TypeCast.bigIntToText(TypeCast.textToBigInt(sumItem.sum).
              add(TypeCast.textToBigInt(another.sum)).mod(n));
      return true;

    }
  }



}