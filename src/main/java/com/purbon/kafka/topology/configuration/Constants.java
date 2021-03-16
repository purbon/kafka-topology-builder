package com.purbon.kafka.topology.configuration;

public class Constants {

  public static final String KAFKA_INTERNAL_TOPIC_PREFIXES = "kafka.internal.topic.prefixes";
  public static final String ACCESS_CONTROL_IMPLEMENTATION_CLASS =
      "topology.builder.access.control.class";

  public static final String ACCESS_CONTROL_DEFAULT_CLASS =
      "com.purbon.kafka.topology.roles.SimpleAclsProvider";

  public static final String CONFLUENT_CLOUD_CONTROL_CLASS =
      "com.purbon.kafka.topology.roles.CCloudAclsProvider";

  public static final String RBAC_ACCESS_CONTROL_CLASS =
      "com.purbon.kafka.topology.roles.RBACProvider";

  public static final String STATE_PROCESSOR_IMPLEMENTATION_CLASS =
      "topology.builder.state.processor.class";

  public static final String STATE_PROCESSOR_DEFAULT_CLASS =
      "com.purbon.kafka.topology.backend.FileBackend";

  public static final String REDIS_STATE_PROCESSOR_CLASS =
      "com.purbon.kafka.topology.backend.RedisBackend";

  public static final String REDIS_HOST_CONFIG = "topology.builder.redis.host";
  public static final String REDIS_PORT_CONFIG = "topology.builder.redis.port";

  public static final String MDS_SERVER = "topology.builder.mds.server";
  public static final String MDS_USER_CONFIG = "topology.builder.mds.user";
  public static final String MDS_PASSWORD_CONFIG = "topology.builder.mds.password";

  public static final String MDS_KAFKA_CLUSTER_ID_CONFIG = "topology.builder.mds.kafka.cluster.id";
  static final String MDS_SR_CLUSTER_ID_CONFIG = "topology.builder.mds.schema.registry.cluster.id";
  static final String MDS_KC_CLUSTER_ID_CONFIG = "topology.builder.mds.kafka.connect.cluster.id";

  public static final String CONFLUENT_SCHEMA_REGISTRY_URL_CONFIG = "schema.registry.url";
  static final String CONFLUENT_MONITORING_TOPIC_CONFIG = "confluent.monitoring.topic";
  static final String CONFLUENT_COMMAND_TOPIC_CONFIG = "confluent.command.topic";
  static final String CONFLUENT_METRICS_TOPIC_CONFIG = "confluent.metrics.topic";

  public static final String TOPIC_PREFIX_FORMAT_CONFIG = "topology.topic.prefix.format";
  public static final String PROJECT_PREFIX_FORMAT_CONFIG = "topology.project.prefix.format";
  public static final String TOPIC_PREFIX_SEPARATOR_CONFIG = "topology.topic.prefix.separator";
  public static final String TOPOLOGY_VALIDATIONS_CONFIG = "topology.validations";
  public static final String CONNECTOR_ALLOW_TOPIC_CREATE = "topology.connector.allow.topic.create";

  static final String TOPOLOGY_FILE_TYPE = "topology.file.type";

  public static final String OPTIMIZED_ACLS_CONFIG = "topology.acls.optimized";

  public static final String ALLOW_DELETE_TOPICS = "allow.delete.topics";
  static final String ALLOW_DELETE_BINDINGS = "allow.delete.bindings";
  static final String ALLOW_DELETE_PRINCIPALS = "allow.delete.principals";
  static final String ALLOW_DELETE_CONNECT_ARTEFACTS = "allow.delete.artefacts.connect";

  public static final String CCLOUD_ENV_CONFIG = "ccloud.environment";

  public static final String TOPOLOGY_EXPERIMENTAL_ENABLED_CONFIG =
      "topology.features.experimental";
  static final String TOPOLOGY_PRINCIPAL_TRANSLATION_ENABLED_CONFIG =
      "topology.translation.principal.enabled";

  public static final String TOPOLOGY_TOPIC_STATE_FROM_CLUSTER =
      "topology.state.topics.cluster.enabled";

  public static final String TOPOLOGY_STATE_FROM_CLUSTER = "topology.state.cluster.enabled";

  public static final String SERVICE_ACCOUNT_MANAGED_PREFIXES =
      "topology.service.accounts.managed.prefixes";

  public static final String TOPIC_MANAGED_PREFIXES = "topology.topic.managed.prefixes";

  public static final String GROUP_MANAGED_PREFIXES = "topology.group.managed.prefixes";

  static final String PLATFORM_SERVERS_CONNECT = "platform.servers.connect";
}
