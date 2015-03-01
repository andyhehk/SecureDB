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

    // Rewrite all subqueries before rewriting the other clauses.
    rewriteTableRefs(selStmt.getTableRefs());

    rewriteSelList(selStmt.getSelectList());
    rewriteWhereClause(selStmt.getWhereClause());
    rewriteGroupByExprs(selStmt.getGroupingExprs());
    rewriteHavingExpr(selStmt.getHavingExpr());
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteSelList(edu.hku.sdb.parse.
   *      SelectionList)
   */
  @Override
  protected void rewriteSelList(SelectionList selList)
      throws UnSupportedException {
    if (selList.involveSdbEncrytedCol()) {

    }
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteTableRefs(java.util.List)
   */
  @Override
  protected void rewriteTableRefs(List<TableRef> tblRefs)
      throws UnSupportedException {

    for (TableRef tblRef : tblRefs) {
      if (tblRef instanceof BaseTableRef) {
        rewriteBaseTblRef((BaseTableRef) tblRef);
      } else if (tblRef instanceof InLineViewRef) {
        rewriteInLineViewRef((InLineViewRef) tblRef);
      }
    }
  }

  /**
   * @throws UnSupportedException
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteBaseTblRef(edu.hku.sdb.parse.BaseTableRef)
   */
  @Override
  protected void rewriteBaseTblRef(BaseTableRef tblRef)
      throws UnSupportedException {
    Expr onClause = tblRef.getOnClause();

    if (onClause != null) {
      if (onClause instanceof NormalBinPredicate) {
        tblRef
            .setOnClause(rewriteNorBinPredicate((NormalBinPredicate) onClause));
      }
    }
  }

  /**
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteInLineViewRef(edu.hku.sdb.parse.InLineViewRef)
   */
  @Override
  protected void rewriteInLineViewRef(InLineViewRef inlineView)
      throws UnSupportedException {
    if (inlineView.involveSdbEncrytedCol()) {

    }
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteWhereClause(edu.hku.sdb.parse
   *      .Expr)
   */
  @Override
  protected void rewriteWhereClause(Expr whereClause)
      throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteGroupByExprs(java.util.List)
   */
  @Override
  protected void rewriteGroupByExprs(List<Expr> groupExprs)
      throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteHavingExpr(edu.hku.sdb.parse
   *      .Expr)
   */
  @Override
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
      throw new UnSupportedException("nested arithmetic expression!");
    }

    // EE mode
    if (left.involveSdbEncrytedCol() && right.involveSdbEncrytedCol()) {

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
      throw new UnSupportedException("nested binary predicate!");
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
