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

package thep.paillier;

import java.io.Serializable;
import java.math.BigInteger;

public class PublicKey implements Serializable {
  /**
   * The serial version ID
   */
  private static final long serialVersionUID = 1L;
  private int bits;
  private BigInteger n;
  private BigInteger n_squared;
  private BigInteger g; // = n+1

  /**
   * Constructs a public key with the given modulus. Precomputes a few values
   * for more efficient computations.
   *
   * @param bits the number of bits in the key
   * @param n    the public modulus
   */
  public PublicKey(int bits, BigInteger n) {
    this.bits = bits;
    this.n = n;
    this.n_squared = n.multiply(n);
    this.g = n.add(BigInteger.ONE);
  }

  /**
   * Returns the public modulus
   *
   * @return the public modulus
   */
  public BigInteger getN() {
    return n;
  }

  /**
   * Returns the number of bits in the key
   *
   * @return the number of bits in the key
   */
  public int getBits() {
    return bits;
  }

  /**
   * Determines if two public keys are equal based on the value of lambda
   *
   * @param other the other public key to look at
   * @return true if they are equal, false otherwise
   */
  public boolean equals(PublicKey other) {
    return this.n.equals(other.getN());
  }

  /**
   * Returns g
   *
   * @return g
   */
  public BigInteger getG() {
    return g;
  }

  /**
   * Returns N Squared
   *
   * @return N Squared
   */
  public BigInteger getNSquared() {
    return n_squared;
  }
}
