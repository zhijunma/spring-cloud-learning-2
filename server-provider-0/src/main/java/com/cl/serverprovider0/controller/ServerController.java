package com.cl.serverprovider0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String server(String name){
        return "hello +"+name+"! there is "+port;
    }
}
