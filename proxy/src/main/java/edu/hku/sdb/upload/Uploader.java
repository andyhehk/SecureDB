package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.crypto.SearchEncrypt;

/**
 * Created by andy on 10/7/15.
 */
public abstract class Uploader {

  protected MetaStore metaStore;
  protected String tblName;
  protected ServerConf serverConf;
  protected SearchEncrypt searchEncrypt;
  protected String sourceFilePath;

  public Uploader(MetaStore metaStore, String tblName, ServerConf serverConf) {
    this.metaStore = metaStore;
    this.tblName = tblName;
    this.serverConf = serverConf;
    searchEncrypt = SearchEncrypt.getInstance();
  }

  public abstract void upload();

  public void setSourceFilePath(String sourceFilePath) {
    this.sourceFilePath = sourceFilePath;
  }

  public abstract String getServerFilePath();
}
