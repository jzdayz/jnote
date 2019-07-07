package org.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTimeUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class JackSonTests {

    @Test
    public void test1()throws Exception{
        ObjectMapper ob = new ObjectMapper();
        ob.registerModule(new SimpleModule().addSerializer(new MyStdSerializer(Date.class)));
        ObjectWriter objectWriter = ob.writerFor(Map.class);
        System.out.println(objectWriter.writeValueAsString(ImmutableMap.of("aa",new Date())));;

        SimpleFilterProvider simpleFilterProvider = new SimpleFilterProvider().addFilter("name", new SimpleBeanPropertyFilter() {
            @Override
            public void serializeAsField(Object pojo, JsonGenerator jgen, SerializerProvider provider, PropertyWriter writer) throws Exception {
                System.out.println("处理了");
                super.serializeAsField(pojo, jgen, provider, writer);
            }
        });
        System.out.println(objectWriter.with(simpleFilterProvider).writeValueAsString(ImmutableMap.of("name",new Date())));;
        System.out.println("done");
    }

    public class MyStdSerializer extends StdSerializer<Date> {


        protected MyStdSerializer(Class<Date> t) {
            super(t);
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString(DateFormatUtils.format(value,"yyyy-MM-dd"));
        }
    }
}
