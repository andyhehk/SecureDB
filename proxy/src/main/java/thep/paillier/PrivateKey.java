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
import java.security.SecureRandom;
import java.util.Random;

import thep.paillier.exceptions.BigIntegerClassNotValid;

public class PrivateKey implements Serializable {
  /**
   * Serial version id
   */
  private static final long serialVersionUID = 1L;
  private PublicKey pub;
  private BigInteger lambda;
  private BigInteger mu;

  /**
   * Constructs a private key with the specified number of bits
   *
   * @param bits the number of bits for the key
   * @throws BigIntegerClassNotValid
   */
  public PrivateKey(int bits) {
    // Create a secure random number generator
    Random rng = new SecureRandom();

    // Generate the random primes
    BigInteger p = new BigInteger(bits / 2, 10, rng);
    BigInteger q = new BigInteger(bits / 2, 10, rng);

    // Compute values
    BigInteger n = p.multiply(q);
    p = p.subtract(BigInteger.ONE); // p is now p-1
    q = q.subtract(BigInteger.ONE); // q is now q-1
    this.lambda = p.multiply(q); // (p-1) * (q-1)

    // Set values
    this.pub = new PublicKey(bits, n);
    this.mu = this.lambda.modInverse(this.pub.getN());
  }

  /**
   * Construct a privateKey with specified p and q
   *
   * @param bits
   * @param p
   * @param q
   */
  public PrivateKey(int bits, BigInteger p, BigInteger q) {

    // Compute values
    BigInteger n = p.multiply(q);
    p = p.subtract(BigInteger.ONE); // p is now p-1
    q = q.subtract(BigInteger.ONE); // q is now q-1
    this.lambda = p.multiply(q); // (p-1) * (q-1)

    // Set values
    this.pub = new PublicKey(bits, n);
    this.mu = this.lambda.modInverse(this.pub.getN());
  }

  /**
   * Returns lambda which is calculated as LCM(p-1,q-1)
   *
   * @return the value for lambda, or LCM(p-1,q-1)
   */
  public BigInteger getLambda() {
    return lambda;
  }

  /**
   * Return a public key associated with this private key
   *
   * @return the public key associated with this private key
   */
  public PublicKey getPublicKey() {
    return pub;
  }

  /*
   * The value x is precomputed only for efficient computations, and
   * should not be used outside of this package.
   */
  BigInteger getMu() {
    return mu;
  }
}
