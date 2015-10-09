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

package edu.hku.sdb.driver;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.ConnectionConf;
import edu.hku.sdb.conf.MetadbConf;
import edu.hku.sdb.conf.SdbConf;
import edu.hku.sdb.connect.Connection;
import edu.hku.sdb.connect.ConnectionService;
import edu.hku.sdb.connect.SdbConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Properties;

public class ConnectionPool extends UnicastRemoteObject implements
        ConnectionService, Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(ConnectionPool.class);

  /**
   * Default serialversion ID
   */
  private static final long serialVersionUID = 1L;
  private static final String SERVICE_NAME = "Connection";
  private static String serviceUrl;
  private Integer maxConnectionNumber;
  private Integer availableConnectionNumber;
  private SdbConf sdbConf;
  private SdbConnection sdbConnection;
  private MetaStore metaStore;

  /**
   * @throws RemoteException
   */
  protected ConnectionPool() throws RemoteException {
    super();
  }

  public ConnectionPool(SdbConf sdbConf) throws RemoteException {
    super(0);
    setSDBConf(sdbConf);
    setAvailableConnectionNumber(sdbConf.getConnectionConf()
            .getMaxConnection());

    LOG.info("Connecting to metastore DB");
    metaStore = new MetaStore(getPersistManager(sdbConf.getMetadbConf()));
  }

  private void createConnection() {
    try {
      ConnectionConf connectionConf = sdbConf.getConnectionConf();
      sdbConnection = new SdbConnection(sdbConf, metaStore);
      serviceUrl = connectionConf.getSdbAddress() + ":"
              + connectionConf.getSdbPort() + "/" + SERVICE_NAME;
      Naming.rebind(serviceUrl, sdbConnection);
    } catch (RemoteException | MalformedURLException e) {
      e.printStackTrace();
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see ConnectionService#getConnection()
   */
  public Connection getConnection() {
    Connection connection = null;
    //TODO enable multiple connection
    synchronized (this) {
      if (availableConnectionNumber > 0) {
        if (sdbConnection == null) {
          createConnection();
        }
        try {
          connection = (Connection) Naming.lookup(serviceUrl);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
          e.printStackTrace();
        }
        availableConnectionNumber--;
        return connection;
      } else return null;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see ConnectionService#closeConnection()
   */
  public void closeConnection() {
    // TODO Auto-generated method stub
  }

  public Integer getMaxConnectionNumber() {
    return maxConnectionNumber;
  }

  public void setMaxConnectionNumber(Integer maxConnectionNumber) {
    this.maxConnectionNumber = maxConnectionNumber;
  }

  public Integer getAvailableConnectionNumber() {
    return availableConnectionNumber;
  }

  private void setAvailableConnectionNumber(Integer availableConnectionNumber) {
    this.availableConnectionNumber = availableConnectionNumber;
  }

  public SdbConf getSDBConf() {
    return sdbConf;
  }

  public void setSDBConf(SdbConf sdbConf) {
    this.sdbConf = sdbConf;
  }

  private PersistenceManager getPersistManager(MetadbConf metadbConf) {
    //TODO: get params from dbConf
    String driver = metadbConf.getJdbcDriverName();

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

    return  pm;
  }

}
