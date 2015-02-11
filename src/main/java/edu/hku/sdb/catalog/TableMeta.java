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

package edu.hku.sdb.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(objectIdClass = TableMeta.TablePK.class)
public class TableMeta {

  @PrimaryKey
  private String dbName;

  @PrimaryKey
  private String tblName;

  // TODO add foreign key relationship
  @Join
  private List<ColumnMeta> cols = new ArrayList<ColumnMeta>();

  public static class TablePK extends Key {

    private static final long serialVersionUID = 1L;
    public String dbName;
    public String tblName;

    public TablePK() {
    }

    public TablePK(String value) {
      StringTokenizer token = new StringTokenizer(value, "::");
      token.nextToken(); // className
      this.dbName = token.nextToken(); // db name
      this.tblName = token.nextToken(); // table name
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof TablePK)) {
        return false;
      }
      TablePK c = (TablePK) obj;

      return dbName.equals(c.dbName) && tblName.equals(c.tblName);
    }

    @Override
    public int hashCode() {
      return this.dbName.hashCode() ^ this.tblName.hashCode();
    }

    @Override
    public String toString() {
      // Give output expected by String constructor
      return this.getClass().getName() + "::" + this.dbName + "::"
          + this.tblName;
    }

  }

  public TableMeta(String dbName, String tblName) {
    // name should be case insensitive
    this.setDbName(dbName.toLowerCase());
    this.setTblName(tblName.toLowerCase());
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
   * @return the name
   */
  public String getName() {
    return getTblName();
  }

  /**
   * @param tblName
   *          the name to set
   */
  public void setName(String tblName) {
    this.setTblName(tblName.toLowerCase());
  }

  /**
   * Remove a column by name
   * 
   * @param colName
   */
  public void remove(String colName) {
    // case insensitive.
    getCols().remove(colName.toLowerCase());
  }


  /**
   * Number of columns.
   * 
   * @return
   */
  public int size() {
    return getCols().size();
  }

  /**
   * @return the cols
   */
  public List<ColumnMeta> getCols() {
    return cols;
  }

  /**
   * @param cols the cols to set
   */
  public void setCols(List<ColumnMeta> cols) {
    this.cols = cols;
  }
}
