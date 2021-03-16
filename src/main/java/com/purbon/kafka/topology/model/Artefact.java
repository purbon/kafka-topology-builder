package com.purbon.kafka.topology.model;

public abstract class Artefact {

  private String path;
  private String serverLabel;
  private String name;

  public Artefact(String path, String serverLabel, String name) {
    this.path = path;
    this.serverLabel = serverLabel;
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public String getServerLabel() {
    return serverLabel;
  }

  public String name() {
    return name;
  }
}
