package com.purbon.kafka.topology.actions;

import com.purbon.kafka.topology.clients.ArtefactClient;
import com.purbon.kafka.topology.model.Artefact;
import com.purbon.kafka.topology.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.purbon.kafka.topology.utils.Utils.filePath;

public class CreateArtefactAction  extends BaseAction {

    private static final Logger LOGGER = LogManager.getLogger(CreateArtefactAction.class);

    private ArtefactClient client;
    private Artefact artefact;
    private String rootPath;
    private List<? extends Artefact> artefacts;

    public CreateArtefactAction(ArtefactClient client,
                                String rootPath,
                                List<? extends Artefact> artefacts,
                                Artefact artefact) {
        this.client = client;
        this.artefact = artefact;
        this.artefacts = artefacts;
        this.rootPath = rootPath;
    }

    @Override
    public void run() throws IOException {
        //TODO: fill the method
        if (!artefacts.contains(artefact)) {
            client.add(content());
        }
    }

    private String content() throws IOException {
        return Utils.readFullFile(filePath(artefact.getPath(), rootPath));
    }

    @Override
    protected Map<String, Object> props() {
        return null;
    }
}
