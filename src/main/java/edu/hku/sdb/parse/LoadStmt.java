package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.MetaStore;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class LoadStmt implements ParseNode {

  String filePath;
  TableName tableName;
  boolean overWrite = false;

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  public LoadStmt(String filePath, TableName tableName){
    super();
    setFilePath(filePath);
    setTableName(tableName);
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {

  }

  @Override
  public String toSql() {
    return "LOAD DATA " + (overWrite ? "LOCAL" : "") + " INPATH '" + filePath + "' OVERWRITE INTO TABLE " + tableName.getName();
  }

  @Override
  public boolean involveSdbEncrytedCol() {
    return false;
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof LoadStmt)){
      return false;
    }
    else if (!((LoadStmt) object).getTableName().equals(tableName)){
      return false;
    }
    return filePath.equals(((LoadStmt) object).filePath);
  }
}
