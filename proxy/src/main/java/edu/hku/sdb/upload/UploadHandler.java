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
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.crypto.SDBEncrypt;
import edu.hku.sdb.crypto.SearchEncrypt;
import edu.hku.sdb.parse.ColumnDefinition;
import edu.hku.sdb.parse.TableName;
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
import java.util.List;

/**
 * Major tasks:
 * 1. Read plaintext line by line
 * 2. For every line, generate row-id, encrypt sensitive integer columns with row-id.
 * 3. Upload file to HDFS.
 */
public class UploadHandler {

  private static final Logger LOG = LoggerFactory.getLogger(UploadHandler.class);


  private String HDFS_URL;
  private String HDFS_FILE_PATH;
  private String sourceFile;
  private boolean localMode;
  private FileSystem hdfs;
  private MetaStore metaStore;
  private ServerConf serverConf;
  private List<ColumnMeta> colMetas;
  private TableName tableName;

  // TODO: Need to find a way to assign this value.
  private String dbName = "default";

  private BigInteger prime1;
  private BigInteger prime2;
  private BigInteger n;
  private BigInteger g;
  private BigInteger nPlusOne;
  private BigInteger nSquared;
  private BigInteger totient;

  private String defaultRowFormat = "\\|";
  private String rowFormat = defaultRowFormat;

  private SearchEncrypt searchEncrypt;

  //List<ColumnMeta> allCols;


  public UploadHandler(MetaStore metaStore, TableName tableName, ServerConf serverConf) {
    this.metaStore = metaStore;
    this.tableName = tableName;
    this.serverConf = serverConf;
    searchEncrypt = SearchEncrypt.getInstance();
  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }


  public MetaStore getMetaStore() {
    return metaStore;
  }

  public void setMetaStore(MetaStore metaStore) {
    this.metaStore = metaStore;
  }

  public String getHDFS_FILE_PATH() {
    return HDFS_FILE_PATH;
  }

  public void setHDFS_FILE_PATH(String HDFS_FILE_PATH) {
    this.HDFS_FILE_PATH = HDFS_FILE_PATH;
  }

  public String getHDFS_URL() {
    return HDFS_URL;
  }

  public void setHDFS_URL(String HDFS_URL) {
    this.HDFS_URL = HDFS_URL;
  }

