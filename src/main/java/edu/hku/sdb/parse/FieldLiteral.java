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
 *******************************************************************************/

package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;

public class FieldLiteral extends LiteralExpr {

  private String tbl;
  private String name;
  private DataType type;
  private boolean isSen;
  private ColumnKey colKey;

  public FieldLiteral() {

  }

  public FieldLiteral(String tbl, String name, DataType type, boolean isSen,
      ColumnKey colKey) {
    this.name = name;
    this.tbl = tbl;
    this.type = type;
    this.isSen = isSen;
    this.colKey = colKey;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FieldLiteral))
      return false;
    FieldLiteral fieldobj = (FieldLiteral) obj;
    return tbl.equals(fieldobj.getTbl()) && name.equals(fieldobj.getName())
        && type.equals(fieldobj.getType()) && isSen == fieldobj.isSen()
        && colKey.equals(fieldobj.getColKey());
  }

  /**
   * @return the tbl
   */
  public String getTbl() {
    return tbl;
  }

  /**
   * @param tbl
   *          the tbl to set
   */
  public void setTbl(String tbl) {
    this.tbl = tbl;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the type
   */
  public DataType getType() {
    return type;
  }

  /**
   * @param type
   *          the type to set
   */
  public void setType(DataType type) {
    this.type = type;
  }

  /**
   * @return the isSen
   */
  public boolean isSen() {
    return isSen;
  }

  /**
   * @param isSen
   *          the isSen to set
   */
  public void setSen(boolean isSen) {
    this.isSen = isSen;
  }

  /**
   * @return the colKey
   */
  public ColumnKey getColKey() {
    return colKey;
  }

  /**
   * @param colKey
   *          the colKey to set
   */
  public void setColKey(ColumnKey colKey) {
    this.colKey = colKey;
  }
}
