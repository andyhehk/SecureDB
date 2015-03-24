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

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.connect.ResultSetMetaData;
import edu.hku.sdb.connect.SDBResultSetMetaData;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.FieldLiteral;
import edu.hku.sdb.plan.LocalDecryptDesc;
import edu.hku.sdb.plan.RemoteSQLDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class LocalDecrypt extends PlanNode<LocalDecryptDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(LocalDecrypt.class);

  PlanNode child;
  boolean initialized = false;
  private List<BasicTupleSlot> basicTupleSlotList;
  private int rowIndex = -1;

  public LocalDecrypt(RowDesc rowDesc){
    nodeDesc = new LocalDecryptDesc();
    nodeDesc.setRowDesc(rowDesc);
  }

  public SDBResultSetMetaData getResultSetMetaData(){
    SDBResultSetMetaData sdbMetaData = null;
    try {
      sdbMetaData = new SDBResultSetMetaData();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    List<BasicColumnDesc> basicColumnDescList = nodeDesc.getRowDesc().getSignature();
    //Remove row_id before init resultSetMetaData for localDecrypt
    sdbMetaData.setColumnList(basicColumnDescList.subList(0, basicColumnDescList.size() - 1));
    return sdbMetaData;
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#init()
   */
  @Override
  public void init() {
    child.init();

    // decrypt and buffer result
    basicTupleSlotList = new ArrayList<>();
    BasicTupleSlot tupleSlot = child.nextTuple();
    while (tupleSlot != null){
      List<Object> row = tupleSlot.nextTuple();
      Object rowId = null;
      BigInteger p = nodeDesc.getP();
      BigInteger q = nodeDesc.getQ();
      BigInteger n = nodeDesc.getN();
      BigInteger g = nodeDesc.getG();
      List<BasicColumnDesc> columnDescList = nodeDesc.getRowDesc().getSignature();

      for (int index = columnDescList.size() - 1; index >= 0; index-- ) {
        BasicColumnDesc columnDesc = columnDescList.get(index);
        if (columnDesc.getName().equals(FieldLiteral.ROW_ID_COLUMN_NAME)){
          BigInteger rowIdEncrypted = new BigInteger((String) row.get(index));
          rowId = Crypto.PaillierDecrypt(rowIdEncrypted, p, q);
        }

        // Decrypt with columnKey if sensitive
        else if (((ColumnDesc) columnDesc).isSensitive()) {
          ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
          BigInteger itemKey = Crypto.generateItemKey(columnKey.getM(), columnKey.getX(), (BigInteger) rowId, g, p, q);
          BigInteger cipherText = new BigInteger ((String) row.get(index));
          BigInteger plainText = Crypto.decrypt(cipherText, itemKey, n);
          row.set(index, plainText);
        }
      }
      basicTupleSlotList.add(tupleSlot);
      tupleSlot = child.nextTuple();
    }

    initialized = true;
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#nextTuple()
   */
  @Override
  public BasicTupleSlot nextTuple() {
    if (!initialized){
      init();
    }

    rowIndex ++;
    if (rowIndex == basicTupleSlotList.size()){
      return null;
    }
    return basicTupleSlotList.get(rowIndex);
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#close()
   */
  @Override
  public void close() {
    child.close();
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof LocalDecrypt)){
      LOG.debug("Not an instance of LocalDecrypt!");
      return false;
    }
    else if ( (((LocalDecrypt) object).getChild() == null) != (this.getChild() == null)){
      LOG.debug("child instance of LocalDecrypt is not equal (one of them is null)!");
      return false;
    }
    else if (! ((LocalDecrypt) object).getChild().equals(this.getChild())){
      LOG.debug("child instance of LocalDecrypt is not equal!");
      return false;
    }
    return true;
  }

  public PlanNode getChild() {
    return child;
  }

  public void setChild(PlanNode child) {
    this.child = child;
  }

  public void setCredential(BigInteger p, BigInteger q, BigInteger n, BigInteger g) {
    nodeDesc.setP(p);
    nodeDesc.setQ(q);
    nodeDesc.setN(n);
    nodeDesc.setG(g);
  }

  public long getServerExecutionTime(){
    if (!(child instanceof RemoteSQL)){
      return 0;
    }
    return ((RemoteSQL) child).getServerExecutionTime();
  }

  public String getRemoteSQLQuery(){
    if (child.nodeDesc instanceof RemoteSQLDesc){
      return ((RemoteSQLDesc) child.nodeDesc).getQuery();
    }
    else return "";
  }
}