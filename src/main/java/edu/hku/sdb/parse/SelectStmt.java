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
 *
 *******************************************************************************/
package edu.hku.sdb.parse;

import java.util.List;

public class SelectStmt extends QueryStmt {

  private SelectionList selectList;
  private List<TableRef> tableRefs;
  private Expr whereClause;
  private List<Expr> groupingExprs;
  private Expr havingExpr;

  // havingClause with aliases and agg output resolved
  protected Expr havingPred;

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectStmt))
      return false;

    SelectStmt selObj = (SelectStmt) obj;

    return selectList.equals(selObj.selectList)
        && tableRefs.equals(selObj.tableRefs)
        && whereClause.equals(selObj.whereClause)
        && groupingExprs.equals(selObj.groupingExprs)
        && havingExpr.equals(selObj.havingExpr)
        && havingPred.equals(selObj.havingPred);
  }

  /**
   * @return the selectList
   */
  public SelectionList getSelectList() {
    return selectList;
  }

  /**
   * @param selectList
   *          the selectList to set
   */
  public void setSelectList(SelectionList selectList) {
    this.selectList = selectList;
  }

  /**
   * @return the tableRefs
   */
  public List<TableRef> getTableRefs() {
    return tableRefs;
  }

  /**
   * @param tableRefs
   *          the tableRefs to set
   */
  public void setTableRefs(List<TableRef> tableRefs) {
    this.tableRefs = tableRefs;
  }

  /**
   * @return the whereClause
   */
  public Expr getWhereClause() {
    return whereClause;
  }

  /**
   * @param whereClause
   *          the whereClause to set
   */
  public void setWhereClause(Expr whereClause) {
    this.whereClause = whereClause;
  }

  /**
   * @return the groupingExprs
   */
  public List<Expr> getGroupingExprs() {
    return groupingExprs;
  }

  /**
   * @param groupingExprs
   *          the groupingExprs to set
   */
  public void setGroupingExprs(List<Expr> groupingExprs) {
    this.groupingExprs = groupingExprs;
  }

  /**
   * @return the havingExpr
   */
  public Expr getHavingExpr() {
    return havingExpr;
  }

  /**
   * @param havingExpr
   *          the havingExpr to set
   */
  public void setHavingExpr(Expr havingExpr) {
    this.havingExpr = havingExpr;
  }

}
