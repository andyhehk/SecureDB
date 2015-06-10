/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.exec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class RemoteQuery extends RemoteSQL {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteQuery.class);
  private List<BasicTupleSlot> resultLists;
  private int rowIndex = -1;
  boolean initialized = false;

  public RemoteQuery(String query, Connection connection, RowDesc rowDesc) {
    super(query, connection);
    nodeDesc.setConnection(connection);
    nodeDesc.setRowDesc(rowDesc);
  }

  /*
 * (non-Javadoc)
 *
 * @see edu.hku.sdb.exec.PlanNode#nextTuple()
 */
  @Override
  public BasicTupleSlot nextTuple() {
    if (!initialized) {
      init();
    }

    rowIndex++;
    if (rowIndex == resultLists.size()) {
      return null;
    }
    return resultLists.get(rowIndex);
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#init()
   */
  @Override
  public void init() {
    long startTimeStamp = System.currentTimeMillis();
    resultLists = new ArrayList<>();
    try {
      String query = nodeDesc.getQuery();
      java.sql.Statement statement = nodeDesc.getConnection().createStatement();
      LOG.debug("Initialize RemoteSQLDesc with sql " + query);
      ResultSet resultSet = statement.executeQuery(query);
      List<BasicColumnDesc> basicColumnDescList = nodeDesc.getRowDesc().getSignature();

      // profile server query execution time
      long endTimeStamp = System.currentTimeMillis();
      setServerExecutionTime(endTimeStamp - startTimeStamp);

      //buffer all results in resultList
      while (resultSet.next()) {
        TupleSlot tupleSlot = new TupleSlot();
        List<Object> row = new ArrayList<Object>();

        for (int i = 1; i <= basicColumnDescList.size(); i++) {
          row.add(resultSet.getObject(i));
        }
        if (row.size() > 0) {
          tupleSlot.setRow(row);
          resultLists.add(tupleSlot);
        }
      }
      resultSet.close();
      statement.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    initialized = true;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof RemoteQuery)) {
      return false;
    }
    if (!super.equals((RemoteSQL) object)) {
      return false;
    }

    if (!nodeDesc.equals(((RemoteSQL) object).nodeDesc)) {
      LOG.debug("nodeDesc instance of RemoteSQL is not equal!");
      return false;
    }

    return true;
  }
}
