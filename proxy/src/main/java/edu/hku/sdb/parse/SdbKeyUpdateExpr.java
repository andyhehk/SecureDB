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

import java.util.ArrayList;
import java.util.List;

public class SdbKeyUpdateExpr extends Expr {

  private final String op = "sdb_keyUp";

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SdbKeyUpdateExpr))
      return false;

    return children.equals(((SdbKeyUpdateExpr) obj).children);
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

  /* (non-Javadoc)
   * @see edu.hku.sdb.parse.Expr#involveSdbCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    return true;
  }

}
