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
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.plan.LocalDecryptDesc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LocalDecrypt extends PlanNode<LocalDecryptDesc> {

  private static final Logger LOG = LoggerFactory
          .getLogger(LocalDecrypt.class);

  PlanNode child;

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
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.PlanNode#nextTuple()
   */
  @Override
  public BasicTupleSlot nextTuple() {
    BasicTupleSlot tupleSlot = child.nextTuple();

    if (tupleSlot != null) {
      List<Object> row = tupleSlot.nextTuple();
      for (BasicColumnDesc columnDesc : nodeDesc.getRowDesc().getSignature()) {

        //Decrypt with columnKey if sensitive
        if (((ColumnDesc) columnDesc).isSensitive()) {
          ColumnKey columnKey = ((ColumnDesc) columnDesc).getColumnKey();
          //TODO: decrypt with rowId
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
    // TODO Auto-generated method stub

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
}