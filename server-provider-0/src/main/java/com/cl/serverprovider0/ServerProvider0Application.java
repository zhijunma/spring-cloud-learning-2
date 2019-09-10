package com.cl.serverprovider0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerProvider0Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerProvider0Application.class, args);
    }

}
