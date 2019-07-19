package org.ms1;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-16
 */

public class ControllerTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTargetClass(ControllerTest.class);
        proxyFactory.setProxyTargetClass(true);

    }

}
