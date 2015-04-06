package edu.hku.sdb.crypto;

import java.math.BigInteger;

public class UDFHandler {

  /**
   * Returns (ae * be) mod n according to SDB Multiplication (EE Mode) protocol
   * @param multiplicand  ae, whose value < n
   * @param multiplier    be, whose value < n
   * @param n
   * @return
   */
	public static BigInteger multi(BigInteger multiplicand,
			BigInteger multiplier, BigInteger n) {
		return (multiplicand.multiply(multiplier)).mod(n);
	}

  /**
   * Calculates the ciphertext ce according to updated p, q values during A's keyUpdate operation.
   * @param a the ciphertext of A, whose value < n
   * @param s the ciphertext of helper S, whose value < n
   * @param p the new p generated in A's keyUpdate operation
   * @param q the new q generated in A's keyUpdate operation
   * @param n
   * @return
   */
	public static BigInteger keyUpdate(BigInteger a, BigInteger s,
			BigInteger p, BigInteger q, BigInteger n) {

    BigInteger sp = s.modPow(p, n);
		return (q.multiply(a).multiply(sp)).mod(n);
	}

  /**
   * Returns (ae + be) mod n according to SDB Addition (EE Mode) protocol
   * @param a   ae, whose value < n
   * @param b   be, whose value < n
   * @param s   se, whose value < n
   * @param pa  the new p generated in A's keyUpdate operation, whose value < n
   * @param qa  the new q generated in A's keyUpdate operation, whose value < n
   * @param pb  the new p generated in B's keyUpdate operation, whose value < n
   * @param qb  the new q generated in B's keyUpdate operation, whose value < n
   * @param n
   * @return
   */
	public static BigInteger add(BigInteger a, BigInteger b, BigInteger s,
			BigInteger pa, BigInteger qa, BigInteger pb, BigInteger qb,
			BigInteger n) {

		BigInteger aUpdated = keyUpdate(a, s, pa, qa, n);
		BigInteger bUpdated = keyUpdate(b, s, pb, qb, n);
		return (aUpdated.add(bUpdated)).mod(n);
	}

  //TODO: test cartesianProduct UDF
	/* this function is not tested yet */
	public static BigInteger cartesianProduct(BigInteger a, BigInteger s, BigInteger p,  BigInteger n) {
		return s.modPow(p, n).multiply(a).mod(n);
	}

  /**
   * Simple BigInteger addition.
   * @param a
   * @param b
   * @return a + b
   */
	public static BigInteger integerAdd(BigInteger a, BigInteger b, BigInteger n) {
		return a.add(b).mod(n);
	}


  /**
   * returns -1 if a is greater than b, 1 if a is less than b.
   * @param a
   * @param b
   * @return either -1, 0 or 1.
   */
  public static int compare(BigInteger a, BigInteger b){
    if (a.equals(BigInteger.ZERO)){
      return 0;
    }
    return b.compareTo(a);
  }
}
