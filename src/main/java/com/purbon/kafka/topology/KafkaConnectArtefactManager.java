package com.purbon.kafka.topology;

import com.purbon.kafka.topology.configuration.Configuration;
import com.purbon.kafka.topology.model.Topology;
import com.purbon.kafka.topology.model.artefact.KafkaConnectArtefact;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class KafkaConnectArtefactManager extends ArtefactManager {


    public KafkaConnectArtefactManager(Configuration config, String topologyFileOrDir) {
        super(config, topologyFileOrDir);
    }

    @Override
    List<KafkaConnectArtefact> selectCandidateArtefacts(Topology topology) {
        return topology
                .getProjects()
                .stream()
                .flatMap(project -> project.getConnectorArtefacts().stream())
                .collect(Collectors.toList());
    }

    @Override
    boolean isAllowDelete() {
        return config.allowDelete() || config.isAllowDeleteConnectArtefacts();
    }

    @Override
    String rootPath() {
        return Files.isDirectory(Paths.get(topologyFileOrDir))
                ? topologyFileOrDir
                : new File(topologyFileOrDir).getParent();
    }
}
