package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-06
 */
@EnableRetry
@SpringBootApplication
public class Test {
    public static void main(String[] args) {
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/huqingfeng/Documents/projects/testproject/jnote/alltest/src/main/resources");
        SpringApplication springApplication = new SpringApplication(Test.class);
        springApplication.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        B bean = configurableApplicationContext.getBean(B.class);
        configurableApplicationContext.getBeanFactory().getBeanPostProcessorCount();

        bean.show();


        BB bean1 = (BB) configurableApplicationContext.getBean("dddd");
        bean1.show();
    }

    @Component("bbb")
    public class B implements Serializable {
        @Retryable
        public void show(){
            System.out.println("show");
        }
    }

    @Component("dddd")
    interface BB{
        default void show(){
            System.out.println("show");
        }
    }

}
