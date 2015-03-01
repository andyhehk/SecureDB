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

public class BoolLiteral extends LiteralExpr {

  private final boolean value;

  public BoolLiteral(boolean value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof BoolLiteral))
      return false;

    return value == ((BoolLiteral) obj).value;
  }

  /**
   * @return the value
   */
  public boolean getValue() {
    return value;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    return Boolean.toString(value);
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
