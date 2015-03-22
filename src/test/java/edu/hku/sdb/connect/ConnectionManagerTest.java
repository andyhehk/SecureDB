package edu.hku.sdb.connect;

import edu.hku.sdb.driver.SdbDriver;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ConnectionManagerTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    String[] args = new String[3];
    args[0] = "start";
    args[1] = "--sdbconf";
    args[2] = "src/test/resources/conf";
    SdbDriver.main(args);
  }

  @Test
  public void testGetStatement() throws Exception {
    ConnectionService connectionService = null;
    try {
      connectionService = (ConnectionService) Naming.lookup("//localhost:2019/ConnectionService");
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      e.printStackTrace();
    }
    assertNotNull(connectionService);
    Connection connection = connectionService.getConnection();
    assertNotNull(connection);
    Statement statement = connection.createStatement();
    assertNotNull(statement);
  }

  @Test
  public void testGetConnection() throws Exception{
    Connection connection = ConnectionManager.getConnection("//localhost:2019/ConnectionService", "", "");
    assertNotNull(connection);
    Statement statement = connection.createStatement();
    assertNotNull(statement);
    ResultSet resultSet = statement.executeQuery("SELECT ID FROM t2");
    assertNotNull(resultSet);
    while (resultSet.next()){
      assertTrue(resultSet.getInteger(1) > 0);
    }
  }

}