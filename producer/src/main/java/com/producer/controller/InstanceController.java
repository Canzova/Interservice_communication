package com.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private String instanceId = UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstanceId(){
        System.out.println("This Producer is running on : " + port + " , with instance id : " + instanceId);
        return "This Producer is running on : " + port + " , with instance id : " + instanceId;
    }
}


