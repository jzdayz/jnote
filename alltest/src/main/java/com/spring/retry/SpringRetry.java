package com.spring.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;

@EnableRetry
@SpringBootApplication
public class SpringRetry {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringRetry.class);
        springApplication.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        ConfigurableApplicationContext run = springApplication.run(args);
        SpringRetry bean = run.getBean(SpringRetry.class);
        A bean1 = run.getBean(A.class);
        bean1.aa();
        bean.testes();
        bean.retryTest();


    }

    @Configuration
    public static class A{
        @Retryable
        public void aa(){
            System.out.println("sssdddds");
        }
    }

    @Retryable
    public void retryTest(){
        System.out.println("1111");
    }

    public void testes(){
        System.out.println("sss");
    }

}
