package com;

import org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-06
 */
public class TestSpringAspectj {
    public static void main(String[] args) {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        Object o = creator.postProcessBeforeInstantiation(Test.BB.class, "aaa");
        System.out.println(o);

    }
}
