package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class Eureka {
    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }

    @Resource
    private ConfigurableEnvironment configurableEnvironment;

    @RequestMapping("/hello")
    public Object hello(){
        return configurableEnvironment.getProperty("server.port");
    }

    public Object show(){
        return "OK";
    }
}
