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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.Type;

public abstract class Expr extends TreeNode<Expr> implements ParseNode {

  // The list of field that refer to this expr. It is used for query rewrite.
  protected List<FieldLiteral> referredByList = new ArrayList<FieldLiteral>();

  /**
   * @return the referredByList
   */
  public List<FieldLiteral> getReferredByList() {
    return referredByList;
  }

  /**
   * @param referredByList the referredByList to set
   */
  public void setReferredByList(List<FieldLiteral> referredByList) {
    this.referredByList = referredByList;
  }

  /**
   * Add a new field refers to this expr.
   *
   * @param field
   */
  public void addReferredBy(FieldLiteral field) {
    referredByList.add(field);
  }

  /**
   * Add a new field refers to this expr.
   *
   * @param field
   */
  public void removeReferredBy(FieldLiteral field) {
    for (Iterator<FieldLiteral> iter = referredByList.listIterator(); iter
            .hasNext(); ) {
      FieldLiteral a = iter.next();
      if (a == field) {
        iter.remove();
        return;
      }
    }
  }

  /**
   * Notify all fields refer to this expr that something has been changed.
   */
  public void notifyAllFields() {
    for (FieldLiteral field : referredByList) {
      field.setReferedExpr(this);
      field.updateColKey();
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Expr))
      return false;

    Expr exprObj = (Expr) obj;
    return referredByList.equals(exprObj.getReferredByList()) && children.equals(exprObj.children);
  }

  /**
   *
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException {
    // Analyze each child
    for (Expr child : getChildren()) {
      child.analyze(metaDB, fieldSources);
    }
  }

  public ColumnKey getColKey() {
    return null;
  }

  public void setColKey(ColumnKey colKey) {}


  public Type getType() {
    return null;
  }

  public void setType(Type type) {}
}
