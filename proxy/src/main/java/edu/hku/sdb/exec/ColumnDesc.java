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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Eric Haibin Lin on 13/3/15.
 */
public class ColumnDesc extends BasicColumnDesc {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnDesc.class);

  private boolean isSensitive;
  private ColumnKey columnKey;

  public void setColumnKey(ColumnKey columnKey) {
    this.columnKey = columnKey;
  }

  public boolean isSensitive() {
    return isSensitive;
  }

  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public ColumnKey getColumnKey() {
    return columnKey;
  }

  public ColumnDesc(String name, String alias, Class clazz, boolean isSensitive, ColumnKey columnKey) {
    super(name, alias, clazz);
    setSensitive(isSensitive);
    setColumnKey(columnKey);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ColumnDesc)) {
      LOG.debug(object.getClass() + " object is not an instance of " + this.getClass());
      return false;
    }
    if (isSensitive != ((ColumnDesc) object).isSensitive()) {
      LOG.debug("isSensitive is not equal!");
      return false;
    }
    if (!columnKey.equals(((ColumnDesc) object).getColumnKey())) {
      LOG.debug("columnKey is not equal!");
      return false;
    }
    if (!super.equals((BasicColumnDesc) object)) {
      LOG.debug("super class instance is not equal!");
      return false;
    }
    return true;
  }

}
