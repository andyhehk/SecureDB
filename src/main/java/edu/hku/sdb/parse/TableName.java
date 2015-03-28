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

package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.MetaStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TableName implements ParseNode {

  private static final Logger LOG = LoggerFactory.getLogger(TableName.class);
  protected String db;
  protected String name;

  /**
   * @return the db
   */
  public String getDb() {
    return db;
  }

  /**
   * @param db
   *          the db to set
   */
  public void setDb(String db) {
    this.db = db;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof TableName)){
      LOG.debug("The other object is not an instance of TableName!");
      return false;
    }

    //TODO check dbName and null values
    if (!name.equals(((TableName) object).getName())){
      LOG.debug("The other object's name does not match!");
      return false;
    }

    return true;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {

  }

  @Override
  public String toSql() {
    return name;
  }

  @Override
  public boolean involveSdbEncrytedCol() {
    return false;
  }
}
