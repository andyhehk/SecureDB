package edu.hku.sdb.exec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class RemoteQuery extends RemoteSQL {

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteQuery.class);
  private List<BasicTupleSlot> resultLists;
  private int rowIndex = -1;

  public RemoteQuery(String query, Connection connection, RowDesc rowDesc) {
    super(query, connection);
    nodeDesc.setConnection(connection);
    nodeDesc.setRowDesc(rowDesc);
  }

  /*
 * (non-Javadoc)
 *
 * @see edu.hku.sdb.exec.PlanNode#nextTuple()
 */
  @Override
  public BasicTupleSlot nextTuple(){
    rowIndex ++;
    if (rowIndex == resultLists.size()){
      return null;
    }
    return resultLists.get(rowIndex);
  }

  /*
   * (non-Javadoc)
   *
   * @see edu.hku.sdb.exec.PlanNode#init()
   */
  @Override
  public void init() {
    long startTimeStamp = System.currentTimeMillis();
    resultLists = new ArrayList<>();
    try {
      String query = nodeDesc.getQuery();
      java.sql.Statement statement = nodeDesc.getConnection().createStatement();
      LOG.debug("Initialize RemoteSQLDesc with sql " + query);
      ResultSet resultSet = statement.executeQuery(query);
      List<BasicColumnDesc> basicColumnDescList = nodeDesc.getRowDesc().getSignature();

      //buffer all results in resultList
      while (resultSet.next()) {
        TupleSlot tupleSlot = new TupleSlot();
        List<Object> row = new ArrayList<Object>();

        for (int i = 1; i<= basicColumnDescList.size(); i++){
          row.add(resultSet.getObject(i));
        }
        if (row.size() > 0){
          tupleSlot.setRow(row);
          resultLists.add(tupleSlot);
        }
      }
      resultSet.close();
      statement.close();

      // profile server query execution time
      long endTimeStamp = System.currentTimeMillis();
      setServerExecutionTime(endTimeStamp - startTimeStamp);

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean equals(Object object){
    if (!(object instanceof RemoteQuery)){
      return false;
    }
    if (!super.equals((RemoteSQL) object)){
      return false;
    }

    if (!nodeDesc.equals(((RemoteSQL) object).nodeDesc)){
      LOG.debug("nodeDesc instance of RemoteSQL is not equal!");
      return false;
    }

    return true;
  }
}
