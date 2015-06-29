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

import java.util.List;

public class FunctionParams {

  private boolean isStar;
  private boolean isDistinct;

  private List<Expr> exprs;

  /**
   * Constructor for a star param.
   */
  private FunctionParams() {
    isStar = true;
    isDistinct = false;
    exprs = null;
  }

  /**
   * Create a star param.
   *
   * @return
   */
  public static FunctionParams createStarParam() {
    return new FunctionParams();
  }

  public FunctionParams(boolean isDistinct, List<Expr> exprs) {
    isStar = false;
    this.isDistinct = isDistinct;
    this.exprs = exprs;
  }

  public FunctionParams(List<Expr> exprs) {
    this(false, exprs);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FunctionParams))
      return false;

    FunctionParams paramsObj = (FunctionParams) obj;

    if(isStar != paramsObj.isStar() || isDistinct != paramsObj.isDistinct())
      return false;

    // Must have exprs
    if(!isStar)
      if(!exprs.equals(paramsObj.getExprs()))
        return false;

    return true;
  }

  public boolean isStar() {
    return isStar;
  }

  public void setIsStar(boolean isStar) {
    this.isStar = isStar;
  }

  public boolean isDistinct() {
    return isDistinct;
  }

  public void setIsDistinct(boolean isDistinct) {
    this.isDistinct = isDistinct;
  }

  public List<Expr> getExprs() {
    return exprs;
  }

  public void setExprs(List<Expr> exprs) {
    this.exprs = exprs;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Function parameters: ");
    if(!isStar) {
      for (Expr expr : exprs) {
        sb.append(expr + "\n");
        sb.append("-------------------" );
      }
    }
    else
      sb.append("*");

    return sb.toString();
  }
}
