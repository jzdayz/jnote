package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author huqingfeng
 * @date 2019/5/12
 */
@SpringBootApplication
@RestController
public class WebFlux {
    public static void main(String[] args) {
        SpringApplication.run(WebFlux.class);
    }

    @RequestMapping
    public Mono<String> test(){
        return Mono.just("HELLO");
    }
}
