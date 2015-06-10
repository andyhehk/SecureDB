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

package edu.hku.sdb.catalog;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetaStore {

  private static final Logger LOG = LoggerFactory.getLogger(MetaStore.class);

  public static final String name = "metastore_db";
  private PersistenceManager pm;
  private String defaultDB = "default";

  public MetaStore(PersistenceManager pm) {
    this.pm = pm;
  }

  public MetaStore(String defaultDB, PersistenceManager pm) {
    // Make sure database name is not null
    this.defaultDB = checkNotNull(defaultDB, "Database name is null");
    this.pm = pm;
  }

  /**
   * Add db meta.
   *
   * @param db
   */
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

  /**
   * Add table meta.
   *
   * @param tbl
   */
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

  /**
   * Add column meta.
   *
   * @param col
   */
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

  /**
   * Add a collection of column meta.
   *
   * @param cols
   */
  public void addCols(Collection<ColumnMeta> cols) {
    Transaction tx = pm.currentTransaction();
    try {
      tx.begin();
      pm.makePersistentAll(cols);
      tx.commit();
    } finally {
      if (tx.isActive()) {
        tx.rollback();
      }
    }
  }

  /**
   * Get db meta.
   *
   * @param dbName
   * @return
   */
  public DBMeta getDB(String dbName) {
    return getByKey(DBMeta.DBPK.class.getName() + "::" + dbName.toLowerCase(),
            DBMeta.class);
  }

  /**
   * Get table meta.
   *
   * @param dbName
   * @param tblName
   * @return
   */
  public TableMeta getTbl(String dbName, String tblName) {
    return getByKey(
            TableMeta.TablePK.class.getName() + "::" + dbName.toLowerCase() + "::"
                    + tblName.toLowerCase(), TableMeta.class);
  }

  /**
   * Get column meta.
   *
   * @param dbName
   * @param tblName
   * @param colName
   * @return
   */
  public ColumnMeta getCol(String dbName, String tblName, String colName) {
    return getByKey(
            ColumnMeta.ColumnPK.class.getName() + "::" + dbName.toLowerCase()
                    + "::" + tblName.toLowerCase() + "::" + colName.toLowerCase(),
            ColumnMeta.class);
  }

  /**
   * Get column meta.
   *
   * @param tblName
   * @param colName
   * @return
   */
  public ColumnMeta getCol(String tblName, String colName) {
    return getByKey(
            ColumnMeta.ColumnPK.class.getName() + "::" + defaultDB.toLowerCase()
                    + "::" + tblName.toLowerCase() + "::" + colName.toLowerCase(),
            ColumnMeta.class);
  }

  /**
   * Get an object through its key. Return null if not found.
   *
   * @param keyString
   * @param clazz
   * @return
   */
  @SuppressWarnings("unchecked")
  public <T> T getByKey(String keyString, Class<T> clazz) {
    T result = null;
    Key k = KeyFactory.stringToKey(keyString);
    try {
      result = (T) pm.getObjectById(k);
    } catch (JDOObjectNotFoundException nfe) {
      LOG.warn("No " + clazz.getCanonicalName() + " found with key: " + k);
    }
    return result;
  }

  /**
   * Get all db meta.
   *
   * @return
   */
  @SuppressWarnings("unchecked")
  public List<DBMeta> getAllDBs() {
    Query q = pm.newQuery(DBMeta.class);

    return (List<DBMeta>) q.execute();
  }

  /**
   * Get all table meta.
   *
   * @return
   */
  @SuppressWarnings("unchecked")
  public List<TableMeta> getAllTbls() {
    Query q = pm.newQuery(TableMeta.class);

    return (List<TableMeta>) q.execute();
  }

  /**
   * Get all column meta.
   *
   * @return
   */
  @SuppressWarnings("unchecked")
  public List<ColumnMeta> getAllCols() {
    Query q = pm.newQuery(ColumnMeta.class);

    return (List<ColumnMeta>) q.execute();
  }

}
