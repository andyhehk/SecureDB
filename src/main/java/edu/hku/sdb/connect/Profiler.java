package edu.hku.sdb.connect;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Eric Haibin Lin on 23/3/15.
 */
public interface Profiler  extends Remote {

  public long getTotalTime() throws RemoteException;

  public long getClientTotalTime() throws RemoteException;

  public long getClientParseTime() throws RemoteException;

  public long getClientAnalyseTime() throws RemoteException;

  public long getClientRewriteTime() throws RemoteException;

  public long getClientExecutionTime() throws RemoteException;

  public long getServerTotalTime() throws RemoteException;




}
