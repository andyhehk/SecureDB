package edu.hku.sdb.connect;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by andy on 9/30/15.
 */
public class JDBCResultSet implements ServerResultSet {

  private ResultSet resultSet;

  public JDBCResultSet(ResultSet resultSet) {
    this.resultSet = resultSet;
  }

  @Override
  public boolean next() {
    try {
     return resultSet.next();
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Object getObject(int i) {
    try {
      return resultSet.getObject(i);
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }
}
