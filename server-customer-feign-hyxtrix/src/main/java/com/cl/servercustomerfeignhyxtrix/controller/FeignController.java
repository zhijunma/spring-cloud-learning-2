package com.cl.servercustomerfeignhyxtrix.controller;

import com.cl.servercustomerfeignhyxtrix.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    FeignService service;
    @GetMapping("/hi")
    public String hi(){
        return service.hello()+"-->I am Feign-customer";
    }
}
