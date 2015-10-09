package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.ServerConf;

/**
 * Created by andy on 10/7/15.
 */
public class UploaderFactory {

  public static Uploader getUploader(MetaStore metaStore, String tblName, ServerConf serverConf) {
    switch (serverConf.getType()) {
      case HIVE:
        HDFSUploader hdfsUploader = new HDFSUploader(metaStore, tblName, serverConf);
        return hdfsUploader;
      case ODPS:
        ODPSUploader odpsUploader = new ODPSUploader(metaStore, tblName, serverConf);
        return odpsUploader;
    }

    return null;
  }

}
