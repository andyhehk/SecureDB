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

import edu.hku.sdb.conf.ConnectionConf;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SdbStatement extends UnicastRemoteObject implements Statement, Serializable {

    private static final long serialVersionUID = 427L;
    private static final String SERVICE_NAME = "ResultSet";

    private ConnectionConf connectionConf;
    private static String serviceUrl;
    private ResultSet resultSet;

    public SdbStatement(ConnectionConf connectionConf) throws RemoteException {
        super();
        setConnectionConf(connectionConf);
    }

    //TODO to be implemented
    @Override
    public ResultSet executeQuery() {
        return null;
    }

    //TODO to be implemented
    @Override
    public void close() {

    }

    public ConnectionConf getConnectionConf() {
        return connectionConf;
    }

    public void setConnectionConf(ConnectionConf connectionConf) {
        this.connectionConf = connectionConf;
    }
}
