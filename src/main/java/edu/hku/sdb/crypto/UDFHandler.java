package edu.hku.sdb.crypto;

import java.math.BigInteger;

public class UDFHandler {

	public static BigInteger multi(BigInteger multiplicand,
			BigInteger multiplier, BigInteger n) {
		return multiplicand.multiply(multiplier).mod(n);
	}

	public static BigInteger keyUpdate(BigInteger a, BigInteger s,
			BigInteger p, BigInteger q, BigInteger n) {

		BigInteger result = q.multiply(a).mod(n).multiply(s.modPow(p, n)).mod(n);
		return result;

	}

	public static BigInteger add(BigInteger a, BigInteger b, BigInteger s,
			BigInteger pa, BigInteger qa, BigInteger pb, BigInteger qb,
			BigInteger n) {

		BigInteger aUpdated = keyUpdate(a, s, pa, qa, n);
		BigInteger bUpdated = keyUpdate(b, s, pb, qb, n);
		BigInteger result = aUpdated.add(bUpdated).mod(n);
		return result;
	}
	
	/* this function is not tested yet */
	public static BigInteger cartesianProduct(BigInteger a, BigInteger s, BigInteger p,  BigInteger n) {
		BigInteger result = s.modPow(p, n).multiply(a).mod(n);
		return result;
	}	
	
	
	public static BigInteger integerAdd(BigInteger a, BigInteger b) {
		BigInteger result = a.add(b);
		return result;
	}	
	
	

}
