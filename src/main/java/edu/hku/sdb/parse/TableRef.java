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

public abstract class TableRef implements ParseNode {

  // represents a table/view name.
  protected String tblName;
  protected String alia;

  protected JoinOperator joinOp;
  protected Expr onClause;

  // the ref to the left of us, if we are part of a JOIN clause
  protected TableRef leftTblRef;

  public TableRef(String tableName, String alias) {
    super();
    this.setTableName(tableName);
    this.setAlia(alias);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof TableRef))
      return false;

    TableRef tblObj = (TableRef) obj;

    return tblName.equals(tblObj.tblName) && alia.equals(tblObj.alia)
        && joinOp.equals(tblObj.joinOp) && onClause.equals(tblObj.onClause)
        && leftTblRef.equals(tblObj.leftTblRef);
  }

  /**
   * @return the tableName
   */
  public String getTableName() {
    return tblName;
  }

  /**
   * @param tableName
   *          the tableName to set
   */
  public void setTableName(String tableName) {
    this.tblName = tableName;
  }

  /**
   * @return the alias
   */
  public String getAlia() {
    return alia;
  }

  /**
   * @param alia
   *          the alias to set
   */
  public void setAlia(String alia) {
    this.alia = alia;
  }

  /**
   * @return the joinOp
   */
  public JoinOperator getJoinOp() {
    return joinOp;
  }

  /**
   * @param joinOp
   *          the joinOp to set
   */
  public void setJoinOp(JoinOperator joinOp) {
    this.joinOp = joinOp;
  }

  /**
   * @return the onClause
   */
  public Expr getOnClause() {
    return onClause;
  }

  /**
   * @param onClause
   *          the onClause to set
   */
  public void setOnClause(Expr onClause) {
    this.onClause = onClause;
  }

  /**
   * @return the leftTblRef
   */
  public TableRef getLeftTblRef() {
    return leftTblRef;
  }

  /**
   * @param leftTblRef
   *          the leftTblRef to set
   */
  public void setLeftTblRef(TableRef leftTblRef) {
    this.leftTblRef = leftTblRef;
  }
}
