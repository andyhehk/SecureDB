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

package edu.hku.sdb.connect;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SdbResultSet extends UnicastRemoteObject implements ResultSet,
    Serializable {

  private static final long serialVersionUID = 127L;

  public List<Object[]> getTuple() {
    return tuple;
  }

  public void setTuple(List<Object[]> tuple) {
    this.tuple = tuple;
  }

  private List<Object[]> tuple;
  private int index;

  public SdbResultSet() throws RemoteException {
    super();
    tuple = new ArrayList<>();
    index = 0;
  }

  public boolean next() throws RemoteException {
    if (index >= tuple.size()){
      return false;
    }
    else{
      index ++;
    }
    return true;
  };

  // TODO to be implemented
  public void close() throws RemoteException {
    return;
  };

  public String getString(int columnIndex) throws RemoteException{
    return (String) tuple.get(index)[columnIndex];
  }

}
