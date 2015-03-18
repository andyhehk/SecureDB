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

package edu.hku.sdb.exec;

import edu.hku.sdb.plan.RemoteSQLDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RemoteSQL extends PlanNode<RemoteSQLDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteSQL.class);

  public RemoteSQL(String query, RowDesc rowDesc) {
    nodeDesc = new RemoteSQLDesc();
    nodeDesc.setRowDesc(rowDesc);
    nodeDesc.setQuery(query);
  }

  public void setConnection(Connection connection){
    nodeDesc.setConnection(connection);
  }

  /*
     * (non-Javadoc)
     *
     * @see edu.hku.sdb.exec.PlanNode#init()
     */
  @Override
  public void init() {
    nodeDesc.init();
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#nextTuple()
   */
  @Override
  public BasicTupleSlot nextTuple() {
    TupleSlot tupleSlot = null;
    try {
      ResultSet resultSet = nodeDesc.getResultSet();
      if (resultSet.next()) {
        tupleSlot = new TupleSlot();
        ArrayList<Object> row = new ArrayList<Object>();
        for (BasicColumnDesc columnDesc : nodeDesc.getRowDesc().getSignature()){
          row.add(resultSet.getObject(columnDesc.getName()));
        }
        tupleSlot.setRow(row);
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
    return tupleSlot;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#close()
   */
  @Override
  public void close() {
    nodeDesc.close();
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof RemoteSQL)){
      LOG.debug("Not an instance of LocalDecrypt!");
      return false;
    }
    if (!nodeDesc.equals((RemoteSQLDesc) ((RemoteSQL) object).nodeDesc)){
      LOG.debug("nodeDesc instance of RemoteSQL is not equal!");
      return false;
    }
    return true;
  }
}
