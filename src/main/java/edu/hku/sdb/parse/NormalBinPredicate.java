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

import static com.google.common.base.Preconditions.checkNotNull;

public class NormalBinPredicate extends BinaryPredicate {

  public NormalBinPredicate(BinOperator op) {
    super(op);
  }

  public NormalBinPredicate(BinOperator op, Expr e1, Expr e2) {
    super(op);
    children.add(checkNotNull(e1, "Left expression is null."));
    children.add(checkNotNull(e2, "Right expression is null."));
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
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    return checkNotNull(getChild(0), "Left expression is null.").toSql() + " "
        + op + " "
        + checkNotNull(getChild(1), "Right expression is null.").toSql();
  }

  @Override
  public String toString() {
    return "(Left child: "
        + checkNotNull(getChild(0), "Left expression is null.") + ";Operator: "
        + op + ";" + "Right child: "
        + checkNotNull(getChild(1), "Right expression is null.") + ")";
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return checkNotNull(getChild(0), "Left expression is null.").involveSdbEncrytedCol() || 
        checkNotNull(getChild(1), "Right expression is null.").involveSdbEncrytedCol();
  }

}
