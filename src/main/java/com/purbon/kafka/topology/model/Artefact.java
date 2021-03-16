package com.purbon.kafka.topology.model;

public abstract class Artefact {

  private String path;
  private String serverLabel;

  public Artefact(String path, String serverLabel) {
    this.path = path;
    this.serverLabel = serverLabel;
  }

  public String getPath() {
    return path;
  }

  public String getServerLabel() {
    return serverLabel;
  }
}
