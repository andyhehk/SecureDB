package edu.hku.sdb.connect;

/**
 * Created by andy on 9/23/15.
 */
public abstract class ServerConnection {

  public abstract void execute(String command);

  public abstract ServerResultSet executeQuery(String query);

  public abstract int executeUpdate(String query);

  public abstract void close();
}
