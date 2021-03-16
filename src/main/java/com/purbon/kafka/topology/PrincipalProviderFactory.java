package com.purbon.kafka.topology;

import com.purbon.kafka.topology.configuration.Configuration;
import com.purbon.kafka.topology.serviceAccounts.CCloudPrincipalProvider;
import com.purbon.kafka.topology.serviceAccounts.VoidPrincipalProvider;

public class PrincipalProviderFactory {

  private Configuration config;

  public PrincipalProviderFactory(Configuration config) {
    this.config = config;
  }

  public PrincipalProvider get() {
    if (config.useConfuentCloud()) {
      return new CCloudPrincipalProvider(config);
    } else {
      return new VoidPrincipalProvider();
    }
  }
}
