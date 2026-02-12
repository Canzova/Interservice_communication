package com.consumer.controller;

import com.consumer.restTemplate.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest-template")
public class RestTemplateClientController {

    private final RestTemplateClient restTemplateClient;

    @GetMapping("/consumer-info")
    public String getConsumerInfo(){
        return restTemplateClient.getInstance("/instance-info");
    }
//
//    public String getConsumerInfo(){
//        return restTemplateClient.getInstance("/instance-info");
//    }
}
