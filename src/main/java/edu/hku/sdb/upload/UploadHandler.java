package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Progressable;

import java.io.*;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.CryptoPrimitive;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 12/2/15.
 * Encrypt and upload a plaintext file to HDFS
 *
 * Major tasks:
 * 1. Read plaintext line by line
 * 2. For every line, generate row-id, encrypt sensitive integer columns with row-id.
 * 3. Write file to HDFS.
 */
public class UploadHandler {

  private String HDFS_URL;
  private String HDFS_FILE_PATH;
  private String sourceFile;
  private boolean localMode;
  private FileSystem hdfs;
  private MetaStore metaStore;

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

  public UploadHandler(MetaStore metaStore){
    setMetaStore(metaStore);
  }

  public void upload(){
    BufferedWriter bufferedWriter = getBufferedWriter();
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFile));
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
  }

  /**
   *
   * @return a buffered writer for target file in HDFS
   */
  private BufferedWriter getBufferedWriter() {
    BufferedWriter bufferedWriter = null;
    Configuration configuration = new Configuration();
    if (localMode){
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
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
    } catch (URISyntaxException | IOException e) {
      e.printStackTrace();
    }
    return bufferedWriter;
  }

  private String processLine(String line){
    String newLine = "";
    String[] columnValues = line.split(";");

    //TODO: should programatically get db name
    DBMeta dbMeta = metaStore.getAllDBs().get(0);
    //TODO: should get the specific columns of that table instead of all columns
    List<ColumnMeta> allCols = metaStore.getAllCols();
    BigInteger n = new BigInteger(dbMeta.getN());
    BigInteger p = new BigInteger(dbMeta.getP());
    BigInteger q = new BigInteger(dbMeta.getQ());
    BigInteger g = new BigInteger(dbMeta.getG());
    BigInteger rowId = Crypto.generatePositiveRand(p, q);

    for (int columnIndex = 0; columnIndex < columnValues.length; columnIndex++){

      ColumnMeta columnMeta = allCols.get(columnIndex);

      AbstractPlaintext plaintext;
      if (columnMeta.getType() == DataType.CHAR){
        plaintext = new StringPlaintext();
        plaintext.setPlainText(columnValues[columnIndex]);
      }
      else {
        //For plaintext of integer type, initiate the object with columnKeys
        plaintext = getIntegerPlaintext(columnValues[columnIndex], n, p, q, g, rowId, columnMeta);
      }
      newLine = appendColumnString(newLine, columnIndex, plaintext);
    }
    //Adding rowId column
    BigInteger encryptedR = Crypto.PaillierEncrypt(rowId, p, q);
    newLine = appendColumnString(newLine, columnValues.length, encryptedR);

    //Adding s column
    int sColumnIndex = columnValues.length + 1;
    newLine = appendHelperColumn(newLine, new BigInteger("1"), allCols.get(sColumnIndex), n, p, q, g, rowId, sColumnIndex);

    //Adding r column
    int rColumnIndex = columnValues.length + 2;
    BigInteger randomInt = Crypto.generatePositiveRand(p, q);
    newLine = appendHelperColumn(newLine, randomInt, allCols.get(rColumnIndex), n, p, q, g, rowId, rColumnIndex);

    return newLine + "\n";
  }

  /**
   * Initiate a integerPlaintext object
   * @param columnValue
   * @param n
   * @param p
   * @param q
   * @param g
   * @param rowId
   * @param columnMeta
   * @return
   */
  private IntegerPlaintext getIntegerPlaintext(String columnValue, BigInteger n, BigInteger p, BigInteger q, BigInteger g, BigInteger rowId, ColumnMeta columnMeta) {
    IntegerPlaintext integerPlaintext = new IntegerPlaintext();
    integerPlaintext.setPlainText(columnValue);
    integerPlaintext.setSensitive(columnMeta.isSensitive());
    integerPlaintext.setP(p);
    integerPlaintext.setQ(q);
    integerPlaintext.setG(g);
    integerPlaintext.setN(n);
    integerPlaintext.setRowId(rowId);
    integerPlaintext.setColumnKey(columnMeta.getColkey());
    return integerPlaintext;
  }

  private String appendHelperColumn(String newLine, BigInteger columnValue, ColumnMeta columnMeta, BigInteger n, BigInteger p, BigInteger q, BigInteger g, BigInteger rowId, int rColumnIndex) {
    IntegerPlaintext integerPlaintext = getIntegerPlaintext(columnValue.toString(), n, p, q, g, rowId, columnMeta);
    newLine = appendColumnString(newLine, rColumnIndex, integerPlaintext);
    return newLine;
  }

  /**
   * Append a new column value to line, separated by ";"
   * @param newLine
   * @param columnIndex 0 for the beginning of line
   * @param plaintext
   * @return
   */
  private String appendColumnString(String newLine, int columnIndex, Object plaintext) {
    if (columnIndex != 0){
      newLine += ";";
    }
    newLine += plaintext.toString();
    return newLine;
  }

}
