package com.purbon.kafka.topology.integration;

import com.purbon.kafka.topology.integration.containerutils.ConnectContainer;
import com.purbon.kafka.topology.integration.containerutils.ContainerFactory;
import com.purbon.kafka.topology.integration.containerutils.SaslPlaintextKafkaContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class ConnectManagerIT {

  static SaslPlaintextKafkaContainer container;
  static ConnectContainer connectContainer;

  @BeforeClass
  public static void setup() {
    container = ContainerFactory.fetchSaslKafkaContainer(System.getProperty("cp.version"));
    container.start();
    connectContainer = new ConnectContainer(container);
    connectContainer.start();
  }

  @AfterClass
  public static void after() {
    connectContainer.stop();
    container.stop();
  }

  @Ignore
  public void testSetup() {
    System.out.println(connectContainer.getContainerIpAddress());
  }
}
