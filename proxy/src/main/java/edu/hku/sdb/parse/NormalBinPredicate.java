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

import static com.google.common.base.Preconditions.checkNotNull;

public class NormalBinPredicate extends BinaryPredicate {

  public NormalBinPredicate(BinOperator op) {
    super(op);
  }

  public NormalBinPredicate(BinOperator op, Expr left, Expr right) {
    super(op);
    children.add(checkNotNull(left, "Left expression is null."));
    children.add(checkNotNull(right, "Right expression is null."));
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof NormalBinPredicate))
      return false;

    NormalBinPredicate binPred = (NormalBinPredicate) obj;

    boolean equal = (op.equals(binPred.op) && children.equals(binPred.children));
    return op.equals(binPred.op) && children.equals(binPred.children);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    return checkNotNull(getLeftExpr(), "Left expression is null.").toSql() + " "
            + op + " "
            + checkNotNull(getRightExpr(), "Right expression is null.").toSql();
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveEncrytedCol() {
    return checkNotNull(getLeftExpr(), "Left expression is null.").involveEncrytedCol() ||
            checkNotNull(getRightExpr(), "Right expression is null.").involveEncrytedCol();
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("Operator: " + op + "|");
    sb.append("Left: " + getLeftExpr() + "|");
    sb.append("Right: " + getRightExpr() + "|");

    return sb.toString();
  }

}
