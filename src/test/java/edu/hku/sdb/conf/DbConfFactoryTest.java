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