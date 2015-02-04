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
  protected final String tblName;
  protected String alia = "";

  protected JoinOperator joinOp;
  protected Expr onClause;

  // the ref to the left of this table, if it is part of a JOIN clause
  protected TableRef leftTblRef;

  public TableRef(String tblName, String alia) {
    this.tblName = tblName;
    this.alia = alia;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof TableRef))
      return false;

    TableRef tblObj = (TableRef) obj;

    if ((joinOp == null) != (tblObj.joinOp == null))
      return false;

    if ((onClause == null) != (tblObj.onClause == null))
      return false;

    if ((leftTblRef == null) != (tblObj.leftTblRef == null))
      return false;

    if ((tblName == null) != (tblObj.tblName == null))
      return false;

    if ((alia == null) != (tblObj.alia == null))
      return false;

    if (joinOp != null) {
      if (!joinOp.equals(tblObj.joinOp))
        return false;
    }

    if (onClause != null) {
      if (!onClause.equals(tblObj.onClause))
        return false;
    }

    if (leftTblRef != null) {
      if (!leftTblRef.equals(tblObj.leftTblRef))
        return false;
    }

    if (tblName != null) {
      if (!tblName.equals(tblObj.tblName))
        return false;
    }

    if (alia != null) {
      if (!alia.equals(tblObj.alia))
        return false;
    }

    return true;
  }

  /**
   * @return the tableName
   */
  public String getTableName() {
    return tblName;
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
    if (alia != null) {
      this.alia = alia;
    }
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
