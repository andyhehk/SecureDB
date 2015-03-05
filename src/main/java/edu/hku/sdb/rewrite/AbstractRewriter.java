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

package edu.hku.sdb.rewrite;

import java.util.List;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.parse.BaseTableRef;
import edu.hku.sdb.parse.Expr;
import edu.hku.sdb.parse.InLineViewRef;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SelectStmt;
import edu.hku.sdb.parse.SelectionList;
import edu.hku.sdb.parse.TableRef;

public abstract class AbstractRewriter {

  protected final DBMeta dbMeta;

  public AbstractRewriter(DBMeta dbMeta) {
    this.dbMeta = dbMeta;
  }

  public abstract void rewrite(ParseNode parseTree) throws UnSupportedException;

  /**
   * Internal rewrite function. All rewriting should be involved by this
   * function.
   * 
   * @param parseTree
   * @return
   */
  protected void rewriteInternal(ParseNode parseTree)
      throws UnSupportedException {

    if (parseTree instanceof SelectStmt) {
      rewriteSelStmt((SelectStmt) parseTree);
    }
  }

  protected abstract void rewriteSelStmt(SelectStmt selStmt)
      throws UnSupportedException;

//  protected abstract void rewriteSelList(SelectionList selList)
//      throws UnSupportedException;
//
//  protected abstract void rewriteTableRefs(List<TableRef> tblRefs)
//      throws UnSupportedException;
//
//  protected abstract void rewriteBaseTblRef(BaseTableRef tblRef)
//      throws UnSupportedException;
//
//  protected abstract void rewriteInLineViewRef(InLineViewRef inlineView)
//      throws UnSupportedException;
//
//  protected abstract void rewriteWhereClause(Expr whereClause)
//      throws UnSupportedException;
//
//  protected abstract void rewriteGroupByExprs(List<Expr> groupExprs, List<TableRef> tblRefs)
//      throws UnSupportedException;
//
//  protected abstract void rewriteHavingExpr(Expr havingExpr)
//      throws UnSupportedException;
}