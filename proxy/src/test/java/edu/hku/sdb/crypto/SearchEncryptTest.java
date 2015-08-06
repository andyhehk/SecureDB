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

import edu.hku.sdb.catalog.SearchColumnKey;

import org.junit.Before;
import org.junit.Test;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Base64;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchEncryptTest {

  SearchEncrypt testObj;

  @Before
  public void prepare() {
    testObj = SearchEncrypt.getInstance();
  }

  @Test
  public void testEncryptAndDecrypt() {
    String testStr = "HelloWorld";
    try {
      SEKey key = testObj.keyGen();
      byte[] cyperText = testObj.encrypt(key, 0, testStr);
      String plainText = testObj.decrypt(key, 0, cyperText);

      assertEquals(testStr, plainText);
    } catch (SEException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testReconstructKey() {
    String testStr = "HelloWorld";
    try {
      SEKey keyOrigin = testObj.keyGen();
      byte[] cyperText = testObj.encrypt(keyOrigin, 0, testStr);

      SearchColumnKey searchColumnKey = new SearchColumnKey(keyOrigin, testObj.prkey);

      testObj.prkey = searchColumnKey.getPubKey();

      String plainText = testObj.decrypt(searchColumnKey.getPriKey(), 0, cyperText);

      assertEquals(testStr, plainText);
    } catch (SEException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testSearch() throws UnsupportedEncodingException {
    String testStr1 = "briton";
    String testStr2 = "Briton";
    try {
      SEKey key = testObj.keyGen();

      String passage = "The 2015 Tour de France was the 102nd edition of the Tour " +
              "de France, one of cycling's three Grand Tours. The 3,360.3 km (2," +
              "088 mi)-long race started in Utrecht, the Netherlands, on 4 July " +
              "2015, and concluded with the Champs-ˆ[lysˆmes stage in Paris, on 26" +
              " July. A total of 198 riders from 22 teams entered the 21-stage " +
              "race, which was won by Chris Froome of Team Sky. The second and " +
              "third places were taken by the Movistar Team riders Nairo Quintana " +
              "and Alejandro Valverde, respectively." +
              "BMC Racing Team's Rohan Dennis won the first stage to take the race" +
              " leader's yellow jersey. Trek Factory Racing rider Fabian " +
              "Cancellara claimed it the following stage, only to lose it to " +
              "crashing out on stage three. Froome held it for the fourth, until a" +
              " three day stint by Etixx-Quick Step's Tony Martin, which came to " +
              "end with his abandonment on the seventh stage. Froome then took " +
              "over the position again. He successfully defended the overall lead " +
              "from attacks by Quintana and other general classification " +
              "contenders until the event's finish in Paris. After the penultimate" +
              " stage that ended on Alpe d'Huez, in which Froome was distanced by " +
              "Quintana, he cemented his final margin of seventy-two seconds." +
              "Froome became the first Briton to win the Tour de France twice, " +
              "after his 2013 victory. He also won the mountains classification. " +
              "Peter Sagan of Tinkoff-Saxo won the points classification. The " +
              "young rider classification was won by Quintana. Movistar Team " +
              "finished as the winners of the team classification, which ranks " +
              "each of the twenty-two teams contesting the race by lowest " +
              "cumulative time.";

      String[] parts = passage.split("[^a-zA-Z0-9]+");
      byte[][] encrypts = new byte[parts.length][];
      int count = 0;
      for (int i = 0; i < parts.length; i++) {
        if (parts[i].length() > 2) { // keyword with at least 3 chars
          encrypts[count] = testObj.encrypt(key, count, parts[i]);
          count++;
        }
      }

      SecretKey pubKey = testObj.prkey;

      String encoded = Base64.encodeBase64String(pubKey.getEncoded());
      byte [] decoded = Base64.decodeBase64(encoded);

      SecretKey prkey = new SecretKeySpec(decoded, "AES");

      testObj.prkey = prkey;

      boolean found = false;
      for (int i = 0; i < count && !found; i++) {
        if (testObj.search(encrypts[i], testStr1)) {
          found = true;
        }
      }

      assertTrue(!found);

      found = false;
      for (int i = 0; i < count && !found; i++) {
        if (testObj.search(encrypts[i], testStr2)) {
          found = true;
        }
      }

      assertTrue(found);

    } catch (SEException e) {
      e.printStackTrace();
    }
  }

}
