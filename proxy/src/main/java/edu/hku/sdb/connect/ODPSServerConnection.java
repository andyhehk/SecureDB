package edu.hku.sdb.connect;

import com.aliyun.odps.Instance;
import com.aliyun.odps.Instance.TaskStatus;
import com.aliyun.odps.Odps;
import com.aliyun.odps.OdpsException;
import com.aliyun.odps.account.Account;
import com.aliyun.odps.account.AliyunAccount;
import com.aliyun.odps.task.SQLTask;
import edu.hku.sdb.conf.ODPSServerConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by andy on 9/23/15.
 */
public class ODPSServerConnection extends ServerConnection {

  private static final Logger LOG = LoggerFactory.getLogger(ODPSServerConnection.class);

  private Odps odps;

  public ODPSServerConnection(ODPSServerConf odpsServerConf) {
    LOG.info("Connecting ODPS with ID: " + odpsServerConf.getAccessID());
    Account account = new AliyunAccount(odpsServerConf.getAccessID(),
            odpsServerConf.getAccessKey());
    odps = new Odps(account);
    String odpsUrl = odpsServerConf.getOdpsURL();
    odps.setEndpoint(odpsUrl);
    odps.setDefaultProject(odpsServerConf.getProject());
    LOG.info("Connection established");
  }

  @Override
  public void execute(String command) {
  }

  @Override
  public ServerResultSet executeQuery(String query) {
    LOG.info("Executing query: " + query);

    // Odps requires query ends with ";"
    query = query + ";";
    try {
      Instance instance = SQLTask.run(odps, query);
      instance.waitForSuccess();

      LOG.info("Query execution finished!");

      LOG.info("Collecting result");
      Map<String, String> results = instance.getTaskResults();
      Map<String, Instance.TaskStatus> taskStatus = instance.getTaskStatus();

      LOG.info("Result collection finished! ");

      ODPSResultSet odpsResultSet = new ODPSResultSet(results,
              taskStatus);

      return odpsResultSet;

    } catch (OdpsException e) {
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public int executeUpdate(String query) {
    LOG.info("Executing update query: " + query);

    query = query + ";";
    try {
      Instance instance = SQLTask.run(odps, query);
      instance.waitForSuccess();

      Map<String, String> results = instance.getTaskResults();
      Map<String, Instance.TaskStatus> taskStatus = instance.getTaskStatus();

      for(Map.Entry<String, TaskStatus> status : taskStatus.entrySet()) {
        if (TaskStatus.Status.SUCCESS == status.getValue().getStatus()) {
          String result = results.get(status.getKey());
          System.out.println(result);
        }
      }

    } catch (OdpsException e) {
      e.printStackTrace();
    }

    return -1;
  }

  @Override
  public void close() {

  }
}
