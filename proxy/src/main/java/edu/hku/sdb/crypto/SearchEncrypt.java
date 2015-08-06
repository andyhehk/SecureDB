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

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SearchEncrypt {

  public static int DEAULTT_LENGTH = 128;

  private SearchEncrypt() {}

  private static final String SCHEME = "AES/ECB/PKCS5Padding";

  private static SearchEncrypt seinstance = null;

  public SecretKey prkey; // pseudo random function key. note: known to server

  public static SearchEncrypt getInstance() {
    if (seinstance == null) {
      seinstance = new SearchEncrypt();
    }
    return seinstance;
  }

  /**
//   *  Generate the private key and public key at the first time.
   */
  public SEKey keyGen() throws SEException {
    SEKey key = new SEKey();
    try {
      // pseudorandom cipher
      Cipher prCipher = Cipher.getInstance(SCHEME);
      SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
      key.iv = new byte[prCipher.getBlockSize()];
      randomSecureRandom.nextBytes(key.iv);

      KeyGenerator kgen = KeyGenerator.getInstance("AES");
      kgen.init(DEAULTT_LENGTH);

      prkey = kgen.generateKey();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      e.printStackTrace();
    }
    return key;
  }

  /**
   * Reconstruct the private key and public key from byte array
   * @param privateKeyPart1
   * @param publicKey
   * @return
   * @throws SEException
   */
  public SEKey keyGen(byte[] privateKeyPart1, byte[] privateKeyPart2, byte[] publicKey) throws SEException {
    prkey = new SecretKeySpec(publicKey, "AES");
    SEKey key = new SEKey(privateKeyPart1);
    key.iv = privateKeyPart2;

    return key;
  }


  private byte[] doEncrypt(SEKey key, int pos, byte[] data) {
    // prepare a unique combination of key and position of the word
    String temp = "" + pos;
    byte[] iv2 = new byte[key.iv.length];
    byte[] tempbyte = temp.getBytes();
    for (int i = 0;i < key.iv.length;i++) {
      iv2[i] = key.iv[i];
    }
    for (int i = 0;i < tempbyte.length && i < iv2.length;i++) {
      iv2[i] = (byte) (tempbyte[i]^key.iv[i]);
    }

    // iv2 is now the parameter to generate stream cipher key
    try {
      // pseudorandom cipher
      Cipher prCipher = Cipher.getInstance(SCHEME);
      Cipher sCipher = Cipher.getInstance(SCHEME);
      prCipher.init(Cipher.ENCRYPT_MODE, prkey);
      sCipher.init(Cipher.ENCRYPT_MODE, key.skey);


      byte[] streambytes = sCipher.doFinal(iv2);
      // streambytes is the long Si in the searchable encryption

      byte[] si = new byte[data.length-1];
      for (int i = 0;i < si.length;i++) {
        si[i] = streambytes[i%streambytes.length];
      }

      // si is chopped with the desired length

      byte[] fksi = prCipher.doFinal(si);
      // fksi is F_k(S_i) in the searchable encryption
      // we use the same AES cipher for simplicity

      byte[] result = new byte[data.length];

      for (int i = 0;i < data.length-1;i++) {
        result[i] = (byte) (data[i]^si[i]);
      }
      result[data.length-1] = (byte) (fksi[0]^data[data.length-1]);

      return result;
    } catch (NoSuchAlgorithmException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (BadPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return null;
  }

  public byte[] encrypt(SEKey key, int pos, String data) {
    return doEncrypt(key, pos, data.getBytes());
  }

  public String decrypt(SEKey key, int pos, byte[] data) {
    return new String(doEncrypt(key, pos, data));
    // data xor key xor key = data, so decrypt = encrypt
  }

  public boolean search(byte[] encrypted, String keyword) {
    byte[] keywordbyte = keyword.getBytes();
    if (keywordbyte.length != encrypted.length) {
      return false;
    }
    byte[] diff1 = new byte[keywordbyte.length-1];
    for (int i = 0;i < diff1.length;i++) {
      diff1[i] = (byte) (encrypted[i]^keywordbyte[i]);
    }
    byte diff2 = (byte) (encrypted[diff1.length]^keywordbyte[diff1.length]);
    // get diff = word xor encrypted
    // if it is a match, first part of diff generates second part of diff using pseudo random function

    try {
      // pseudorandom cipher
      Cipher prCipher = Cipher.getInstance(SCHEME);
      prCipher.init(Cipher.ENCRYPT_MODE, prkey);

      // si is chopped with the desired length

      byte[] fksi = prCipher.doFinal(diff1);
      // fksi is F_k(S_i) in the searchable encryption
      // we use the same AES cipher for simplicity

      return fksi[0] == diff2;
    } catch (NoSuchAlgorithmException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (BadPaddingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return false;
  }

  private void showBinary(byte[] data) {
    int x;
    for (int i = 0;i < data.length;i++) {
      x = data[i];
      // System.out.println("Data:" + x);
      if (x < 0) {
        System.out.print("1");
        x = -x;
      } else {
        System.out.print("0");
      }
      String temp = "";
      for (int j = 0;j < 7;j++) {
        temp = (x % 2) + temp;
        x /= 2;
      }
      System.out.print(temp + " ");
    }
    System.out.println();
  }

}
