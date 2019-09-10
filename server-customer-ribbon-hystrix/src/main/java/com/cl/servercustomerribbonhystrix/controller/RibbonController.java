package com.cl.servercustomerribbonhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/hi")
    public String hi(){
        return template.getForObject("http://SERVER-PROVIDER/hello",String.class)+"-->I am Ribbon-customer";
    }

    public String fallback(){
        return "change to " +template.getForObject("http://SERVER-PROVIDER/hello",String.class)+"-->I am Ribbon-customer";
    }

}
