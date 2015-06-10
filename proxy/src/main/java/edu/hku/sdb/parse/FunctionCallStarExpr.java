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

import static com.google.common.base.Preconditions.checkNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionCallStarExpr extends Expr {

  private static final Logger LOG = LoggerFactory.getLogger(FunctionCallStarExpr.class);
  private final String name;

  public FunctionCallStarExpr(String name) {
    this.name = checkNotNull(name, "Function Name is null.");
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FunctionCallStarExpr))
      return false;

    FunctionCallStarExpr funcObj = (FunctionCallStarExpr) obj;

    if (!name.equals(funcObj.name)) {
      String info = "Two function are not equal: \n" + "Left: "
              + toSql() + "Right: " + funcObj.toSql();
      LOG.debug(info);
      return false;
    }

    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#toSql()
   */
  @Override
  public String toSql() {
    return name + "(*)";
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.parse.ParseNode#involveSdbEncrytedCol()
   */
  @Override
  public boolean involveSdbEncrytedCol() {
    // TODO Auto-generated method stub
    return false;
  }

}
