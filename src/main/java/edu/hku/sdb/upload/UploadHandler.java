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
import java.util.List;

/**
 * Created by Eric Haibin Lin on 12/2/15.
 */
public class UploadHandler {

  private String HDFS_URL;
  private String HDFS_FILE_PATH;
  private String sourceFile;
  private FileSystem hdfs;
  //TODO: replace metaStore with DBMeta/TableMeta
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


  public void upload(){
    BufferedWriter bufferedWriter = getBufferedWriter();
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFile));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = processLine(line);
        bufferedWriter.write(newLine);
      }
      bufferedReader.close();
      bufferedWriter.close();
      hdfs.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private BufferedWriter getBufferedWriter() {
    BufferedWriter bufferedWriter = null;
    Configuration configuration = new Configuration();
    try {
      hdfs = FileSystem.get(new URI(HDFS_URL), configuration);
      Path file = new Path(HDFS_FILE_PATH);
      //TODO: append to file instead of delete
      if (hdfs.exists(file)) {
        hdfs.delete(file, true);
      }
      OutputStream os = hdfs.create(file,
        new Progressable() {
          public void progress() {
          }
      });
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
    } catch (URISyntaxException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return bufferedWriter;
  }


  private String processLine(String line){
    String newLine = "";
    String[] columnValues = line.split(";");

    DBMeta dbMeta = metaStore.getDB("sdbclient");
    List<ColumnMeta> allCols = metaStore.getAllCols();
    BigInteger n = dbMeta.getN();
    BigInteger p = dbMeta.getP();
    BigInteger q = dbMeta.getQ();
    BigInteger g = dbMeta.getG();
    BigInteger rowId = generateRandomInt(n);

    for (int columnIndex = 0; columnIndex < columnValues.length; columnIndex++){

      ColumnMeta columnMeta = allCols.get(columnIndex);

      AbstractPlaintext plaintext;
      if (columnMeta.getType() == DataType.CHAR){
        plaintext = new StringPlaintext();
        plaintext.setPlainText(columnValues[columnIndex]);
      }
      else {
        IntegerPlaintext integerPlaintext = getIntegerPlaintext(columnValues[columnIndex], n, p, q, g, rowId, columnMeta);
        plaintext = integerPlaintext;
      }
      newLine = appendColumnString(newLine, columnIndex, plaintext);
    }

    //Adding rowId column
//    BigInteger encryptedR = Crypto.PailierEncrypt(rowId, p, q);
    //TODO: encrypt R well
    BigInteger encryptedR = rowId;
    newLine = appendColumnString(newLine, columnValues.length, encryptedR);

    //Adding s column
    int sColumnIndex = columnValues.length + 1;
    newLine = appendHelperColumn(newLine, new BigInteger("1"), allCols.get(sColumnIndex), n, p, q, g, rowId, sColumnIndex);

    //Adding r column
    int rColumnIndex = columnValues.length + 2;
    BigInteger randomInt = generateRandomInt(n);
    newLine = appendHelperColumn(newLine, randomInt, allCols.get(rColumnIndex), n, p, q, g, rowId, rColumnIndex);

    return newLine + "\n";
  }

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
    ColumnMeta rColumnMeta = columnMeta;
    IntegerPlaintext integerPlaintext = getIntegerPlaintext(columnValue.toString(), n, p, q, g, rowId, rColumnMeta);
    newLine = appendColumnString(newLine, rColumnIndex, integerPlaintext);
    return newLine;
  }

  private String appendColumnString(String newLine, int columnIndex, Object plaintext) {
    if (columnIndex != 0){
      newLine += ";";
    }
    newLine += plaintext.toString();
    return newLine;
  }

  private BigInteger generateRandomInt(BigInteger n){
    BigInteger r = null;
    while(true){
      //TODO: fix the bitLength of r
      r = Crypto.generatePositiveRand(2);
      if (r.compareTo(BigInteger.ZERO) == 1 && r.compareTo(n) == -1) break;
    }
    return r;
  }

}
