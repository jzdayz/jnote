package com.metrics;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-26
 */
@Configuration
public class Metrics {

    @Test
    public void test(){
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
        con.scan("com.metrics");
        con.registerBean(AopConfigUtils.AUTO_PROXY_CREATOR_BEAN_NAME
                ,AnnotationAwareAspectJAutoProxyCreator.class);
        AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(con);
        con.refresh();
        Metrics bean = con.getBean(Metrics.class);
        bean.a();

        MeterRegistry bean1 = con.getBean(MeterRegistry.class);
        List<Meter> test1 = bean1.getMeters();
        System.out.println();
    }

    @Bean
    public MeterRegistry meterRegistry(){
        return new SimpleMeterRegistry();
    }

    @Timed("test")
    public void a(){
        try {
            TimeUnit.SECONDS.sleep(1L);
        }catch (Exception e){

        }
        System.out.println("done");
    }

    @Test
    public void test2(){
        System.out.println(DateFormatUtils.format(new Date(1561428605000L),"yyyy-MM-dd HH:mm:ss"));
    }

}
