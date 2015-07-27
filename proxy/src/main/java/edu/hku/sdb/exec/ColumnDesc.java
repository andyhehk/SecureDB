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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnDesc {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnDesc.class);

  protected String name;
  protected String alias;
  protected Class clazz;

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

  public Class getClazz() {
    return clazz;
  }

  public void setClazz(Class clazz) {
    this.clazz = clazz;
  }

  public ColumnDesc(String name, String alias, Class clazz) {
    this.name = name;
    this.alias = alias;
    this.clazz = clazz;
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
    if (!clazz.equals(((ColumnDesc) object).getClazz())) {
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
