package edu.hku.sdb.connect;

/**
 * Created by andy on 9/23/15.
 */
public abstract class ServerConnection {

  public abstract ServerResultSet executeQuery(String query);

  public abstract boolean executeUpdate(String query);
}
