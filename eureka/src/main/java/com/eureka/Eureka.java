package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class Eureka {
    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }


    @RequestMapping("/hello")
    public Object hello(){
        return show();
    }

    public Object show(){
        return "OK";
    }
}
