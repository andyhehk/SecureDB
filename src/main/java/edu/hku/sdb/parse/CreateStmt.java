package edu.hku.sdb.parse;

import com.google.common.base.Joiner;
import edu.hku.sdb.catalog.MetaStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 25/3/15.
 */
public class CreateStmt implements ParseNode {

  private static final Logger LOG = LoggerFactory.getLogger(CreateStmt.class);

  private List<BasicFieldLiteral> fieldList;
  private TableName tableName;
  private TableRowFormat tableRowFormat;


  public TableRowFormat getTableRowFormat() {
    return tableRowFormat;
  }

  public void setTableRowFormat(TableRowFormat tableRowFormat) {
    this.tableRowFormat = tableRowFormat;
  }

  public List<BasicFieldLiteral> getFieldList() {
    return fieldList;
  }

  public void setFieldList(List<BasicFieldLiteral> fieldList) {
    this.fieldList = fieldList;
  }

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  @Override
  public void analyze(MetaStore metaDB, ParseNode... fieldSources) throws SemanticException {
    for (BasicFieldLiteral fieldLiteral : fieldList){
      fieldLiteral.analyze(metaDB, tableName);
    }
  }

  @Override
  public String toSql() {

    List<String> items = new ArrayList<String>();
    for (BasicFieldLiteral field : fieldList) {
      items.add(field.toSql());
    }
    String fields = Joiner.on(", ").join(items);

    String rowFormat = "";
    if (tableRowFormat != null ){
      rowFormat = tableRowFormat.toSql();
    }

    return "CREATE TABLE " + tableName.toSql() + " (" + fields + ") " + rowFormat;
  }

  @Override
  public boolean involveSdbEncrytedCol() {
    return false;
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof CreateStmt)){
      LOG.debug("The other object is not an instance of CreateStmt!");
      return false;
    }

    if (!tableName.equals(((CreateStmt) object).getTableName())){
      LOG.debug("The other object's tableName does not match!");
      return false;
    }

    if ((tableRowFormat == null) != (((CreateStmt) object).tableRowFormat == null)) {
      String err = (tableRowFormat == null) ? "Left tableRowFormat is null, while "
              + "tableRowFormat key is: " + ((CreateStmt) object).tableRowFormat: "tableRowFormat is: "
              + tableRowFormat + ", while right tableRowFormat is null";
      LOG.debug(err);
      return false;
    }
    if (tableRowFormat != null) {
      if (!tableRowFormat.equals(((CreateStmt) object).getTableRowFormat())){
        LOG.debug("The other object's tableRowFormat does not match!");
        return false;
      }
    }

    if (!fieldList.equals(((CreateStmt) object).getFieldList())){
      LOG.debug("The other object's fieldList does not match!");
      return false;
    }


    return true;
  }
}
