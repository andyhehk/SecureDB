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

package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.DataType;

/**
 * Created by Eric Haibin Lin on 26/3/15.
 */
public class ColumnType {

  private DataType dataType;

  public ColumnType(DataType dataType) {
    this.dataType = dataType;
  }

  private int length;

  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ColumnType)) {
      return false;
    }
    return (((ColumnType) object).getDataType() == dataType) && (length == ((ColumnType) object).getLength());
  }

  public String toSql() {
    if (length > 0) {
      return dataType + "(" + length + ")";
    }
    return dataType.toString();
  }

}
