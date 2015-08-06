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

import edu.hku.sdb.catalog.MetaStore;

public class LikePredicate extends Predicate {

  private final String op = "LIKE";

  // Only one constructor is allowed.
  public LikePredicate(Expr column, Expr pattern) {
    children.add(column);
    children.add(pattern);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.parse.BasicSemanticAnalyzer
   * )
   */
  public void analyze(MetaStore metaDB, ParseNode... fieldParent) throws
          SemanticException {
    getColumn().analyze(metaDB, fieldParent);

    if (involveEncrytedCol()) {
      Expr pattern = getPattern();
      if (pattern instanceof StringLiteral) {
        String value = ((StringLiteral) pattern).getValue();
        if (!value.matches("[a-zA-Z0-9]+")) {
          SemanticException e = new SemanticException("The pattern can only " +
                  "contains letter and digit.");
          throw e;
        }
      } else {
        SemanticException e = new SemanticException("Like predicate only support a" +
                " single string pattern");
        throw e;
      }
    }
  }


  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    return getColumn() + op + "\'" + getPattern() + "\'";
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveEncrytedCol() {
    return getColumn() != null ? getColumn().involveEncrytedCol() : false;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

  public void setColumn(Expr expr) {
    children.set(0, expr);
  }

  public Expr getColumn() {
    return getChild(0);
  }

  public void setPattern(Expr expr) {
    children.set(1, expr);
  }

  public Expr getPattern() {
    return getChild(1);
  }

}
