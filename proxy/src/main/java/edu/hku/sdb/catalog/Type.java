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

public abstract class Type {

  // Static constant types for scalar types that don't require additional information.
  public static final ScalarType INVALID = new ScalarType(PrimitiveType.INVALID_TYPE);
  public static final ScalarType NULL = new ScalarType(PrimitiveType.NULL_TYPE);
  public static final ScalarType BOOLEAN = new ScalarType(PrimitiveType.BOOLEAN);
  public static final ScalarType TINYINT = new ScalarType(PrimitiveType.TINYINT);
  public static final ScalarType SMALLINT = new ScalarType(PrimitiveType.SMALLINT);
  public static final ScalarType INT = new ScalarType(PrimitiveType.INT);
  public static final ScalarType BIGINT = new ScalarType(PrimitiveType.BIGINT);
  public static final ScalarType FLOAT = new ScalarType(PrimitiveType.FLOAT);
  public static final ScalarType DOUBLE = new ScalarType(PrimitiveType.DOUBLE);
  public static final ScalarType STRING = new ScalarType(PrimitiveType.STRING);
  public static final ScalarType BINARY = new ScalarType(PrimitiveType.BINARY);
  public static final ScalarType TIMESTAMP = new ScalarType(PrimitiveType.TIMESTAMP);
  public static final ScalarType DATE = new ScalarType(PrimitiveType.DATE);
  public static final ScalarType DATETIME = new ScalarType(PrimitiveType.DATETIME);
  public static final ScalarType DEFAULT_DECIMAL = (ScalarType)
          ScalarType.createDecimalType(ScalarType.DEFAULT_PRECISION,
                  ScalarType.DEFAULT_SCALE);
  public static final ScalarType DEFAULT_VARCHAR = ScalarType.createVarcharType(8);
  public static final ScalarType DEFAULT_CHAR = ScalarType.createCharType(8);

  public static final UnKnownType UNKNOWN = new UnKnownType();

  public abstract String toSql();

}
