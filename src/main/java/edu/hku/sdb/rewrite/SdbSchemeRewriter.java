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

package edu.hku.sdb.rewrite;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.parse.BaseTableRef;
import edu.hku.sdb.parse.Expr;
import edu.hku.sdb.parse.InLineViewRef;
import edu.hku.sdb.parse.NormalArithmeticExpr;
import edu.hku.sdb.parse.NormalBinPredicate;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SdbArithmeticExpr;
import edu.hku.sdb.parse.SdbBinPredicate;
import edu.hku.sdb.parse.SdbKeyUpdateExpr;
import edu.hku.sdb.parse.SelectStmt;
import edu.hku.sdb.parse.SelectionList;
import edu.hku.sdb.parse.TableRef;

public class SdbSchemeRewriter extends AbstractRewriter {

  private static final Logger LOG = LoggerFactory
      .getLogger(SdbSchemeRewriter.class);

  /**
   * @param dbMeta
   */
  public SdbSchemeRewriter(DBMeta dbMeta) {
    super(dbMeta);
    // TODO Auto-generated constructor stub
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewrite(edu.hku.sdb.parse.ParseNode)
   */
  @Override
  public void rewrite(ParseNode parseTree) throws UnSupportedException {
    rewriteInternal(parseTree);
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteSelStmt(edu.hku.sdb.parse.
   *      SelectStmt)
   */
  @Override
  protected void rewriteSelStmt(SelectStmt selStmt) throws UnSupportedException {

    /***********************************************************************
     * The rewrite steps are: 1. Rewrite sub-queries if any, also propagate the
     * key updates to all fields in the outer query that refer to selection
     * items in the sub queries.
     * 
     * 2. Check if there are join in the from clause. If yes, do key update for
     * all fields in selection list and where clause if necessary. Also
     * propagate the key update to the group by fields.
     * 
     * 3. Do rewrite for all selection items and exprs in where clause. The key
     * update will propagate to the outer query if it is a sub query.
     * 
     * 4. Do rewrite for all group by exprs.
     * 
     * 5. Not support having clause, orderby clause at this moment.
     * 
     **********************************************************************/

    rewriteTableRefs(selStmt.getTableRefs(), selStmt.getSelectList(),
        selStmt.getWhereClause(), selStmt.getGroupingExprs());
    rewriteWhereClause(selStmt.getWhereClause());
    rewriteGroupByExprs(selStmt.getGroupingExprs(), selStmt.getTableRefs());

    rewriteSelList(selStmt.getSelectList());
    rewriteHavingExpr(selStmt.getHavingExpr());
  }

  protected void rewriteSelList(SelectionList selList)
      throws UnSupportedException {
    if (selList.involveSdbEncrytedCol()) {

    }
  }

  protected void rewriteTableRefs(List<TableRef> tblRefs,
      SelectionList selList, Expr whereClause, List<Expr> groupExprs)
      throws UnSupportedException {

    List<BaseTableRef> baseRefs = new ArrayList<BaseTableRef>();
    List<InLineViewRef> inlineviews = new ArrayList<InLineViewRef>();
    
    for (TableRef tblRef : tblRefs) {
      if (tblRef instanceof BaseTableRef) {
        baseRefs.add((BaseTableRef) tblRef);
      } else if (tblRef instanceof InLineViewRef) {
        inlineviews.add((InLineViewRef) tblRef);
      }
    }
    
    // Rewrite inlineview first.
    for (InLineViewRef view : inlineviews) {
      rewriteInLineViewRef(view);
    }
    
    // Rewrite base table.
    for (BaseTableRef baseTbl : baseRefs) {
      rewriteBaseTblRef(baseTbl);
    }
    
  }

  protected void rewriteBaseTblRef(BaseTableRef tblRef)
      throws UnSupportedException {
    Expr onClause = tblRef.getOnClause();

    // rewrite the join clause is any
    if (onClause != null) {
      if (onClause instanceof NormalBinPredicate) {
        tblRef
            .setOnClause(rewriteNorBinPredicate((NormalBinPredicate) onClause));
      }
    }
  }

  protected void rewriteInLineViewRef(InLineViewRef inlineView)
      throws UnSupportedException {
    if (inlineView.involveSdbEncrytedCol()) {
      rewriteSelStmt((SelectStmt)inlineView.getQueryStmt());
      Expr onClause = inlineView.getOnClause();
      
      // rewrite the join clause is any
      if (onClause != null) {
        if (onClause instanceof NormalBinPredicate) {
          inlineView
              .setOnClause(rewriteNorBinPredicate((NormalBinPredicate) onClause));
        }
      }
    }
  }

  protected void rewriteWhereClause(Expr whereClause)
      throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  protected void rewriteGroupByExprs(List<Expr> groupExprs,
      List<TableRef> tblRefs) throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  protected void rewriteHavingExpr(Expr havingExpr) throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  protected Expr rewriteNorArithExpr(NormalArithmeticExpr arithExpr)
      throws UnSupportedException {
    // No SDB encrypted column.
    if (!arithExpr.involveSdbEncrytedCol())
      return arithExpr;

    Expr left = arithExpr.getChild(0);
    Expr right = arithExpr.getChild(1);

    // TODO support nested arithmetic expression.
    if (checkNotNull(left).hasChild(1) || checkNotNull(right).hasChild(1)) {
      UnSupportedException e = new UnSupportedException(
          "nested arithmetic expression!");
      LOG.error("There is unsupported expression!", e);
      throw e;
    }

    // EE mode
    if (left.involveSdbEncrytedCol() && right.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
      case MULTIPLY:
        break;
      case ADD:
        break;
      case SUBTRACT:
        break;
      default:
        break;
      }
    }

    // EC mode
    else if (left.involveSdbEncrytedCol() || right.involveSdbEncrytedCol()) {

    }

    return null;
  }

  protected Expr rewriteNorBinPredicate(NormalBinPredicate binPred)
      throws UnSupportedException {
    // No SDB encrypted column.
    if (!binPred.involveSdbEncrytedCol())
      return binPred;

    Expr left = binPred.getChild(0);
    Expr right = binPred.getChild(1);

    // TODO support nested binary predicate.
    if (checkNotNull(left).hasChild(1) || checkNotNull(right).hasChild(1)) {
      UnSupportedException e = new UnSupportedException(
          "nested binary predicate!");
      LOG.error("There is unsupported expression!", e);
      throw e;
    }

    SdbArithmeticExpr sdbArithExpr = new SdbArithmeticExpr();
    SdbKeyUpdateExpr sdbKeyUpExpr = new SdbKeyUpdateExpr();

    // EE mode
    if (left.involveSdbEncrytedCol() && right.involveSdbEncrytedCol()) {

    }

    // EC mode
    else if (left.involveSdbEncrytedCol() || right.involveSdbEncrytedCol()) {

    }

    SdbBinPredicate sdbBinPred = new SdbBinPredicate(binPred.getOp(),
        sdbArithExpr, sdbKeyUpExpr);

    return sdbBinPred;
  }

  private ParseNode rewriteAddEE(ParseNode parseTree) {
    return null;
  }

  private ParseNode rewriteAddEC(ParseNode parseTree) {
    return null;
  }

  private ParseNode rewriteEquiJoinEE(ParseNode parseTree) {
    return null;
  }

}
