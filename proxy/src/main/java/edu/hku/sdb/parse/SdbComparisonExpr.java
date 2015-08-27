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

package edu.hku.sdb.parse;

import com.google.common.base.Joiner;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SdbComparisonExpr extends Expr {

  public static String SDB_EQ_UDF = "sdb_eq";
  public static String SDB_LT_UDF = "sdb_lt";
  public static String SDB_GT_UDF = "sdb_gt";
  public static String SDB_LE_UDF = "sdb_le";
  public static String SDB_GE_UDF = "sdb_ge";
  public static String SDB_NE_UDF = "sdb_ne";

  public static Map<BinOperator, String> opUdfMap = new HashMap<>();
  static {
    opUdfMap.put(BinOperator.EQ, SDB_EQ_UDF);
    opUdfMap.put(BinOperator.LT, SDB_LT_UDF);
    opUdfMap.put(BinOperator.GT, SDB_GT_UDF);
    opUdfMap.put(BinOperator.LE, SDB_LE_UDF);
    opUdfMap.put(BinOperator.GE, SDB_GE_UDF);
    opUdfMap.put(BinOperator.NE, SDB_NE_UDF);
  }

  BinOperator op;

  public SdbComparisonExpr(BinOperator op) {
    this.op = op;
  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder();
    sb.append(opUdfMap.get(op));
    sb.append("(");

    List<String> children = new ArrayList<>();
    for(Expr expr : getChildren())
      children.add(expr.toSql());

    sb.append(Joiner.on(",").join(children));
    sb.append(")");

    return sb.toString();
  }

  @Override
  public boolean involveEncrytedCol() {
    return true;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }
}
