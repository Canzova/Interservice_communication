package com.consumer.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="provider-service", url = "http://localhost:8081/")
public interface OpenFeignClient {

    @GetMapping("/instance-info")
    public String getInstanceInfo();

}
