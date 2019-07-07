package com.socket.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-24
 */
public class TestOkHttp {

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(1L, TimeUnit.DAYS)
            .callTimeout(1L,TimeUnit.DAYS)
            .readTimeout(1L,TimeUnit.DAYS)
            .build();

    public void before(){
        System.out.println("before");
    }

    @Test
    public void test1() throws Exception{
        int amount = 15;
        TimeUnit timeUnit = TimeUnit.MINUTES;

        String beginStr = "2019-06-27 00:00:00";
        String format = "yyyy-MM-dd HH:mm:ss";
        Date begin = DateUtils.parseDate(beginStr,format);


        Date end = add(begin,timeUnit,amount);
        end = new Date(end.getTime()-1000);
        Date point = add(begin,TimeUnit.DAYS,1);

        int amountTmp = amount;
        while (end.before(point)){
            Request.Builder re = new Request.Builder();
            String url = "http://localhost:9600/hand/calCsPerformance" +
                    "?shopId=178287&startDate=" +
                    DateFormatUtils.format(begin, format)
                    + "&endDate=" +
                    DateFormatUtils.format(end, format);
            re.url(url);
            System.err.println(url);
            if (1==1)return;
            Call call = okHttpClient.newCall(re.build());
            Response execute = call.execute();
            ResponseBody body = execute.body();
            JSONObject jsonObject = JSON.parseObject(body.string());
            Integer retCode = jsonObject.getInteger("retCode");
            // 模拟错误
            if (retCode == 1){
                amountTmp = amountTmp + amount;
                System.out.println("发生错误了");
                end = add(end, timeUnit,amount);
                continue;
            }
            begin = add(begin, timeUnit,amountTmp);
            amountTmp = amount;
            end = add(end, timeUnit,amountTmp);
        }
    }

    private Date add(Date date,TimeUnit timeUnit,long num){
        return new Date(date.getTime()+timeUnit.toMillis(num));
    }

    @Test
    public void test2() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(String.format("年：%s", time / (365 * 12 * 30 * 24 * 60 * 60 * 1000) + 1970));

    }

    @Test
    public void test3() throws Exception{
        System.out.println(InetAddress.getLocalHost());
    }

    @After
    public void after(){
        System.out.println("done");
    }
}
