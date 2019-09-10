package com.cl.servercustomerfeign.controller;

import com.cl.servercustomerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    @Autowired
    FeignService service;
    @GetMapping("/hi")
    public String hello(){
        return service.sayHello()+"-->I am Feign-customer";
    }
}
