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

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.parse.TableName;
import edu.hku.sdb.plan.LocalCreateDesc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class LocalCreate extends PlanNode<LocalCreateDesc> {


  public LocalCreate(MetaStore metaStore, TableName tableName, RowDesc localCreateRowDesc) {
    nodeDesc = new LocalCreateDesc();
    nodeDesc.setMetaStore(metaStore);
    nodeDesc.setTableName(tableName);
    nodeDesc.setRowDesc(localCreateRowDesc);
  }

  @Override
  public void init() {
    MetaStore metaStore = nodeDesc.getMetaStore();
    DBMeta dbMeta = metaStore.getAllDBs().get(0);

    TableMeta tableMeta = new TableMeta(dbMeta.getName(), nodeDesc.getTableName().getName());
    tableMeta.setDbMeta(dbMeta);
    metaStore.addTbl(tableMeta);

    List<ColumnMeta> columnMetaList = new ArrayList<>();

    for (BasicColumnDesc columnDesc : nodeDesc.getRowDesc().getSignature()) {
      ColumnMeta columnMeta = null;
      String dbName = DBMeta.defaultDbName;
      String tableName = nodeDesc.getTableName().getName();
      String colName = columnDesc.getName();

      if (columnDesc instanceof ColumnDesc) {
        //sensitive column's plaintext is int type, by default
        DataType type = DataType.INT;
        boolean isSen = true;
        ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
        columnMeta = new ColumnMeta(dbName, tableName, colName, type, isSen, columnKey);
      } else if (columnDesc instanceof BasicColumnDesc) {
        columnMeta = new ColumnMeta(dbName, tableName, colName);
        if (columnDesc.getClazz() == String.class) {
          columnMeta.setType(DataType.VARCHAR);
        } else {
          columnMeta.setType(DataType.INT);
        }
      }
      columnMeta.setTableMeta(tableMeta);
      columnMetaList.add(columnMeta);
    }
    tableMeta.setCols(columnMetaList);
    dbMeta.add(tableMeta);

    //Update metaStore
    metaStore.addCols(columnMetaList);
    metaStore.addTbl(tableMeta);
    metaStore.addDB(dbMeta);
  }

  @Override
  public BasicTupleSlot nextTuple() {
    return null;
  }

  @Override
  public void close() {

  }
}
