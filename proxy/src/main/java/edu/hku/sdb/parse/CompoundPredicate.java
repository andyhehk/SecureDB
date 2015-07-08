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

public class CompoundPredicate extends Predicate {

  public enum CompoundOperator {
    AND("AND"),
    OR("OR");

    private final String description;

    private CompoundOperator(String description) {
      this.description = description;
    }

    @Override
    public String toString() {
      return description;
    }
  }

  private CompoundOperator op;

  public CompoundPredicate(CompoundOperator op) {
    this.op = op;
  }

  public CompoundPredicate(CompoundOperator op, Predicate left, Predicate
          right) {
    this.op = op;
    setChild(0, checkNotNull(left, "Left predicate is null."));
    setChild(1, checkNotNull(right, "Right predicate is null."));
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    return getLeftPred().toSql() + " " + op + " " + getRightPred().toSql();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof CompoundPredicate))
      return false;

    CompoundPredicate compoundPredObj = (CompoundPredicate) obj;

    boolean equal = (op == compoundPredObj.op && children.equals(compoundPredObj.children));

    return op == compoundPredObj.op && children.equals(compoundPredObj.children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Operator: " + op + "|");
    sb.append("Left: " + getLeftPred() + "|");
    sb.append("Right: " + getRightPred() + "|");

    return sb.toString();
  }

  /* (non-Javadoc)
     * @see edu.hku.sdb.parse.Expr#involveSdbCol()
     */
  @Override
  public boolean involveSdbEncrytedCol() {
    return getLeftPred().involveSdbEncrytedCol() || getRightPred()
            .involveSdbEncrytedCol();
  }

  public CompoundOperator getOp() {
    return op;
  }

  public void setLeftPred(Expr leftPred) {
    if(children.size() < 1)
      children.add(leftPred);
    else
      setChild(0, leftPred);
  }

  public Expr getLeftPred() {
    return  getChild(0);
  }

  public void setRightPred(Expr rightPred) {
    if(children.size() < 1) {
      children.add(null);
      children.add(rightPred);
    }
    else if(children.size() == 1) {
      children.add(rightPred);
    }
    else
      setChild(1, rightPred);
  }

  public Expr getRightPred() {
    return  getChild(1);
  }
}
