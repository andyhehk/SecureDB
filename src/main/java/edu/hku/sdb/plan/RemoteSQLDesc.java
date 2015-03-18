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

package edu.hku.sdb.plan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoteSQLDesc extends PlanNodeDesc {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteSQLDesc.class);

  private String query;
  private Connection connection;
  private Statement statement;
  private ResultSet resultSet;

  public ResultSet getResultSet() {
    return resultSet;
  }

  public void setResultSet(ResultSet resultSet) {
    this.resultSet = resultSet;
  }

  public Statement getStatement() {
    return statement;
  }

  public void setStatement(Statement statement) {
    this.statement = statement;
  }

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  public void init(){
    try {
      statement = connection.createStatement();
      LOG.debug("Initialize RemoteSQLDesc with sql " + query);
      resultSet = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void close(){
    try {
      resultSet.close();
      statement.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof RemoteSQLDesc)){
      return false;
    }
    LOG.debug("Comparing query\n" + query + "\nwith:\n" + ((RemoteSQLDesc) object).getQuery());
    //TODO: compare if query is equal
    if (!rowDesc.equals(((RemoteSQLDesc) object).getRowDesc())){
      LOG.debug("rowDesc of RemoteSQLDesc is not equal!");
      return false;
    }
    return true;
  }

}
