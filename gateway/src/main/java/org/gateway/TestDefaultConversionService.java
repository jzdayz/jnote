package com.gateway;

import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @author ☞ 🏀
 * @date 2019-05-20
 */
public class TestDefaultConversionService {
    public static void main(String[] args) {
        DefaultConversionService service = new DefaultConversionService();
        System.out.println(service.canConvert(String.class,String.class));
    }
}
