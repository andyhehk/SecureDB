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

public class InLineViewRef extends TableRef {

  protected SelectStmt selectStmt;

  /**
   * @param tableName
   * @param alias
   */
  public InLineViewRef(String tableName, String alias) {
    super(tableName, alias);
    // TODO Auto-generated constructor stub
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InLineViewRef))
      return false;

    if (!super.equals(obj))
      return false;

    InLineViewRef viewObj = (InLineViewRef) obj;

    return selectStmt.equals(viewObj.selectStmt);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * edu.hku.sdb.parse.ParseNode#analyze(edu.hku.sdb.parse.BasicSemanticAnalyzer
   * )
   */
  public void analyze(BasicSemanticAnalyzer analyzer) throws SemanticException {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  public String toSql() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @return the selectStmt
   */
  public SelectStmt getSelectStmt() {
    return selectStmt;
  }

  /**
   * @param selectStmt
   *          the selectStmt to set
   */
  public void setSelectStmt(SelectStmt selectStmt) {
    this.selectStmt = selectStmt;
  }

}
