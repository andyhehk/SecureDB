package edu.hku.sdb.connect;

/**
 * Created by andy on 9/23/15.
 */
public class JDBCServer extends  ServerConnection{

  @Override
  public ServerResultSet executeQuery(String query) {
    return null;
  }

  @Override
  public boolean executeUpdate(String query) {
    return false;
  }
}
