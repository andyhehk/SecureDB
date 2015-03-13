package edu.hku.sdb.exec;

import edu.hku.sdb.connect.ResultSet;
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
    ResultSet resultSet = null;
    ExecutionState eState = null;
    executor.execute(planNode, eState, resultSet);

  }
}