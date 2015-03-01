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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.MetaStore;

import com.google.common.base.Joiner;

public class SelectStmt extends QueryStmt {

  private static final Logger LOG = LoggerFactory.getLogger(SelectStmt.class);

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
      tblRef
          .analyze(metaDB, tableRefs.toArray(new ParseNode[tableRefs.size()]));
    }

    // Resolve the table names of the selection items
    selectList.analyze(metaDB,
        tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the fields in the where clause
    if (whereClause != null)
      whereClause.analyze(metaDB,
          tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the grouping fields
    if (groupingExprs != null)
      for (Expr expr : groupingExprs) {
        expr.analyze(metaDB, tableRefs.toArray(new ParseNode[tableRefs.size()]));
      }

    // Get the table name of the aggregation field.
    // It must be called after selection item resolved their table names.
    if (havingExpr != null)
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
            "A selection statement cannot have empty selection list or table "
                + "list");
      } catch (SemanticException e) {
        e.printStackTrace();
      }
    }

    SelectStmt selObj = (SelectStmt) obj;
    
    // TODO Too verbose. Can we have better way to debug.
    if ((whereClause == null) != (selObj.whereClause == null)) {
      String err = (whereClause == null) ? "Left where clause is null, while "
          + "right clause is: " + selObj.whereClause : "Left where clause is: "
          + whereClause + ", while right clause is null";
      LOG.debug(err);
      return false;
    } else if ((groupingExprs == null) != (selObj.groupingExprs == null)) {
      String err = (groupingExprs == null) ? "Left group by clause is null, "
          + "while right clause is: " + selObj.groupingExprs
          : "Left group by clause is: " + groupingExprs
              + ", while right clause is null";
      LOG.debug(err);
      return false;
    } else if ((havingExpr == null) != (selObj.havingExpr == null)) {
      String err = (havingExpr == null) ? "Left having clause is null, while "
          + "right clause is: " + selObj.havingExpr : "Left having clause is: "
          + havingExpr + ", while right clause is null";
      LOG.debug(err);
      return false;
    } else if ((havingPred == null) != (selObj.havingPred == null)) {
      String err = (havingPred == null) ? "Left having predicate is null, while "
          + "right predicate is: " + selObj.havingPred
          : "Left having predicate is: " + havingPred
              + ", while right predicate is null";
      LOG.debug(err);
      return false;
    } else {
      if ((whereClause != null) && !whereClause.equals(selObj.whereClause)) {
        String err = "Left where clause is: " + whereClause
            + ";Right where clause is: " + selObj.whereClause;
        LOG.debug(err);
        return false;
      }
      if ((groupingExprs != null)
          && !groupingExprs.equals(selObj.groupingExprs)) {
        String err = "Left group by clause is: " + groupingExprs
            + ";Right group by clause is: " + selObj.groupingExprs;
        LOG.debug(err);
        return false;
      }
      if ((havingExpr != null) && !havingExpr.equals(selObj.havingExpr)) {
        String err = "Left having clause is: " + havingExpr
            + ";Right having clause is: " + selObj.havingExpr;
        LOG.debug(err);
        return false;
      }
      if ((havingPred != null) && !havingPred.equals(selObj.havingPred)) {
        String err = "Left having predicate is: " + havingPred
            + ";Right having predicate is: " + selObj.havingPred;
        LOG.debug(err);
        return false;
      }

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

  public String toSql() {
    StringBuffer sb = new StringBuffer();

    sb.append("SELECT " + selectList.toSql() + "\n");

    List<String> tables = new ArrayList<String>();
    for (TableRef tbl : tableRefs) {
      tables.add(tbl.toSql());
    }

    sb.append("FROM " + Joiner.on(" ").join(tables) + "\n");

    if (whereClause != null)
      sb.append("WHERE " + whereClause.toSql() + "\n");

    List<String> groups = new ArrayList<String>();

    if (groupingExprs != null) {
      for (Expr expr : groupingExprs) {
        groups.add(expr.toSql());
      }

      sb.append("GROUP BY " + Joiner.on(",").join(groups) + "\n");
    }

    if (havingExpr != null)
      sb.append("HAVING " + havingExpr.toSql() + "\n");

    return sb.toString();
  }

}
