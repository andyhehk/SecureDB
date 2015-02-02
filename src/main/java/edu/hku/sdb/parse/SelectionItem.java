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

public class SelectionItem {

  private Expr expr;
  private String alia;

  public SelectionItem(Expr expr, String alia) {
    this.expr = expr;
    this.alia = alia;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectionItem))
      return false;

    SelectionItem selitemObj = (SelectionItem) obj;
    return expr.equals(selitemObj.expr) && alia.equals(selitemObj.alia);
  }

  /**
   * @return the expr
   */
  public Expr getExpr() {
    return expr;
  }

  /**
   * @param expr
   *          the expr to set
   */
  public void setExpr(Expr expr) {
    this.expr = expr;
  }

  /**
   * @return the alias
   */
  public String getAlia() {
    return alia;
  }

  /**
   * @param alias
   *          the alias to set
   */
  public void setAlia(String alias) {
    this.alia = alias;
  }
}
