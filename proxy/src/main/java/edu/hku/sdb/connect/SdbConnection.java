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

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.*;
import edu.hku.sdb.crypto.SDBEncrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SdbConnection extends UnicastRemoteObject implements Connection,
        Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(SdbConnection.class);

  private static final long serialVersionUID = 227L;
  private static final String SERVICE_NAME = "Statement";
  private static String serviceUrl;

  private SdbConf sdbConf;
  private Statement statement;
  private MetaStore metaStore;
  private String serverDB;
  private ServerConnection serverConnection;

  public SdbConnection(SdbConf sdbConf, MetaStore metaStore) throws RemoteException {
    super();
    setSdbConf(sdbConf);

    this.metaStore = metaStore;

    String serverDBName = "";

    if(sdbConf.getServerConf().getType() == ServerType.HIVE) {
     serverDBName = ((HiveServerConf)sdbConf.getServerConf()).getDatabaseName();
    }
    else if (sdbConf.getServerConf().getType() == ServerType.ODPS) {
      serverDBName = ((ODPSServerConf) sdbConf.getServerConf()).getProject();
    }
    else {
      LOG.error("Unsupported server type: " + sdbConf.getServerConf().getType());
      System.exit(0);
    }

    serverDB = serverDBName;

    DBMeta dbMeta = metaStore.getDB(serverDBName);
    //create database if empty at the first place
    if (dbMeta == null) {
      String dbName = serverDBName;
      dbMeta = new DBMeta(dbName);
      BigInteger prime1 = SDBEncrypt.generateRandPrime();
      BigInteger prime2 = SDBEncrypt.generateRandPrime();
      BigInteger n = prime1.multiply(prime2);
      BigInteger g = SDBEncrypt.generatePositiveRand(prime1, prime2);
      BigInteger K = SDBEncrypt.generatePositiveRand(prime1, prime2);
      dbMeta.setN(n.toString());
      dbMeta.setPrime1(prime1.toString());
      dbMeta.setPrime2(prime2.toString());
      dbMeta.setG(g.toString());
      dbMeta.setK(K.toString());
      metaStore.addDB(dbMeta);
    }

    LOG.info("Connecting to server DB");
    serverConnection = ServerConFactory.getServerCon(sdbConf.getServerConf());
  }

  public SdbConf getSdbConf() {
    return sdbConf;
  }

  public void setSdbConf(SdbConf sdbConf) {
    this.sdbConf = sdbConf;
  }

  public Statement createStatement() throws RemoteException {
    try {
      if (statement == null) {
        //init connection
        ConnectionConf connectionConf = sdbConf.getConnectionConf();

        //create sdbStatement
        LOG.info("Creating sdb statement");
        SdbStatement sdbStatement = new SdbStatement(metaStore, serverConnection, serverDB, sdbConf.getServerConf());
        serviceUrl = connectionConf.getSdbAddress() + ":"
                + connectionConf.getSdbPort() + "/" + SERVICE_NAME;
        Naming.rebind(serviceUrl, sdbStatement);
      }
      statement = (Statement) Naming.lookup(serviceUrl);
    } catch (RemoteException | NotBoundException | MalformedURLException e) {
      e.printStackTrace();
    }
    return statement;
  }

  public void close() throws RemoteException {
    //TODO to be implemented
  }



}
