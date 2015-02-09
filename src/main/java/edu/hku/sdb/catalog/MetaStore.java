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

package edu.hku.sdb.catalog;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

public class MetaStore {

  public static final String name = "metastore_db";
  private PersistenceManager pm;

  public MetaStore(PersistenceManager pm) {
    this.pm = pm;
  }

  public void addDB(DBMeta db) {
    Transaction tx = pm.currentTransaction();
    try {
      tx.begin();
      pm.makePersistent(db);
      tx.commit();
    } finally {
      if (tx.isActive()) {
        tx.rollback();
      }
    }
  }

  public void addTbl(TableMeta tbl) {
    Transaction tx = pm.currentTransaction();
    try {
      tx.begin();
      pm.makePersistent(tbl);
      tx.commit();
    } finally {
      if (tx.isActive()) {
        tx.rollback();
      }
    }
  }

  public void addCol(ColumnMeta col) {
    Transaction tx = pm.currentTransaction();
    try {
      tx.begin();
      pm.makePersistent(col);
      tx.commit();
    } finally {
      if (tx.isActive()) {
        tx.rollback();
      }
    }
  }

  public DBMeta getDB(String dbName) {
    return pm.getObjectById(DBMeta.class, dbName.toLowerCase());
  }

  public TableMeta getTbl(String dbName, String tblName) {
    TableMeta.TablePK key = new TableMeta.TablePK(
        TableMeta.TablePK.class.getName() + "::" + dbName.toLowerCase() + "::"
            + tblName.toLowerCase());

    return (TableMeta) pm.getObjectById(key);
  }

  public ColumnMeta getCol(String dbName, String tblName, String colName) {
    ColumnMeta.ColumnPK key = new ColumnMeta.ColumnPK(
        ColumnMeta.ColumnPK.class.getName() + "::" + dbName.toLowerCase()
        + "::" + tblName.toLowerCase() + "::" + colName.toLowerCase());
    
    return (ColumnMeta) pm.getObjectById(key);
  }

  @SuppressWarnings("unchecked")
  public List<DBMeta> getAllDBs() {
    Query q = pm.newQuery(DBMeta.class);

    return (List<DBMeta>) q.execute();
  }

  @SuppressWarnings("unchecked")
  public List<TableMeta> getAllTbls() {
    Query q = pm.newQuery(TableMeta.class);

    return (List<TableMeta>) q.execute();
  }

  @SuppressWarnings("unchecked")
  public List<ColumnMeta> getAllCols() {
    Query q = pm.newQuery(ColumnMeta.class);

    return (List<ColumnMeta>) q.execute();
  }

}
