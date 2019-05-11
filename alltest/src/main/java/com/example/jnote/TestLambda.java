package com.example.jnote;

import java.util.function.Supplier;

public class TestLambda {
    private Supplier<Double> z = ()->0.0;

    public static void main(String[] args) {
        final Supplier<Double> z = new TestLambda().z;
        z.get();
    }
}
