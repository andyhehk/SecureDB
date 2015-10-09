package edu.hku.sdb.conf;

/**
 * Created by andy on 9/23/15.
 */
public class ODPSServerConf extends ServerConf {

  private String accessID;
  private String accessKey;
  private String odpsURL;
  private String tunnelURL;
  private String project;

  @Override
  void printConfig() {

  }

  public String getAccessID() {
    return accessID;
  }

  public void setAccessID(String accessID) {
    this.accessID = accessID;
  }

  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public String getOdpsURL() {
    return odpsURL;
  }

  public void setOdpsURL(String odpsURL) {
    this.odpsURL = odpsURL;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public String getTunnelURL() {
    return tunnelURL;
  }

  public void setTunnelURL(String tunnelURL) {
    this.tunnelURL = tunnelURL;
  }
}
