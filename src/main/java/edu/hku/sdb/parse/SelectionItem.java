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

import edu.hku.sdb.catalog.MetaStore;

public class SelectionItem implements ParseNode {

  private Expr expr;
  private String alias;

  /**
   * Default constructor
   */
  public SelectionItem() {
  
  }
  
  public SelectionItem(Expr expr, String alias) {
    this.expr = expr;
    this.alias = alias;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectionItem))
      return false;

    SelectionItem selitemObj = (SelectionItem) obj;

    if ((expr == null) != (selitemObj.expr == null))
      return false;

    if ((alias == null) != (selitemObj.alias == null))
      return false;

    if(alias != null)
      if(!alias.equals(selitemObj.alias))
        return false;
    
    return expr.equals(selitemObj.expr);
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
  public String getAlias() {
    return alias;
  }

  /**
   * @param alias
   *          the alias to set
   */
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.catalog.DBMeta)
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {
    expr.analyze(metaDB, fieldSources);
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }
}
