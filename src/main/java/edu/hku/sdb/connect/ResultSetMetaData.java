package edu.hku.sdb.connect;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Eric Haibin Lin on 22/3/15.
 */
public interface ResultSetMetaData extends Remote {

  public Class getColumnType(int columnIndex) throws RemoteException;

  public int getColumnCount() throws RemoteException;

  public String getColumnName(int columnIndex) throws RemoteException;

}
