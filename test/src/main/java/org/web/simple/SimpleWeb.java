package org.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-18
 */
@SpringBootApplication
public class SimpleWeb {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SimpleWeb.class, args);

    }
}
