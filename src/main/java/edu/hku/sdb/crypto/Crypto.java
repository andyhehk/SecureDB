package edu.hku.sdb.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;

import thep.paillier.EncryptedInteger;
import thep.paillier.PrivateKey;
import thep.paillier.PublicKey;
import thep.paillier.exceptions.BigIntegerClassNotValid;

public class Crypto {

	public static int defaultCertainty = 10;
  public static int ONE_THOUSAND_TWENTY_FOUR = 1024;

	/**
	 * 
	 * @return a random prime number with bit length = 512, certainty = 10
	 */
	public static BigInteger generateRandPrime() {
		return generateRandPrime(512, defaultCertainty);
	}

	/**
	 * 
	 * @param numBits
	 * @param certainty
	 * @return a random prime number with bit length numBits and specified
	 *         certainty
	 */
	private static BigInteger generateRandPrime(int numBits, int certainty) {
		return new BigInteger(numBits, certainty, new SecureRandom());
	}

	/**
	 * 
	 * @param p
	 * @param q
	 * @return the totient of p and q
	 */
	public static BigInteger evaluateTotient(BigInteger p, BigInteger q) {
		return (p.subtract(BigInteger.ONE))
				.multiply(q.subtract(BigInteger.ONE));
	}

	/**
	 * 
	 * @param numBits
	 * @return a positive random number with specified number of bits
	 */
	public static BigInteger generatePositiveRand(int numBits) {
		return new BigInteger(numBits, new SecureRandom());
	}

  public static BigInteger generatePositiveRand(int numBits, BigInteger upperBound){
    BigInteger r = null;
    while(true){
      r = new BigInteger(numBits, new SecureRandom());
      //if rand is less than upperBound
      if (r.compareTo(BigInteger.ZERO) == 1 && r.compareTo(upperBound) == -1) break;
    }
    return r;
  }

	/**
	 * 
	 * @param m
	 * @param x
	 * @param r
	 * @param g
	 * @param p
	 * @param q
	 * @return item key based on m, x, r, g, p, q
	 */
	public static BigInteger generateItemKey(BigInteger m, BigInteger x,
			BigInteger r, BigInteger g, BigInteger p, BigInteger q) {

		BigInteger n = p.multiply(q);
		BigInteger totient = Crypto.evaluateTotient(p, q);
		BigInteger power = r.multiply(x).mod(totient);

		return m.multiply(g.modPow(power, n)).mod(n);
	}

	/**
	 * 
	 * @param plainText
	 * @param itemKey
	 * @param n
	 * @return encrypted value based on plainText, itemKey and n
	 */
	public static BigInteger encrypt(BigInteger plainText, BigInteger itemKey,
			BigInteger n) {

		BigInteger keyInverse = itemKey.modInverse(n);
		return plainText.multiply(keyInverse).mod(n);
	}

	/**
	 * 
	 * @param ciphertext
	 * @param itemKey
	 * @param n
	 * @return decrypted value based on cipherText, itemKey and n
	 */
	public static BigInteger decrypt(BigInteger ciphertext, BigInteger itemKey,
			BigInteger n) {
		return ciphertext.multiply(itemKey).mod(n);
	}

	/**
	 * 
	 * @param plaintext
	 * @param p
	 * @param q
	 * @return encrypted value using Paillier encryption
	 */
	public static BigInteger PailierEncrypt(BigInteger plaintext, BigInteger p,
			BigInteger q) {
		try {
			return new EncryptedInteger(plaintext, new PublicKey(1024,
					p.multiply(q))).getCipherVal();
		} catch (BigIntegerClassNotValid e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param ciphertext
	 * @param p
	 * @param q
	 * @return decrypted value using Paillier encryption
	 */
	public static BigInteger PailierDecrypt(BigInteger ciphertext,
			BigInteger p, BigInteger q) {
		PrivateKey privateKey = new PrivateKey(1024, p, q);
		try {
			return new EncryptedInteger(ciphertext).decrypt(privateKey);
		} catch (BigIntegerClassNotValid e) {
			e.printStackTrace();
		}
		return null;
	}


  public static BigInteger[] keyUpdateClient(BigInteger ma, BigInteger mc,
                                             BigInteger ms, BigInteger xa, BigInteger xc, BigInteger xs,
                                             BigInteger p, BigInteger q){
		BigInteger totient = Crypto.evaluateTotient(p, q);
		BigInteger n = p.multiply(q);

		BigInteger[] newPQ = new BigInteger[2];
		BigInteger newP = xs.modInverse(n).multiply(xc.subtract(xa).mod(totient))
				.mod(totient);
		BigInteger newQ = ms.modPow(newP, n).mod(n).multiply(ma).mod(n)
				.multiply(mc.modInverse(n)).mod(n);
		newPQ[0] = newP;
		newPQ[1] = newQ;

		return newPQ;
	}

}
