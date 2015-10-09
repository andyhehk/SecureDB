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

package edu.hku.sdb.parse;


import edu.hku.sdb.catalog.DBMeta;

public class TableRowFormat implements ParseNode {

  private String fieldDelimiter;
  private String colletionDelimiter;

  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  public void setFieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
  }

  @Override
  public void analyze(DBMeta dbMeta, ParseNode... fieldSources) throws SemanticException {

  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder();
    sb.append("ROW FORMAT DELIMITED FIELDS TERMINATED BY " + "'" + fieldDelimiter + "'");
    sb.append("\n");
    sb.append("COLLECTION ITEMS TERMINATED BY " + "'" + colletionDelimiter + "'");
    return sb.toString();

  }

  @Override
  public boolean involveEncrytedCol() {
    return false;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TableRowFormat)) {
      return false;
    }
    if (!fieldDelimiter.equals(((TableRowFormat) object).getFieldDelimiter())) {
      return false;
    }
    return true;
  }

  public String getColletionDelimiter() {
    return colletionDelimiter;
  }

  public void setColletionDelimiter(String colletionDelimiter) {
    this.colletionDelimiter = colletionDelimiter;
  }
}
