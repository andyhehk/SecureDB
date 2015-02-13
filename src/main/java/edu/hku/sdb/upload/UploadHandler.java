package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.TableMeta;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Progressable;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Yifan on 12/2/15.
 */
public class UploadHandler {

  private String HDFS_URL;
  private String HDFS_FILE_PATH;
  private String sourceFile;
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


  public void upload(){
    BufferedWriter bufferedWriter = getBufferedWriter();
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFile));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = line;
        //TODO: process the line with meta.
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

  public String encrypt(String plainText){
    return null;
  }

}
