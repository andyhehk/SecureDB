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

import java.math.BigInteger;

public class SdbFirstUDF extends UDAF {

  public static class SdbFirstEvaluator implements UDAFEvaluator {

    private Text firstValue;

    public SdbFirstEvaluator() {
      super();
      init();
    }

    @Override
    public void init() {
      firstValue = null;
    }

    /**
     * function: iterate
     * This function is called for every individual record of a group
     * @param value
     * @return
     * @throws HiveException
     */
    public boolean iterate(Text value) throws HiveException {
      if(value != null && firstValue == null)
        firstValue = value;
      return true;
    }

    /**
     * function: terminate
     * this function is called after the last record of the group has been streamed
     * @return
     */
    public Text terminate(){
      return firstValue;
    }

    /**
     * function: terminatePartial
     * this function is called on the mapper side and
     * returns partially aggregated results.
     * @return
     */
    public Text terminatePartial(){
      return firstValue;
    }

    /**
     * function: merge
     * This function is called two merge two partially aggregated results
     * @param another
     * @return
     */
    public boolean merge(Text another) throws HiveException {
      iterate(another);
      return true;
    }
  }



}