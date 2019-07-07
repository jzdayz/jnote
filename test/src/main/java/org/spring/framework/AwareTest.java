package org.spring.framework;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;

import java.util.Set;

//@Component
@SpringBootApplication
public class AwareTest implements EnvironmentAware , LoadTimeWeaverAware {
    @Override
    public void setEnvironment(Environment environment) {
        final boolean dev = environment.acceptsProfiles(Profiles.of("!(aa|prod)&dev"));
        System.out.println(dev);
    }

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AwareTest.class);
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AwareTest.class, args);
        AwareTest bean = configurableApplicationContext.getBean(AwareTest.class);
        System.out.println(bean);

        System.out.println(bean.test() == configurableApplicationContext.getBean(Test.class));
    }

    @Bean
    public Test test(){
        return new Test();
    }

    @Bean
    public Test1 test1(Test test){
        test();
        return new Test1();
    }

    static class Test{

    }
    static class Test1{

    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
        System.out.println(loadTimeWeaver);
    }
}
