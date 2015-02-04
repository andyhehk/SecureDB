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

public class NormalBinPredicate extends BinaryPredicate {

  public NormalBinPredicate(BinOperator op) {
    super(op);
  }

  public NormalBinPredicate(BinOperator op, Expr e1, Expr e2) {
    super(op);
    children.add(e1);
    children.add(e2);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof NormalBinPredicate))
      return false;

    NormalBinPredicate binPred = (NormalBinPredicate) obj;
    return op.equals(binPred.op) && children.equals(binPred.children);
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
    // TODO Auto-generated method stub
    return null;
  }

}
