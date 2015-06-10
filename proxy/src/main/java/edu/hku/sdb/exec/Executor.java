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
import edu.hku.sdb.connect.SdbResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.List;

public class Executor {

  private static final Logger LOG = LoggerFactory
          .getLogger(Executor.class);

  public void execute(PlanNode plan, ExecutionState eState, SdbResultSet resultSet) {

    // Only support LocalDecrypt node
    if ((plan instanceof LocalDecrypt)) {
      executeLocalDecrypt(plan, eState, resultSet);
    } else if (plan instanceof CreateTbl) {
      plan.init();
    } else if (plan instanceof RemoteSQL) {
      executeRemoteQuery(plan, eState, resultSet);
    }

  }

  private void executeLocalDecrypt(PlanNode plan, ExecutionState eState, SdbResultSet resultSet) {
    List<Object[]> resultList = resultSet.getTuple();
    BasicTupleSlot basicTupleSlot = plan.nextTuple();
    while (basicTupleSlot != null) {
      resultList.add(basicTupleSlot.nextTuple().toArray());
      basicTupleSlot = plan.nextTuple();
    }

    try {
      //set client & server SdbMetaData
      if (resultSet.getResultSetMetaData() == null) {
        resultSet.setSdbResultSetMetaData(((LocalDecrypt) plan).getResultSetMetaData());
      }
      //set server execution time
      resultSet.setServerTotalTime(((LocalDecrypt) plan).getServerExecutionTime());
      resultSet.setRemoteSQLQuery(((LocalDecrypt) plan).getRemoteSQLQuery());
    } catch (RemoteException e) {
      e.printStackTrace();
    }

    //TODO find a better way to handle batch fetch
    resultSet.setTuple(resultList);
    resultSet.seteState(eState);
    resultSet.setPlanNode(plan);
    resultSet.setExecutor(this);

    LOG.debug(resultList.size() + " records computed, saved in resultSet");
  }

  private void executeRemoteQuery(PlanNode plan, ExecutionState eState, SdbResultSet resultSet) {
    List<Object[]> resultList = resultSet.getTuple();
    BasicTupleSlot basicTupleSlot = plan.nextTuple();
    while (basicTupleSlot != null) {
      resultList.add(basicTupleSlot.nextTuple().toArray());
      basicTupleSlot = plan.nextTuple();
    }

    try {
      //set client & server SdbMetaData
      //TODO set metaData
      if (resultSet.getResultSetMetaData() == null) {
        resultSet.setSdbResultSetMetaData(((RemoteSQL) plan).getResultSetMetaData());
      }
      //set server execution time
      resultSet.setServerTotalTime(((RemoteSQL) plan).getServerExecutionTime());

    } catch (RemoteException e) {
      e.printStackTrace();
    }

    //TODO find a better way to handle batch fetch
    resultSet.setTuple(resultList);
    resultSet.seteState(eState);
    resultSet.setPlanNode(plan);
    resultSet.setExecutor(this);

    LOG.debug(resultList.size() + " records computed, saved in resultSet");
  }
}
