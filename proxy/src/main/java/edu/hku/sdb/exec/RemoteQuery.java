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

import edu.hku.sdb.connect.ServerConnection;
import edu.hku.sdb.connect.ServerResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RemoteQuery extends RemoteSQL {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteQuery.class);
  private BasicTupleSlot tupleSlot;
  boolean initialized = false;

  public RemoteQuery(String query, ServerConnection connection, RowDesc rowDesc) {
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
  public List<Object> nextTuple() {
    if (!initialized) {
      init();
    }

    return tupleSlot.nextTuple();
  }

  /**
   * Buffer all the remote query result at the first place.
   */
  @Override
  public void init() {
    if(initialized)
      return;

    long startTimeStamp = System.currentTimeMillis();
    tupleSlot = new TupleSlot();

    String query = nodeDesc.getQuery();
    LOG.debug("Initialize RemoteSQLDesc with sql " + query);
    ServerResultSet resultSet = nodeDesc.getConnection().executeQuery(query);
    List<ColumnDesc> columnDescList = nodeDesc.getRowDesc().getSignature();

    // profile server query execution time
    long endTimeStamp = System.currentTimeMillis();
    setServerExecutionTime(endTimeStamp - startTimeStamp);

    //buffer all results in resultList
    while (resultSet.next()) {
      List<Object> row = new ArrayList<Object>();

      for (int i = 1; i <= columnDescList.size(); i++) {
        row.add(resultSet.getObject(i));
      }
      if (row.size() > 0) {
        tupleSlot.addRow(row);
      }
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
