package org.ms1;

import com.netflix.discovery.shared.LookupService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;

import java.lang.reflect.Method;
import java.util.Collections;

@RestController
@SpringBootApplication
@EnableFeignClients
public class msApp1{
    public static void main(String[] args) throws Exception{
        SpringApplication sa = new SpringApplication();
        sa.addPrimarySources(Collections.singletonList(msApp1.class));
        ConfigurableApplicationContext context = sa.run(args);
        TestResolver bean = context.getBean(TestResolver.class);
        System.out.println(bean);

//        Test.main( args);

    }

    @Autowired(required = false)
    private LookupService lookupService;

    @RequestMapping("/getapps")
    public Object getApp(){
        System.out.println();
        return lookupService.getApplications();
    }



    @Bean("/testbeanurl")
    public Object handler(msApp1 msApp1) throws Exception{
        final Method testUrl = org.ms1.msApp1.class.getDeclaredMethod("testUrl", String.class);
        ReflectionUtils.makeAccessible(testUrl);
        return new HandlerMethod(msApp1,testUrl);
    }

    @ResponseBody
    public Object testUrl(String name){
        return name;
    }

    @GetMapping("/ping")
    public Object ping(){
        return "pong";
    }

    @Autowired
    private MeterRegistry meterRegistry;

    @GetMapping("getStr")
    public Object getStr(){
        final Counter getStr = meterRegistry.counter("HTTP调用","getStr","总数");
        getStr.increment();
        final DistributionSummary summary = meterRegistry.summary("HTTP调用", "getStr", "QPS");
        summary.record(1);
        return "AA";
    }

    @GetMapping("ms1")
    public Object test11(){
        return ms2.ms2();
    }

    @Autowired
    private  Ms2 ms2;


    @FeignClient("ms2")
    public interface Ms2{
        @RequestMapping("/ms2")
        String ms2();
    }

}
