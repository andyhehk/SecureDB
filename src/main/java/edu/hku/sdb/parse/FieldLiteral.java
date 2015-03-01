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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.ColumnMeta;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.catalog.MetaStore;

import static com.google.common.base.Preconditions.*;

public class FieldLiteral extends LiteralExpr {

  private static final Logger LOG = LoggerFactory.getLogger(FieldLiteral.class);

  // Make sure the tbl is not null.
  private String tblName = "";
  private final String name;
  private DataType type;
  private boolean isSen;
  private ColumnKey colKey;

  // It will be set after the analyze function is called.
  // It is used for query rewriting.
  private Expr referedExpr;

  public FieldLiteral(String name, DataType type) {
    this.name = checkNotNull(name, "Field name is null.");
    // this.name.trim();
    this.type = type;
    isSen = false;
  }

  public FieldLiteral(String tbl, String name, DataType type) {
    this.name = checkNotNull(name, "Field name is null.");
    this.tblName = checkNotNull(tbl, "Table name is null.");
    // this.name.trim();
    // this.tbl.trim();
    this.type = type;
    isSen = false;
  }

  public FieldLiteral(String tbl, String name, DataType type, boolean isSen,
      ColumnKey colKey) {
    this.name = checkNotNull(name, "Field name is null.");
    this.tblName = checkNotNull(tbl, "Table name is null.");
    this.type = type;
    this.isSen = isSen;
    this.colKey = colKey;
  }

  /**
   * Get the table name of this field referred if it is not specified, also the
   * column key if it is a sensitive column.
   * 
   * TODO Shall we postpone the ambiguity detection to the underlying DB?
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

    for (SelectionItem item : itemList) {
      count += resolve(item);

      // This field is ambiguous.
      if (count > 1)
        throw new AmbiguousException(name);
    }

    for (BaseTableRef tbl : baseTbls) {
      if (tblName.equals(""))
        count += resolve(metaDB, tbl.tblName, tbl.alias);
      
      // When table name is specified.
      else if (tblName.equals(tbl.tblName))
        count += resolve(metaDB, tbl.tblName, tbl.alias);

      // This field is ambiguous.
      if (count > 1)
        throw new AmbiguousException(name);
    }

    for (InLineViewRef view : inlineViews) {
      if (tblName.equals(""))
        count += resolve(((SelectStmt) view.queryStmt).getSelectList().itemList);
      
      // When table name is specified.
      else if (tblName.equals(view.alias))
        count += resolve(((SelectStmt) view.queryStmt).getSelectList().itemList);
      
      // This field is ambiguous.
      if (count > 1)
        throw new AmbiguousException(name);
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
  private int resolve(MetaStore metaDB, String tblName, String alias) {
    int count = 0;

    ColumnMeta colMeta = metaDB.getCol(tblName, name);

    if (colMeta != null) {
      this.tblName = tblName;
      if (!alias.equals(""))
        this.tblName = alias;
      type = colMeta.getType();
      isSen = colMeta.isSensitive();
      colKey = colMeta.getColkey();

      count++;
    }

    return count;
  }

  /**
   * It is a field from inline view.
   * 
   * @param itemList
   * @return
   */
  private int resolve(List<SelectionItem> itemList) {
    int count = 0;

    for (SelectionItem item : itemList) {
      count += resolve(item);
    }

    return count;
  }

  /**
   * It is a field refer to a selection item.
   * 
   * @param item
   * @return
   */
  private int resolve(SelectionItem item) {
    // Count the number of sources this field corresponds to.
    int count = 0;
    // No alias
    if (item.getAlias().equals("")) {
      // It should be a field, otherwise, it cannot be referred by other fields
      if (item.getExpr() instanceof FieldLiteral) {
        FieldLiteral field = (FieldLiteral) item.getExpr();
        if (name.equals(field.name)) {
          tblName = field.tblName;
          type = field.type;
          isSen = field.isSen;
          colKey = field.colKey;
          count++;
          referedExpr = field;
        }
      }
    }

    else if (item.getAlias().equals(name)) {
      count++;
      // It can be either a field or a complicated expression.
      if (item.getExpr() instanceof FieldLiteral) {
        FieldLiteral field = (FieldLiteral) item.getExpr();
        if (name.equals(field.name)) {
          tblName = field.tblName;
          type = field.type;
          isSen = field.isSen;
          colKey = field.colKey;
          referedExpr = field;
        }
      } else {
        // It is not a field literal, cannot determine if it is sensitive now.
        referedExpr = item.getExpr();
      }
    }

    return count;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FieldLiteral))
      return false;

    FieldLiteral fieldobj = (FieldLiteral) obj;

    if ((colKey == null) != (fieldobj.colKey == null)) {
      String err = (colKey == null) ? "Left column key is null, while "
          + "right column key is: " + fieldobj.colKey : "Left column is: "
          + colKey + ", while right column key is null";
      LOG.debug(err);
      return false;
    }

    if (colKey != null) {
      if (!colKey.equals(fieldobj.getColKey())) {
        String err = "Left column key is: " + colKey + ";Right column key is: "
            + fieldobj.colKey;
        LOG.debug(err);
        return false;
      }
    }

    return tblName.equals(fieldobj.getTbl()) && name.equals(fieldobj.getName())
        && type.equals(fieldobj.getType()) && isSen == fieldobj.isSen();
  }

  /**
   * @return the tbl
   */
  public String getTbl() {
    return tblName;
  }

  /**
   * 
   * @param tbl
   *          the tbl to set
   */
  public void setTbl(String tbl) {
    // Make sure the tbl is not null.
    this.tblName = checkNotNull(tbl, "Table name is null.");
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

  /**
   * @return the referedExpr
   */
  public Expr getReferedExpr() {
    return referedExpr;
  }

  /**
   * @param referedExpr
   *          the referedExpr to set
   */
  public void setReferedExpr(Expr referedExpr) {
    this.referedExpr = referedExpr;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    return tblName.equals("") ? name : tblName + "." + name;
  }

  @Override
  public String toString() {
    return "tableName: " + tblName + ";" + "field name: " + name + ";"
        + "DataType: " + type + ";" + "isSensitive: " + Boolean.toString(isSen)
        + ";" + "Column Key: " + colKey;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return isSen;
  }
}
