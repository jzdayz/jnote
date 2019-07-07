package org.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-27
 */
@RestController
public class TestMetric implements BeanFactoryAware {

    BeanFactory beanFactory;

    @RequestMapping("test")
    public Object test(HttpServletRequest re){
        Counter counter = beanFactory.getBean("http-request", Counter.class);
        counter.labels(re.getRequestURI(),
                re.getMethod(), HttpStatus.OK.getReasonPhrase()).inc();
        return "OK";
    }

    @Autowired
    private CollectorRegistry collectorRegistry;

    @Bean("http-request")
    public Counter requestTotalCountCollector(){
        return  Counter.build()
                .name("http_requests_total")
                .labelNames("path", "method", "code")
                .help("http请求总计数").register(collectorRegistry);
    }

    @Bean
    MeterRegistryCustomizer<MeterRegistry> configurer(
            @Value("${spring.application.name}") String applicationName) {
        return (registry) -> {
            System.err.println(applicationName);
            registry.config().commonTags("application", applicationName);
        };
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
