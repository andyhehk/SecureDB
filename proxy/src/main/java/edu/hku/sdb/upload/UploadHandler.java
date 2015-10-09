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

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.conf.HiveServerConf;
import edu.hku.sdb.conf.JDBCServerConf;
import edu.hku.sdb.conf.ODPSServerConf;
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.connect.JDBCResultSet;
import edu.hku.sdb.crypto.SDBEncrypt;
import edu.hku.sdb.crypto.SearchEncrypt;
import edu.hku.sdb.parse.ColumnDefinition;
import edu.hku.sdb.utility.ParserConstant;
import org.apache.commons.codec.binary.Base64;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Progressable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Major tasks:
 * 1. Read plaintext line by line
 * 2. For every line, generate row-id, encrypt sensitive integer columns with row-id.
 * 3. Upload file to HDFS.
 */
public class UploadHandler {

  private static final Logger LOG = LoggerFactory.getLogger(UploadHandler.class);

  private List<ColumnMeta> trueValueColMetas = new ArrayList<>();
  private List<ColumnMeta> auxiliaryColMetas = new ArrayList<>();
  private String dbName;
  private BigInteger prime1;
  private BigInteger prime2;
  private BigInteger n;
  private BigInteger g;
  private BigInteger totient;

  // Original records are delimited
  private  String defaultRowFormat = "\\|";
  private String rowFormat = defaultRowFormat;

  private SearchEncrypt searchEncrypt;

  //List<ColumnMeta> allCols;

  public UploadHandler(MetaStore metaStore, String tableName, ServerConf
          serverConf) {
    searchEncrypt = SearchEncrypt.getInstance();

    switch (serverConf.getType()) {
      case HIVE:
        dbName = ((JDBCServerConf) serverConf).getDatabaseName();
        break;
      case ODPS:
        dbName = ((ODPSServerConf) serverConf).getProject();
        break;
      default:
        LOG.error("Unsupported server type: " + serverConf.getType());
        System.exit(-1);
        break;
    }

    DBMeta dbMeta = metaStore.getDB(dbName);
    n = new BigInteger(dbMeta.getN());
    prime1 = new BigInteger(dbMeta.getPrime1());
    prime2 = new BigInteger(dbMeta.getPrime2());
    g = new BigInteger(dbMeta.getG());
    totient = SDBEncrypt.evaluateTotient(prime1, prime2);

    List<ColumnMeta> colMetas = metaStore.getTbl(dbName, tableName).getCols();

    for (int columnIndex = 0; columnIndex < colMetas.size(); columnIndex++) {
      ColumnMeta colMeta = colMetas.get(columnIndex);
      if (colMeta.getColName().equals(ColumnDefinition.ROW_ID_COLUMN_NAME) ||
              colMeta.getColName().equals(ColumnDefinition.R_COLUMN_NAME) ||
              colMeta.getColName().equals(ColumnDefinition.S_COLUMN_NAME)) {
        auxiliaryColMetas.add(colMeta);
      }
      else
        trueValueColMetas.add(colMeta);
    }
  }

