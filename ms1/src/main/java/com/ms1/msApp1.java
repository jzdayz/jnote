package com.ms1;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@RestController
@SpringBootApplication
@EnableFeignClients
public class msApp1 {
    public static void main(String[] args) {
        SpringApplication.run(msApp1.class,args);
        System.out.println();
    }

    @Resource
    private Environment environment;

    @RequestMapping("/ms1")
    public Object hello(String[] name){
        return ms2.ms2();
    }

    @Bean("/testbeanurl")
    public Object handler(msApp1 msApp1) throws Exception{
        final Method testUrl = com.ms1.msApp1.class.getDeclaredMethod("testUrl", String.class);
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


    @Autowired
    private  Ms2 ms2;


    @FeignClient("ms2")
    public interface Ms2{
        @RequestMapping("/ms2")
        String ms2();
    }

}
