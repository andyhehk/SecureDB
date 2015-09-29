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
  private DBMeta dbMeta;
  private java.sql.Connection serverConnection;

  public SdbConnection(SdbConf sdbConf, MetaStore metaStore) throws RemoteException {
    super();
    setSdbConf(sdbConf);

    this.metaStore = metaStore;

    String serverDBName = "";

    if(sdbConf.getServerConf().getType() == ServerType.HIVE) {
     serverDBName = ((HiveServerConf)sdbConf.getServerConf()).getDatabaseName();
    }
    else {
      LOG.error("Unsupported server type: " + sdbConf.getServerConf().getType());
      System.exit(0);
    }

    dbMeta = metaStore.getDB(serverDBName);
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
    serverConnection = getServerConnection(sdbConf.getServerConf());
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
        SdbStatement sdbStatement = new SdbStatement(metaStore, serverConnection, dbMeta, sdbConf.getServerConf());
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




  private java.sql.Connection getServerConnection(ServerConf serverConf) {
    if(serverConf.getType() == ServerType.HIVE) {
      HiveServerConf hiveServerConf = (HiveServerConf) serverConf;

      String hiveDriverName = hiveServerConf.getJdbcDriverName();
      String connectionURL = hiveServerConf.getJdbcUrl() + "/" + hiveServerConf.getDatabaseName();

      LOG.info("Connecting to server: " + connectionURL);

      String username = hiveServerConf.getUsername();
      String password = hiveServerConf.getPassword();
      try {
        Class.forName(hiveDriverName);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
        System.exit(1);
      }
      java.sql.Connection con = null;
      try {
        con = DriverManager.getConnection(connectionURL, username, password);
        java.sql.Statement stmt = con.createStatement();

        // register UDFs
        // failed in Spark 1.1.0
        // successful in Hive 0.12
        final String serverUDFPATH = System.getenv("SDB_SERVER_UDF_PATH");

        if (serverUDFPATH == null) {
          LOG.error("Please specify the path that the UDF jar store on server!");
          System.exit(1);
        }


        stmt.execute("add jar " + serverUDFPATH);
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.hive.SdbIntAddUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'edu.hku.sdb.udf.hive.SdbAddUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'edu.hku.sdb.udf.hive.SdbMultiUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_sum AS 'edu.hku.sdb.udf.hive.SdbSumUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_first AS 'edu.hku.sdb.udf.hive.SdbFirstUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'edu.hku.sdb.udf.hive.SdbKeyUpdateUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUpPlain AS 'edu.hku.sdb.udf.hive.SdbKeyUpdatePlainUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_cartesian AS 'edu.hku.sdb.udf.hive.SdbCartProdUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_lt AS 'edu.hku.sdb.udf.hive.SdbLtUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_gt AS 'edu.hku.sdb.udf.hive.SdbGtUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_le AS 'edu.hku.sdb.udf.hive.SdbLeUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_ge AS 'edu.hku.sdb.udf.hive.SdbGeUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_eq AS 'edu.hku.sdb.udf.hive.SdbEqUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_ne AS 'edu.hku.sdb.udf.hive.SdbNeUDF'");
        stmt.execute("CREATE TEMPORARY FUNCTION sdb_search AS 'edu.hku.sdb.udf.hive.SdbSearchUDF'");
        stmt.execute("set hive.auto.convert.join=false");

      } catch (SQLException e) {
        e.printStackTrace();
      }
      return con;
    }
    else {
      return null;
    }
  }

}
