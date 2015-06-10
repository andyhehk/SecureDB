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
  private boolean isSen = false;
  private boolean isUp2date = false;
  private ColumnKey colKey;

  // It will be set after the analyze function is called.
  // It is used for query rewriting.
  private Expr referExpr;

  public FieldLiteral(String name, DataType type) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    // this.name.trim();
    //this.type = checkNotNull(type, "Field type is null.");
    this.type = type;
    isSen = false;
  }

  public FieldLiteral(String tbl, String name, DataType type) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.tblName = checkNotNull(tbl.toLowerCase(), "Table name is null.");
    // this.name.trim();
    // this.tbl.trim();
    //this.type = checkNotNull(type, "Field type is null.");
    this.type = type;
    isSen = false;
  }

  public FieldLiteral(String tbl, String name, DataType type, boolean isSen,
                      ColumnKey colKey) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.tblName = checkNotNull(tbl.toLowerCase(), "Table name is null.");
    //this.type = checkNotNull(type, "Field type is null.");
    this.type = type;
    this.isSen = isSen;
    this.colKey = colKey;
  }

  /**
   * Get the table name of this field referred if it is not specified, also the
   * column key if it is a sensitive column.
   * <p/>
   * TODO Shall we postpone the ambiguity detection to the underlying DB?
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException {
    // The analyze function has been called unless it is field from base table.
    if (referExpr != null)
      return;

    // A field may refer to a selection item if it is in the group by or having
    // clause
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
      if (count > 1) {
        AmbiguousException e = new AmbiguousException(name);
        LOG.error("One or more fields are ambiguous!", e);
        throw e;
      }
    }

    for (BaseTableRef tbl : baseTbls) {
      if (tblName.equals(""))
        count += resolve(metaDB, tbl.tblName, tbl.alias);

        // When table name is specified.
      else if (tblName.equals(tbl.tblName))
        count += resolve(metaDB, tbl.tblName, tbl.alias);

      // This field is ambiguous.
      if (count > 1) {
        AmbiguousException e = new AmbiguousException(name);
        LOG.error("One or more fields are ambiguous!", e);
        throw e;
      }
    }

    for (InLineViewRef view : inlineViews) {
      if (tblName.equals(""))
        count += resolve(
                ((SelectStmt) view.queryStmt).getSelectList().itemList, view.alias);

        // When table name is specified.
      else if (tblName.equals(view.alias))
        count += resolve(
                ((SelectStmt) view.queryStmt).getSelectList().itemList, view.alias);

      // This field is ambiguous.
      if (count > 1) {
        AmbiguousException e = new AmbiguousException(name);
        LOG.error("One or more fields are ambiguous!", e);
        throw e;
      }
    }

    // Cannot resolve this field.
    if (count == 0) {
      UnableResolveException e = new UnableResolveException(name);
      LOG.error("One or more fields cannot find its referred table!", e);
      throw e;
    }
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
      isUp2date = true;
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
  private int resolve(List<SelectionItem> itemList, String viewAlias) {
    int count = 0;

    for (SelectionItem item : itemList) {
      count += resolve(item);
    }

    // This field is referring to a selection item of the inline view.
    if (count > 0)
      tblName = viewAlias;

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

          // remember the refer-relationship, it is used for query rewrite
          isUp2date = true;
          referExpr = field;
          referExpr.addReferredBy(this);
          count++;
        }
      }
    } else if (item.getAlias().equals(name)) {
      count++;
      // It can be either a field or a complicated expression.
      if (item.getExpr() instanceof FieldLiteral) {
        FieldLiteral field = (FieldLiteral) item.getExpr();
        if (name.equals(field.name)) {
          tblName = field.tblName;
          type = field.type;
          isSen = field.isSen;
          colKey = field.colKey;

          // remember the refer-relationship, it is used for query rewrite
          isUp2date = true;
          referExpr = field;
          referExpr.addReferredBy(this);
        }
      } else {
        // It is not a field literal, cannot determine if it is sensitive now.
        // remember the refer-relationship, it is used for query rewrite
        type = DataType.UNKNOWN;
        referExpr = item.getExpr();
        referExpr.addReferredBy(this);
      }
    }

    return count;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FieldLiteral))
      return false;

    FieldLiteral fieldobj = (FieldLiteral) obj;

    // Log messages are used for debug.
    if ((colKey == null) != (fieldobj.colKey == null)) {
      String err = (colKey == null) ? "Left column key is null, while "
              + "right column key is: " + fieldobj.colKey : "Left column is: "
              + colKey + ", while right column key is null";
      LOG.debug(err);
      return false;
    }

    if ((referExpr == null) != (fieldobj.referExpr == null)) {
      String err = (referExpr == null) ? "Left referred field is null, while "
              + "right referred field is: " + fieldobj.referExpr
              : "Left referred field is: " + referExpr
              + ", while right referred field is null";
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

    if (referExpr != null) {
      if (!referExpr.equals(fieldobj.referExpr)) {
        String err = "Left referred field is: " + referExpr
                + ";Right referred field is: " + fieldobj.referExpr;
        LOG.debug(err);
        return false;
      }
    }

    return tblName.equals(fieldobj.getTbl()) && name.equals(fieldobj.getName())
            && type.equals(fieldobj.getType()) && isSen == fieldobj.isSen()
            && isUp2date == fieldobj.isUp2date();
  }

  /**
   * @return the tbl
   */
  public String getTbl() {
    return tblName;
  }

  /**
   * @param tbl the tbl to set
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
   * @return the type
   */
  public void setType(DataType type) {
    this.type = checkNotNull(type, "Field type is null.");
  }

  /**
   * @return the isSen
   */
  public boolean isSen() {
    return isSen;
  }

  /**
   * @param isSen the isSen to set
   */
  public void setSen(boolean isSen) {
    this.isSen = isSen;
  }

  /**
   * @return the isUp2date
   */
  public boolean isUp2date() {
    return isUp2date;
  }

  /**
   * @param isUp2date the isUp2date to set
   */
  public void setUp2date(boolean isUp2date) {
    this.isUp2date = isUp2date;
  }

  /**
   * @return the colKey
   */
  @Override
  public ColumnKey getColKey() {
    return colKey;
  }

  /**
   * Update the column key if it is not up to date.
   */
  public void updateColKey() {
    if (!isUp2date)
      colKey = checkNotNull(referExpr, "Referred expression is null")
              .getColKey();
  }

  /**
   * @param colKey the colKey to set
   */
  public void setColKey(ColumnKey colKey) {
    this.colKey = colKey;
  }

  /**
   * @return the referedExpr
   */
  public Expr getReferedExpr() {
    return referExpr;
  }

  /**
   * @param referedExpr the referedExpr to set
   */
  public void setReferedExpr(Expr referedExpr) {
    this.referExpr = referedExpr;
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

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return isSen;
  }

  public void notifyField() {
    isUp2date = false;
  }
}
