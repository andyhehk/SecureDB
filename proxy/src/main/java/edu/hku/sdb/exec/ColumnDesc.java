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

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnDesc {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnDesc.class);

  protected String name;
  protected String alias;
  protected boolean isSensitive;
  protected Type type;

  protected ColumnKey colKey;

  public ColumnDesc(String colName, String alias, Type type, boolean
          isSensitive, ColumnKey colKey) {
    this.name = colName;
    this.alias = alias;
    this.type = type;
    this.isSensitive = isSensitive;
    this.colKey = colKey;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public boolean isSensitive() {
    return isSensitive;
  }

  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public void setColKey(ColumnKey colKey) {
    this.colKey = colKey;
  }

  public ColumnKey getColKey() {
    return colKey;
  }

  public ColumnDesc(String name, String alias, Type type) {
    this.name = name;
    this.alias = alias;
    this.type = type;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ColumnDesc)) {
      LOG.debug(object.getClass() + " object is not an instance of " + this.getClass());
      return false;
    }

    if (!name.equals(((ColumnDesc) object).getName())) {
      LOG.debug("name is not equal!");
      return false;
    }
    if (!type.equals(((ColumnDesc) object).getType())) {
      LOG.debug("clazz is not equal!");
      return false;
    }
    if (!alias.equals(((ColumnDesc) object).getAlias())) {
      LOG.debug("alias is not equal!");
      return false;
    }
    return true;
  }
}
