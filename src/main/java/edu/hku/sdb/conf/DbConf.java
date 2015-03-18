/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.conf;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DbConf extends Configuration {
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
      if (username != null && password != null){
        connection = DriverManager.getConnection(jdbcUrl,
                username, password);
      }
      else {
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
