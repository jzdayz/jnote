package com.gateway;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

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
}
