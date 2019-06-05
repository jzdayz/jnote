package com.example.jnote;

import com.google.common.collect.Lists;
import java.util.*;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
         class B{
            String a;

             public B(String a) {
                 this.a = a;
             }

             public String getA() {
                 return a;
             }

             public void setA(String a) {
                 this.a = a;
             }

             @Override
             public String toString() {
                 return new StringJoiner(", ", B.class.getSimpleName() + "[", "]")
                         .add("a='" + a + "'")
                         .toString();
             }
         }
        final HashMap<String, List<B>> collect = Arrays.asList(new B("sss"), new B("sss"), new B("aaa"))
                .stream().collect(Collectors.toMap(B::getA, Lists::newArrayList, (x, y) -> {
                    x.addAll(y);
                    return x;
                }, HashMap::new));

        System.out.println(collect);

    }
}
