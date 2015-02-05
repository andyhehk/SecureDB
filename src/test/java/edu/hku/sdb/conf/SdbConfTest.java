package edu.hku.sdb.conf;

import edu.hku.sdb.connect.Connection;
import junit.framework.TestCase;

import java.util.Map;

public class SdbConfTest extends TestCase {
  SdbConf sdbConf;


  public void setUp() throws Exception {
    super.setUp();
    sdbConf = new SdbConf("src/test/resources/conf");
  }

  public void testConnectionInit() throws Exception {
    ConnectionConf connectionConf = sdbConf.getConnectionConf();
    assertEquals(connectionConf.getSdbAddress(), "//localhost");
    assertEquals(connectionConf.getSdbPort(), new Integer(2019));
  }
}