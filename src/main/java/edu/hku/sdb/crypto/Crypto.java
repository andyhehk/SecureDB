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
  public static int TWO_THOUSAND_FORTY_EIGHT = 2048;

	/**
	 * 
	 * @return a random prime number with bit length = 512, certainty = 10
	 */
	public static BigInteger generateRandPrime() {
		return generateRandPrime(ONE_THOUSAND_TWENTY_FOUR, defaultCertainty);
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
	private static BigInteger generatePositiveRand(int numBits) {
		return new BigInteger(numBits, new SecureRandom());
	}

  /**
   * Generates a positive random number of 2048 bits, which is less than n, and co-prime with both n and totient(n).
   * @param p
   * @param q
   * @return a random positive big integer co-prime with p,q & totient(p,q)
   */
  public static BigInteger generatePositiveRand(BigInteger p, BigInteger q){
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = null;
    while(true){
      r = generatePositiveRand(TWO_THOUSAND_FORTY_EIGHT);
      try{
        BigInteger rReverseN = r.modInverse(n);
        BigInteger rReverseTotient = r.modInverse(totient);
      } catch (ArithmeticException e){
        //r is not co-prime with n or totient(n)
        continue;
      }
      //r is less than n and positive
      if (r.compareTo(BigInteger.ZERO) == 1 && r.compareTo(n) == -1) break;
    }
    return r;
  }

	/**
	 * Generates an item key based on columnKey<m,x> and row-id.
	 * @param m m value of columnKey whose value is less than (p * q)
	 * @param x x value of columnKey whose value is less than (p * q)
	 * @param r row-id, whose value is less than (p * q)
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
    BigInteger grx = g.modPow(power, n);

    return (m.multiply(grx)).mod(n);

  }

	/**
	 * Encrypt a plaintext with its itemKey using secret sharing
	 * @param plainText plaintext to be encrypted
	 * @param itemKey an itemKey with value less than n
	 * @param n
	 * @return encrypted value based on plainText, itemKey and n
	 */
	public static BigInteger encrypt(BigInteger plainText, BigInteger itemKey,
			BigInteger n) {
		BigInteger keyInverse = itemKey.modInverse(n);
		return (plainText.multiply(keyInverse)).mod(n);
	}

	/**
	 * Decrypt a ciphertext with its itemKey using secret sharing
	 * @param ciphertext  ciphertext to be decrypted, whose value < n
	 * @param itemKey     an itemKey                , whose value < n
	 * @param n
	 * @return decrypted value based on cipherText, itemKey and n
	 */
	public static BigInteger decrypt(BigInteger ciphertext, BigInteger itemKey,
			BigInteger n) {
		return (ciphertext.multiply(itemKey)).mod(n);
	}

	/**
	 * Encrypt a plaintext with Pailier Encryption algorithm. Adopted from thep.paillier package
	 * @param plaintext
	 * @param p
	 * @param q
	 * @return encrypted value using Paillier encryption
	 */
	public static BigInteger PaillierEncrypt(BigInteger plaintext, BigInteger p,
			BigInteger q) {
		try {
			return new EncryptedInteger(plaintext, new PublicKey(TWO_THOUSAND_FORTY_EIGHT,
					p.multiply(q))).getCipherVal();
		} catch (BigIntegerClassNotValid e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Decrypt a plaintext with Pailier Decryption algorithm. Adopted from thep.paillier package
	 * @param ciphertext
	 * @param p
	 * @param q
	 * @return decrypted value using Paillier encryption
	 */
	public static BigInteger PaillierDecrypt(BigInteger ciphertext,
			BigInteger p, BigInteger q) {
		PrivateKey privateKey = new PrivateKey(TWO_THOUSAND_FORTY_EIGHT, p, q);
		try {
			return new EncryptedInteger(ciphertext).decrypt(privateKey);
		} catch (BigIntegerClassNotValid e) {
			e.printStackTrace();
		}
		return null;
	}

  /**
   * Update column A with target columnKey<mc,mx> and plaintext [a]
   * @param ma m value of original columnKey A, whose value < (p * q)
   * @param mc m value of target columnKey C,   whose value < (p * q)
   * @param ms m value of columnKey S,          whose value < (p * q)
   * @param xa x value of original columnKey A, whose value < (p * q)
   * @param xc x value of target columnKey C,   whose value < (p * q)
   * @param xs x value of columnKey S,          whose value < (p * q)
   * @param p
   * @param q
   * @return [new_p, new_q] pair generated by SDB KeyUpdate client protocol
   */
  public static BigInteger[] keyUpdateClient(BigInteger ma, BigInteger mc,
                                             BigInteger ms, BigInteger xa, BigInteger xc, BigInteger xs,
                                             BigInteger p, BigInteger q){
    BigInteger[] newPQ = new BigInteger[2];
    BigInteger totient = Crypto.evaluateTotient(p, q);
		BigInteger n = p.multiply(q);

    //prepare numbers for p
    BigInteger xsInverse = xs.modInverse(totient);
    BigInteger xcMinusXa = xc.subtract(xa).mod(totient);
		BigInteger newP = (xsInverse.multiply(xcMinusXa)).mod(totient);

    //prepare numbers for q
    BigInteger msp = ms.modPow(newP, n);
    BigInteger mcInverse = mc.modInverse(n);
		BigInteger newQ = ((ma.mod(n)).multiply(msp).multiply(mcInverse)).mod(n);

		newPQ[0] = newP;
		newPQ[1] = newQ;

		return newPQ;
	}

}
