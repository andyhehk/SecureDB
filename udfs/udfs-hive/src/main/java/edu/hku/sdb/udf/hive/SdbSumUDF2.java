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
import org.apache.hadoop.hive.common.type.HiveVarchar;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator;
import org.apache.hadoop.hive.serde2.io.HiveVarcharWritable;
import org.apache.hadoop.hive.serde2.objectinspector.*;

import org.apache.hadoop.hive.serde2.objectinspector.primitive
        .HiveVarcharObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive
        .PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive
        .PrimitiveObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.apache.hadoop.hive.serde2.typeinfo.PrimitiveTypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
import org.apache.hadoop.io.Text;
import org.apache.hive.common.util.HiveStringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;

/**
 * This implementation through runtime error.
 */
public class SdbSumUDF2 extends AbstractGenericUDAFResolver {

  private static final Logger LOG = LoggerFactory.getLogger
          (SdbSumUDF2.class);

  @Override
  public GenericUDAFEvaluator getEvaluator(TypeInfo[] parameters)
          throws SemanticException {
    if (parameters.length != 2) {
      throw new UDFArgumentTypeException(parameters.length - 1,
              "Please specify exactly two arguments.");
    }

    // validate the first parameter, which is the expression to compute over
    if (parameters[0].getCategory() != ObjectInspector.Category.PRIMITIVE) {
      throw new UDFArgumentTypeException(0,
              "Only primitive type arguments are accepted but "
                      + parameters[0].getTypeName() + " was passed as parameter 1.");
    }
    switch (((PrimitiveTypeInfo) parameters[0]).getPrimitiveCategory()) {
      case STRING:
        break;
      default:
        throw new UDFArgumentTypeException(0,
                "Only string type arguments are accepted but "
                        + parameters[0].getTypeName() + " was passed as parameter " +
                        "1.");
    }

    // validate the second parameter, which is the number of histogram bins
    if (parameters[1].getCategory() != ObjectInspector.Category.PRIMITIVE) {
      throw new UDFArgumentTypeException(1,
              "Only primitive type arguments are accepted but "
                      + parameters[1].getTypeName() + " was passed as parameter 2.");
    }
    if (((PrimitiveTypeInfo) parameters[1]).getPrimitiveCategory()
            != PrimitiveObjectInspector.PrimitiveCategory.STRING) {
      throw new UDFArgumentTypeException(1,
              "Only an string argument is accepted as parameter 2, but "
                      + parameters[1].getTypeName() + " was passed instead.");
    }

    return new SdbSumUDAFEvaluator();
  }

  public static class SdbSumUDAFEvaluator extends GenericUDAFEvaluator {

    // For PARTIAL1 and COMPLETE
    private transient StringObjectInspector inputOI;
    private transient StringObjectInspector nOI;
    // For PARTIAL2 and FINAL
    private transient StructObjectInspector sOI;
    private transient StructField sumField;
    private transient StructField nField;
    private StringObjectInspector sumFieldOI;
    private StringObjectInspector nFieldOI;
    // For PARTIAL1 and PARTIAL2
    protected transient Object[] partialResult;

    @Override
    public ObjectInspector init(Mode mode, ObjectInspector[] parameters)
            throws HiveException {
      assert (parameters.length == 2);
      super.init(mode, parameters);

      // init input
      if (mode == Mode.PARTIAL1 || mode == Mode.COMPLETE) {
        inputOI = (StringObjectInspector) parameters[0];
        nOI = (StringObjectInspector) parameters[1];
      } else {
        sOI = (StructObjectInspector) parameters[0];
        sumField = sOI.getStructFieldRef("sum");
        nField = sOI.getStructFieldRef("n");
        sumFieldOI = (StringObjectInspector) sumField.getFieldObjectInspector();
        nFieldOI = (StringObjectInspector) nField.getFieldObjectInspector();
      }

      // init output
      if (mode == Mode.PARTIAL1 || mode == Mode.PARTIAL2) {
        // The output of a partial aggregation is a struct containing
        // a "string" sum and a "string" public key n.

        ArrayList<ObjectInspector> foi = new ArrayList<ObjectInspector>();
        foi.add(PrimitiveObjectInspectorFactory.writableStringObjectInspector);
        foi.add(PrimitiveObjectInspectorFactory.writableStringObjectInspector);
        ArrayList<String> fname = new ArrayList<String>();
        fname.add("sum");
        fname.add("n");
        partialResult = new Object[2];
        partialResult[0] = new Text("0");
        partialResult[1] = new Text();
        return ObjectInspectorFactory.getStandardStructObjectInspector(fname,
                foi);

      } else {
        return PrimitiveObjectInspectorFactory.writableStringObjectInspector;
      }
    }

    /**
     * class for storing the current max value
     */
    static class SumAgg extends AbstractAggregationBuffer {
      String sum;
      String n;
    }

    @Override
    public AggregationBuffer getNewAggregationBuffer() throws HiveException {
      SumAgg result = new SumAgg();
      reset(result);
      return result;
    }

    @Override
    public void reset(AggregationBuffer agg) throws HiveException {
      SumAgg myagg = (SumAgg) agg;
      myagg.sum = new String("0");
      myagg.n = new String("");
    }

    boolean warned = false;

    @Override
    public void iterate(AggregationBuffer agg, Object[] parameters)
            throws HiveException {
      assert (parameters.length == 2);
      SumAgg sumAgg = (SumAgg) agg;

      String sum = PrimitiveObjectInspectorUtils.getString
              (parameters[0], inputOI);
      String n = PrimitiveObjectInspectorUtils.getString(parameters[1],
              nOI);

      sumAgg.n = n;
      sumAgg.sum = TypeCast.bigIntToString(TypeCast.stringToBigInt(sumAgg.sum).add(TypeCast.stringToBigInt(sum)).mod
              (TypeCast.stringToBigInt(n)));

    }

    @Override
    public Object terminatePartial(AggregationBuffer agg)
            throws HiveException {
      SumAgg sumAgg = (SumAgg) agg;
      partialResult[0] = new Text(sumAgg.sum);
      partialResult[1] = new Text(sumAgg.n);

      return partialResult;
    }

    @Override
    public void merge(AggregationBuffer agg, Object partial)
            throws HiveException {
      if (partial != null) {
        SumAgg myagg = (SumAgg) agg;
        Object partialSum = sOI.getStructFieldData(partial, sumField);
        Text sum = sumFieldOI.getPrimitiveWritableObject(partialSum);
        myagg.sum = TypeCast.bigIntToString(TypeCast.stringToBigInt(myagg.sum).add(TypeCast.stringToBigInt(sum.toString())).mod
                (TypeCast.stringToBigInt(myagg.n)));

      }
    }

    @Override
    public Object terminate(AggregationBuffer agg) throws HiveException {
      SumAgg myagg = (SumAgg) agg;
      return myagg.sum;
    }
  }
}