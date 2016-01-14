package models;

import javax.xml.crypto.Data;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Databases {
  private static List<Database> databaseList;
  private static boolean isUpdated = false;

  public static List<Database> getDatabases() throws RemoteException {
    if(isUpdated)
      return databaseList;

    else {
      QueryModel queryModel = new QueryModel();
      queryModel.executeQuery("SHOW TABLES");

      databaseList = new ArrayList<Database>();

      List<List<String>> tables = queryModel.getResult();

      Database database = new Database("default");
      for(List<String> tbl : tables) {
        String tblName = tbl.get(0);

        queryModel.executeQuery("DESCRIBE " + tblName);

        List<List<String>> attributes = queryModel.getResult();

        Table table = new Table(tblName);
        for(List<String> attr : attributes) {
          String attName = attr.get(0);
          String type = attr.get(1);
          String isSen = attr.get(2);

          boolean isSensitive = isSen.equals("YES") ? true : false;

          Attribute attribute = new Attribute(attName, isSensitive);
          table.addAtt(attribute);
        }

        database.addTbl(table);
      }

      databaseList.add(database);

      isUpdated = true;
      return databaseList;
    }
  }

  public static void setUpdated(boolean beUpdated) {
    isUpdated = beUpdated;
  }
}