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

package edu.hku.sdb.driver;

import edu.hku.sdb.connect.Connection;
import edu.hku.sdb.connect.ConnectionService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConnectionPool extends UnicastRemoteObject implements ConnectionService {

  /**
   * Default serialversion ID
   */
  private static final long serialVersionUID = 1L;

  /**
   * @throws RemoteException
   */
  protected ConnectionPool() throws RemoteException {
    super();
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.connect.ConnectionService#getConnection()
   */
  public Connection getConnection() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see edu.hku.sdb.connect.ConnectionService#closeConnection()
   */
  public void closeConnection() {
    // TODO Auto-generated method stub
    
  }

}
