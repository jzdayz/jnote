package org.web.web;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.google.common.collect.ImmutableMap;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-12
 */
@RestController
public class TestController {


    @RequestMapping("/test/basic")
    public Object testBasic(){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();
        response.setHeader("WWW-Authenticate","Basic");
        response.setStatus(401);
        return "OK";
    }

    @RequestMapping("/test/testJackSon")
    public Object testJackSon(MappingJacksonValue mappingJacksonValue){
//        mappingJacksonValue.setValue(ImmutableMap.of("aa",new Date()));
//        new SimpleFilterProvider().addFilter("aa",)
//        mappingJacksonValue.setFilters();
        return null;
    }

    @RequestMapping("/test/testGetJackson")
    public Object testJackSon(){
        ImmutableMap<String, String> of = ImmutableMap.of("11", "22");
        ImmutableMap<String, Object> of1 = ImmutableMap.of("22", of);
        ImmutableMap<String, Object> of2 = ImmutableMap.of("22", of);

        return ImmutableMap.of("result",ImmutableMap.of("of1",of1,"of2",of2));
    }

}
