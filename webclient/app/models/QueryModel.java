package models;

import edu.hku.sdb.connect.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class QueryModel {

  public String query;
  private Statement statement;
  private ResultSet resultSet;
  private Profiler profiler;
  private int resultSize = 0;
  private boolean hasResult = false;
  private List<Long> executionTimeList;

  public int getResultSize() {
    return resultSize;
  }

  public void setResultSize(int resultSize) {
    this.resultSize = resultSize;
  }

  public boolean init() {
    if (query == null) {
      return false;
    }
    try {
      Connection connection = ConnectionManager.getConnection(DB_URL, "", "");
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      if (!query.toLowerCase().contains("create")) {
        hasResult = true;
      }
      profiler = statement.getProfiler();
    } catch (RemoteException e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  public boolean isHasResult() {
    return hasResult;
  }

  static final String DB_URL = "//localhost:2019/ConnectionService";

  private List<String> nextRow(int columnCount) {
    List<String> resultRow = new ArrayList<>();
    try {
      if (resultSet.next()) {
        for (int i = 0; i < columnCount; i++) {
          resultRow.add(resultSet.getString(i + 1));
        }
      } else return null;
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    return resultRow;
  }

  public List<String> getResultMetaName() {
    if (hasResult) {
      List<String> resultMetaRow = new ArrayList<>();
      try {
        ResultSetMetaData resultSetMetaData = resultSet.getResultSetMetaData();
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
          resultMetaRow.add(resultSetMetaData.getColumnName(i));
        }
      } catch (RemoteException e) {
        e.printStackTrace();
      }
      return resultMetaRow;
    } else return null;
  }

  public List<List<String>> getResult() {
    if (hasResult) {
      List<List<String>> result = new ArrayList<>();
      int columnCount = 0;
      try {
        columnCount = resultSet.getResultSetMetaData().getColumnCount();
      } catch (RemoteException e) {
        e.printStackTrace();
      }
      List<String> resultRow = nextRow(columnCount);
      resultSize = 1;
      while (resultRow != null) {
        result.add(resultRow);
        resultRow = nextRow(columnCount);
        resultSize++;
      }
      return result;
    } else return null;
  }

  public List<Long> getExecutionTime() {
    if (executionTimeList != null) {
      return executionTimeList;
    }

    executionTimeList = new ArrayList<>();
    try {
      executionTimeList.add(profiler.getServerTotalTime());
      executionTimeList.add(profiler.getClientTotalTime());
      executionTimeList.add(profiler.getClientParseTime());
      executionTimeList.add(profiler.getClientAnalyseTime());
      executionTimeList.add(profiler.getClientRewriteTime());
      executionTimeList.add(profiler.getClientExecutionTime());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    return executionTimeList;
  }

  public long getTotalExecutionTime() {
    try {
      return profiler.getTotalTime();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    return 0;
  }

  //TODO resources should be correctly released
  public boolean close() {
    try {
      statement.close();
      resultSet.close();
      return true;
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    return false;
  }

  public String getRemoteSQLQuery() {
    try {
      return resultSet.getRemoteSQLQuery();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
    return "";
  }

}
