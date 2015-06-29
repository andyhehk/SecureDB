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

public class LimitElement {
  Expr lmtExpr;

  public LimitElement(Expr lmtExpr) {
    this.lmtExpr = lmtExpr;
  }

  public Expr getLmtExpr() {
    return lmtExpr;
  }

  public void setLmtExpr(Expr lmtExpr) {
    this.lmtExpr = lmtExpr;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof LimitElement))
      return false;

    LimitElement limitObj = (LimitElement) obj;

    return lmtExpr.equals(limitObj.getLmtExpr());
  }

  @Override
  public String toString() {
    return lmtExpr.toString();
  }

  public String toSql() {
    return lmtExpr.toSql();
  }
}
