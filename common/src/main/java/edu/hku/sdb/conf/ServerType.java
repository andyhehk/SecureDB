package edu.hku.sdb.conf;

/**
 * Created by andy on 9/23/15.
 */
public enum ServerType {
  MYSQL("mysql"),
  HIVE("hive"),
  ODPS("odps");

  private final String description;

  private ServerType(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return description;
  }
}
