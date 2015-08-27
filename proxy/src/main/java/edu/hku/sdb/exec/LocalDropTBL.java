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

package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.plan.LocalDropTBLDesc;

import java.util.List;

public class LocalDropTBL extends LocalPlanNode<LocalDropTBLDesc> {

  private final MetaStore metaStore;
  private final String dbName;
  private final String tblName;
  private BasicTupleSlot tupleSlot;
  private boolean initilized = false;
  private PlanNode child;

  public LocalDropTBL(MetaStore metaStore, String dbName, String tblName, RowDesc rowDesc) {
    this.metaStore = metaStore;
    this.dbName = dbName;
    this.tblName = tblName;

    nodeDesc = new LocalDropTBLDesc();
    nodeDesc.setRowDesc(rowDesc);
  }

  @Override
  public void init() {

    metaStore.delTbl(dbName, tblName);
    initilized = true;
  }

  @Override
  public List<Object> nextTuple() {
    if(!initilized)
      init();

    child.nextTuple();

    return null;
  }

  @Override
  public void addChild(PlanNode child) {
    this.child = child;
  }

  @Override
  public void close() {

  }
}
