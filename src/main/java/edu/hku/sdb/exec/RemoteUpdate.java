package edu.hku.sdb.exec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class RemoteUpdate extends RemoteSQL {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteUpdate.class);

  public RemoteUpdate(String query, Connection connection) {
    super(query, connection);
  }

  @Override
  public void init() {
    long startTimeStamp = System.currentTimeMillis();

    try {
      String query = nodeDesc.getQuery();
      java.sql.Statement statement = nodeDesc.getConnection().createStatement();
      statement.executeUpdate(query);
      statement.close();

      // profile server query execution time
      long endTimeStamp = System.currentTimeMillis();
      setServerExecutionTime(endTimeStamp - startTimeStamp);

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public BasicTupleSlot nextTuple() {
    return null;
  }
}
