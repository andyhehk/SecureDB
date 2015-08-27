package models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Database {

  private List<Table> tables;
  private String databaseName;
  private BigInteger databaseSize;

  public Database(String databaseName) {
    this.databaseName = databaseName;
    tables = new ArrayList<Table>();
  }

  public Database(List<Table> tables, String databaseName, BigInteger databaseSize) {
    super();
    this.tables = tables;
    this.databaseName = databaseName;
    this.databaseSize = databaseSize;
  }

  public void addTbl(Table table) {
    tables.add(table);
  }

  public List<Table> getTables() {
    return tables;
  }

  public void setTables(List<Table> tables) {
    this.tables = tables;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public BigInteger getDatabaseSize() {
    return databaseSize;
  }

  public void setDatabaseSize(BigInteger databaseSize) {
    this.databaseSize = databaseSize;
  }

  public static List<Database> getDefaultDatabases() {

    List<Database> defaultDatabases = new LinkedList<Database>();
    defaultDatabases.add(new Database(Table.getDefaultTablesEmployee(),
            "default", new BigInteger("9851")));
    return defaultDatabases;
  }
}
