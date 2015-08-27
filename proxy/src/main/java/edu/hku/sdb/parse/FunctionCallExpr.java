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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Joiner;
import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallExpr extends Expr {

  private static final Logger LOG = LoggerFactory.getLogger(FunctionCallExpr.class);

  private FunctionName name;
  private FunctionParams functionParams;

  private ColumnKey colKey;
  private Type type;

  public FunctionCallExpr() {

  }

  /**
   * Constructor for star function call
   *
   * @param name
   */
  public FunctionCallExpr(FunctionName name) {
    this.name = name;
    functionParams = FunctionParams.createStarParam();
  }


  public FunctionCallExpr(FunctionName name, FunctionParams functionParams) {
    this.name = name;
    this.functionParams = functionParams;
  }

  /**
   * @return the name
   */
  public FunctionName getFunctionName() {
    return name;
  }

  /**
   * @param name
   */
  public void setName(FunctionName name) {
    this.name = name;
  }


  /**
   * @return the funcExpr
   */
  public FunctionParams getFunctionParams() {
    return functionParams;
  }

  /**
   * @param funcExpr the funcExpr to set
   */
  public void setFunctionParams(FunctionParams functionParams) {
    this.functionParams = functionParams;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException {
    // Analyze each child
    if(!functionParams.isStar())
      for (Expr expr : functionParams.getExprs()) {
        expr.analyze(metaDB, fieldSources);
      }
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FunctionCallExpr))
      return false;

    FunctionCallExpr funcObj = (FunctionCallExpr) obj;

    checkNotNull(name, "Function on the left has no function name");
    checkNotNull(funcObj.getFunctionName(), "Function on the right has no function" +
            " name");
    checkNotNull(functionParams, "Function on the left has no function parameters");
    checkNotNull(funcObj.getFunctionParams(), "Function on the right has no " +
            "function parameters");

    if (!name.equals(funcObj.getFunctionName()))
      return false;

    if(!functionParams.equals(funcObj.getFunctionParams()))
      return false;

    return true;
  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder();

    sb.append(name.getName());
    sb.append("(");

    if (functionParams.isStar()) {
      sb.append("*");
    } else {
      List<String> params = new ArrayList<String>();
      for (Expr expr : functionParams.getExprs()) {
        params.add(expr.toSql());
      }

      sb.append(Joiner.on(", ").join(params));
    }
    sb.append(")");

    return sb.toString();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name + "\n");
    sb.append(functionParams + "\n");
    return sb.toString();
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    //TODO: we dont support secure operator with *
    if(functionParams.isStar())
      return false;

    for( Expr expr : functionParams.getExprs()) {
      if(expr.involveSdbEncrytedCol())
        return true;
    }

    return false;
  }

  public ColumnKey getColKey() {
    return colKey;
  }

  public void setColKey(ColumnKey colKey) {
    this.colKey = colKey;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}
