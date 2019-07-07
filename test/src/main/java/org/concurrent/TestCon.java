package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-11
 */
public class TestCon {
    public static void main(String[] args)throws Exception {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,1,0, TimeUnit.MINUTES,new ArrayBlockingQueue(100));
        Future<?> submit = threadPoolExecutor.submit(() -> {
                throw new RuntimeException();
        });
        Future<?> submit1 = threadPoolExecutor.submit(() -> {
            System.out.println("1");
        });
        System.out.println(submit1.get());
        threadPoolExecutor.submit(()->{
            System.out.println("2");
        });
        TimeUnit.MINUTES.sleep(1L);
    }
}
