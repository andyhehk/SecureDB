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
import edu.hku.sdb.conf.ConnectionConf;
import edu.hku.sdb.conf.DbConf;
import edu.hku.sdb.conf.SdbConf;
import edu.hku.sdb.crypto.Crypto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SdbConnection extends UnicastRemoteObject implements Connection,
        Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(SdbConnection.class);

  private static final long serialVersionUID = 227L;
  private static final String SERVICE_NAME = "Statement";
  private static String serviceUrl;

  private SdbConf sdbConf;
  private Statement statement;

  public SdbConnection(SdbConf sdbConf) throws RemoteException {
    super();
    setSdbConf(sdbConf);

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
        MetaStore metaDb = getMetaDbConnection(sdbConf.getMetadbConf());
        java.sql.Connection serverConnection = getServerConnection(sdbConf.getServerdbConf());

        LOG.info("Connecting to metastore DB");
        LOG.info("Connecting to server DB");

        //create sdbStatement
        LOG.info("Creating sdb statement");
        SdbStatement sdbStatement = new SdbStatement(metaDb, serverConnection);
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

  private MetaStore getMetaDbConnection(DbConf dbConf) {
    //TODO: get params from dbConf
    String driver = dbConf.getJdbcDriverName();

    LOG.info("Connecting to Metastore with driver: " + driver);

    Properties properties = new Properties();
    properties.setProperty("javax.jdo.option.ConnectionURL",
            "jdbc:derby:metastore_db;create=true");

    properties.setProperty("javax.jdo.option.ConnectionDriverName",
            driver);

    properties.setProperty("javax.jdo.option.ConnectionUserName", "");
    properties.setProperty("javax.jdo.option.ConnectionPassword", "");
    properties.setProperty("datanucleus.schema.autoCreateSchema", "true");
    properties.setProperty("datanucleus.schema.autoCreateTables", "true");
    properties.setProperty("datanucleus.schema.validateTables", "false");
    properties.setProperty("datanucleus.schema.validateConstraints", "false");

    PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(properties);
    PersistenceManager pm = pmf.getPersistenceManager();
    MetaStore metaStore = new MetaStore(pm);

    //create default database if empty
    if (metaStore.getAllDBs().size() == 0) {
      String dbName = "default";
      DBMeta dbMeta = new DBMeta(dbName);
      BigInteger p = Crypto.generateRandPrime();
      BigInteger q = Crypto.generateRandPrime();
      BigInteger n = p.multiply(q);
      BigInteger g = Crypto.generatePositiveRand(p, q);
      dbMeta.setN(n.toString());
      dbMeta.setP(p.toString());
      dbMeta.setQ(q.toString());
      dbMeta.setG(g.toString());
      metaStore.addDB(dbMeta);
    }
    return metaStore;
  }


  private java.sql.Connection getServerConnection(DbConf dbConf) {
    String hiveDriverName = dbConf.getJdbcDriverName();
    String connectionURL = dbConf.getJdbcUrl() + "/" + dbConf.getDatabaseName();

    LOG.info("Connecting server: " + connectionURL);

    String username = dbConf.getUsername();
    String password = dbConf.getPassword();
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

      LOG.debug("Registering UDFS in server: " + connectionURL);
      // register UDFs
      stmt.execute("add jar SDB-0.1-SNAPSHOT.jar");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.SDBIntAddUDF'");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'edu.hku.sdb.udf.SDBAddUDF'");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.SDBIntAddUDF'");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'edu.hku.sdb.udf.SDBKeyUpdateUDF'");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'edu.hku.sdb.udf.SDBMultiUDF'");
      stmt.execute("CREATE TEMPORARY FUNCTION sdb_compare AS 'edu.hku.sdb.udf.SDBCompareUDF'");

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  }

}
