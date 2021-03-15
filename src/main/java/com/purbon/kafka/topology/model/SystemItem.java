package com.purbon.kafka.topology.model;

public abstract class SystemItem {

  private String path;
  private String serverConfigLabel;

  public SystemItem(String path, String serverConfigLabel) {
    this.path = path;
    this.serverConfigLabel = serverConfigLabel;
  }

  public String getPath() {
    return path;
  }

  public String getServerConfigLabel() {
    return serverConfigLabel;
  }
}
