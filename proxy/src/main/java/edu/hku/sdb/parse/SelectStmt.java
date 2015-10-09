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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.hku.sdb.catalog.DBMeta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Joiner;

public class SelectStmt extends QueryStmt {

  private static final Logger LOG = LoggerFactory.getLogger(SelectStmt.class);

  private SelectionList selectList;
  private List<TableRef> tableRefs;
  private Expr whereClause;
  private List<Expr> groupingExprs;
  private Expr havingExpr; // original having clause

  // havingClause with aliases and agg output resolved
  //  protected Expr havingPred;

  private BigInteger p;
  private BigInteger q;
  private BigInteger n;
  private BigInteger g;

  public SelectStmt() {
    super(null, null);
  }

  public SelectStmt(ArrayList<OrderByElement> orderByElements, LimitElement
          limitElement) {
    super(orderByElements, limitElement);
  }

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
  public void analyze(DBMeta dbMeta, ParseNode... fieldSources)
          throws SemanticException {

    Set<String> tblNames = new HashSet<>();

    // Check if there are table names specified more than once.
    for (TableRef tblRef : tableRefs) {
      if (tblRef.tblName == null) {
        if (tblNames.contains(tblRef.alias)) {
          SemanticException e = new SemanticException("Table " + tblRef.alias
                  + " specified more than once!");
          LOG.error("Table name specified more than once!", e);
          throw e;
        } else {
          tblNames.add(tblRef.alias);
        }
      } else {
        if(tblRef.alias.equals("")) {
          if (tblNames.contains(tblRef.tblName)) {
            SemanticException e = new SemanticException("Table " + tblRef.tblName
                    + " specified more than once!");
            LOG.error("Table name specified more than once!", e);
            throw e;
          } else {
            tblNames.add(tblRef.tblName);
          }
        }
        else {
          if (tblNames.contains(tblRef.alias)) {
            SemanticException e = new SemanticException("Table " + tblRef.alias
                    + " specified more than once!");
            LOG.error("Table name specified more than once!", e);
            throw e;
          } else {
            tblNames.add(tblRef.alias);
          }
        }
      }
    }

    // Resolve the nested queries and join clauses first if any.

    for (TableRef tblRef : tableRefs) {
      tblRef.analyze(dbMeta, tableRefs.toArray(new ParseNode[tableRefs.size()]));
    }

    // Resolve the table names of the selection items.
    selectList.analyze(dbMeta,
            tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the fields in the where clause
    if (whereClause != null)
      whereClause.analyze(dbMeta,
              tableRefs.toArray(new ParseNode[tableRefs.size()]));

    // Resolve the table names of the grouping fields
    // It must be called after selection items resolved their table names.
    if (groupingExprs != null)
      for (Expr expr : groupingExprs) {
        try {
          expr.analyze(dbMeta,
                  selectList.itemList.toArray(new ParseNode[selectList.itemList
                          .size()]));

        } catch (UnableResolveException e) {
          LOG.error("There is no selection item that group by element: " + expr
                  .toSql() + " refers to!");
        }
      }

    // Get the table name of the aggregation fields.
    // It must be called after selection items resolved their table names.
    if (havingExpr != null)
      try {
        havingExpr.analyze(dbMeta,
                selectList.itemList.toArray(new ParseNode[selectList.itemList.size
                        ()]));

      } catch (UnableResolveException e) {
        LOG.error("There is no selection items that having expr: " + havingExpr
                .toSql() + " refers to!");
      }

    if (orderByElements != null) {
      for (OrderByElement element : orderByElements) {
        try {
          element.getExpr().analyze(dbMeta, selectList.itemList.toArray(new
                  ParseNode[selectList.itemList.size()]));
        } catch (UnableResolveException e) {
          LOG.error("There is no selection item that order by element: " + element
                  .getExpr().toSql() + " refers to!");
        }
      }
    }

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
    //    if (!(p.equals(selObj.getP()) && q.equals(selObj.getQ()) && n.equals
    // (selObj.getN()) && g.equals(selObj.getG()))) {
    //      String info = "p, q, n, g are not equal!";
    //      LOG.debug(info);
    //      return false;
    //    }

    // TODO Too verbose. Can we have better way to debug.
    if ((whereClause == null) != (selObj.whereClause == null)) {
      LOG.debug("Where clauses are not equal!");
      return false;
    } else if ((groupingExprs == null) != (selObj.groupingExprs == null)) {
      LOG.debug("Group by clauses are not equal!");
      return false;
    } else if ((havingExpr == null) != (selObj.havingExpr == null)) {
      LOG.debug("Having clauses are not equal!");
      return false;
    } else if ((orderByElements == null) != (selObj.orderByElements == null)) {
      LOG.debug("Order by clauses are not equal!");
      return false;
    } else if ((limitElement == null) != (selObj.limitElement == null)) {
      LOG.debug("Limit clauses are not equal!");
      return false;
    } else {
      if ((whereClause != null) && !whereClause.equals(selObj.whereClause)) {
        LOG.debug("Where clauses are not equal!");
        return false;
      }
      if ((groupingExprs != null)
              && !groupingExprs.equals(selObj.groupingExprs)) {
        LOG.debug("Group by clauses are not equal!");
        return false;
      }
      if ((havingExpr != null) && !havingExpr.equals(selObj.havingExpr)) {
        LOG.debug("Having clauses are not equal!");
        return false;
      }

      if ((orderByElements != null) && !orderByElements.equals(selObj
              .orderByElements)) {
        LOG.debug("Order by clauses are not equal!");
        return false;
      }

      if ((limitElement != null) && !limitElement.equals(selObj.limitElement)) {
        LOG.debug("Limit clauses are not equal!");
        return false;
      }

      if (!selectList.equals(selObj.selectList)) {
        LOG.debug("Selection clauses are not equal!");
        return false;
      }

      if (!tableRefs.equals(selObj.tableRefs)) {
        LOG.debug("Tables are not equal!");
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
   * @param selectList the selectList to set
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
   * @param tableRefs the tableRefs to set
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
   * @param whereClause the whereClause to set
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
   * @param groupingExprs the groupingExprs to set
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
   * @param havingExpr the havingExpr to set
   */
  public void setHavingExpr(Expr havingExpr) {
    this.havingExpr = havingExpr;
  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder();

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

    if (orderByElements != null) {
      List<String> orderElemts = new ArrayList<String>();
      for (OrderByElement orderElemt : orderByElements) {
        orderElemts.add(orderElemt.toSql());
      }
      sb.append("ORDER BY " + Joiner.on(",").join(orderElemts) + "\n");
    }

    if (limitElement != null) {
      sb.append("LIMIT " + limitElement.toSql());
    }

    return sb.toString();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("SELECTION LIST: " + selectList + "\n");
    for (TableRef tableRef : tableRefs) {
      sb.append("TABLE REFERENCE: " + tableRef + "\n");
    }
    if (whereClause != null)
      sb.append("WHERE PREDICATES: " + whereClause + "\n");
    if (groupingExprs != null) {
      sb.append("GROUP BY ELEMENTS:" + "\n");
      for (Expr expr : groupingExprs) {
        sb.append(expr + "\n");
        sb.append("--------------------\n");
      }
    }
    if (havingExpr != null) {
      sb.append("HAVING ELEMENTS: " + havingExpr + "\n");
    }
    if (orderByElements != null) {
      sb.append("ORDER BY ELEMENTS: ");
      for (OrderByElement elemt : orderByElements) {
        sb.append(elemt + "\n");
        sb.append("--------------------\n");
      }
    }
    if (limitElement != null) {
      sb.append("LIMIT ELEMENT: " + limitElement + "\n");
    }

    return sb.toString();
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#involveSdbCol()
   */
  @Override
  public boolean involveEncrytedCol() {
    if (selectList.involveEncrytedCol()) {
      return true;
    }

    for (TableRef tblRef : tableRefs) {
      if (tblRef.involveEncrytedCol())
        return true;
    }

    if (whereClause != null && whereClause.involveEncrytedCol()) {
      return true;
    }

    if (groupingExprs != null) {
      for (Expr group : groupingExprs) {
        if (group.involveEncrytedCol())
          return true;
      }
    }

    if (havingExpr != null && havingExpr.involveEncrytedCol()) {
      return true;
    }

    return false;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

}
