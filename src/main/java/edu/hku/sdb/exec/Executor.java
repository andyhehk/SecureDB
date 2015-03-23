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

    List<Object[]> resultList = resultSet.getTuple();
    BasicTupleSlot basicTupleSlot = plan.nextTuple();
    while (basicTupleSlot != null){
      resultList.add(basicTupleSlot.nextTuple().toArray());
      basicTupleSlot = plan.nextTuple();
    }

    try {
      //set SdbMetaData
      if (resultSet.getResultSetMetaData() == null){
        SDBResultSetMetaData sdbMetaData = new SDBResultSetMetaData();
        List<BasicColumnDesc> basicColumnDescList = plan.nodeDesc.getRowDesc().getSignature();
        //Remove row_id before init resultSetMetaData
        sdbMetaData.setColumnList(basicColumnDescList.subList(0, basicColumnDescList.size() - 1));
        resultSet.setSdbResultSetMetaData(sdbMetaData);
      }
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
