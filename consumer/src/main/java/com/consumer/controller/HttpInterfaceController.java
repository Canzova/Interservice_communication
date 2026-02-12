package com.consumer.controller;

import com.consumer.httpInterface.ProviderHttpInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/httpinterface")
@RequiredArgsConstructor
public class HttpInterfaceController {

    public final ProviderHttpInterface providerHttpInterface;

    @GetMapping("/consumer-info")
    public String getInstanceInfo(){
        return providerHttpInterface.getInstanceInfo();
    }

}
