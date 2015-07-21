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

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.connect.SDBResultSetMetaData;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.BasicFieldLiteral;
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

  public LocalDecrypt(RowDesc rowDesc) {
    nodeDesc = new LocalDecryptDesc();
    nodeDesc.setRowDesc(rowDesc);
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
    sdbMetaData.setColumnList(basicColumnDescList.subList(0, basicColumnDescList
            .size() - 1));
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

    BigInteger prime1 = nodeDesc.getPrime1();
    BigInteger prime2 = nodeDesc.getPrime2();
    BigInteger n = nodeDesc.getN();
    BigInteger g = nodeDesc.getG();
    BigInteger totient = Crypto.evaluateTotient(prime1, prime2);

    // decrypt and buffer result
    basicTupleSlotList = new ArrayList<>();
    BasicTupleSlot tupleSlot = child.nextTuple();
    while (tupleSlot != null) {
      List<Object> row = tupleSlot.nextTuple();
      Object rowId = null;

      List<BasicColumnDesc> columnDescList = nodeDesc.getRowDesc().getSignature();

      // RowID is always at index 0
      for (int index = columnDescList.size() - 1; index >= 0; index--) {
        BasicColumnDesc columnDesc = columnDescList.get(index);
        if (columnDesc.getName().equals(BasicFieldLiteral.ROW_ID_COLUMN_NAME)) {
          ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
          BigInteger rowIdEncrypted = Crypto.getSecureBigInt((String) row.get
                  (index));
          rowId = Crypto.SIESDecrypt(rowIdEncrypted, columnKey.getM(), columnKey
                  .getX(), n);
        }

        // Decrypt with columnKey if sensitive
        else if (((ColumnDesc) columnDesc).isSensitive()) {
          ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
          BigInteger itemKey = Crypto.generateItemKeyOp2(columnKey.getM(),
                  columnKey.getX(), (BigInteger) rowId, g, n, totient, prime1,
                  prime2);
          BigInteger cipherText = Crypto.getSecureBigInt((String) row.get(index));
          BigInteger plainText = Crypto.decrypt(cipherText, itemKey, n);
          if (plainText.compareTo(n.subtract(BigInteger.ONE).divide(new BigInteger
                  ("2"))) >= 0) {
            plainText = plainText.subtract(n);
          }
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
    if (!initialized) {
      init();
    }

    rowIndex++;
    if (rowIndex == basicTupleSlotList.size()) {
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
  public boolean equals(Object object) {
    if (!(object instanceof LocalDecrypt)) {
      LOG.debug("Not an instance of LocalDecrypt!");
      return false;
    } else if ((((LocalDecrypt) object).getChild() == null) != (this.getChild() ==
            null)) {
      LOG.debug("child instance of LocalDecrypt is not equal (one of them is null)" +
              "!");
      return false;
    } else if (!((LocalDecrypt) object).getChild().equals(this.getChild())) {
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
    nodeDesc.setPrime1(p);
    nodeDesc.setPrime2(q);
    nodeDesc.setN(n);
    nodeDesc.setG(g);
  }

  public long getServerExecutionTime() {
    if (!(child instanceof RemoteQuery)) {
      return 0;
    }
    return ((RemoteSQL) child).getServerExecutionTime();
  }

  public String getRemoteSQLQuery() {
    if (child.nodeDesc instanceof RemoteSQLDesc) {
      return ((RemoteSQLDesc) child.nodeDesc).getQuery();
    } else return "";
  }
}