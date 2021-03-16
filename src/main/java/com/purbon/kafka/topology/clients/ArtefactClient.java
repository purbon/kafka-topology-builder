package com.purbon.kafka.topology.clients;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ArtefactClient {

    Map<String, Object> add(String content) throws IOException;
    void delete(String label) throws IOException;
    List<String> list() throws IOException;

}