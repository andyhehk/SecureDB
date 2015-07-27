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

package edu.hku.sdb.connect;

import edu.hku.sdb.catalog.Type;
import edu.hku.sdb.exec.ColumnDesc;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class SDBResultSetMetaData extends UnicastRemoteObject implements ResultSetMetaData,
        Serializable {

  private static final long serialVersionUID = 198103L;
  List<ColumnDesc> columnList;

  public SDBResultSetMetaData() throws RemoteException {
    super();
  }

  public List<ColumnDesc> getColumnList() {
    return columnList;
  }

  public void setColumnList(List<ColumnDesc> columnList) {
    this.columnList = columnList;
  }

  /**
   * Get the designated column's name.
   *
   * @param columnIndex - the first column is 1, the second is 2, ...
   * @return
   */
  public String getColumnName(int columnIndex) throws RemoteException {
    ColumnDesc columnDesc = columnList.get(columnIndex - 1);
    String alias = columnDesc.getAlias();
    String name = columnDesc.getName();
    return (alias.equals("") ? name : alias);
  }

  public int getColumnCount() throws RemoteException {
    return columnList.size();
  }

//  /**
//   * Get the designated column's TYPE.
//   *
//   * @param columnIndex - the first column is 1, the second is 2, ...
//   * @return
//   */
//  public Type getColumnType(int columnIndex) throws RemoteException {
//    return columnList.get(columnIndex - 1).getType();
//  }

}
