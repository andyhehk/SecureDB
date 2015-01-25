package edu.hku.sdb.conf;

import junit.framework.TestCase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SparksqlDbConfTest extends TestCase {

    DbConf serverDbConf;
    public void setUp() throws Exception {
        super.setUp();
        DbConfFactory dbConfFactory = new DbConfFactory();
        serverDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-server.xml");
    }

    public void tearDown() throws Exception {

    }

    public void testGetConnection() throws Exception {
        Connection connection = serverDbConf.getConnection();
        assertNotNull(connection);
        Statement statement = connection.createStatement();
        assertNotNull(statement);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        assertNotNull(resultSet);
        while (resultSet.next()){
            String salary = resultSet.getString("salary");
            assertNotNull(salary);
        }
    }
}