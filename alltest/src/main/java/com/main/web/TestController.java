package com.main.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

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

}