  public String processLine(String line) {

    StringBuffer newLine = new StringBuffer();
    String[] columnValues = line.split(rowFormat);

    //80 bit long rowId is sufficient
    BigInteger rowId = SDBEncrypt.generatePositiveRandShort(prime1, prime2);

    // Each table has three extra column: row_id, r, s
    for (int columnIndex = 0; columnIndex < trueValueColMetas.size(); columnIndex++) {
      ColumnMeta colMeta = trueValueColMetas.get(columnIndex);

      if (colMeta.getType() instanceof ScalarType) {
        String plaintext = columnValues[columnIndex];
        ScalarType type = (ScalarType) colMeta.getType();

        switch (type.getType()) {
          case INT:
          case TINYINT:
          case SMALLINT:
          case BIGINT:
            if (colMeta.isSensitive()) {
              SdbColumnKey colKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
              String encryptedValue = getSDBEncryptedValue(new BigInteger(plaintext),
                      rowId, colKey);
              newLine = appendColumnString(newLine, columnIndex, encryptedValue);
            } else {
              newLine = appendColumnString(newLine, columnIndex, plaintext);
            }
            break;
          case DECIMAL:
            if (colMeta.isSensitive()) {
              SdbColumnKey colKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
              int scale = type.getScale();
              // TODO: overflow is not checked.
              float valueF = Float.valueOf(plaintext);
              long valueL = (long) (valueF * Math.pow(10, scale));
              String encryptedValue = getSDBEncryptedValue(new BigInteger(String
                      .valueOf(valueL)), rowId, colKey);
              newLine = appendColumnString(newLine, columnIndex, encryptedValue);
            } else
              newLine = appendColumnString(newLine, columnIndex, plaintext);
            break;
          case CHAR:
          case VARCHAR:
          case STRING:
            if (colMeta.isSensitive()) {
              SearchColumnKey searchColKey = new SearchColumnKey(colMeta.getM(),
                      colMeta.getX());
              searchEncrypt.prkey = searchColKey.getPubKey();
              // We only count letters and numbers as keyword.
              String[] parts = plaintext.split("[^a-zA-Z0-9]+");
              StringBuilder encryptedValues = new StringBuilder();
              int count = 0;
              for (int i = 0; i < parts.length; i++) {
                if (parts[i].length() > 2) { // keyword with at least 3 chars
                  if (count > 0) {
                    encryptedValues.append(ParserConstant
                            .DEFAULT_COLLETION_DELIMETER);
                  }
                  encryptedValues.append(Base64.encodeBase64String(searchEncrypt
                          .encrypt(
                                  searchColKey.getPriKey(), count, parts[i])).trim());
                  count++;
                } else {
                  LOG.warn("There is sensitive string with length less than 3.");
                }
              }
              newLine = appendColumnString(newLine, columnIndex, encryptedValues);
            } else {
              newLine = appendColumnString(newLine, columnIndex, plaintext);
            }
            break;
          default:
            // They should not be sensitive, since we have do the checking before.
            newLine = appendColumnString(newLine, columnIndex, plaintext);
            break;
        }
      } else {
        // Nothing to do now.
      }
    }

    for (int columnIndex = 0; columnIndex < auxiliaryColMetas.size(); columnIndex++) {
      ColumnMeta colMeta = auxiliaryColMetas.get(columnIndex);
      if (colMeta.getColName().equals(ColumnDefinition.ROW_ID_COLUMN_NAME)) {
        SdbColumnKey colKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
        BigInteger encryptedR = SDBEncrypt.SIESEncrypt(rowId, colKey.getM(),
                colKey.getX(), n);
        newLine = appendColumnString(newLine, columnValues.length, SDBEncrypt
                .getSecureString(encryptedR));
      } else if (colMeta.getColName().equals(ColumnDefinition.R_COLUMN_NAME)) {
        BigInteger randomInt = SDBEncrypt.generatePositiveRandShort(prime1, prime2);
        SdbColumnKey colKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
        String encryptedR = getSDBEncryptedValue(randomInt, rowId, colKey);
        newLine = appendColumnString(newLine, columnIndex, encryptedR);
      } else if (colMeta.getColName().equals(ColumnDefinition.S_COLUMN_NAME)) {
        SdbColumnKey colKey = new SdbColumnKey(colMeta.getM(), colMeta.getX());
        String encryptedS = getSDBEncryptedValue(new BigInteger("1"), rowId, colKey);
        newLine = appendColumnString(newLine, columnIndex, encryptedS);
      }
    }
    return newLine.toString();
  }

  /**
   * Encrypt the data based on SDB encryption scheme
   *
   * @param value
   * @param rowID
   * @param colKey
   * @return
   */
  private String getSDBEncryptedValue(BigInteger value, BigInteger rowID,
                                      SdbColumnKey
          colKey) {
    BigInteger itemKey = SDBEncrypt.generateItemKeyOp2(colKey.getM(), colKey
                    .getX(),
            rowID, g, n, totient, prime1, prime2);
    BigInteger encryptedValue = SDBEncrypt.encrypt(value, itemKey, n);

    return SDBEncrypt.getSecureString(encryptedValue);
  }

  /**
   * Append a new column value to line, separated by ";"
   *
   * @param newLine
   * @param columnIndex 0 for the beginning of line
   * @param plaintext
   * @return
   */
  private StringBuffer appendColumnString(StringBuffer newLine, int columnIndex,
                                          Object plaintext) {
    if (columnIndex != 0) {
      newLine.append(ParserConstant.DEFAULT_FIELD_DELIMETER);
    }
    newLine.append(plaintext.toString());
    return newLine;
  }

}
