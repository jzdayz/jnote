package org.seata;

import io.seata.spring.annotation.GlobalTransactional;
import io.seata.spring.annotation.GlobalTransactionalInterceptor;
import io.seata.tm.api.DefaultFailureHandlerImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-16
 */

public class ControllerTest {

    private static final long M = 24 * 60 * 60 * 1000;
    private static final long M1 = 24 * 60 * 60 * 1000 * 1000;

    public static void main(String[] args) {
        System.out.println(M1 + "  " + M);
        System.out.println(M1/M);
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new ControllerTest());
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.addAdvice(new GlobalTransactionalInterceptor(new DefaultFailureHandlerImpl()));




        ControllerTest proxy = (ControllerTest) proxyFactory.getProxy();
        proxy.doSomething();

    }

    @GlobalTransactional
    public void doSomething(){
        System.out.println("1");
    }

}
