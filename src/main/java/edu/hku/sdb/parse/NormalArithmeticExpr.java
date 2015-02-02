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

public class NormalArithmeticExpr extends Expr {

  enum Operator {
    MULTIPLY("*", "multiply"),
    DIVIDE("/", "divide"),
    MOD("%", "mod"),
    INT_DIVIDE("DIV", "int_divide"),
    ADD("+", "add"),
    SUBTRACT("-", "subtract"),
    BITAND("&", "bitand"),
    BITOR("|", "bitor"),
    BITXOR("^", "bitxor"),
    BITNOT("~", "bitnot");

    private final String description;
    private final String name;

    private Operator(String description, String name) {
      this.description = description;
      this.name = name;
    }

    @Override
    public String toString() {
      return description;
    }

    public String getName() {
      return name;
    }
  }

  private final Operator op;

  public NormalArithmeticExpr(Operator op) {
    this.op = op;
  }

  public NormalArithmeticExpr(Operator op, Expr e1, Expr e2) {
    this.op = op;
    getChildren().add(e1);
    getChildren().add(e2);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof NormalArithmeticExpr))
      return false;

    NormalArithmeticExpr arithObj = (NormalArithmeticExpr) obj;
    return op.equals(arithObj.op) && children.equals(arithObj.children);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @return the op
   */
  public Operator getOp() {
    return op;
  }

}
