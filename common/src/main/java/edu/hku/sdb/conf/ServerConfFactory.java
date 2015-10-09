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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ServerConfFactory {

  private static final Logger LOG = LoggerFactory
          .getLogger(ServerConfFactory.class);

  // Server related
  public static String SDB_SERVER_TYPE = "sdb.server.type";
  public static String SDB_SERVER_JDBC_USERNAME = "sdb.server.jdbc.username";
  public static String SDB_SERVER_JDBC_PASSWORD = "sdb.server.jdbc.password";
  public static String SDB_SERVER_JDBC_DATABASE = "sdb.server.jdbc.database";
  public static String SDB_SERVER_JDBC_DRIVERNAME = "sdb.server.jdbc.drivername";
  public static String SDB_SERVER_JDBC_URL = "sdb.server.jdbc.url";
  public static String SDB_SERVER_HADOOP_USERNAME = "sdb.server.hadoop.username";

  public static String SDB_SERVER_ODPS_ACCESSID = "sdb.server.odps.accessID";
  public static String SDB_SERVER_ODPS_ACCESSKEY = "sdb.server.odps.accessKey";
  public static String SDB_SERVER_ODPS_END_POINT = "sdb.server.odps.end_point";
  public static String SDB_SERVER_ODPS_TUNNEL_POINT = "sdb.server.odps.tunnel_point";
  public static String SDB_SERVER_ODPS_PROJECT = "sdb.server.odps.project";

  static public ServerConf getServerConf(Map<String, String> prop) {
    LOG.info("Creating server config for " + prop.get(SDB_SERVER_TYPE));

    if(prop.get(SDB_SERVER_TYPE).equals(ServerType.HIVE.toString())) {

      HiveServerConf hiveServerConf = new HiveServerConf();

      hiveServerConf.setDatabaseName(prop.get(SDB_SERVER_JDBC_DATABASE));
      hiveServerConf.setJdbcDriverName(prop.get(SDB_SERVER_JDBC_DRIVERNAME));
      hiveServerConf.setJdbcUrl(prop.get(SDB_SERVER_JDBC_URL));
      hiveServerConf.setPassword(prop.get(SDB_SERVER_JDBC_PASSWORD));
      hiveServerConf.setUsername(prop.get(SDB_SERVER_JDBC_USERNAME));
      hiveServerConf.setType(ServerType.HIVE);
      hiveServerConf.setHadoopUName(prop.get(SDB_SERVER_HADOOP_USERNAME));
      return hiveServerConf;
    }

    else if(prop.get(SDB_SERVER_TYPE).equals(ServerType.ODPS.toString())) {
      ODPSServerConf odpsServerConf = new ODPSServerConf();
      odpsServerConf.setType(ServerType.ODPS);

      odpsServerConf.setAccessID(prop.get(SDB_SERVER_ODPS_ACCESSID));
      odpsServerConf.setAccessKey(prop.get(SDB_SERVER_ODPS_ACCESSKEY));
      odpsServerConf.setOdpsURL(prop.get(SDB_SERVER_ODPS_END_POINT));
      odpsServerConf.setProject(prop.get(SDB_SERVER_ODPS_PROJECT));
      odpsServerConf.setTunnelURL(prop.get(SDB_SERVER_ODPS_TUNNEL_POINT));

      return odpsServerConf;
    }

    else {

      LOG.error("Unsupported server type: " + prop.get(SDB_SERVER_TYPE));
      System.exit(1);
      return null;
    }


  }


}
