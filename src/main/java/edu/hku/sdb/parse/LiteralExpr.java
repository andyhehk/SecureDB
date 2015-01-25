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

public abstract class LiteralExpr extends Expr {

  private boolean isEncrypted;
  private EncryptType encrytType;
  
  public void analyze(BasicSemanticAnalyzer analyzer) throws SemanticException {
    // TODO Auto-generated method stub

  }

  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @return the isEncrypted
   */
  public boolean isEncrypted() {
    return isEncrypted;
  }

  /**
   * @param isEncrypted the isEncrypted to set
   */
  public void setEncrypted(boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  /**
   * @return the encrytType
   */
  public EncryptType getEncrytType() {
    return encrytType;
  }

  /**
   * @param encrytType the encrytType to set
   */
  public void setEncrytType(EncryptType encrytType) {
    this.encrytType = encrytType;
  }

}
