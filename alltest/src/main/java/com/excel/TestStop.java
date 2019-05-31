package com.excel;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-05-30
 */
@SuppressWarnings("Duplicates")
public class TestStop {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));;
        stopwatch.reset();
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));;
        stopwatch.reset();
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));;
        stopwatch.reset();
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));;
        stopwatch.reset();
        TimeUnit.SECONDS.sleep(1L);

    }
}
