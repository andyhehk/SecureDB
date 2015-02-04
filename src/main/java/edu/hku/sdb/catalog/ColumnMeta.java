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

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class ColumnMeta {

  @PrimaryKey
  private String name;

  private DataType type;
  private boolean isSensitive = false;
  private ColumnKey colkey;

  public ColumnMeta(String name) {
    this.setName(name);
  }

  public ColumnMeta(String name, DataType type, boolean isSen, ColumnKey colkey) {
    // column name should be case insensitive
    this.setName(name);
    this.type = type;
    this.isSensitive = isSen;
    this.setColkey(colkey);
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
    this.name = name.toLowerCase();
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
   * @return the isSensitive
   */
  public boolean isSensitive() {
    return isSensitive;
  }

  /**
   * @param isSensitive
   *          the isSensitive to set
   */
  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  /**
   * @return the colkey
   */
  public ColumnKey getColkey() {
    return colkey;
  }

  /**
   * @param colkey
   *          the colkey to set
   */
  public void setColkey(ColumnKey colkey) {
    this.colkey = colkey;
  }

}
