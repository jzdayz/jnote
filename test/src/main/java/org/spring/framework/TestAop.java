package org.spring.framework;

import org.aopalliance.intercept.MethodInterceptor;
import org.server.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.config.AopConfigUtils;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.aop.target.SimpleBeanTargetSource;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.lang.reflect.Method;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-05
 */
public class TestAop {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,System.getProperty("user.dir")+System.getProperty("file.separator")+"cglib");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        DefaultIntroductionAdvisor defaultIntroductionAdvisor = new DefaultIntroductionAdvisor(
                (MethodInterceptor)(invocation)->{
                    System.out.println("do -- ");
                    return invocation.proceed();
                }
        );
        factory.registerSingleton("defaultIntroductionAdvisor",defaultIntroductionAdvisor);

        AnnotationAwareAspectJAutoProxyCreator beanPostProcessor = new AnnotationAwareAspectJAutoProxyCreator();
        beanPostProcessor.setBeanFactory(factory);
        beanPostProcessor.setCustomTargetSourceCreators((beanClass,beanName)->{
            SimpleBeanTargetSource simpleBeanTargetSource = new SimpleBeanTargetSource();
            simpleBeanTargetSource.setTargetBeanName(beanName);
            simpleBeanTargetSource.setBeanFactory(factory);
            simpleBeanTargetSource.setTargetClass(beanClass);
            return simpleBeanTargetSource;
        });
        factory.addBeanPostProcessor(beanPostProcessor);
        factory.registerBeanDefinition("a", BeanDefinitionBuilder
                .rootBeanDefinition(TestAop.class)
                .getBeanDefinition());
        Object a = factory.getBean("a");
        System.out.println(a);
//        System.out.println(a);

    }
}
