package com.ms1;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.util.Random;

@RestController
@SpringBootApplication
public class msApp2 {
    public static void main(String[] args) {
        SpringApplication.run(msApp2.class,args);
    }

    @Resource
    private Environment environment;

    @RequestMapping("/ms2")
    public Object hello(){
        if (new Random().nextBoolean()){
//            throw new RuntimeException();
        }
        return JsonbBuilder.create(new JsonbConfig()).toJson(environment);
    }

}
