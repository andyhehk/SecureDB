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

package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.SdbColumnKey;
import edu.hku.sdb.crypto.SDBEncrypt;

import java.math.BigInteger;

/**
 * Created by Eric Haibin Lin on 14/2/15.
 * An integer plaintext returns itself if it is not sensitive, returns encrypted value with supplied columnKey if so.
 */
public class IntegerPlaintext extends AbstractPlaintext {

  //TODO should use ENC TYPE to determine whether to encrypt the value by Paillier / SIES or secret sharing
  private boolean isSensitive;
  private BigInteger n;
  private BigInteger g;
  private BigInteger prime1;
  private BigInteger prime2;
  private BigInteger totient;
  private BigInteger rowId;
  private SdbColumnKey sdbColumnKey;

  public BigInteger getTotient() {
    return totient;
  }

  public void setTotient(BigInteger totient) {
    this.totient = totient;
  }

  public SdbColumnKey getSdbColumnKey() {
    return sdbColumnKey;
  }

  public void setSdbColumnKey(SdbColumnKey sdbColumnKey) {
    this.sdbColumnKey = sdbColumnKey;
  }

  public BigInteger getRowId() {
    return rowId;
  }

  public void setRowId(BigInteger rowId) {
    this.rowId = rowId;
  }

  public BigInteger getG() {
    return g;
  }

  public void setG(BigInteger g) {
    this.g = g;
  }

  public BigInteger getPrime1() {
    return prime1;
  }

  public void setPrime1(BigInteger prime1) {
    this.prime1 = prime1;
  }

  public BigInteger getPrime2() {
    return prime2;
  }

  public void setPrime2(BigInteger prime2) {
    this.prime2 = prime2;
  }

  public boolean isSensitive() {
    return isSensitive;
  }

  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public BigInteger getN() {
    return n;
  }

  public void setN(BigInteger n) {
    this.n = n;
  }

  @Override
  public String toString() {
    if (!isSensitive) {
      return plainText;
    }
    BigInteger itemKey = SDBEncrypt.generateItemKeyOp2(sdbColumnKey.getM(),
            sdbColumnKey.getX(), rowId, g, n, totient, prime1, prime2);
    BigInteger encryptedValue = SDBEncrypt.encrypt(new BigInteger(plainText),
            itemKey, n);

    return SDBEncrypt.getSecureString(encryptedValue);
  }
}
