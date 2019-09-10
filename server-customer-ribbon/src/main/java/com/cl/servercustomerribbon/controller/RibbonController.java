package com.cl.servercustomerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    RestTemplate template;

    @GetMapping("/hi")
    public String hi(){
        return template.getForObject("http://SERVER-PROVIDER/hello",String.class)+"-->I am Ribbon-customer";
    }
}
