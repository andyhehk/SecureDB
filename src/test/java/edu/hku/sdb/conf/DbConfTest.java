package edu.hku.sdb.conf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
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