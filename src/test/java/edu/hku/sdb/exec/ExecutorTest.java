package edu.hku.sdb.exec;

import edu.hku.sdb.connect.ResultSet;
import edu.hku.sdb.connect.SdbResultSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExecutorTest {

  private Executor executor;
  @Before
  public void setUp(){
    executor = new Executor();
  }

  @Test
  public void testExecute() throws Exception {
    PlanNode planNode = null;
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);


  }
}