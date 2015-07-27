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

import com.google.common.base.Preconditions;

public class ScalarType extends Type {

  public static int DEFAULT_PRECISION = 9;
  public static int DEFAULT_SCALE = 0; // SQL standard

  private final PrimitiveType type;

  // Only used for type CHAR.
  private int len;

  // Only used if type is DECIMAL.
  private int precision;
  private int scale;

  public ScalarType(PrimitiveType type) {
    this.type = type;
  }

  public PrimitiveType getType() {
    return type;
  }

  public int getLen() {
    return len;
  }

  public void setLen(int len) {
    this.len = len;
  }

  public int getPrecision() {
    return precision;
  }

  public void setPrecision(int precision) {
    this.precision = precision;
  }

  public int getScale() {
    return scale;
  }

  public void setScale(int scale) {
    this.scale = scale;
  }

  public static ScalarType createType(PrimitiveType type) {
    switch (type) {
      case INVALID_TYPE: return INVALID;
      case NULL_TYPE: return NULL;
      case BOOLEAN: return BOOLEAN;
      case SMALLINT: return SMALLINT;
      case TINYINT: return TINYINT;
      case INT: return INT;
      case BIGINT: return BIGINT;
      case FLOAT: return FLOAT;
      case DOUBLE: return DOUBLE;
      case STRING: return STRING;
      case VARCHAR: return createVarcharType();
      case BINARY: return BINARY;
      case TIMESTAMP: return TIMESTAMP;
      case DATE: return DATE;
      case DATETIME: return DATETIME;
      case DECIMAL: return createDecimalType();
      default:
        Preconditions.checkState(false);
        return NULL;
    }
  }

  public static ScalarType createCharType() {
    return Type.DEFAULT_CHAR;
  }

  public static ScalarType createCharType(int len) {
    ScalarType type = new ScalarType(PrimitiveType.CHAR);
    type.len = len;

    return type;
  }

  public static ScalarType createVarcharType() {
    return DEFAULT_VARCHAR;
  }

  public static ScalarType createVarcharType(int len) {
    // length checked in analysis
    ScalarType type = new ScalarType(PrimitiveType.VARCHAR);
    type.len = len;
    return type;
  }

  public static ScalarType createDecimalType() { return DEFAULT_DECIMAL; }

  public static ScalarType createDecimalType(int precision) {
    return createDecimalType(precision, DEFAULT_SCALE);
  }

  public static ScalarType createDecimalType(int precision, int scale) {
    ScalarType scalarType = new ScalarType(PrimitiveType.DECIMAL);

    scalarType.precision = precision;
    scalarType.scale = scale;

    return scalarType;
  }

  @Override
  public boolean equals(Object object) {
    if(!(object instanceof ScalarType))
      return false;

    ScalarType scalaObj = (ScalarType) object;

    return type == scalaObj.type && len == scalaObj.len && precision == scalaObj.precision;
  }

  @Override
  public String toSql() {

    switch (type) {
      case BINARY: return type.toString();
      case VARCHAR:
      case CHAR:
        return type.toString() + "(" + len + ")";
      case DECIMAL:
        return String.format("%s(%s,%s)", type.toString(), precision, scale);
      default: return type.toString();
    }
  }

  @Override
  public String toString() {
    switch (type) {
      case BINARY: return type.toString();
      case VARCHAR:
      case CHAR:
        return type.toString() + "(" + len + ")";
      case DECIMAL:
        return String.format("%s(%s,%s)", type.toString(), precision, scale);
      default: return type.toString();
    }
  }
}
