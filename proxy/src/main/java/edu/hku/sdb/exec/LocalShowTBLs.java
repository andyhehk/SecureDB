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

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.TableMeta;
import edu.hku.sdb.plan.LocalShowTBLsDesc;

import java.util.ArrayList;
import java.util.List;

public class LocalShowTBLs  extends LocalPlanNode<LocalShowTBLsDesc>  {

  private final DBMeta dbMeta;
  private BasicTupleSlot tupleSlot;
  private boolean initilized = false;

  public LocalShowTBLs(DBMeta dbMeta, RowDesc rowDesc) {
    this.dbMeta = dbMeta;

    nodeDesc = new LocalShowTBLsDesc();
    nodeDesc.setRowDesc(rowDesc);
  }

  @Override
  public void init() {
    tupleSlot = new TupleSlot();
    List<TableMeta> tblMetas = dbMeta.getTbls();

    for(TableMeta tblMeta : tblMetas) {
      List<Object> row = new ArrayList<>();
      String tblName = tblMeta.getTblName();
      row.add(tblName);
      tupleSlot.addRow(row);
      initilized = true;
    }
  }

  @Override
  public List<Object> nextTuple() {
    if(!initilized)
      init();

    return tupleSlot.nextTuple();
  }

  @Override
  public void close() {

  }
}
