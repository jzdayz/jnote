package org.web.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-18
 */
@SpringBootApplication
@RestController
public class SimpleWeb {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWeb.class, args);
    }

    @PostMapping("/test/a")
    public Object test(){
        return "hello";
    }
    @RequestMapping("/test/*")
    public Object test1(){
        return "KKKKK";
    }

}
