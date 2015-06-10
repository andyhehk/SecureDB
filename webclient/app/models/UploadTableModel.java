package models;

import edu.hku.sdb.connect.*;

import java.rmi.RemoteException;

public class UploadTableModel {

  public String query;
  public String tableName;
  public String filePath;
  private Statement statement;

  static final String DB_URL = "//localhost:2019/ConnectionService";

  public boolean init() {
    String sql = this.query;
    if (filePath != null && !filePath.equals("")) {
      sql = "LOAD DATA LOCAL INPATH '" + filePath + "' OVERWRITE INTO TABLE " + tableName;
    }
    try {
      Connection connection = ConnectionManager.getConnection(DB_URL, "", "");
      statement = connection.createStatement();
      statement.executeQuery(sql);
    } catch (RemoteException e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

}
