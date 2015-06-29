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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.hku.sdb.catalog.MetaStore;

import static com.google.common.base.Preconditions.*;

public class InLineViewRef extends TableRef {

  private static final Logger LOG = LoggerFactory
          .getLogger(InLineViewRef.class);


  protected QueryStmt queryStmt;

  public InLineViewRef() {
    super(null, null);
  }

  /**
   * @param alias
   * @param queryStmt
   */
  public InLineViewRef(String alias, QueryStmt queryStmt) {
    super(null, alias);
    this.queryStmt = queryStmt;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InLineViewRef))
      return false;

    InLineViewRef viewObj = (InLineViewRef) obj;

    if (!alias.equals(viewObj.alias)) {
      LOG.debug("Alias are not equal!");
      return false;
    }

    if (!queryStmt.equals(viewObj.queryStmt)) {
      LOG.debug("Sub Queries are not equal!");
      return false;
    }

    return true;
  }

  /**
   * @see edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.parse.BasicSemanticAnalyzer
   *)
   */
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException {
    queryStmt.analyze(metaDB, fieldSources);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    StringBuilder sb = new StringBuilder();

    sb.append("(\n" + queryStmt.toSql() + ")" + " " + alias);

    return sb.toString();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Alias: " + alias + "\n");
    sb.append("Query Statement: " + queryStmt);
    sb.append("On Clause: " + onClause + "\n");
    if(joinOp != null)
      sb.append("Join Operator: " + joinOp + "\n");
    if(leftTblRef != null)
      sb.append("LeftTbl: " + leftTblRef.tblName + "\n");

    return sb.toString();
  }

  /**
   * @return the selectStmt
   */
  public QueryStmt getQueryStmt() {
    return queryStmt;
  }

  /**
   * @param queryStmt the selectStmt to set
   */
  public void setQueryStmt(QueryStmt queryStmt) {
    this.queryStmt = queryStmt;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return queryStmt.involveSdbEncrytedCol()
            || onClause.involveSdbEncrytedCol();
  }

}
