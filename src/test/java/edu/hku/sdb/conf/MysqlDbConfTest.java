package edu.hku.sdb.conf;

import junit.framework.TestCase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDbConfTest extends TestCase {

    DbConf clientDbConf;
    DbConf metastoreDbConf;
    public void setUp() throws Exception {
        super.setUp();
        DbConfFactory dbConfFactory = new DbConfFactory();
        clientDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-client.xml");
        metastoreDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-metastore.xml");
    }

    public void tearDown() throws Exception {

    }

    public void testGetConnectionClient() throws Exception {
        Connection connection = clientDbConf.getConnection();
        assertNotNull(connection);
        Statement statement = connection.createStatement();
        assertNotNull(statement);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee;");
        assertNotNull(resultSet);
        while (resultSet.next()){
            int salary = resultSet.getInt("salary");
            assertNotNull(salary);
        }
    }

    public void testGetConnectionMetastore() throws Exception {
        Connection connection = metastoreDbConf.getConnection();
        assertNotNull(connection);
        Statement statement = connection.createStatement();
        assertNotNull(statement);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM column_key;");
        assertNotNull(resultSet);
        while (resultSet.next()){
            String tableName = resultSet.getString("table_name");
            assertNotNull(tableName);
        }
    }
}