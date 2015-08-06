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

import com.google.common.base.Joiner;
import edu.hku.sdb.catalog.MetaStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CreateStmt extends StatementBase {

  private static final Logger LOG = LoggerFactory.getLogger(CreateStmt.class);

  private List<ColumnDefinition> columnDefinitions;
  private TableName tableName;
  private TableRowFormat tableRowFormat;

  public TableRowFormat getTableRowFormat() {
    return tableRowFormat;
  }

  public void setTableRowFormat(TableRowFormat tableRowFormat) {
    this.tableRowFormat = tableRowFormat;
  }

  public List<ColumnDefinition> getColumnDefinitions() {
    return columnDefinitions;
  }

  public void setColumnDefinitions(List<ColumnDefinition> columnDefinitions) {
    this.columnDefinitions = columnDefinitions;
  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {
    for (ColumnDefinition fieldLiteral : columnDefinitions) {
      fieldLiteral.analyze(metaDB, tableName);
    }
  }

  @Override
  public String toSql() {

    List<String> items = new ArrayList<String>();
    for (ColumnDefinition field : columnDefinitions) {
      items.add(field.toSql());
    }
    String fields = Joiner.on(", ").join(items);

    String rowFormat = "";
    if (tableRowFormat != null) {
      rowFormat = tableRowFormat.toSql();
    }

    return "CREATE TABLE " + tableName.toSql() + " (" + fields + ") " + rowFormat;
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
    if (!(object instanceof CreateStmt)) {
      LOG.debug("The other object is not an instance of CreateStmt!");
      return false;
    }

    if (!tableName.equals(((CreateStmt) object).getTableName())) {
      LOG.debug("The other object's tableName does not match!");
      return false;
    }

    if ((tableRowFormat == null) != (((CreateStmt) object).tableRowFormat == null)) {
      String err = (tableRowFormat == null) ? "Left tableRowFormat is null, while "
              + "tableRowFormat key is: " + ((CreateStmt) object).tableRowFormat : "tableRowFormat is: "
              + tableRowFormat + ", while right tableRowFormat is null";
      LOG.debug(err);
      return false;
    }
    if (tableRowFormat != null) {
      if (!tableRowFormat.equals(((CreateStmt) object).getTableRowFormat())) {
        LOG.debug("The other object's tableRowFormat does not match!");
        return false;
      }
    }

    if (!columnDefinitions.equals(((CreateStmt) object).getColumnDefinitions())) {
      LOG.debug("The other object's columnDefinitions does not match!");
      return false;
    }

    return true;
  }
}
