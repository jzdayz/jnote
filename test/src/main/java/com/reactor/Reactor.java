package com.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ☞ 🏀
 * @date 2019-05-22
 */
public class Reactor {
    public static void main(String[] args) {
        Flux.just("1","2").concatMap(k->Flux.just(k.getClass(),"嘿嘿")).subscribe(System.out::println);
    }
}
