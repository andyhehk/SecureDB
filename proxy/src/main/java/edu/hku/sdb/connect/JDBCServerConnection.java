package edu.hku.sdb.connect;

import edu.hku.sdb.conf.JDBCServerConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by andy on 9/23/15.
 */
public class JDBCServerConnection extends  ServerConnection{

  private static final Logger LOG = LoggerFactory.getLogger(JDBCServerConnection.class);

  private java.sql.Connection connection;
  private java.sql.Statement statement;

  public JDBCServerConnection(JDBCServerConf jdbcServerConf) {

    String jdbcDriverName = jdbcServerConf.getJdbcDriverName();
    String connectionURL = jdbcServerConf.getJdbcUrl() + "/" + jdbcServerConf.getDatabaseName();

    String username = jdbcServerConf.getUsername();
    String password = jdbcServerConf.getPassword();

    try {
      Class.forName(jdbcDriverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    try {
      LOG.info("Connecting to server: " + connectionURL);
      connection = DriverManager.getConnection(connectionURL, username, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void initStatment() {
    try {
      statement = connection.createStatement();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void execute(String command) {
    if(statement == null)
      initStatment();

    try {
      statement.execute(command);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public ServerResultSet executeQuery(String query) {
    if(statement == null)
      initStatment();

    try {
      JDBCResultSet resultSet = new JDBCResultSet(statement.executeQuery(query));

      return resultSet;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public int executeUpdate(String query) {
    if(statement == null)
      initStatment();

    try {
      return statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  @Override
  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
