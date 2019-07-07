package com.gateway;

import org.junit.Test;
import org.springframework.cloud.gateway.handler.predicate.PathRoutePredicateFactory;
import org.springframework.cloud.gateway.support.ConfigurationUtils;
import org.springframework.core.convert.support.DefaultConversionService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ☞ 🏀
 * @date 2019-05-19
 */
public class A {
    public static void main(String[] args) {
        Flux.fromIterable(Arrays.asList((B) Mono::empty, ()->Mono.just("哈哈"),()->Mono.just("嘿嘿")))
                .concatMap(B::get).next().subscribe(System.out::println);
    }

    @FunctionalInterface
    interface B{
       Mono<Object> get();
    }

    @Test
    public void show(){
        Map<String,Object> properties = new HashMap<>();
        properties.put("patterns","/baidu");
        Object config = new PathRoutePredicateFactory.Config();
        ConfigurationUtils.bind(config, properties, "",
                "patterns", null, new DefaultConversionService());
        System.out.println(config);
    }
}
