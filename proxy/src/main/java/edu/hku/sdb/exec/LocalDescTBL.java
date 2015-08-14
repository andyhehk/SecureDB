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

import edu.hku.sdb.catalog.ColumnMeta;
import edu.hku.sdb.catalog.TableMeta;
import edu.hku.sdb.plan.LocalDescTBLDesc;

import java.util.ArrayList;
import java.util.List;

public class LocalDescTBL extends LocalPlanNode<LocalDescTBLDesc> {

  private final TableMeta tblMeta;
  private BasicTupleSlot tupleSlot;
  private boolean initilized = false;

  public LocalDescTBL(TableMeta tblMeta, RowDesc rowDesc) {
    this.tblMeta = tblMeta;

    nodeDesc = new LocalDescTBLDesc();
    nodeDesc.setRowDesc(rowDesc);
  }


  @Override
  public void init() {
    tupleSlot = new TupleSlot();
    List<ColumnMeta> colMetas = tblMeta.getCols();

    for(ColumnMeta colMeta : colMetas) {
      List<Object> row = new ArrayList<>();
      String colName = colMeta.getColName();
      String type = colMeta.getType().toString();
      String enc = colMeta.isSensitive()? "YES" : "NO";
      row.add(colName);
      row.add(type);
      row.add(enc);
      tupleSlot.addRow(row);
    }

    initilized = true;
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
