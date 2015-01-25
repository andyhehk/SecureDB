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

public class ConnectionManagerTest{

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        String[] args = new String[1];
        args[0] = "start";
        SdbDriver.main(args);
    }

    public void setUp() throws Exception {

    }


    public void tearDown() throws Exception {

    }

    @Test
    public void testGetConnectionService() throws Exception {
        ConnectionService connectionService = null;
        try {
            connectionService = (ConnectionService) Naming.lookup("//localhost:2019/ConnectionService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        assertNotNull(connectionService);
    }

    @Test
    public void testGetConnection() throws Exception {
        ConnectionService connectionService = null;
        try {
            connectionService = (ConnectionService) Naming.lookup("//localhost:2019/ConnectionService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        Connection connection = connectionService.getConnection();
        assertNotNull(connection);
    }

    @Test
    public void testGetStatement() throws Exception {
        ConnectionService connectionService = null;
        try {
            connectionService = (ConnectionService) Naming.lookup("//localhost:2019/ConnectionService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        Statement statement = connectionService.getConnection().createStatement();
        assertNotNull(statement);
    }

}