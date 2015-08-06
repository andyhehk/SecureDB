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

package edu.hku.sdb.crypto;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SEKey {

  public SecretKey skey; // stream cipher key
  public byte[] iv; // stream cipher key

  // initiate a key (but is not completed), pls use SE.initKey()
  public SEKey() throws SEException {
    // TODO Auto-generated method stub
    KeyGenerator kgen;
    try {
      kgen = KeyGenerator.getInstance("AES");
    } catch (NoSuchAlgorithmException e) {
      // TODO Auto-generated catch block
      throw new SEException("AES algorithm not found.");
    }
    kgen.init(SearchEncrypt.DEAULTT_LENGTH);

    skey = kgen.generateKey();
  }

  public SEKey(byte[] key) throws SEException {
    skey = new SecretKeySpec(key, "AES");
  }
}
