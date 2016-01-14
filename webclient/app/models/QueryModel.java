package models;

import edu.hku.sdb.connect.*;

import java.lang.System;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class QueryModel {

  static final String DB_URL = "//localhost:2019/ConnectionService";

  private Statement statement;
  private ResultSet resultSet;
  private Profiler profiler;
  private int resultSize = 0;
  private boolean hasResult = false;
  private List<Long> executionTimeList;

  public QueryModel() {
    try {
      init();
    } catch (RemoteException e) {
      System.out.print(e.getStackTrace());
    }
  }

  public int getResultSize() {
    return resultSize ;
  }

  public void setResultSize(int resultSize) {
    this.resultSize = resultSize;
  }

  private boolean init() throws RemoteException{
    try {
      Connection connection = ConnectionManager.getConnection(DB_URL, "", "");
      statement = connection.createStatement();

    } catch (RemoteException e) {
      throw  e;
    }
    return true;
  }

  public boolean executeQuery(String query) throws RemoteException {

    if(query == null)
      return false;

    try {

      resultSet = statement.executeQuery(query);

      if(query.toLowerCase().contains("create") || query.toLowerCase().contains("drop")) {
        hasResult = false;
        Databases.setUpdated(false);
      }
      else  {
        hasResult = true;
      }

      profiler = statement.getProfiler();
    } catch (RemoteException e) {
      throw  e;
    }

    return true;
  }

  public boolean isHasResult() {
    return hasResult;
  }



  private List<String> nextRow(int columnCount) throws RemoteException{
    List<String> resultRow = new ArrayList<>();

    if (resultSet.next()) {
      for (int i = 0; i < columnCount; i++) {
        resultRow.add(resultSet.getString(i));
      }
    } else return null;

    return resultRow;
  }

  public List<String> getResultMetaName() throws  RemoteException{
    if (hasResult) {
      List<String> resultMetaRow = new ArrayList<>();

      ResultSetMetaData resultSetMetaData = resultSet.getResultSetMetaData();
      if(resultSetMetaData != null) {
        for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
          resultMetaRow.add(resultSetMetaData.getColumnName(i));
        }
      }

      return resultMetaRow;
    } else return null;
  }

  public List<List<String>> getResult() throws  RemoteException{
    if (hasResult) {
      List<List<String>> result = new ArrayList<>();
      int columnCount = 0;

      if(resultSet.getResultSetMetaData() != null) {
        columnCount = resultSet.getResultSetMetaData().getColumnCount();
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
