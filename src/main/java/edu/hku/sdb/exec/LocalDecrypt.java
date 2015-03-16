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
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.FieldLiteral;
import edu.hku.sdb.plan.LocalDecryptDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

public class LocalDecrypt extends PlanNode<LocalDecryptDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(LocalDecrypt.class);

  PlanNode child;
  boolean initialized = false;

  public PlanNode getChild() {
    return child;
  }

  public void setChild(PlanNode child) {
    this.child = child;
  }

  public LocalDecrypt(RowDesc rowDesc){
    nodeDesc = new LocalDecryptDesc();
    nodeDesc.setRowDesc(rowDesc);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#init()
   */
  @Override
  public void init() {
    child.init();
    initialized = true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#nextTuple()
   */
  @Override
  public BasicTupleSlot nextTuple() {
    return getNextTupleInternal();
  }

  private BasicTupleSlot getNextTupleInternal() {
    if (!initialized){
      init();
    }

    BasicTupleSlot tupleSlot = child.nextTuple();

    if (tupleSlot != null) {
      List<Object> row = tupleSlot.nextTuple();
      Object rowId = null;
      BigInteger p = nodeDesc.getP();
      BigInteger q = nodeDesc.getP();
      BigInteger g = nodeDesc.getG();
      List<BasicColumnDesc> columnDescList = nodeDesc.getRowDesc().getSignature();

      for (int index = columnDescList.size() - 1; index >= 0; index-- ) {
        BasicColumnDesc columnDesc = columnDescList.get(index);
        if (columnDesc.getName().equals(FieldLiteral.ROW_ID_COLUMN_NAME)){
          BigInteger rowIdEncrypted = new BigInteger((String) row.get(index));

          rowId = Crypto.PaillierDecrypt(rowIdEncrypted, p, q);
        }

        //Decrypt with columnKey if sensitive
        if (((ColumnDesc) columnDesc).isSensitive()) {
          ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
          BigInteger itemKey = Crypto.generateItemKey(columnKey.getM(), columnKey.getX(), (BigInteger) rowId, g, p, q);
          //TODO: decrypt with itemKey
        }
      }
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

  public void setCredential(BigInteger p, BigInteger q, BigInteger n, BigInteger g) {
    nodeDesc.setP(p);
    nodeDesc.setP(q);
    nodeDesc.setP(n);
    nodeDesc.setP(g);
  }
}