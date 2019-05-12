package com.example.jnote;

import java.util.function.Function;

public class A {
    public static void main(String[] args) {
        Function<String,Integer> a = (s)-> {
            final int i = Integer.parseInt(s);
            return i;
        };
        final Function<Double, Integer> compose = a.compose((s) -> "1");
        final Integer apply = compose.apply(1.1);

    }
}
