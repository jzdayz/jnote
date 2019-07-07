package org.spring.framework;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.stereotype.Component;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-13
 */
@Component
public class TestScanPackage {

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        CustomClassPathBeanDefinitionScanner scanner = new CustomClassPathBeanDefinitionScanner(defaultListableBeanFactory);
        scanner.scan("com.spring.framework");
        TestScanPackage bean = defaultListableBeanFactory.getBean(TestScanPackage.class);
        System.out.println(bean.age);
    }

    private static class CustomClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner{

        public CustomClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
            super(registry);
        }

        @Override
        protected void postProcessBeanDefinition(AbstractBeanDefinition beanDefinition, String beanName) {
            super.postProcessBeanDefinition(beanDefinition, beanName);
            try {
                if (Class.forName(beanDefinition.getBeanClassName()).equals(TestScanPackage.class)){
                    beanDefinition.getPropertyValues().add("age",10000);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
