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

import edu.hku.sdb.catalog.SdbColumnKey;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.SearchColumnKey;
import edu.hku.sdb.catalog.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnDefinition implements ParseNode {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnDefinition.class);
  public static final String ROW_ID_COLUMN_NAME = "row_id";
  public static final String S_COLUMN_NAME = "s";
  public static final String R_COLUMN_NAME = "r";

  private TableName tableName;
  // The original data type
  private final Type originType;
  // Type after being rewritten
  private Type rewrittenType;
  private boolean isSDBEncrypted = false;
  private String name;
  // Column Key for SDB encryption scheme.
  private SdbColumnKey sdbColKey;
  // Column Key for Search ecnvryption scheme.
  private SearchColumnKey searchColKey;

  public SdbColumnKey getSDBColumnKey() {
    return sdbColKey;
  }

  public void setSDBColumnKey(SdbColumnKey sdbColKey) {
    this.sdbColKey = sdbColKey;
  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Type getRewrittenType() {
    return rewrittenType;
  }

  public void setRewrittenType(Type rewrittenType) {
    this.rewrittenType = rewrittenType;
  }

  public Type getOriginType() {
    return originType;
  }


  public boolean isSDBEncrypted() {
    return isSDBEncrypted;
  }

  public void setSDBEncrypted(boolean isSen) {
    this.isSDBEncrypted = isSen;
  }

  public ColumnDefinition(String name, Type type) {
    this.name = name;
    this.rewrittenType = this.originType = type;
  }

  public ColumnDefinition(String name, Type type, TableName tableName) {
    this.name = name;
    this.rewrittenType = this.originType = type;
    this.tableName = tableName;
  }

  public ColumnDefinition(String name, Type type, TableName tableName, boolean isSen,
                          SdbColumnKey sdbColumnKey) {
    this.name = name;
    this.rewrittenType = this.originType = type;
    this.isSDBEncrypted = isSen;
    this.tableName = tableName;
    this.sdbColKey = sdbColumnKey;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {
    for (ParseNode fieldSource : fieldSources) {
      if (fieldSource instanceof TableName) {
        setTableName((TableName) fieldSource);
      }
    }
  }

  @Override
  public String toSql() {
    return name + " " + rewrittenType.toSql();
  }

  @Override
  public boolean involveEncrytedCol() {
    return isSDBEncrypted;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

  @Override
  public boolean equals(Object obj) {
    // Log messages are used for debug.
    if (!(obj instanceof ColumnDefinition)) {
      LOG.debug("object is not an instance of ColumnDefinition");
      return false;
    }

    ColumnDefinition fieldobj = (ColumnDefinition) obj;

    if (!originType.equals(fieldobj.getOriginType())) {
      LOG.debug("type of right ColumnDefinition " + fieldobj.getOriginType() + " is not equal!");
      return false;
    }

    if (isSDBEncrypted != fieldobj.isSDBEncrypted()) {
      LOG.debug("isSDBEncrypted of right ColumnDefinition " + fieldobj.isSDBEncrypted() + " is not equal to " + isSDBEncrypted + "!");
      return false;
    }

    if (!name.equals(fieldobj.getName())) {
      LOG.debug("name of right ColumnDefinition " + fieldobj.getName() + " is not equal to " + name + "!");
      return false;
    }

    if (!tableName.equals(fieldobj.getTableName())) {
      LOG.debug("tableName of right ColumnDefinition " + fieldobj.getTableName() + " is not equal to " + tableName + "!");
      return false;
    }

    if ((sdbColKey == null) != (fieldobj.sdbColKey == null)) {
      String err = (sdbColKey == null) ? "Left column key is null, while "
              + "right column key is: " + fieldobj.sdbColKey : "Left column is: "
              + sdbColKey + ", while right column key is null";
      LOG.debug(err);
      return false;
    }

    if (sdbColKey != null) {
      //TODO temporarily disabled for testing convenience
      /*if (!sdbColKey.equals(fieldobj.getSDBColumnKey())) {
        String err = "Left column key is: " + sdbColKey + ";Right column key is: "
                + fieldobj.sdbColKey;
        LOG.debug(err);
        return false;
      }*/
    }

    return true;
  }


  public SearchColumnKey getSearchColKey() {
    return searchColKey;
  }

  public void setSearchColKey(SearchColumnKey searchColKey) {
    this.searchColKey = searchColKey;
  }
}

