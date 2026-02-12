//package com.consumer.webClient;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//@Service
//@RequiredArgsConstructor
//public class ProviderWebClient {
//
//    private final WebClient webClient;
//
//    public Mono<String> getInstance(String subDomainUrl){
//        return webClient.get()
//                .uri(subDomainUrl)
//                .retrieve()
//                .bodyToMono(String.class);
//    }
//
//}
