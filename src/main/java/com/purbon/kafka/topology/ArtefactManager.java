package com.purbon.kafka.topology;

import com.purbon.kafka.topology.configuration.Configuration;
import com.purbon.kafka.topology.model.Artefact;
import com.purbon.kafka.topology.model.Topology;

import java.io.IOException;
import java.util.List;

/**
 * Manages Artefacts as defined within the context of the filter class
 */
public abstract class ArtefactManager implements ManagerOfThings {

    protected Configuration config;
    protected String topologyFileOrDir;

    public ArtefactManager(Configuration config, String topologyFileOrDir) {
        this.config = config;
        this.topologyFileOrDir = topologyFileOrDir;
    }

    @Override
    public void apply(Topology topology, ExecutionPlan plan) throws IOException {

        List<? extends Artefact> artefacts = selectCandidateArtefacts(topology);

        if (isAllowDelete()) {

        }


    }

    abstract List<? extends Artefact> selectCandidateArtefacts(Topology topology);

    abstract boolean isAllowDelete();

    abstract String rootPath();

}