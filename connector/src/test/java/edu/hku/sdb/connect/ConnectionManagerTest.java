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

//import edu.hku.sdb.driver.SdbDriver;

import org.junit.BeforeClass;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ConnectionManagerTest {

//  @BeforeClass
//  public static void setUpBeforeClass() throws Exception {
//    String[] args = new String[3];
//    args[0] = "start";
//    args[1] = "--sdbconf";
//    args[2] = "src/test/resources/conf";
//    SdbDriver.main(args);
//  }
//
//  @Test
//  public void testGetStatement() throws Exception {
//    ConnectionService connectionService = null;
//    try {
//      connectionService = (ConnectionService) Naming.lookup("//localhost:2019/ConnectionService");
//    } catch (NotBoundException | MalformedURLException | RemoteException e) {
//      e.printStackTrace();
//    }
//    assertNotNull(connectionService);
//    Connection connection = connectionService.getConnection();
//    assertNotNull(connection);
//    Statement statement = connection.createStatement();
//    assertNotNull(statement);
//  }
//
//  @Test
//  public void testGetConnection() throws Exception{
//    Connection connection = ConnectionManager.getConnection("//localhost:2019/ConnectionService", "", "");
//    assertNotNull(connection);
//    Statement statement = connection.createStatement();
//    assertNotNull(statement);
//    ResultSet resultSet = statement.executeQuery("SELECT ID FROM t2");
//    assertNotNull(resultSet);
//    while (resultSet.next()){
//      assertTrue(resultSet.getInteger(1) > 0);
//    }
//  }

}