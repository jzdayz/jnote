package com.example;

import java.lang.reflect.Constructor;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-23
 */
public class Java {


    public Java(String a){

    }

    public Java(String a,String b){

    }

    public static void main(String[] args) throws Exception{
        Customer customer = new Customer();
        customer.sayHello("哈哈");

        Constructor<?>[] constructors = Java.class.getConstructors();
        System.out.println(constructors);
        Constructor<Java> declaredConstructor = Java.class.getDeclaredConstructor();
        System.out.println(declaredConstructor);

        System.out.println();
    }
}
