package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.HiveServerConf;
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.utility.ProfileUtil;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Progressable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

/**
 * Created by andy on 10/7/15.
 */
public class HDFSUploader extends Uploader {

  private static final Logger LOG = LoggerFactory.getLogger(HDFSUploader.class);

  private String HDFS_URL;
  private String HDFS_FILE_PATH;
  private boolean localMode;
  private FileSystem hdfs;

  public HDFSUploader(MetaStore metaStore, String tblName, ServerConf serverConf) {
    super(metaStore, tblName, serverConf);

  }

  @Override
  public void upload() {
    final String hdfsURL = System.getenv("HDFS_URL");
    final String userDIR = System.getenv("HDFS_USER_DIR");
    if (hdfsURL == null) {
      LOG.error("Please specify the HDFS URL!");
      System.exit(1);
    }

    if (userDIR == null) {
      LOG.error("Please specify the user directory in HDFS!");
      System.exit(1);
    }
    String serverFilePath = hdfsURL + userDIR + "/" + tblName + new Random()
            .nextInt(60000) + ".txt";
    HDFS_URL = hdfsURL ;
    HDFS_FILE_PATH = serverFilePath;

    LOG.info("Loading data from " + sourceFilePath + " to server " + HDFS_URL);

    ProfileUtil profileUtil = new ProfileUtil();
    LOG.info("Upload time: " + profileUtil.getDuration());

    BufferedWriter bufferedWriter = getHDFSBufferedWriter();
    BufferedReader bufferedReader;

    UploadHandler uploadHandler = new UploadHandler(metaStore,tblName,serverConf);

    try {
      bufferedReader = new BufferedReader(new FileReader(sourceFilePath), 32768);
      String line;
      //Read and process plaintext line by line
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = uploadHandler.processLine(line);
        bufferedWriter.write(newLine + "\n");
      }

      //close resources
      bufferedReader.close();
      bufferedWriter.close();
      hdfs.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @Override
  public String getServerFilePath() {
    return HDFS_FILE_PATH;
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
}
