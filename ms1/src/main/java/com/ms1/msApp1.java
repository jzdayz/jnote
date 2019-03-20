package com.ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
@EnableFeignClients
public class msApp1 {
    public static void main(String[] args) {
        SpringApplication.run(msApp1.class,args);
    }

    @Resource
    private Environment environment;

    @RequestMapping("/ms1")
    public Object hello(){
        return ms2.ms2();
    }

    @Autowired
    private  Ms2 ms2;


    @FeignClient("ms2")
    public interface Ms2{
        @RequestMapping("/ms2")
        String ms2();
    }

}
