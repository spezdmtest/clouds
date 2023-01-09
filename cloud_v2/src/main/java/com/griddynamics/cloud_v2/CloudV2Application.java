package com.griddynamics.cloud_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudV2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudV2Application.class, args);
    }

}
