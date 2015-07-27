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
import edu.hku.sdb.catalog.PrimitiveType;
import edu.hku.sdb.catalog.ScalarType;
import edu.hku.sdb.connect.SDBResultSetMetaData;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.ColumnDefinition;
import edu.hku.sdb.plan.LocalDecryptDesc;
import edu.hku.sdb.plan.RemoteSQLDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.List;

public class LocalDecrypt extends PlanNode<LocalDecryptDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(LocalDecrypt.class);

  PlanNode child;
  boolean initialized = false;
  private BasicTupleSlot tupleSlot;
  List<ColumnDesc> childColDescList;
  int bufferSize = 100;

  BigInteger prime1;
  BigInteger prime2;
  BigInteger n;
  BigInteger g;
  BigInteger totient;

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
    sdbMetaData.setColumnList(nodeDesc.getRowDesc().getSignature());
    //Remove row_id before init resultSetMetaData for localDecrypt
    return sdbMetaData;
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#init()
   */
  @Override
  public void init() {
    tupleSlot = new TupleSlot();
    prime1 = nodeDesc.getPrime1();
    prime2 = nodeDesc.getPrime2();
    n = nodeDesc.getN();
    g = nodeDesc.getG();
    totient = Crypto.evaluateTotient(prime1, prime2);
    // Get the row signature of the RemoteSQL query
    childColDescList = child.nodeDesc.getRowDesc().getSignature();
    initialized = true;
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

    List<Object> tuple = tupleSlot.nextTuple();

    if(tuple != null) {
      return tuple;
    } else {
      List<Object> childTuple = child.nextTuple();
      int rowCount = 0;

      // Buffer a set of tuple up to the buffer size.
      while (childTuple != null && rowCount <= bufferSize) {
        BigInteger rowId = null;

        // RowID is always at index 0
        for (int index = childColDescList.size() - 1; index >= 0; index--) {
          ColumnDesc columnDesc = childColDescList.get(index);
          if (columnDesc.getName().equals(ColumnDefinition.ROW_ID_COLUMN_NAME)) {
            ColumnKey columnKey = columnDesc.getColKey();
            BigInteger rowIdEncrypted = Crypto.getSecureBigInt((String) childTuple.get
                    (index));
            rowId = Crypto.SIESDecrypt(rowIdEncrypted, columnKey.getM(), columnKey
                    .getX(), n);
          }

          // Decrypt with columnKey if sensitive
          else if (columnDesc.isSensitive()) {
            ColumnKey columnKey = columnDesc.getColKey();
            BigInteger itemKey = Crypto.generateItemKeyOp2(columnKey.getM(),
                    columnKey.getX(), rowId, g, n, totient, prime1,
                    prime2);
            BigInteger cipherText = Crypto.getSecureBigInt((String) childTuple.get(index));
            BigInteger plainText = Crypto.decrypt(cipherText, itemKey, n);
            // Check if it is negative or positive
            if (plainText.compareTo(n.subtract(BigInteger.ONE).divide(new BigInteger
                    ("2"))) >= 0) {
              plainText = plainText.subtract(n);
            }
            childTuple.set(index, plainText);
            if(((ScalarType)columnDesc.getType()).getType() == PrimitiveType.DECIMAL) {
              int scale = ((ScalarType)columnDesc.getType()).getScale();
              long plainValue = plainText.longValue();
              childTuple.set(index, plainValue / Math.pow(10, scale));
            }

          }
        }
        tupleSlot.addRow(childTuple);
        childTuple = child.nextTuple();
        rowCount++;
      }
    }

    return tupleSlot.nextTuple();
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