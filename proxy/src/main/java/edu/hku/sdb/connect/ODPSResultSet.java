package edu.hku.sdb.connect;

import com.aliyun.odps.Instance.TaskStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by andy on 9/23/15.
 */
public class ODPSResultSet implements ServerResultSet {

  private static final Logger LOG = LoggerFactory.getLogger(ODPSResultSet.class);

  String[] result;
  // The first tuple is the column header
  int index = 0;

  public ODPSResultSet(Map<String, String> results, Map<String, TaskStatus>
          taskStatus) {

    for(Map.Entry<String, TaskStatus> status : taskStatus.entrySet()) {
      if (TaskStatus.Status.SUCCESS == status.getValue().getStatus()) {
        String resultStr = results.get(status.getKey());
        result = resultStr.split("\\n");
      }
    }
  }

  @Override
  public boolean next() {
    index++;
    if(index < result.length)
      return true;
    else
      return false;
  }

  @Override
  public Object getObject(int i) {
    // The first tuple of ODPS's return answer is column header.
    if(index >= result.length || index == 0)
      return null;
    else {
      String ret =result[index].split(",")[i-1];
      ret = ret.substring(1,ret.length()-1);

      return ret;
    }
  }
}
