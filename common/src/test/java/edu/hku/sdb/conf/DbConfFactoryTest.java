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

import junit.framework.TestCase;

public class DbConfFactoryTest extends TestCase {

  public void setUp() throws Exception {
    super.setUp();

  }

  public void tearDown() throws Exception {

  }

  public void testGetDbConf() throws Exception {
    DbConfFactory dbConfFactory = new DbConfFactory();
    DbConf clientDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-metastore.xml");
    String clientDatabase = clientDbConf.getDatabaseName();
    String clientUrl = clientDbConf.getJdbcUrl();
    String clientUsername = clientDbConf.getUsername();
    String clientPassword = clientDbConf.getPassword();
    String clientDriverName = clientDbConf.getJdbcDriverName();

    assertEquals(clientUsername, null);
    assertEquals(clientPassword, null);
    assertNotNull(clientDatabase, "metastore_db");
    assertEquals(clientDriverName, "org.apache.derby.jdbc.EmbeddedDriver");
    assertEquals(clientUrl, "jdbc:derby:memory:metastore_db;create=true");

  }
}