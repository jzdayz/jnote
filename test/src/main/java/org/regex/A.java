package org.regex;

import java.util.Arrays;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-18
 */
public class A {
    public static void main(String[] args) {
        Arrays.asList("1","2","3").forEach(e->{
            if (e.equalsIgnoreCase("2")){
                return;
            }
            System.out.println(e);
        });
    }
}
