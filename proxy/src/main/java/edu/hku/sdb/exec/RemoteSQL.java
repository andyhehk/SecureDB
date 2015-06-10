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

import edu.hku.sdb.connect.SDBResultSetMetaData;
import edu.hku.sdb.plan.RemoteSQLDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class RemoteSQL extends PlanNode<RemoteSQLDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteSQL.class);
  private long serverExecutionTime;

  public RemoteSQL(String query, Connection connection) {
    nodeDesc = new RemoteSQLDesc();
    nodeDesc.setQuery(query);
    nodeDesc.setConnection(connection);
  }

  public long getServerExecutionTime() {
    return serverExecutionTime;
  }

  public void setServerExecutionTime(long serverExecutionTime) {
    this.serverExecutionTime = serverExecutionTime;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#close()
   */
  @Override
  public void close() {
    try {
      nodeDesc.getConnection().close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof RemoteSQL)) {
      LOG.debug("Not an instance of LocalDecrypt!");
      return false;
    }
    if (!nodeDesc.equals(((RemoteSQL) object).nodeDesc)) {
      LOG.debug("nodeDesc instance of RemoteSQL is not equal!");
      return false;
    }
    return true;
  }

  public SDBResultSetMetaData getResultSetMetaData() {
    SDBResultSetMetaData sdbMetaData = null;
    try {
      sdbMetaData = new SDBResultSetMetaData();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    List<BasicColumnDesc> basicColumnDescList = nodeDesc.getRowDesc().getSignature();
    //Remove row_id before init resultSetMetaData for localDecrypt
    sdbMetaData.setColumnList(basicColumnDescList);
    return sdbMetaData;
  }
}
