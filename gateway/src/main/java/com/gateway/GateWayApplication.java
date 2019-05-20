package com.gateway;


import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.AbstractRateLimiter;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@SpringBootApplication
@RestController
public class GateWayApplication implements BeanFactoryAware {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}

	@RequestMapping(value = "/anything/a")
	public Object test(String name){
		return "TEST";
	}

    @RequestMapping(value = "/anything/b")
    public Object test1(String name){
        return "TEST1";
    }

	private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    class Custom extends AbstractRateLimiter {

	    private RateLimiter rateLimiter = RateLimiter.create(3);

        public Custom(Class configClass, String configurationPropertyName, Validator validator) {
            super(configClass, configurationPropertyName, validator);
        }

        private AtomicInteger integer = new AtomicInteger();
        @Override
        public Mono<Response> isAllowed(String routeId, String id) {
            if (rateLimiter.tryAcquire()){
                System.out.println("Request "+integer.incrementAndGet());
                return Mono.just(new Response(true, Collections.emptyMap()));
            }
            return Mono.just(new Response(false, Collections.emptyMap()));
        }

    }

    @Bean
    public Custom custom(){
	    return new Custom(Object.class,"non",null);
    }

    @Bean
    public KeyResolver keyResolver(){
        return exchange-> Mono.just("sss");
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("limit_route", r -> r
                        .path("/aa/**")
                        .filters(f -> f.requestRateLimiter(c -> {
                            c.setRateLimiter(beanFactory.getBean(Custom.class));
                            c.setStatusCode(HttpStatus.TOO_MANY_REQUESTS);
                        })
                        )
                        .uri("http://localhost:8080/anything/a"))
                .route("host_route", r -> r.path("/a/**").filters(f -> f.stripPrefix(1)).uri("http://localhost:8081"))

                .build();
    }

}