  public String getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
  }

  public boolean isLocalMode() {
    return localMode;
  }

  public void setLocalMode(boolean localMode) {
    this.localMode = localMode;
  }


  public void upload() {

    switch (serverConf.getType()) {
      case HIVE:
        // We assume the default store engine for hive is hdfs
        BufferedWriter bufferedWriter = getHDFSBufferedWriter();
        BufferedReader bufferedReader = null;

        DBMeta dbMeta = metaStore.getDB(dbName);
        n = new BigInteger(dbMeta.getN());
        prime1 = new BigInteger(dbMeta.getPrime1());
        prime2 = new BigInteger(dbMeta.getPrime2());
        g = new BigInteger(dbMeta.getG());
        totient = SDBEncrypt.evaluateTotient(prime1, prime2);
        nPlusOne = n.add(BigInteger.ONE);
        nSquared = n.multiply(n);

        colMetas = metaStore.getTbl(dbName, tableName.getName()).getCols();

        try {
          bufferedReader = new BufferedReader(new FileReader(sourceFile), 32768);
          String line;
          //Read and process plaintext line by line
          while ((line = bufferedReader.readLine()) != null) {
            String newLine = processLine(line);
            bufferedWriter.write(newLine);
          }

          //close resources
          bufferedReader.close();
          bufferedWriter.close();
          hdfs.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      default:
          break;
    }

  }

  /**
   * @return a buffered writer for target file in HDFS
   */
  private BufferedWriter getHDFSBufferedWriter() {
    BufferedWriter bufferedWriter = null;
    Configuration configuration = new Configuration();

    HiveServerConf hiveServerConf = (HiveServerConf) serverConf;

    System.setProperty("HADOOP_USER_NAME", hiveServerConf.getHadoopUName());
    //configuration.
    if (localMode) {
      configuration.set("mapred.job.tracker", "local");
    }
    try {
      hdfs = FileSystem.get(new URI(HDFS_URL), configuration);
      Path file = new Path(HDFS_FILE_PATH);
      //Delete the file if it already exists
      if (hdfs.exists(file)) {
        hdfs.delete(file, true);
      }
      //Create file
      OutputStream os = hdfs.create(file,
              new Progressable() {
                public void progress() {
                }
              });
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"),
              32768);
    } catch (URISyntaxException | IOException e) {
      e.printStackTrace();
    }
    return bufferedWriter;
  }

  public String processLineForTest(String line) {

    DBMeta dbMeta = metaStore.getDB(dbName);
    n = new BigInteger(dbMeta.getN());
    prime1 = new BigInteger(dbMeta.getPrime1());
    prime2 = new BigInteger(dbMeta.getPrime2());
    g = new BigInteger(dbMeta.getG());
    totient = SDBEncrypt.evaluateTotient(prime1, prime2);
    nPlusOne = n.add(BigInteger.ONE);
    nSquared = n.multiply(n);

    return processLine(line);
  }

  private void processLines(BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFile), 32768);
      String line;

      SdbColumnKey [] sdbColumnKeys = new SdbColumnKey[colMetas.size()];
      SearchColumnKey [] searchColumnKeys = new SearchColumnKey[colMetas.size()];

      for (int columnIndex = 0; columnIndex < colMetas.size(); columnIndex++) {
        ColumnMeta colMeta = colMetas.get(columnIndex);

        if(colMeta.getType() instanceof ScalarType) {
          ScalarType type = (ScalarType) colMeta.getType();

          switch (type.getType()) {
            case INT:
            case TINYINT:
            case SMALLINT:
            case BIGINT:
            case DECIMAL:
              // Assume SDB encryption scheme is used.
              sdbColumnKeys[columnIndex] = new SdbColumnKey(colMeta.getM(), colMeta.getX());
              continue;
            case CHAR:
            case VARCHAR:
            case STRING:
              // Assume search encryption scheme is used.
              searchColumnKeys[columnIndex] = new SearchColumnKey(colMeta.getM(), colMeta.getX());
              continue;
            default:
                continue;
          }

        }
      }

      // Read and process plaintext line by line
      // TODO: find a way to reduce the redundant work.
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = processLine(line);
        bufferedWriter.write(newLine);
      }



      //close resources
      bufferedReader.close();
      bufferedWriter.close();
      hdfs.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String processLine(String line) {

    StringBuffer newLine = new StringBuffer();
    String[] columnValues = line.split(rowFormat);

    //80 bit long rowId is sufficient
    BigInteger rowId = SDBEncrypt.generatePositiveRandShort(prime1, prime2);

    // Each table has three extra column: row_id, r, s
    for (int columnIndex = 0; columnIndex < colMetas.size(); columnIndex++) {
      ColumnMeta colMeta = colMetas.get(columnIndex);

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
      } else if (colMeta.getType() instanceof ScalarType) {
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
              long valueL = (long) (valueF * Math.pow(10,scale));
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
              SearchColumnKey searchColKey = new SearchColumnKey(colMeta.getM(),colMeta.getX());
              searchEncrypt.prkey = searchColKey.getPubKey();
              // We only count letters and numbers as keyword.
              String[] parts = plaintext.split("[^a-zA-Z0-9]+");
              StringBuilder encryptedValues = new StringBuilder();
              int count = 0;
              for (int i = 0; i < parts.length; i++) {
                if (parts[i].length() > 2) { // keyword with at least 3 chars
                  if(count > 0)
                    encryptedValues.append(ParserConstant.DEFAULT_COLLETION_DELIMETER);
                  String value = searchEncrypt.encrypt(searchColKey.getPriKey(), count, parts[i]).toString();
                  encryptedValues.append(Base64.encodeBase64String(searchEncrypt.encrypt(
                          searchColKey.getPriKey(), count, parts[i])).trim());
                  count++;
                } else {
                  LOG.warn("There is sensitive string with length less than 3.");
                }
              }
              newLine = appendColumnString(newLine, columnIndex, encryptedValues);
            }
            else {
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

    return newLine.toString() + "\n";
  }

  /**
   * Encrypt the data based on SDB encryption scheme
   *
   * @param value
   * @param rowID
   * @param colKey
   * @return
   */
  private String getSDBEncryptedValue(BigInteger value, BigInteger rowID, SdbColumnKey
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
