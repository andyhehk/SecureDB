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
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.DataType;

public class FieldLiteral extends LiteralExpr {

  private final String tbl;
  private final String name;
  private final DataType type;
  private boolean isSen;
  private ColumnKey colKey;

  public FieldLiteral(String tbl, String name, DataType type) {
    this.name = name;
    this.tbl = tbl;
    this.type = type;
    isSen = false;
  }

  public FieldLiteral(String tbl, String name, DataType type, boolean isSen,
      ColumnKey colKey) {
    this.name = name;
    this.tbl = tbl;
    this.type = type;
    this.isSen = isSen;
    this.colKey = colKey;
  }

  /**
   * Get table name of this field referred, also the column key if
   * it is a sensitive column.
   */
  public void analyze(DBMeta dbMeta) throws SemanticException {
    // TODO

  }
  
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FieldLiteral))
      return false;

    FieldLiteral fieldobj = (FieldLiteral) obj;

    if ((colKey == null) != (fieldobj.colKey == null))
      return false;

    if (colKey != null) {
      if (!colKey.equals(fieldobj.getColKey()))
        return false;
    }

    return tbl.equals(fieldobj.getTbl()) && name.equals(fieldobj.getName())
        && type.equals(fieldobj.getType()) && isSen == fieldobj.isSen();
  }

  /**
   * @return the tbl
   */
  public String getTbl() {
    return tbl;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the type
   */
  public DataType getType() {
    return type;
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
