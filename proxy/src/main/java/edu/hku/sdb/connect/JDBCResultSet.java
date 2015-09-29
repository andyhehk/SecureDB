package edu.hku.sdb.connect;

/**
 * Created by andy on 9/23/15.
 */
public class JDBCResultSet extends ServerResultSet {
  @Override
  public boolean next() {
    return false;
  }

  @Override
  public Object getObject(int i) {
    return null;
  }
}
