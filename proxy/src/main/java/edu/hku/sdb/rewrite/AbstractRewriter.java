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

package edu.hku.sdb.rewrite;

import java.util.List;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.parse.*;

public abstract class AbstractRewriter {

  protected final DBMeta dbMeta;

  public AbstractRewriter(DBMeta dbMeta) {
    this.dbMeta = dbMeta;
  }

  public abstract void rewrite(ParseNode parseTree) throws RewriteException;

  /**
   * Internal rewrite function. All rewriting should be involved by this
   * function.
   *
   * @param parseTree
   * @return
   */
  protected void rewriteInternal(ParseNode parseTree)
          throws RewriteException {

    if (parseTree instanceof SelectStmt) {
      rewriteSelStmt((SelectStmt) parseTree);
      // No need to get the auxiliary column at the final step.
      ((SelectStmt) parseTree).getSelectList().setAuxiliaryR(null);
      ((SelectStmt) parseTree).getSelectList().setAuxiliaryS(null);
    } else if (parseTree instanceof CreateStmt) {
      rewriteCreateStmt((CreateStmt) parseTree);
    } else if (parseTree instanceof LoadStmt) {
      ;
    } else throw new UnSupportedException(parseTree.getClass().toString());
  }

  protected abstract void rewriteSelStmt(SelectStmt selStmt)
          throws RewriteException;

  protected abstract void rewriteCreateStmt(CreateStmt createStmt)
          throws RewriteException;

}