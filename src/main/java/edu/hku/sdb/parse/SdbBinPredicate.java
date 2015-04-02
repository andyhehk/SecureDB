/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.parse;

import java.math.BigInteger;

public class SdbBinPredicate extends BinaryPredicate {

  private SdbArithmeticExpr arithExpr;
  private SdbKeyUpdateExpr keyUpExpr;
  private String sdbCompareUDF = "sdb_compare";
  private BigInteger threshold;

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SdbBinPredicate))
      return false;

    SdbBinPredicate sdbBin = (SdbBinPredicate) obj;
    return op.equals(sdbBin.op) && arithExpr.equals(sdbBin.arithExpr)
        && keyUpExpr.equals(sdbBin.keyUpExpr);
  }

  public BigInteger getThreshold() {
    return threshold;
  }

  public void setThreshold(BigInteger threshold) {
    this.threshold = threshold;
  }

  public SdbBinPredicate(BinOperator op, SdbArithmeticExpr arithExpr,
                         SdbKeyUpdateExpr keyUpExpr) {
    super(op);
    this.arithExpr = arithExpr;
    this.keyUpExpr = keyUpExpr;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.parse.BasicSemanticAnalyzer
   * )
   */
  public void analyze(BasicSemanticAnalyzer analyzer) throws SemanticException {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    return  sdbCompareUDF + "(" + keyUpExpr.toSql() + ", \"" + threshold.toString() +  "\") " + op + " 0";
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return true;
  }

}
