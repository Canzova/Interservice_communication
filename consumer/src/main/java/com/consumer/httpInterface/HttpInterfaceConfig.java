package com.consumer.httpInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {
    // Using RestClient
    @Bean
    public ProviderHttpInterface providerHttpInterface(){
        RestClient restClient = RestClient.create("http://localhost:8081");
        RestClientAdapter adapter = RestClientAdapter.create(restClient);

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(ProviderHttpInterface.class);
    }
}
