package edu.hku.sdb.connect;

import edu.hku.sdb.driver.SdbDriver;
import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ConnectionManagerTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
        SdbDriver.main(null);
    }

    public void tearDown() throws Exception {

    }

    public void testGetConnectionService() throws Exception {
        ConnectionService connectionService = null;
        try {
            connectionService = (ConnectionService) Naming.lookup("//localhost/ConnectionService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        assertNotNull(connectionService);
    }

    public void testGetConnection() throws Exception {
        ConnectionService connectionService = null;
        try {
            connectionService = (ConnectionService) Naming.lookup("//localhost/ConnectionService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        assertNotNull(connectionService.getConnection());
    }
    

}