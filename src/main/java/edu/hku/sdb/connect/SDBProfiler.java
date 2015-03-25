package edu.hku.sdb.connect;

/**
 * Created by Eric Haibin Lin on 24/3/15.
 */
public class SDBProfiler {

  private long clientTotalTime;
  private long serverTotalTime;
  private long totalTime;

  public long getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(long totalTime) {
    this.totalTime = totalTime;
  }

  public long getClientTotalTime() {
    return clientTotalTime;
  }

  public void setClientTotalTime(long clientTotalTime) {
    this.clientTotalTime = clientTotalTime;
  }

  public long getServerTotalTime() {
    return serverTotalTime;
  }

  public void setServerTotalTime(long serverTotalTime) {
    this.serverTotalTime = serverTotalTime;
  }
}
