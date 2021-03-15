package com.purbon.kafka.topology.model;

import java.util.Collections;
import java.util.List;

public class PlatformSystem<T extends User> {

  private List<T> accessControlLists;
  private List<? extends SystemItem> items;

  public PlatformSystem() {
    this(Collections.emptyList(), Collections.emptyList());
  }

  public PlatformSystem(List<T> accessControlLists) {
    this(accessControlLists, Collections.emptyList());
  }

  public PlatformSystem(List<T> accessControlLists, List<? extends SystemItem> items) {
    this.accessControlLists = accessControlLists;
    this.items = items;
  }

  public List<T> getAccessControlLists() {
    return accessControlLists;
  }

  public List<? extends SystemItem> getItems() {
    return items;
  }
}
