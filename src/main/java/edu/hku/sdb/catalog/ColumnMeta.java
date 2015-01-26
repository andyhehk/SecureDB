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

import java.math.BigInteger;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class ColumnMeta {
  
  @PrimaryKey
  private String name;
  
  private DataType type;
  private boolean isSensitive = false;

  // The m part of the column key
  private BigInteger m = null;
  // The x part of the column key
  private BigInteger x = null;
  
  public ColumnMeta(String name) {
    this.name = name;
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
   * @return the m
   */
  public BigInteger getM() {
    return m;
  }

  /**
   * @param m the m to set
   */
  public void setM(BigInteger m) {
    this.m = m;
  }

  /**
   * @return the x
   */
  public BigInteger getX() {
    return x;
  }

  /**
   * @param x the x to set
   */
  public void setX(BigInteger x) {
    this.x = x;
  }
  
}
