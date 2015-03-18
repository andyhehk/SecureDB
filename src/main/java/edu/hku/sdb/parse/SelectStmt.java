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

import java.math.BigInteger;
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

  private BigInteger p;
  private BigInteger q;
  private BigInteger n;
  private BigInteger g;

  public BigInteger getP() {
    return p;
  }

  public void setP(BigInteger p) {
    this.p = p;
  }

  public BigInteger getQ() {
    return q;
  }

  public void setQ(BigInteger q) {
    this.q = q;
  }

  public BigInteger getN() {
    return n;
  }

  public void setN(BigInteger n) {
    this.n = n;
  }

  public BigInteger getG() {
    return g;
  }

  public void setG(BigInteger g) {
    this.g = g;
  }

  /**
   * @see edu.hku.sdb.parse.ParseNode#analyze()
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
      throws SemanticException {
    // Resolve the nested queries and join clauses first if any.
    for (TableRef tblRef : tableRefs) {
      tblRef
          .analyze(metaDB, tableRefs.toArray(new ParseNode[tableRefs.size()]));
    }

    // Resolve the table names of the selection items.
    selectList.analyze(metaDB,
        tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the fields in the where clause
    if (whereClause != null)
      whereClause.analyze(metaDB,
          tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the grouping fields
    // It must be called after selection item resolved their table names.
    if (groupingExprs != null)
      for (Expr expr : groupingExprs) {
        expr.analyze(metaDB,
            selectList.itemList.toArray(new ParseNode[tableRefs.size()]));
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

    //TODO check if p, q, n, g are null
    if (!(p.equals(selObj.getP()) && q.equals(selObj.getQ()) && n.equals(selObj.getN()) && g.equals(selObj.getG()))) {
      String info = "p, q, n, g are not equal!";
      LOG.debug(info);
      return false;
    }

    // TODO Too verbose. Can we have better way to debug.
    if ((whereClause == null) != (selObj.whereClause == null)) {
      String info = (whereClause == null) ? "Left where clause is null, while "
          + "right clause is: " + selObj.whereClause : "Left where clause is: "
          + whereClause + ", while right clause is null";
      LOG.debug(info);
      return false;
    } else if ((groupingExprs == null) != (selObj.groupingExprs == null)) {
      String info = (groupingExprs == null) ? "Left group by clause is null, "
          + "while right clause is: " + selObj.groupingExprs
          : "Left group by clause is: " + groupingExprs
              + ", while right clause is null";
      LOG.debug(info);
      return false;
    } else if ((havingExpr == null) != (selObj.havingExpr == null)) {
      String info = (havingExpr == null) ? "Left having clause is null, while "
          + "right clause is: " + selObj.havingExpr : "Left having clause is: "
          + havingExpr + ", while right clause is null";
      LOG.debug(info);
      return false;
    } else if ((havingPred == null) != (selObj.havingPred == null)) {
      String info = (havingPred == null) ? "Left having predicate is null, while "
          + "right predicate is: " + selObj.havingPred
          : "Left having predicate is: " + havingPred
              + ", while right predicate is null";
      LOG.debug(info);
      return false;
    } else {
      if ((whereClause != null) && !whereClause.equals(selObj.whereClause)) {
        String info = "Left where clause is: " + whereClause
            + ";Right where clause is: " + selObj.whereClause;
        LOG.debug(info);
        return false;
      }
      if ((groupingExprs != null)
          && !groupingExprs.equals(selObj.groupingExprs)) {
        String info = "Left group by clause is: " + groupingExprs
            + ";Right group by clause is: " + selObj.groupingExprs;
        LOG.debug(info);
        return false;
      }
      if ((havingExpr != null) && !havingExpr.equals(selObj.havingExpr)) {
        String info = "Left having clause is: " + havingExpr
            + ";Right having clause is: " + selObj.havingExpr;
        LOG.debug(info);
        return false;
      }
      if ((havingPred != null) && !havingPred.equals(selObj.havingPred)) {
        String info = "Left having predicate is: " + havingPred
            + ";Right having predicate is: " + selObj.havingPred;
        LOG.debug(info);
        return false;
      }

      if (!selectList.equals(selObj.selectList)) {
        String info = "Two selection lists are not equal for SQLs: \n"
            + "Left: " + toSql() + "Right: " + selObj.toSql();
        LOG.debug(info);
        return false;
      }

      if (!tableRefs.equals(selObj.tableRefs)) {
        String info = "Two table lists are not equal for SQLs: \n" + "Left: "
            + toSql() + "Right: " + selObj.toSql();
        LOG.debug(info);
        return false;
      }

      return true;
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

  @Override
  public String toSql() {
    StringBuffer sb = new StringBuffer();

    sb.append("SELECT " + selectList.toSql() + "\n");

    List<String> tables = new ArrayList<String>();
    for (TableRef tbl : tableRefs) {
      tables.add(tbl.toSql());
    }

    String tblList = Joiner.on(" ").join(tables);
    // In the case that there is only on table, the separator "," should be
    // ignored.
    if (tblList.charAt(tblList.length() - 1) == ',') {
      tblList = tblList.substring(0, tblList.length() - 2);
    }
    sb.append("FROM " + tblList + "\n");

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

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    if (selectList.involveSdbEncrytedCol()) {
      return true;
    }

    for (TableRef tblRef : tableRefs) {
      if (tblRef.involveSdbEncrytedCol())
        return true;
    }

    if (whereClause.involveSdbEncrytedCol()) {
      return true;
    }

    for (Expr group : groupingExprs) {
      if (group.involveSdbEncrytedCol())
        return true;
    }

    if (havingExpr.involveSdbEncrytedCol()) {
      return true;
    }

    return false;
  }

}
