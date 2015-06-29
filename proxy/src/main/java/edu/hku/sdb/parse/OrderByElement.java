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

public class OrderByElement {
  private Expr expr;
  // In Hive, it is true if not specified.
  private final boolean isAsc;
  /**
   * Constructs the OrderByElement.
   *
   */
  public OrderByElement(Expr expr, boolean isAsc) {
    this.expr = expr;
    this.isAsc = isAsc;
  }

  public Expr getExpr() {
    return expr;
  }

  public void setExpr(Expr expr) {
    this.expr = expr;
  }

  public boolean isAsc() {
    return isAsc;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof OrderByElement))
      return false;

    OrderByElement orderByObj = (OrderByElement) obj;

    return expr.equals(orderByObj.getExpr()) && isAsc == orderByObj.isAsc;
  }

  public String toSql() {
    StringBuilder sb = new StringBuilder();
    sb.append(expr.toSql());
    sb.append(isAsc ? " ASC" : " DESC");

    return sb.toString();
  }

  @Override
  public String toString() {
    return expr + "\n";
  }
}
