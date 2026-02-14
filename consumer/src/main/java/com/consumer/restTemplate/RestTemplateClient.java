package com.consumer.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class RestTemplateClient {

    private final RestClient restClient;
//    private final String PRODUCER_URL = "http://localhost:8081";
//    private final String PRODUCER_URL = "http://producer";

    public String getInstance(String subdomainUrl){
        return restClient.get()
                .uri(subdomainUrl)
                .retrieve()
                .body(String.class);
    }


}
