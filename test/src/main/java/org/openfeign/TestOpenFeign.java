package org.openfeign;

import com.alibaba.fastjson.JSON;
import feign.Feign;
import feign.Headers;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.apache.commons.collections4.MultiMapUtils;

import java.util.HashMap;
import java.util.Map;

public class TestOpenFeign {

    public static void main(String[] args) {
        Remote target = Feign.builder().decoder(new JacksonDecoder()).encoder(new JacksonEncoder()).target(Remote.class, "http://httpbin.org");
        Map<String,Object> body = new HashMap<>();
        body.put("name","xioaming");
        Object test = target.test(JSON.toJSONString(body));
        System.out.println(String.format("%s \n type=%s",test,test.getClass()));
    }

    interface Remote{
        @Headers("Content-Type: application/json")
        @RequestLine("POST /post")
        Object test(Object body);
    }

}
