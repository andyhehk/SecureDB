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

import edu.hku.sdb.conf.SdbConf;
import edu.hku.sdb.connect.Connection;
import edu.hku.sdb.connect.ConnectionService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SdbDriver {

    private final String HELP = "help";

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        startDriver();

    }

    private static void startDriver() {
        try {
            ConnectionPool connectionPool = new ConnectionPool(new SdbConf());
            Registry registry = LocateRegistry.getRegistry();
            Naming.rebind("//localhost/ConnectionService", connectionPool);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
