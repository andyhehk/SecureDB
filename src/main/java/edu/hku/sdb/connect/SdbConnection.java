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
import edu.hku.sdb.conf.SdbConf;
import org.apache.hadoop.fs.Stat;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SdbConnection extends UnicastRemoteObject implements Connection, Serializable {

    private static final long serialVersionUID = 227L;
    private static final String SERVICE_NAME = "Statement";

    private ConnectionConf connectionConf;
    private static String serviceUrl;
    private Statement statement;


    public SdbConnection(ConnectionConf connectionConf) throws RemoteException {
        super();
        setConnectionConf(connectionConf);
    }

    @Override
    public Statement createStatement() throws RemoteException{
        try {
            serviceUrl = connectionConf.getSdbAddress() + ":" + connectionConf.getSdbPort() + "/" + SERVICE_NAME;
            if (statement == null){
                SdbStatement sdbStatement= new SdbStatement(connectionConf);
                Naming.rebind(serviceUrl, statement);
            };
            statement= (Statement) Naming.lookup(serviceUrl);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        return statement;
    }

    @Override
    public void close() throws RemoteException {

    }

    public ConnectionConf getConnectionConf() {
        return connectionConf;
    }

    public void setConnectionConf(ConnectionConf connectionConf) {
        this.connectionConf = connectionConf;
    }


}
