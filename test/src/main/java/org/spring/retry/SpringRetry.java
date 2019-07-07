package org.spring.retry;


import org.junit.Test;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.target.QuickTargetSourceCreator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;


@EnableRetry
@Configuration
public class SpringRetry {

    @Test
    public void test1(){

    }


    @Test
    public void test2(){

        String dirName = "cglib";
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,System.getProperty("user.dir")+System.getProperty("file.separator")+dirName);

        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(SpringRetry.class);
        SpringRetry springRetry = con.getBean(SpringRetry.class);
        System.out.println(springRetry);
        springRetry.test();
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
