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

import edu.hku.sdb.catalog.MetaStore;

import com.google.common.base.Joiner;

public class SelectionList implements ParseNode {

  private static final Logger LOG = LoggerFactory
          .getLogger(SelectionList.class);

  protected List<SelectionItem> itemList;

  public SelectionList() {
    itemList = new ArrayList<SelectionItem>();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SelectionList))
      return false;

    SelectionList listObj = (SelectionList) obj;

    boolean equal = itemList.equals(listObj.itemList);

    if (!equal) {
      LOG.debug("Two selection lists are not equal!");
    }
    return equal;

  }

  /**
   * @return the itemList
   */
  public List<SelectionItem> getItemList() {
    return itemList;
  }

  /**
   * @param itemList the itemList to set
   */
  public void setItemList(List<SelectionItem> itemList) {
    this.itemList = itemList;
  }

  /**
   * @see edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.catalog.DBMeta)
   */
  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException {
    for (SelectionItem item : itemList)
      item.analyze(metaDB, fieldSources);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {

    List<String> items = new ArrayList<String>();

    for (SelectionItem item : itemList) {
      items.add(item.toSql());
    }

    return Joiner.on(", ").join(items);

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {

    for (SelectionItem item : itemList) {
      if (item.involveSdbEncrytedCol())
        return true;
    }

    return false;
  }
}
