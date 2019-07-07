package com.spring.retry;


import org.junit.Test;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.target.QuickTargetSourceCreator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;


@EnableRetry
@Configuration
public class SpringRetry {

    @Test
    public void test1(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        DefaultAdvisorAutoProxyCreator beanPostProcessor = new DefaultAdvisorAutoProxyCreator();
        beanPostProcessor.setCustomTargetSourceCreators(new QuickTargetSourceCreator());
        beanPostProcessor.setBeanFactory(beanFactory);
        beanFactory.addBeanPostProcessor(beanPostProcessor);
        beanFactory.registerBeanDefinition("a",new RootBeanDefinition(SpringRetry.class));
        SpringRetry bean = beanFactory.getBean(SpringRetry.class);
        System.out.println(bean);
        bean.test();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
    }

    @Retryable
    public void test(){
        RuntimeException r = new RuntimeException();
        StackTraceElement[] stackTrace = r.getStackTrace();
        for (int i = 0; i < stackTrace.length && i<2; i++) {
            System.out.println(stackTrace[i].getClassName());
        }
        System.out.println("1");
    }

}
