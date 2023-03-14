package org.example.service.data;

import org.example.service.network.NetworkBuilder;

public class RequestHandler {
    private String resource;
    private String method;
    private String body;

    NetworkBuilder networkBuilder;

    public RequestHandler() {
        networkBuilder = new NetworkBuilder();
    }

    public RequestHandler setResource(String resource) {
        this.resource = resource;
        return this;
    }

    public RequestHandler setMethod(String method) {
        this.method = method;
        return this;
    }

    public RequestHandler setBody(String body) {
        this.body = body;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public String getResource() {
        return resource;
    }

    public String getBody() {
        return body;
    }

    public NetworkBuilder proceedRequest() {
        return networkBuilder
                .setApiKey("")
                .setProductionMode(false)
                .setLocalization("");
    }
}
