package com.example.jnote;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
    @Test
    public void test() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        final A a = new A();
        a.setDate(new Date());
        a.setName("111");
        final String s = objectMapper.writeValueAsString(a);
        System.out.println(s);

    }

    private static class A{
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date date;
        private String name;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void  test2(){
        final Date truncate = DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
        System.out.println(truncate);
    }
}
