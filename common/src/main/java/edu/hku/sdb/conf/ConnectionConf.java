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

package edu.hku.sdb.conf;

import java.util.Map;

public class ConnectionConf extends Configuration {
  private String sdbAddress;
  private Integer sdbPort;
  private Integer maxConnection;

  // Proxy related
  public static String SDB_PROXY_CONNECTION_MAX = "sdb.proxy.connection.max";
  public static String SDB_PROXY_CONNECTION_PORT = "sdb.proxy.connection.port";
  public static String SDB_PROXY_CONNECTION_ADDRESS = "sdb.proxy.connection.address";

  public static String CONF_FILE = "sdb_connection.xml";

  public ConnectionConf(Map<String, String> prop) {
    sdbAddress = prop.get(SDB_PROXY_CONNECTION_ADDRESS);
    sdbPort = Integer.valueOf(prop.get(SDB_PROXY_CONNECTION_PORT));
    maxConnection = Integer.valueOf(prop.get(SDB_PROXY_CONNECTION_MAX));
  }

  public String getSdbAddress() {
    return sdbAddress;
  }



  public void setSdbAddress(String sdbAddress) {
    this.sdbAddress = sdbAddress;
  }

  public Integer getSdbPort() {
    return sdbPort;
  }

  public void setSdbPort(Integer sdbPort) {
    this.sdbPort = sdbPort;
  }

  public Integer getMaxConnection() {
    return maxConnection;
  }

  public void setMaxConnection(Integer maxConnection) {
    this.maxConnection = maxConnection;
  }

  public void printConfig() {
    String config = "Sdb address: " + sdbAddress + "\n" + "Sdb port: "
            + sdbPort + "\n" + "Maximum number of connection: "
            + maxConnection + "\n";
    System.out.println(config);
  }

}
