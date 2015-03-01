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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.MetaStore;

public abstract class Expr extends TreeNode<Expr> implements ParseNode {

  private final static Logger LOG = LoggerFactory.getLogger(Expr.class);

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Expr))
      return false;

    Expr exprObj = (Expr) obj;
    return children.equals(exprObj.children);
  }

  /**
   * 
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {
    // Analyze each child
    for (Expr child : getChildren()) {
      child.analyze(metaDB, fieldSources);
    }
  }
}
