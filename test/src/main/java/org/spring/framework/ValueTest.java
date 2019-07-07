//package com.spring.framework;
//
//import com.alibaba.fastjson.JSON;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.core.env.ConfigurableEnvironment;
//
//@SpringBootApplication
//public class ValueTest {
//    public static void main(String[] args) {
//        SpringApplication sa = new SpringApplication(ValueTest.class);
//        sa.setApplicationContextClass(AnnotationConfigApplicationContext.class);
//        ConfigurableApplicationContext run = sa.run(args);
//        ConfigurableEnvironment environment = run.getEnvironment();
//        System.out.println(JSON.toJSONString(environment));
//    }
//
//
//    @Value("${file.separator}")
//    private String separator;
//
//}
