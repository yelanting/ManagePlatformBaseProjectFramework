package com.baseproject.framework.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "baseproject-framework-producer", fallback = BaseProjectFrameworkProducerHystrix.class)
public interface BaseProjectFrameworkProducerService {

    @RequestMapping("/hello")
    public String hello();
    
}
