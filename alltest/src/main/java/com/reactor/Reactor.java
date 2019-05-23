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

    @Test
    public void show(){

        System.out.println(Stream.of(1,2,3).reduce((x,y)->{
            System.out.println(x+" "+y);
            return x+y;
        }).get());

    }

    @Test
    public void show1(){

        class b{
            private boolean a;

            public b(boolean a) {
                this.a = a;
            }
        }
        ArrayList<b> a = new ArrayList<>();
        a.add(new b(true));
        a.add(new b(false));
        final List<b> collect = a.stream().filter(k -> k.a).collect(Collectors.toList());
        System.out.println(a.get(0) == collect.get(0));
    }
}
