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

import edu.hku.sdb.catalog.MetaStore;

public class SelectStmt extends QueryStmt {

  private SelectionList selectList;
  private List<TableRef> tableRefs;
  private Expr whereClause;
  private List<Expr> groupingExprs;
  private Expr havingExpr; // original having clause

  // havingClause with aliases and agg output resolved
  protected Expr havingPred;
  
  /**
   * @see edu.hku.sdb.parse.ParseNode#analyze()
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
      throws SemanticException {
    // Resolve the nested query first if any
    for (TableRef tblRef : tableRefs) {
      tblRef.analyze(metaDB, (ParseNode) null);
    }
    
    // Resolve the table names of the selection items
    selectList.analyze(metaDB,
        tableRefs.toArray(new ParseNode[tableRefs.size()]));
    // Resolve the table names of the fields in the where clause
    whereClause.analyze(metaDB,
        tableRefs.toArray(new ParseNode[tableRefs.size()]));
    // Resolve the table names of the grouping fields
    for (Expr expr : groupingExprs) {
      expr.analyze(metaDB, tableRefs.toArray(new ParseNode[tableRefs.size()]));
    }

    // Get the table name of the aggregation field.
    // It must be called after selection item resolved their table names.
    havingExpr.analyze(metaDB,
        selectList.itemList.toArray(new ParseNode[tableRefs.size()]));

  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectStmt))
      return false;

    if (selectList == null || tableRefs == null) {
      try {
        throw new SemanticException(
            "A selection statement cannot have empty selection list or table list");
      } catch (SemanticException e) {
        e.printStackTrace();
      }
    }

    SelectStmt selObj = (SelectStmt) obj;

    if ((whereClause == null) != (selObj.whereClause == null))
      return false;
    else if ((groupingExprs == null) != (selObj.groupingExprs == null))
      return false;
    else if ((havingExpr == null) != (selObj.havingExpr == null))
      return false;
    else if ((havingPred == null) != (selObj.havingPred == null))
      return false;

    else {
      if ((whereClause != null) && !whereClause.equals(selObj.whereClause))
        return false;
      if ((groupingExprs != null)
          && !groupingExprs.equals(selObj.groupingExprs))
        return false;
      if ((havingExpr != null) && !havingExpr.equals(selObj.havingExpr))
        return false;
      if ((havingPred != null) && !havingPred.equals(selObj.havingPred))
        return false;

      return selectList.equals(selObj.selectList)
          && tableRefs.equals(selObj.tableRefs);
    }
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
