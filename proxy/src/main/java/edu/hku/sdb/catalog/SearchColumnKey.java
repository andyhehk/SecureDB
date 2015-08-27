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

package edu.hku.sdb.catalog;

import edu.hku.sdb.crypto.SEException;
import edu.hku.sdb.crypto.SEKey;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class SearchColumnKey extends ColumnKey {

  private SEKey priKey;
  private SecretKey pubKey;

  public SearchColumnKey(String priKeyString, String pubKeyString) {
    String [] priKeys = priKeyString.split(";");

    if(priKeys.length < 2) {
      throw new RuntimeException("private key for searchable encryption is invalid");
    }

    pubKey = new SecretKeySpec(Base64.getDecoder().decode(pubKeyString), "AES");
    try {
      priKey = new SEKey(Base64.getDecoder().decode(priKeys[0]));
      priKey.iv = Base64.getDecoder().decode(priKeys[1]);
    } catch (SEException e) {
      e.printStackTrace();
    }
  }

  public SearchColumnKey(SEKey priKey, SecretKey pubKey) {
    this.priKey = priKey;
    this.pubKey = pubKey;
  }

  public SEKey getPriKey() {
    return priKey;
  }

  public void setPriKey(SEKey priKey) {
    this.priKey = priKey;
  }

  public SecretKey getPubKey() {
    return pubKey;
  }

  public void setPubKey(SecretKey pubKey) {
    this.pubKey = pubKey;
  }

  public String priKey2String() {
    String skeytext = Base64.getEncoder().encodeToString(priKey.skey.getEncoded());
    String ivtext = Base64.getEncoder().encodeToString(priKey.iv);

    return skeytext + ";" + ivtext;
  }

  public String pubKey2String() {
    String pubKeyStr = Base64.getEncoder().encodeToString(pubKey.getEncoded());

    return pubKeyStr;
  }
}
