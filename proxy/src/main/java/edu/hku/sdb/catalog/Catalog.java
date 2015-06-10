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

import java.sql.Connection;

import edu.hku.sdb.conf.SdbConf;

public class Catalog {

  private MetaStore metadb;
  private Connection serverdbCon;

  public Catalog() {

  }

  public Catalog(SdbConf sdbconf) {
    initMetaDB();
    initConnections();
  }

  /**
   * Initialize the metastore database
   */
  private void initMetaDB() {

  }

  /**
   * Initialize the clientdb and serverdb connections.
   */
  private void initConnections() {

  }

  /**
   * @return the metadb
   */
  public MetaStore getMetadb() {
    return metadb;
  }

  /**
   * @param metadb the metadb to set
   */
  public void setMetadb(MetaStore metadb) {
    this.metadb = metadb;
  }

  /**
   * @return the serverdbCon
   */
  public Connection getServerdbCon() {
    return serverdbCon;
  }

  /**
   * @param serverdbCon the serverdbCon to set
   */
  public void setServerdbCon(Connection serverdbCon) {
    this.serverdbCon = serverdbCon;
  }

}
