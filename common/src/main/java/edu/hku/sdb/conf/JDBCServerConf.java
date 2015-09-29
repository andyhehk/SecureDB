package edu.hku.sdb.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andy on 9/23/15.
 */
public abstract class JDBCServerConf extends ServerConf {

  protected String username;
  protected String password;
  protected String jdbcDriverName;
  protected String databaseName;
  protected String jdbcUrl;

  public void printConfig() {
    String config = "username: " + username + "\n" + "password: " + password
            + "\n" + "jdbcDriverName: " + jdbcDriverName + "\n" + "databaseName: "
            + databaseName + "\n" + "jdbcUrl: " + jdbcUrl + "\n";
    System.out.println(config);
  }

  public Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName(jdbcDriverName);
      if (username != null && password != null) {
        connection = DriverManager.getConnection(jdbcUrl,
                username, password);
      } else {
        connection = DriverManager.getConnection(jdbcUrl);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }

  public String getJdbcDriverName() {
    return jdbcDriverName;
  }

  public void setJdbcDriverName(String jdbcDriverName) {
    this.jdbcDriverName = jdbcDriverName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

}
