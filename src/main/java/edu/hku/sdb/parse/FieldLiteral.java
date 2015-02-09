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

import java.util.ArrayList;
import java.util.List;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.catalog.MetaStore;

public class FieldLiteral extends LiteralExpr {

  private String tbl;
  private final String name;
  private final DataType type;
  private boolean isSen;
  private ColumnKey colKey;

  public FieldLiteral(String name, DataType type) {
    this.name = name;
    this.type = type;
    isSen = false;
  }

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
   * Get the table name of this field referred if it is not specified, also the
   * column key if it is a sensitive column.
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
      throws SemanticException {
    // A field may refer to a selection item if it is in the having clause
    List<SelectionItem> itemList = new ArrayList<SelectionItem>();
    // A field may refer to a column of a base table
    List<BaseTableRef> baseTbls = new ArrayList<BaseTableRef>();
    // A field may refer to a selection item of a inline view
    List<InLineViewRef> inlineViews = new ArrayList<InLineViewRef>();

    for (ParseNode node : fieldSources) {
      if (node instanceof SelectionItem)
        itemList.add((SelectionItem) node);
      else if (node instanceof BaseTableRef)
        baseTbls.add((BaseTableRef) node);
      else if (node instanceof InLineViewRef)
        inlineViews.add((InLineViewRef) node);
    }

    // Count the number of sources this field corresponds to.
    int count = 0;

    if (tbl == null) {
      for (SelectionItem item : itemList) {
        count += resolve(item);

        // This field is ambiguous.
        if (count > 1)
          throw new AmbiguousException(name);
      }

      for (BaseTableRef tbl : baseTbls) {
        count += resolve(metaDB, tbl.tblName);

        // This field is ambiguous.
        if (count > 1)
          throw new AmbiguousException(name);
      }

      for (InLineViewRef view : inlineViews) {
        count += resolve(((SelectStmt) view.queryStmt).getSelectList().itemList);

        // This field is ambiguous.
        if (count > 1)
          throw new AmbiguousException(name);
      }

    }
    // Cannot resolve this field.
    if (count == 0)
      throw new UnableResolveException(name);

  }

  /**
   * It is a field from base table.
   * 
   * @param metaDB
   * @param tblName
   * @return
   */
  private int resolve(MetaStore metaDB, String tblName) {

    return 0;
  }

  /**
   * It is a field from inline view.
   * 
   * @param itemList
   * @return
   */
  private int resolve(List<SelectionItem> itemList) {

    return 0;
  }

  /**
   * It is a field refer to a selection item.
   * 
   * @param item
   * @return
   */
  private int resolve(SelectionItem item) {

    return 0;
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
