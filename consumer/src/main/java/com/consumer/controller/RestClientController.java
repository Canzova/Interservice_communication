package com.consumer.controller;

import com.consumer.restClient.RestClientClass;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restclient")
@RequiredArgsConstructor

public class RestClientController {

    private final RestClientClass restClient;

    @GetMapping("/consumer-info")
    public String getInstance(){
        return restClient.getInstance();
    }

}
