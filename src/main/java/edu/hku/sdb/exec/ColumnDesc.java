package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.ColumnKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Eric Haibin Lin on 13/3/15.
 */
public class ColumnDesc extends BasicColumnDesc {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnDesc.class);

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

  @Override
  public boolean equals(Object object){
    if (! (object instanceof ColumnDesc)){
      LOG.debug(object.getClass() + " object is not an instance of " + this.getClass());
      return false;
    }
    if (isSensitive != ((ColumnDesc) object).isSensitive()){
      LOG.debug("isSensitive is not equal!");
      return false;
    }
    if (!columnKey.equals(((ColumnDesc) object).getColumnKey())){
      LOG.debug("columnKey is not equal!");
      return false;
    }
    if (! super.equals((BasicColumnDesc) object)) {
      LOG.debug("super class instance is not equal!");
      return false;
    }
    return true;
  }

}
