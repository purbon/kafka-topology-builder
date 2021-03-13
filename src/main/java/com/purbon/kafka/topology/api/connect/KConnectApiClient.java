package com.purbon.kafka.topology.api.connect;

import com.purbon.kafka.topology.api.mds.Response;
import com.purbon.kafka.topology.clients.JulieHttpClient;
import com.purbon.kafka.topology.utils.JSON;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class KConnectApiClient extends JulieHttpClient {

  public KConnectApiClient(String server) {
    super(server);
  }

  public List<String> getConnectors() throws IOException {
    Response response = doGet("/connectors");
    return JSON.toArray(response.getResponseAsString());
  }

  public Map<String, Object> add(String config) throws IOException {
    String response = doPost("/connectors", config);
    return JSON.toMap(response);
  }

  public void delete(String connector) throws IOException {
    doDelete("/connectors/" + connector + "/", "");
  }
}
