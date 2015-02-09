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
    DbConf clientDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-client.xml");
    String clientDatabase = clientDbConf.getDatabaseName();
    String clientUrl = clientDbConf.getJdbcUrl();
    String clientUsername = clientDbConf.getUsername();
    String clientPassword = clientDbConf.getPassword();
    String clientDriverName = clientDbConf.getJdbcDriverName();

    assertEquals(clientUsername, null);
    assertEquals(clientPassword, null);
    assertEquals(clientDatabase, "sdbclient");
    assertEquals(clientDriverName, "org.apache.derby.jdbc.EmbeddedDriver");
    assertEquals(clientUrl, "jdbc:derby:memory:sdbclient;create=true");

  }
}