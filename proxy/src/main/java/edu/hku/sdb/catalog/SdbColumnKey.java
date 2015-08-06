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

import java.math.BigInteger;

public class SdbColumnKey extends ColumnKey {
  // The m part of the column key
  private final BigInteger m;
  // The x part of the column key
  private final BigInteger x;

  public SdbColumnKey(String m, String x) {
    this.m =  m != null?  new BigInteger(m): null;
    this.x =  m != null?  new BigInteger(x): null;
  }

  public SdbColumnKey(BigInteger m, BigInteger x) {
    this.m = m;
    this.x = x;
  }

  public SdbColumnKey(SdbColumnKey colKey) {
    this.m = colKey.m;
    this.x = colKey.x;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof SdbColumnKey))
      return false;

    SdbColumnKey colkeyObj = (SdbColumnKey) obj;
    return m.equals(colkeyObj.m) && x.equals(colkeyObj.x);
  }

  /**
   * @return the m
   */
  public BigInteger getM() {
    return m;
  }

  /**
   * @return the x
   */
  public BigInteger getX() {
    return x;
  }


  @Override
  public String toString() {
    return "m: " + m + "; x: " + x;
  }
}
