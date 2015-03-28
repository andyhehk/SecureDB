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

package edu.hku.sdb.optimize;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.exec.PlanNode;
import edu.hku.sdb.parse.CreateStmt;
import edu.hku.sdb.parse.ParseNode;
import edu.hku.sdb.parse.SelectStmt;
import edu.hku.sdb.rewrite.UnSupportedException;

import java.sql.Connection;

public abstract class Optimizer {

  abstract public PlanNode optimize(ParseNode parseTree, Connection connection, MetaStore metaStore) throws UnSupportedException;

  protected PlanNode optimizeInternal(ParseNode parseTree, Connection connection, MetaStore metaStore) throws UnSupportedException {
    if (parseTree instanceof SelectStmt) {
      return optimizeSelStmt((SelectStmt) parseTree, connection, metaStore);
    }
    else if (parseTree instanceof CreateStmt) {
      return optimizeCreateStmt((CreateStmt) parseTree, connection, metaStore);
    }
    throw new UnSupportedException("unsupported parseTree to optimize");
  }

  protected abstract PlanNode optimizeCreateStmt(CreateStmt createStmt, Connection connection, MetaStore metaStore) throws UnSupportedException;

  protected abstract PlanNode optimizeSelStmt(SelectStmt selStmt, Connection connection, MetaStore metaStore)
          throws UnSupportedException;

}
