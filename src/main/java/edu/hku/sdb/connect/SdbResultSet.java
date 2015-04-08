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

package edu.hku.sdb.connect;

import edu.hku.sdb.exec.ExecutionState;
import edu.hku.sdb.exec.Executor;
import edu.hku.sdb.exec.PlanNode;

import java.io.Serializable;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class SdbResultSet extends UnicastRemoteObject implements ResultSet,
    Serializable, Profiler {

  private static final long serialVersionUID = 127L;

  private List<Object[]> tuple;
  private int index;

  private ExecutionState eState;
  private Executor executor;
  private PlanNode planNode;
  private SDBResultSetMetaData sdbResultSetMetaData;

  private SDBProfiler sdbProfiler;
  private String remoteSQLQuery;

  public void setSdbProfiler(SDBProfiler sdbProfiler) {
    this.sdbProfiler = sdbProfiler;
  }

  public SdbResultSet() throws RemoteException {
    super();
    tuple = new ArrayList<>();
    index = -1;
    sdbProfiler = new SDBProfiler();
  }

  public void setRemoteSQLQuery(String remoteSQLQuery) {
    this.remoteSQLQuery = remoteSQLQuery;
  }

  @Override
  public String getRemoteSQLQuery() throws RemoteException {
    return remoteSQLQuery;
  }

  public ResultSetMetaData getResultSetMetaData() throws RemoteException{
    return sdbResultSetMetaData;
  }

  public void setSdbResultSetMetaData(SDBResultSetMetaData sdbResultSetMetaData) {
    this.sdbResultSetMetaData = sdbResultSetMetaData;
  }

  public List<Object[]> getTuple() {
    return tuple;
  }

  public PlanNode getPlanNode() {
    return planNode;
  }

  public void setPlanNode(PlanNode planNode) {
    this.planNode = planNode;
  }

  public Executor getExecutor() {
    return executor;
  }

  public void setExecutor(Executor executor) {
    this.executor = executor;
  }

  public ExecutionState geteState() {
    return eState;
  }

  public void seteState(ExecutionState eState) {
    this.eState = eState;
  }
  public void setTuple(List<Object[]> tuple) {
    this.tuple = tuple;
  }

  @Override
  public boolean next() throws RemoteException {
    if (tuple.size() == 0){
      return false;
    }
    //TODO fetch 50 localDecrypt results per page
    if (index == tuple.size()-1 ){
      return false;
    } else{
      index ++;
    }
    return true;
  }

  /**
   * nullify tuple and other related resources
   * @throws RemoteException
   */
  public void close() throws RemoteException {
    tuple = null;
    index = -1;
    return;
  }

  /**
   * Get the String at column index
   * @param columnIndex
   * @return
   * @throws RemoteException
   */
  public String getString(int columnIndex) throws RemoteException{
    //column index starts from 1 in JDBC
    Object columnData = tuple.get(index)[columnIndex - 1];
    if (columnData instanceof Integer){
      return String.valueOf(columnData);
    }
    return columnData.toString();
  }

  /**
   * Get the integer at column index
   * @param columnIndex the index of column, starting from 1
   * @return integer at specified column
   * @throws RemoteException
   */
  public Integer getInteger(int columnIndex) throws RemoteException{
    //column index starts from 1 in JDBC
    Object columnData = tuple.get(index)[columnIndex - 1];
    if (columnData instanceof BigInteger){
      return Integer.valueOf(columnData.toString());
    }
    if (columnData instanceof String){
      return Integer.valueOf((String) columnData);
    }
    return (Integer) columnData;
  }

  private void getNext(){
    executor.execute(planNode, eState, this);
  }

  @Override
  public long getTotalTime() throws RemoteException {
    return sdbProfiler.getTotalTime();
  }

  @Override
  public long getClientTotalTime() throws RemoteException {
    return sdbProfiler.getClientTotalTime();
  }

  @Override
  public long getClientParseTime() throws RemoteException {
    return sdbProfiler.getClientParseTime();
  }

  @Override
  public long getClientAnalyseTime() throws RemoteException {
    return sdbProfiler.getClientAnalyseTime();
  }

  @Override
  public long getClientRewriteTime() throws RemoteException {
    return sdbProfiler.getClientRewriteTime();
  }

  @Override
  public long getClientExecutionTime() throws RemoteException {
    return sdbProfiler.getClientExecuteTime();
  }

  @Override
  public long getServerTotalTime() throws RemoteException {
    return sdbProfiler.getServerTotalTime();
  }

  public void setTotalTime(long totalTime) {
    sdbProfiler.setTotalTime(totalTime);
  }


  public void setClientTotalTime(long clientTotalTime) {
    sdbProfiler.setClientTotalTime(clientTotalTime);
  }

  public void setServerTotalTime(long serverTotalTime) {
    sdbProfiler.setServerTotalTime(serverTotalTime);
  }
}
