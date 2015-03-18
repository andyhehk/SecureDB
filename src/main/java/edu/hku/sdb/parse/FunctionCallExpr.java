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

import static com.google.common.base.Preconditions.checkNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionCallExpr extends Expr {

  private static final Logger LOG = LoggerFactory.getLogger(FunctionCallExpr.class);
  
  private final String name;
  private Expr funcExpr;
  
  public FunctionCallExpr(String name) {
    this.name = checkNotNull(name, "Function Name is null.");
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the funcExpr
   */
  public Expr getFuncExpr() {
    return funcExpr;
  }

  /**
   * @param funcExpr the funcExpr to set
   */
  public void setFuncExpr(Expr funcExpr) {
    this.funcExpr = funcExpr;
  }

  public void analyze(BasicSemanticAnalyzer analyzer) throws SemanticException {
    // TODO Auto-generated method stub

  }

  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    // TODO Auto-generated method stub
    return false;
  }

}
