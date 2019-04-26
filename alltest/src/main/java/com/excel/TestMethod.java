package com.excel;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.Json;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Properties;

public class TestMethod {

    public void show(String aaa){

    }

    public static void main(String[] args) throws Exception{
        final Method show = TestMethod.class.getDeclaredMethod("show", String.class);
        final Parameter parameter = show.getParameters()[0];
        System.out.println(parameter.getName());

        final Properties properties = System.getProperties();
        System.out.println(new ObjectMapper().writeValueAsString(properties));

    }
}
