package edu.hku.sdb.conf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DbConfTest {

    DbConf clientDbConf;
    DbConf metastoreDbConf;
    DbConf serverDbConf;

    @Before
    public void setUp() throws Exception {
        DbConfFactory dbConfFactory = new DbConfFactory();
        clientDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-client.xml");
        metastoreDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-metastore.xml");
        serverDbConf = dbConfFactory.getDbConf("src/test/resources/conf/sdb-server.xml");
    }
    /**
     * Drop the in-memory database after test.
     */
    @After
    public void clearTestDB() {
        try {
            DriverManager.getConnection("jdbc:derby:memory:sdbclient;drop=true");
            DriverManager.getConnection("jdbc:derby:memory:sdbserver;drop=true");
            DriverManager.getConnection("jdbc:derby:memory:metastore_db;drop=true");
        } catch (SQLException se) {
            if (!se.getSQLState().equals("08006")) {
                // SQLState 08006 indicates a success
                se.printStackTrace();
            }
        }
    }


    @Test
    public void testGetConnection() throws Exception {
        Connection connection;
        try {
            connection = clientDbConf.getConnection();
            assertTrue(connection.isValid(0));
            connection = metastoreDbConf.getConnection();
            assertTrue(connection.isValid(0));
            connection = serverDbConf.getConnection();
            assertTrue(connection.isValid(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}