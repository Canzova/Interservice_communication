//package com.consumer.controller;
//
//import com.consumer.webClient.ProviderWebClient;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("/webclient")
//@RequiredArgsConstructor
//public class WebClientController {
//
//    private final ProviderWebClient providerWebClient;
//
//    @GetMapping("/consumer-info")
//    public Mono<String> getInstance(){
//        return providerWebClient.getInstance("/instance-info");
//    }
//
//}
