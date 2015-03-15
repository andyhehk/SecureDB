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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RowDesc {

  private static final Logger LOG = LoggerFactory
          .getLogger(RowDesc.class);

  private List<BasicColumnDesc> signature;

  public List<BasicColumnDesc> getSignature() {
    return signature;
  }

  public void setSignature(List<BasicColumnDesc> signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object object){
    if (!(object instanceof RowDesc)){
      return false;
    }
    if (!signature.equals(((RowDesc) object).getSignature())){
      LOG.debug("signature of RowDesc is not equal!");
      return false;
    };
    return true;
  }

}
