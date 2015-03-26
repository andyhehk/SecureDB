package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.DataType;

/**
 * Created by Eric Haibin Lin on 26/3/15.
 */
public class ColumnType {

  private DataType dataType;

  public ColumnType(DataType dataType) {
    this.dataType = dataType;
  }

  private int length;

  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof ColumnType)){
      return false;
    }
    return (((ColumnType) object).getDataType() == dataType) && (length == ((ColumnType) object).getLength());
  }

  public String toSql(){
    if (length > 0){
      return dataType + "(" + length + ")";
    }
    return dataType.toString();
  }

}
