package com.cl.servercustomerfeignhyxtrix.service;

import com.cl.servercustomerfeignhyxtrix.fallbackService.FallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVER-PROVIDER",fallback = FallbackService.class)
public interface FeignService {

    @RequestMapping(value = "/hello?name=feign-hystrix",method = RequestMethod.GET)
    String hello();
}
