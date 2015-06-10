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

import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DbConfTest {

  DbConf metastoreDbConf;
  DbConf serverDbConf;

  @Before
  public void setUp() throws Exception {
    DbConfFactory dbConfFactory = new DbConfFactory();
    metastoreDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-metastore.xml");
    serverDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-server.xml");
  }

  @Test
  public void testGetConnection() throws Exception {
    Connection connection;
    try {
      connection = metastoreDbConf.getConnection();
      assertTrue(connection.isValid(0));
      connection = serverDbConf.getConnection();
      assertTrue(connection.isValid(0));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}