package edu.hku.sdb.conf;

import java.util.Map;

/**
 * Created by andy on 9/23/15.
 */
public class MetadbConfFactory {

  // Metastore related
  public static String SDB_METASTORE_TYPE = "sdb.metastore.type";
  public static String SDB_METASTORE_USERNAME = "sdb.metastore.username";
  public static String SDB_METASTORE_PASSWORD = "sdb.metastore.password";
  public static String SDB_METASTORE_DATABASE_NAME = "sdb.metastore.database.name";
  public static String SDB_METASTORE_JDBC_DRIVERNAME = "sdb.metastore.jdbc.drivername";
  public static String SDB_METASTORE_JDBC_URL = "sdb.metastore.jdbc.url";


  public static MetadbConf getMetadbConf(Map<String, String> prop) {

    MetadbConf metadbConf = new MetadbConf();
    metadbConf.setDatabaseName(prop.get(SDB_METASTORE_DATABASE_NAME));
    metadbConf.setJdbcDriverName(prop.get(SDB_METASTORE_JDBC_DRIVERNAME));
    metadbConf.setJdbcUrl(prop.get(SDB_METASTORE_JDBC_URL));
    metadbConf.setPassword(prop.get(SDB_METASTORE_PASSWORD));
    metadbConf.setUsername(prop.get(SDB_METASTORE_USERNAME));
    metadbConf.setType(ServerType.HIVE);

    return metadbConf;
  }

}
