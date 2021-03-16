package com.purbon.kafka.topology.actions;

import com.purbon.kafka.topology.clients.ArtefactClient;
import com.purbon.kafka.topology.model.Artefact;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Map;

public class DeleteArtefactAction extends BaseAction {

    private static final Logger LOGGER = LogManager.getLogger(DeleteArtefactAction.class);

    private ArtefactClient client;
    private Artefact artefact;

    public DeleteArtefactAction(ArtefactClient client, Artefact artefact) {
        this.client = client;
        this.artefact = artefact;
    }

    @Override
    public void run() throws IOException {
        client.delete(artefact.name());
    }

    @Override
    protected Map<String, Object> props() {
        return null;
    }
}
