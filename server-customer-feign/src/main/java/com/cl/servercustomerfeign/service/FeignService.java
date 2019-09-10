package com.cl.servercustomerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVER-PROVIDER")
public interface FeignService {

    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    String sayHello();
}
