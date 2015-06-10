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

public class AggregateExpr extends Expr {

  public AggregateExpr(Expr expr, AggregateType type) {
    this.expr = expr;
    this.type = type;
  }

  private Expr expr;
  private AggregateType type;

  public Expr getExpr() {
    return expr;
  }

  public void setExpr(Expr expr) {
    this.expr = expr;
  }


  public enum AggregateType {
    COUNT("count"),
    SUM("sum");

    private final String description;

    private AggregateType(String description) {
      this.description = description;
    }

    @Override
    public String toString() {
      return description;
    }
  }


  public String toSql() {
    return type.toString() + "(" + expr.toSql() + ")";
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return false;
  }


}
