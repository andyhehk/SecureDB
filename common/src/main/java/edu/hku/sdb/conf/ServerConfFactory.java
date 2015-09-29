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
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.util.Map;

public class ServerConfFactory {

  private static final Logger LOG = LoggerFactory
          .getLogger(ServerConfFactory.class);

  // Server related
  public static String SDB_SERVER_TYPE = "sdb.server.type";
  public static String SDB_SERVER_USERNAME = "sdb.server.username";
  public static String SDB_SERVER_PASSWORD = "sdb.server.password";
  public static String SDB_SERVER_DATABASE_NAME = "sdb.server.database.name";
  public static String SDB_SERVER_JDBC_DRIVERNAME = "sdb.server.jdbc.drivername";
  public static String SDB_SERVER_JDBC_URL = "sdb.server.jdbc.url";

  static public ServerConf createServerConf(Map<String, String> prop) {

    if(prop.get(SDB_SERVER_TYPE).equals(ServerType.HIVE)) {
      JDBCServerConf hiveServerConf = new HiveServerConf();

      hiveServerConf.setDatabaseName(prop.get(SDB_SERVER_DATABASE_NAME));
      hiveServerConf.setJdbcDriverName(prop.get(SDB_SERVER_JDBC_DRIVERNAME));
      hiveServerConf.setJdbcUrl(prop.get(SDB_SERVER_JDBC_URL));
      hiveServerConf.setPassword(prop.get(SDB_SERVER_PASSWORD));
      hiveServerConf.setUsername(prop.get(SDB_SERVER_USERNAME));
      hiveServerConf.setType(ServerType.HIVE);
      return hiveServerConf;
    }

    else if(prop.get(SDB_SERVER_TYPE).equals(ServerType.ODPS)) {
      ODPSServerConf odpsServerConf = new ODPSServerConf();
      odpsServerConf.setType(ServerType.ODPS);
      return odpsServerConf;
    }

    return null;
  }


}
