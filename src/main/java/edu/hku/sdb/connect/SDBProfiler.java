package edu.hku.sdb.connect;

/**
 * Created by Eric Haibin Lin on 24/3/15.
 */
public class SDBProfiler {

  private long clientTotalTime;
  private long clientParseTime;
  private long clientAnalyseTime;
  private long clientRewriteTime;
  private long clientExecuteTime;
  private long executeTime;
  private long serverTotalTime;
  private long totalTime;

  public long getExecuteTime() {
    return executeTime;
  }

  public void setExecuteTime(long executeTime) {
    this.executeTime = executeTime;
  }

  public long getClientParseTime() {
    return clientParseTime;
  }

  public void setClientParseTime(long clientParseTime) {
    this.clientParseTime = clientParseTime;
  }

  public void setClientExecuteTime(long clientExecuteTime) {
    this.clientExecuteTime = clientExecuteTime;
  }

  public long getClientAnalyseTime() {
    return clientAnalyseTime;
  }

  public void setClientAnalyseTime(long clientAnalyseTime) {
    this.clientAnalyseTime = clientAnalyseTime;
  }

  public long getClientRewriteTime() {
    return clientRewriteTime;
  }

  public void setClientRewriteTime(long clientRewriteTime) {
    this.clientRewriteTime = clientRewriteTime;
  }

  public long getClientExecuteTime() {
    return clientExecuteTime;
  }

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

  @Override
  public String toString(){
    return  "totalTime: " + totalTime + "ms\n" +
            "serverTotalTime: " + serverTotalTime + "ms\n" +
            "clientTotalTime: " + clientTotalTime + "ms\n" +
            "clientParseTime: " + clientParseTime + "ms\n" +
            "clientAnalyseTime: " + clientAnalyseTime + "ms\n" +
            "clientRewriteTime: " + clientRewriteTime + "ms\n" +
            "clientExecuteTime: " + clientExecuteTime + "ms\n";
  }

}
