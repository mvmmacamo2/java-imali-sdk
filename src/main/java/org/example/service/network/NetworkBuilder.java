package org.example.service.network;

import org.example.service.data.RequestHandler;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class NetworkBuilder {
    private static final String BASE_URL_TEST = "https://paytek-africa.com/imalipartnersapi/public/api/partner/";
    private static final String BASE_URL_PROD = "https://paytek-africa.com/imalipartnersprod/public/api/partner/";

    private boolean production;
    private String apiKey;
    private String localization;
    private final RequestHandler requestHandler;

    public NetworkBuilder() {
        requestHandler = new RequestHandler();
    }

    public HttpResponse<String> buildClient() throws IOException, InterruptedException {

        String BASE_URL;
        if (production) {
            BASE_URL = BASE_URL_PROD;
        } else {
            BASE_URL = BASE_URL_TEST;
        }
        var uri = URI.create(BASE_URL + requestHandler.getResource());
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Authorization", "Bearer "+apiKey)
                .header("X-localization", localization)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .method(requestHandler.getMethod(), HttpRequest.BodyPublishers.ofString(requestHandler().getBody()))
                .timeout(Duration.ofSeconds(120))
                .build();


        return client.send(
                request,
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
        );
//       return (HttpResponse<String>) client.sendAsync(
//                request,
//                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
//        )
//               .thenApply(HttpResponse::statusCode)
//               .thenAccept(System.out::println);

    }

    public NetworkBuilder setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public NetworkBuilder setLocalization(String localization) {
        this.localization = localization;
        return this;
    }

    public NetworkBuilder setProductionMode(boolean productionMode) {
        this.production = productionMode;
        return this;
    }
    public RequestHandler requestHandler() {
      return requestHandler;
    }

}
