package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.TableName;
import edu.hku.sdb.utility.ProfileUtil;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Progressable;

import java.io.*;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
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
  private TableName tableName;

  private BigInteger p;
  private BigInteger q;
  private BigInteger n;
  private BigInteger g;
  private BigInteger nPlusOne;
  private BigInteger nSquared;
  private BigInteger totient;

  private String defaultRowFormat = "\\|";
  private String rowFormat = defaultRowFormat;

  List<ColumnMeta> allCols;


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

  public UploadHandler(MetaStore metaStore, TableName tableName){
    setMetaStore(metaStore);
    setTableName(tableName);
  }

  public void upload(){
    BufferedWriter bufferedWriter = getBufferedWriter();
    BufferedReader bufferedReader = null;

    //TODO: should programatically get db name
    DBMeta dbMeta = metaStore.getAllDBs().get(0);
    n = new BigInteger(dbMeta.getN());
    p = new BigInteger(dbMeta.getP());
    q = new BigInteger(dbMeta.getQ());
    g = new BigInteger(dbMeta.getG());
    totient = Crypto.evaluateTotient(p, q);
    nPlusOne = n.add(BigInteger.ONE);
    nSquared = n.multiply(n);

    //TODO: should get the specific columns of that table instead of all columns
    allCols = metaStore.getTbl(DBMeta.defaultDbName, tableName.getName()).getCols();

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
  }

  /**
   *
   * @return a buffered writer for target file in HDFS
   */
  private BufferedWriter getBufferedWriter() {
    BufferedWriter bufferedWriter = null;
    Configuration configuration = new Configuration();
    System.setProperty("HADOOP_USER_NAME", "haibin");
    //configuration.
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
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"), 32768);
    } catch (URISyntaxException | IOException e) {
      e.printStackTrace();
    }
    return bufferedWriter;
  }

  public String processLineForTest(String line){
    
    DBMeta dbMeta = metaStore.getAllDBs().get(0);
    n = new BigInteger(dbMeta.getN());
    p = new BigInteger(dbMeta.getP());
    q = new BigInteger(dbMeta.getQ());
    g = new BigInteger(dbMeta.getG());
    totient = Crypto.evaluateTotient(p, q);
    nPlusOne = n.add(BigInteger.ONE);
    nSquared = n.multiply(n);
    allCols = metaStore.getTbl(DBMeta.defaultDbName, tableName.getName()).getCols();

    return processLine(line);
  }

  private String processLine(String line){

    StringBuffer newLine = new StringBuffer();
    String[] columnValues = line.split(rowFormat);

    //80 bit long rowId is sufficient
    BigInteger rowId = Crypto.generatePositiveRandShort(p, q);

    for (int columnIndex = 0; columnIndex < columnValues.length; columnIndex++){
      ColumnMeta columnMeta = allCols.get(columnIndex);
      AbstractPlaintext plaintext;

      if (columnMeta.getType() == DataType.CHAR || columnMeta.getType() == DataType.VARCHAR){
        plaintext = new StringPlaintext();
        plaintext.setPlainText(columnValues[columnIndex]);
      } else {
        //For plaintext of integer type, initiate the object with columnKeys
        plaintext = getIntegerPlaintext(columnValues[columnIndex], rowId, columnMeta);
      }
      newLine = appendColumnString(newLine, columnIndex, plaintext);
    }
    //Adding rowId column
    int rowIdColumnIndex = columnValues.length;
    ColumnKey rowIdColumnKey = allCols.get(rowIdColumnIndex).getColkey();
    BigInteger encryptedR = Crypto.SIESEncrypt(rowId, rowIdColumnKey.getM(), rowIdColumnKey.getX(), n);
    newLine = appendColumnString(newLine, columnValues.length, Crypto.getSecureString(encryptedR));

    //Adding s column
    int sColumnIndex = columnValues.length + 1;
    IntegerPlaintext sPlaintext = getIntegerPlaintext("1", rowId, allCols.get(sColumnIndex));
    newLine = appendColumnString(newLine, sColumnIndex, sPlaintext);

    //Adding r column
    int rColumnIndex = columnValues.length + 2;
    //80 bit long r value is sufficient
    BigInteger randomInt = Crypto.generatePositiveRandShort(p, q);
    IntegerPlaintext rPlaintext = getIntegerPlaintext(randomInt.toString(), rowId, allCols.get(rColumnIndex));
    newLine = appendColumnString(newLine, rColumnIndex, rPlaintext);

    return newLine.toString() + "\n";
  }

  /**
   * Initiate a integerPlaintext object
   * @param columnValue
   * @param rowId
   * @param columnMeta
   * @return
   */
  private IntegerPlaintext getIntegerPlaintext(String columnValue, BigInteger rowId, ColumnMeta columnMeta) {
    IntegerPlaintext integerPlaintext = new IntegerPlaintext();
    integerPlaintext.setPlainText(columnValue);
    integerPlaintext.setSensitive(columnMeta.isSensitive());
    integerPlaintext.setP(p);
    integerPlaintext.setQ(q);
    integerPlaintext.setG(g);
    integerPlaintext.setN(n);
    integerPlaintext.setTotient(totient);
    integerPlaintext.setRowId(rowId);
    integerPlaintext.setColumnKey(columnMeta.getColkey());
    return integerPlaintext;
  }

  /**
   * Append a new column value to line, separated by ";"
   * @param newLine
   * @param columnIndex 0 for the beginning of line
   * @param plaintext
   * @return
   */
  private StringBuffer appendColumnString(StringBuffer newLine, int columnIndex, Object plaintext) {
    if (columnIndex != 0){
      newLine.append(";");
    }
    newLine.append(plaintext.toString());
    return newLine;
  }

}
