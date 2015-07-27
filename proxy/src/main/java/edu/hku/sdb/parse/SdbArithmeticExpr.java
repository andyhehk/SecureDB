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
import edu.hku.sdb.catalog.ColumnKey;

import java.util.ArrayList;
import java.util.List;

public class SdbArithmeticExpr extends Expr {

  public enum SdbOperator {
    SDB_ADD("sdb_add", "sdb UDF for adding  two columns"),
    SDB_MUL("sdb_mul", "sdb UDF for multiplying two columns"),
    SDB_ADDROWID("sdb_intadd", "sdb UDF for adding two row IDs"),
    SDB_SUM("sdb_sum", "sdb UDF for sum aggregation"),
    SDB_FIRST("sdb_first", "sdb UDF for getting the first saw value"),
    SDB_LT("sdb_lt", "sdb UDF for <"),
    SDB_GT("sdb_gt", "sdb UDF for >"),
    SDB_LE("sdb_le", "sdb UDF for <="),
    SDB_GE("sdb_lt", "sdb UDF for >="),
    SDB_EQ("sdb_lt", "sdb UDF for ="),
    SDB_NE("sdb_lt", "sdb UDF for !=");

    private final String description;
    private final String name;

    private SdbOperator(String description, String name) {
      this.description = description;
      this.name = name;
    }

    @Override
    public String toString() {
      return description;
    }

    public String getName() {
      return name;
    }

  }

  public SdbArithmeticExpr() {}

  public SdbArithmeticExpr(SdbOperator op) {
    this.op = op;
  }

  private SdbOperator op;

  private ColumnKey columnKey;


  @Override
  public ColumnKey getColKey() {
    return columnKey;
  }

  public void setColKey(ColumnKey columnKey) {
    this.columnKey = columnKey;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SdbArithmeticExpr))
      return false;

    SdbArithmeticExpr sdbAriObj = (SdbArithmeticExpr) obj;
    return op.equals(sdbAriObj.op) && children.equals(sdbAriObj.children);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    List<String> items = new ArrayList<String>();
    for (Expr child : children) {
      items.add(child.toSql());
    }
    return op + "(" + Joiner.on(",").join(items) + ")";
  }

  /**
   * @return the op
   */
  public SdbOperator getOp() {
    return op;
  }

  /**
   * @param op the op to set
   */
  public void setOp(SdbOperator op) {
    this.op = op;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return true;
  }

}
