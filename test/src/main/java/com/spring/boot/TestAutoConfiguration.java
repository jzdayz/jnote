package com.spring.boot;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-27
 */
@Conditional(TestCondition.class)
@Configuration
public class TestAutoConfiguration {
    public TestAutoConfiguration() {
        System.out.println("init "+this.getClass().getName());
    }
}
