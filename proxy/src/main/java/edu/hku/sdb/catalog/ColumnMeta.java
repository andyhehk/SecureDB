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

package edu.hku.sdb.catalog;

import java.util.StringTokenizer;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(objectIdClass = ColumnMeta.ColumnPK.class)
public class ColumnMeta {

  @PrimaryKey
  private String dbName;

  @PrimaryKey
  private String tblName;

  @PrimaryKey
  private String colName;

  @Persistent
  private DataType type;
  @Persistent
  private boolean isSensitive = false;
  @Column(length = 2048)
  private String m;
  @Column(length = 2048)
  private String x;

  @Persistent
  private TableMeta tableMeta;

  public static class ColumnPK extends Key {

    private static final long serialVersionUID = 1L;

    public String dbName;
    public String tblName;
    public String colName;

    public ColumnPK() {
    }

    public ColumnPK(String value) {
      StringTokenizer token = new StringTokenizer(value, "::");
      token.nextToken(); // className
      this.dbName = token.nextToken(); // db name
      this.tblName = token.nextToken(); // table name
      this.colName = token.nextToken(); // column name
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof ColumnPK)) {
        return false;
      }
      ColumnPK c = (ColumnPK) obj;


      return dbName.equals(c.dbName) && tblName.equals(c.tblName)
              && colName.equals(c.colName);
    }

    @Override
    public int hashCode() {
      return this.dbName.hashCode() ^ this.tblName.hashCode()
              ^ this.colName.hashCode();
    }

    @Override
    public String toString() {
      // Give output expected by String constructor
      return this.getClass().getName() + "::" + this.dbName + "::"
              + this.tblName + "::" + this.colName;
    }

  }

  public ColumnMeta(String dbName, String tblName, String colName) {
    // names should be case insensitive
    this.setDbName(dbName.toLowerCase());
    this.setTblName(tblName.toLowerCase());
    this.setColName(colName.toLowerCase());
  }

  public ColumnMeta(String dbName, String tblName, String colName,
                    DataType type, boolean isSen, ColumnKey colKey) {
    // names should be case insensitive
    this.setDbName(dbName.toLowerCase());
    this.setTblName(tblName.toLowerCase());
    this.setColName(colName.toLowerCase());
    this.type = type;
    this.isSensitive = isSen;
    this.setColkey(colKey);
  }

  public TableMeta getTableMeta() {
    return tableMeta;
  }

  public void setTableMeta(TableMeta tableMeta) {
    this.tableMeta = tableMeta;
  }

  /**
   * @return the dbName
   */
  public String getDbName() {
    return dbName;
  }

  /**
   * @param dbName the dbName to set
   */
  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  /**
   * @return the tblName
   */
  public String getTblName() {
    return tblName;
  }

  /**
   * @param tblName the tblName to set
   */
  public void setTblName(String tblName) {
    this.tblName = tblName;
  }

  /**
   * @return the colName
   */
  public String getColName() {
    return colName;
  }

  /**
   * @param colName the colName to set
   */
  public void setColName(String colName) {
    this.colName = colName;
  }

  /**
   * @return the type
   */
  public DataType getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(DataType type) {
    this.type = type;
  }

  /**
   * @return the isSensitive
   */
  public boolean isSensitive() {
    return isSensitive;
  }

  /**
   * @param isSensitive the isSensitive to set
   */
  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  /**
   * @return the colkey
   */
  public ColumnKey getColkey() {
    if (m != null && x != null)
      return new ColumnKey(m, x);
    return null;
  }

  /**
   * @param colkey the colkey to set
   */
  public void setColkey(ColumnKey colkey) {
    if(colkey != null) {
      if(colkey.getM() != null && colkey.getX() != null) {
        this.m = colkey.getM().toString();
        this.x = colkey.getX().toString();
      }
    }
  }

}
