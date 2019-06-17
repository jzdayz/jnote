package com.jesey.netty;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {
    public static final String CLICHED_MESSAGE = "Hello World!";

    @GET
    @Produces("text/plain")
    public String getHello() {
        return CLICHED_MESSAGE;
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(){
        return JSON.toJSONString(ImmutableMap.of("111","222"));
    }



}