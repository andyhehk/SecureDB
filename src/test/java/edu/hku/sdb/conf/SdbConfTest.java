package edu.hku.sdb.conf;

import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SdbConfTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testGetClientdbConf() throws Exception {
        DbConfFactory dbConfFactory = new DbConfFactory();
        DbConf clientDbConf = dbConfFactory.getDbConf("/Users/Yifan/sdb/dev/securedb/target/conf/sdb-client.xml");
        String clientDatabase = clientDbConf.getDatabaseName();
        String clientUrl = clientDbConf.getJdbcUrl();
        assertEquals(clientDatabase, "metastore");
        assertEquals(clientUrl, "jdbc:mysql://localhost");
    }
}