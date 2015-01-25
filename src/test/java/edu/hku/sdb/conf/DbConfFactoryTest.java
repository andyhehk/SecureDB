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
        DbConf clientDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-client.xml");
        String clientDatabase = clientDbConf.getDatabaseName();
        String clientUrl = clientDbConf.getJdbcUrl();
        assertEquals(clientDatabase, "sdbclient");
        assertEquals(clientUrl, "jdbc:mysql://localhost");
    }
}