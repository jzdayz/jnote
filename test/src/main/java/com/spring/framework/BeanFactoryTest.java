package com.spring.framework;

import org.junit.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class BeanFactoryTest {


    /**
     * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean(String, RootBeanDefinition, Object[])}
     *  1:creat bean  ( 创建正常的bean或者被cglib强化过的bean )
     *  2:调用{@link org.springframework.beans.factory.config.BeanPostProcessor}({@link org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor})
     *  的postProcessMergedBeanDefinition方法，改变{@link org.springframework.beans.factory.config.BeanDefinition}的属性，比如设置初始化方法{@link javax.annotation.PostConstruct}
     *  3:
     *
     */
    @Test
    public void test1(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(BeanFactoryTest.class).getBeanDefinition();
        beanFactory.registerBeanDefinition("a",beanDefinition);
        BeanFactoryTest bean = beanFactory.getBean(BeanFactoryTest.class);
    }
}
