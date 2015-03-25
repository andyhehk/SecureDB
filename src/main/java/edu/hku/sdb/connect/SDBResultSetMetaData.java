package edu.hku.sdb.connect;

import edu.hku.sdb.exec.BasicColumnDesc;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 22/3/15.
 */
public class SDBResultSetMetaData extends UnicastRemoteObject implements ResultSetMetaData,
        Serializable{

  private static final long serialVersionUID = 198103L;
  List<BasicColumnDesc> columnList;

  public SDBResultSetMetaData() throws RemoteException {
    super();
  }

  public List<BasicColumnDesc> getColumnList() {
    return columnList;
  }

  public void setColumnList(List<BasicColumnDesc> columnList) {
    this.columnList = columnList;
  }

  /**
   * Get the designated column's name.
   * @param columnIndex - the first column is 1, the second is 2, ...
   * @return
   */
  public String getColumnName(int columnIndex) throws RemoteException{
    BasicColumnDesc columnDesc = columnList.get(columnIndex - 1);
    String alias = columnDesc.getAlias();
    String name = columnDesc.getName();
    return (alias.equals("") ? name : alias);
  }

  public int getColumnCount() throws RemoteException{
    return columnList.size();
  }

  /**
   * Get the designated column's class.
   * @param columnIndex - the first column is 1, the second is 2, ...
   * @return either String.class or Integer.class
   */
  public Class getColumnType(int columnIndex) throws RemoteException{
    return columnList.get(columnIndex - 1).getClazz();
  }

}
