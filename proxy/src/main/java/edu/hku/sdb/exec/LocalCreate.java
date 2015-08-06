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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LocalCreate extends PlanNode<LocalCreateDesc> {

  private static final Logger LOG = LoggerFactory.getLogger(LocalCreate.class);

  public LocalCreate(MetaStore metaStore, TableName tableName, RowDesc localCreateRowDesc) {
    nodeDesc = new LocalCreateDesc();
    nodeDesc.setMetaStore(metaStore);
    nodeDesc.setTableName(tableName);
    nodeDesc.setRowDesc(localCreateRowDesc);
  }

  @Override
  public void init() {
    MetaStore metaStore = nodeDesc.getMetaStore();
    // TODO: Get the database name of the connection
    DBMeta dbMeta = metaStore.getAllDBs().get(0);

    TableMeta tableMeta = new TableMeta(dbMeta.getName(), nodeDesc.getTableName().getName());
    tableMeta.setDbMeta(dbMeta);

    List<ColumnMeta> columnMetaList = new ArrayList<>();

    for (ColumnDesc columnDesc : nodeDesc.getRowDesc().getSignature()) {
      ColumnMeta columnMeta = null;
      // TODO: need to set the daName according to the connection
      String dbName = DBMeta.defaultDbName;
      String tableName = nodeDesc.getTableName().getName();
      String colName = columnDesc.getName();

      Type type = columnDesc.getType();
      if (columnDesc.isSensitive) {
        //sensitive column's plaintext is int type, by default
        // It is a scalar type
        if(type instanceof  ScalarType) {
          ScalarType scalaType = (ScalarType) type;

          switch (scalaType.getType()) {
            case INT:
            case BIGINT:
            case TINYINT:
            case DECIMAL:
              SdbColumnKey sdbColumnKey = columnDesc.getSdbColKey();
              columnMeta = new ColumnMeta(dbName, tableName, colName, type.toString(), true, sdbColumnKey.getM().toString(), sdbColumnKey.getX().toString());
              break;
            case CHAR:
            case VARCHAR:
            case STRING:
              SearchColumnKey searchColKey = columnDesc.getSearchColKey();
              columnMeta = new ColumnMeta(dbName, tableName, colName, type.toString(), true, searchColKey.priKey2String(), searchColKey.pubKey2String());
              break;
            default:
              LOG.error(type.toString() + " is not supported for SDB encryption scheme!");
              return;
          }

        }
        else {
          LOG.error(type.toString() + " is not supported for SDB encryption scheme!");
          return;
        }
      }
      else {
        columnMeta = new ColumnMeta(dbName, tableName, colName, type.toString(), false, null, null);
      }
      columnMeta.setTableMeta(tableMeta);
      columnMetaList.add(columnMeta);
    }

    tableMeta.setCols(columnMetaList);
    dbMeta.add(tableMeta);

    //Update metaStore
    metaStore.addDB(dbMeta);
  }

  @Override
  public List<Object> nextTuple() {
    return null;
  }

  @Override
  public void close() {

  }
}
