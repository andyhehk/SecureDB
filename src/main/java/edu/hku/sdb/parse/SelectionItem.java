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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.MetaStore;

import static com.google.common.base.Preconditions.*;

public class SelectionItem implements ParseNode {

  private static final Logger LOG = LoggerFactory
      .getLogger(SelectionItem.class);

  private Expr expr;
  // Make sure alias is not null
  private String alias = "";

  /**
   * Default constructor
   */
  public SelectionItem() {

  }

  public SelectionItem(Expr expr, String alias) {
    this.expr = expr;
    // Make sure alias is not null
    this.alias = checkNotNull(alias, "Alias is null");
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectionItem))
      return false;

    SelectionItem selitemObj = (SelectionItem) obj;

    if ((expr == null) != (selitemObj.expr == null)) {
      String err = (expr == null) ? "Left selection item is null, while "
          + "right selection item is: " + selitemObj.expr
          : "Left selection item is: " + expr
              + ", while right selection item is null";
      LOG.debug(err);
      return false;
    }

    return expr.equals(selitemObj.expr) && alias.equals(selitemObj.alias);
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
    // Make sure alias is not null
    this.alias = checkNotNull(alias, "Alias is null");
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.catalog.DBMeta)
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
      throws SemanticException {
    expr.analyze(metaDB, fieldSources);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    if (alias.equals(""))
      return expr.toSql();
    else
      return expr.toSql() + "AS" + alias;
  }
}
