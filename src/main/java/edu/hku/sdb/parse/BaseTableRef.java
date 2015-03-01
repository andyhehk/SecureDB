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

import edu.hku.sdb.catalog.MetaStore;

import static com.google.common.base.Preconditions.*;

public class BaseTableRef extends TableRef {

  /**
   * @param tableName
   * @param alias
   */
  public BaseTableRef(String tableName, String alias) {
    // Trim any white space.
    super(checkNotNull(tableName, "Table Name is null."), checkNotNull(alias,
        "Alias is null."));
  }
  
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof BaseTableRef))
      return false;

    return super.equals(obj);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.parse.BasicSemanticAnalyzer
   * )
   */
  public void analyze(MetaStore metaDB, ParseNode... fieldParent)
      throws SemanticException {
    if(onClause!=null)
      onClause.analyze(metaDB, fieldParent);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    StringBuilder sb = new StringBuilder();

    if (alias.equals("")) {
      if (onClause == null) {
        if(joinOp == null)
          sb.append(tblName + ",");
        else
          sb.append(tblName);
      }
      else
        sb.append("JOIN " + tblName + " ON " + onClause.toSql());
    } else {
      if (onClause == null) {
        if(joinOp == null)
          sb.append(tblName + " as " + alias +",");
        else
          sb.append(tblName + " as " + alias);
      }
      else
        sb.append(" Join " + tblName + " as " + alias + " ON "
            + onClause.toSql());
    }
    return sb.toString();
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.ParseNode#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return onClause.involveSdbEncrytedCol();
  }

}
