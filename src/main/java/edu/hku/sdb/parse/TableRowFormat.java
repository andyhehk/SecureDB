package edu.hku.sdb.parse;


import edu.hku.sdb.catalog.MetaStore;

/**
 * Created by Eric Haibin Lin on 25/3/15.
 */
public class TableRowFormat implements ParseNode {

  private String rowFieldFormat;

  public String getRowFieldFormat() {
    return rowFieldFormat;
  }

  public void setRowFieldFormat(String rowFieldFormat) {
    this.rowFieldFormat = rowFieldFormat;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {

  }

  @Override
  public String toSql() {
    return "ROW FORMAT DELIMITED FIELDS TERMINATED BY " + "'" + rowFieldFormat + "'";

  }

  @Override
  public boolean involveSdbEncrytedCol() {
    return false;
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof TableRowFormat)){
      return false;
    }
    if (!rowFieldFormat.equals(((TableRowFormat) object).getRowFieldFormat())){
      return false;
    }
    return true;
  }

}
