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

import edu.hku.sdb.catalog.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.*;

public class FieldLiteral extends LiteralExpr {

  private static final Logger LOG = LoggerFactory.getLogger(FieldLiteral.class);

  // Make sure the tbl/tbl alias is not null.
  private String tblName = "";
  private final String name;
  private Type type;
  private boolean isSDBEncrypted = false;
  private SdbColumnKey sdbColKey;

  private SearchColumnKey searchColKey;

  // It will be set after the analyze function is called.
  // It is used for query rewriting.
  private Expr referExpr;


  public FieldLiteral(String name, Type type) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.type = type;
  }

  public FieldLiteral(String tbl,  String name) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.tblName = checkNotNull(tbl.toLowerCase(), "Table name is null.");
  }

  public FieldLiteral(String tbl, String name, Type type) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.tblName = checkNotNull(tbl.toLowerCase(), "Table name is null.");
    this.type = type;
  }

  public FieldLiteral(String tbl, String name, Type type, boolean isSDBEncrypted,
                      SdbColumnKey colKey) {
    this.name = checkNotNull(name.toLowerCase(), "Field name is null.");
    this.tblName = checkNotNull(tbl.toLowerCase(), "Table name is null.");
    //this.type = checkNotNull(type, "Field type is null.");
    this.type = type;
    this.isSDBEncrypted = isSDBEncrypted;
    this.sdbColKey = colKey;
  }

  public FieldLiteral(FieldLiteral fieldLiteral) {
    this.name = fieldLiteral.name;
    this.tblName = fieldLiteral.tblName;
    this.type = fieldLiteral.type;
    this.sdbColKey = new SdbColumnKey(fieldLiteral.getSdbColKey());
    this.isSDBEncrypted = fieldLiteral.isSDBEncrypted;
    this.referredByList = fieldLiteral.referredByList;
  }

  /**
   * Get the table name of this field referred if it is not specified, also get the
   * column key if it is a sensitive column.
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

    if (tblName.equals("")) {
      for (BaseTableRef tbl : baseTbls) {
        count += resolve(metaDB, tbl.tblName, tbl.alias);

        if (count > 1) {
          AmbiguousException e = new AmbiguousException(name);
          LOG.error("One or more fields are ambiguous!", e);
          throw e;
        }

      }

      for (InLineViewRef view : inlineViews) {
        count += resolve(((SelectStmt) view.queryStmt).getSelectList().itemList,
                view.alias);

        if (count > 1) {
          AmbiguousException e = new AmbiguousException(name);
          LOG.error("One or more fields are ambiguous!", e);
          throw e;
        }

      }

    } else {
      for (BaseTableRef tbl : baseTbls) {
        // No alias for this table
        if (tbl.alias.equals("")) {
          if (tblName.equals(tbl.tblName))
            count += resolve(metaDB, tbl.tblName, tbl.alias);
        }
        // If there is alias, the field should refer to the alias.
        else {
          if (tblName.equals(tbl.alias))
            count += resolve(metaDB, tbl.tblName, tbl.alias);
        }
      }

      for (InLineViewRef view : inlineViews) {
        if (tblName.equals(view.alias))
          count += resolve(
                  ((SelectStmt) view.queryStmt).getSelectList().itemList, view
                          .alias);
      }
    }

    // Cannot resolve this field.
    if (count == 0) {
      UnableResolveException e = new UnableResolveException(name);
      LOG.error("One or more fields cannot find its referred table or fields!", e);
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
      // if these is alias, the output table name should be the alias.
      // We also record the true table name this field refers to.
      if (!alias.equals("")) {
        this.tblName = alias;
      }
      type = colMeta.getType();
      isSDBEncrypted = colMeta.isSensitive();
      if(type instanceof ScalarType) {

        switch(((ScalarType) type).getType()) {
          case INT:
          case BIGINT:
          case TINYINT:
          case SMALLINT:
          case DECIMAL:
            if(isSDBEncrypted) {
              sdbColKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
            }
            break;
          case CHAR:
          case VARCHAR:
          case STRING:
            if(isSDBEncrypted) {
              searchColKey = new SearchColumnKey(colMeta.getM(), colMeta.getX());
            }
            break;
        }
      }
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
   * It is a field refers to a selection item.
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
          isSDBEncrypted = field.isSDBEncrypted;
          sdbColKey = field.sdbColKey;
          searchColKey = field.searchColKey;
          // remember the refer-relationship, it is used for query rewrite
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
          isSDBEncrypted = field.isSDBEncrypted;
          sdbColKey = field.sdbColKey;
          searchColKey = field.searchColKey;
          // remember the refer-relationship, it is used for query rewrite
          referExpr = field;
          referExpr.addReferredBy(this);
        }
      } else {
        // It is not a field literal, cannot determine if it is sensitive now.
        // remember the refer-relationship, it is used for query rewrite
        type = Type.UNKNOWN;
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
    if ((sdbColKey == null) != (fieldobj.sdbColKey == null)) {
      LOG.debug("Column Key is not equal!");
      return false;
    }

    if ((referExpr == null) != (fieldobj.referExpr == null)) {
      LOG.debug("Refer expr is not equal!");
      return false;
    }

    if (sdbColKey != null) {
      if (!sdbColKey.equals(fieldobj.getSdbColKey())) {
        LOG.debug("Column Key is not equal!");
        return false;
      }
    }

    if (referExpr != null) {
      if (!referExpr.equals(fieldobj.referExpr)) {
        LOG.debug("Refer expr is not equal!");
        return false;
      }
    }

    return tblName.equals(fieldobj.getTblName()) && name.equals(fieldobj.getName())
            && type.equals(fieldobj.getType()) && isSDBEncrypted == fieldobj.isSDBEncrypted();
  }

  /**
   * @return the tbl
   */
  public String getTblName() {
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
  @Override
  public Type getType() {
    return type;
  }

  /**
   * @return the type
   */
  @Override
  public void setType(Type type) {
    this.type = checkNotNull(type, "Field type is null.");
  }

  /**
   * @return the isSDBEncrypted
   */
  public boolean isSDBEncrypted() {
    return isSDBEncrypted;
  }

  /**
   * @param isSen the isSDBEncrypted to set
   */
  public void setSDBEncrypted(boolean isSen) {
    this.isSDBEncrypted = isSen;
  }

  /**
   * @return the sdbColKey
   */
  @Override
  public SdbColumnKey getSdbColKey() {
    return sdbColKey;
  }

  /**
   * @param sdbColKey the sdbColKey to set
   */
  @Override
  public void setSdbColKey(SdbColumnKey sdbColKey) {
    this.sdbColKey = sdbColKey;
  }

  @Override
  public SearchColumnKey getSearchColKey() {
    return searchColKey;
  }

  @Override
  public void setSearchColKey(SearchColumnKey searchColKey) {
    this.searchColKey = searchColKey;
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
    StringBuilder sb = new StringBuilder();

    sb.append("Table Name: " + tblName + "|");
    sb.append("Name: " + name + "|");
    sb.append("DataType: " + type + "|");
    if (isSDBEncrypted)
      sb.append("Sensitive: true" + "|");
    else
      sb.append("Sensitive: false" + "|");

    sb.append("ColumnKeys: " + sdbColKey);

    return sb.toString();

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveEncrytedCol() {
    return isSDBEncrypted;
  }

  @Override
  public EncryptionScheme getEncrytionScheme() {
    return null;
  }

  public void updateColKey() {
    sdbColKey = referExpr.getSdbColKey();
  }
}
