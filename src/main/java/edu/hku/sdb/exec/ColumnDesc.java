package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.ColumnKey;

/**
 * Created by Eric Haibin Lin on 13/3/15.
 */
public class ColumnDesc extends BasicColumnDesc {

  private boolean isSensitive;
  private ColumnKey columnKey;

  public void setColumnKey(ColumnKey columnKey) {
    this.columnKey = columnKey;
  }

  public boolean isSensitive() {
    return isSensitive;
  }

  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public ColumnKey getColumnKey() {
    return columnKey;
  }

  public ColumnDesc(String name, String alias, Class clazz, boolean isSensitive, ColumnKey columnKey){
    super(name, alias, clazz);
    setSensitive(isSensitive);
    setColumnKey(columnKey);
  }

}
