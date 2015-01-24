package edu.hku.sdb.conf;

import junit.framework.TestCase;

import java.sql.Connection;
import java.sql.Statement;

public class MysqlDbConfTest extends TestCase {

    DbConf clientDbConf;
    public void setUp() throws Exception {
        super.setUp();
        DbConfFactory dbConfFactory = new DbConfFactory();
        clientDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-client.xml");

    }

    public void tearDown() throws Exception {

    }

    public void testGetConnection() throws Exception {
        Connection connection = clientDbConf.getConnection();
        assertNotNull(connection);
        Statement statement = connection.createStatement();
        assertNotNull(statement);

    }
}