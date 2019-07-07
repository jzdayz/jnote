package org.jdk;

import org.apache.derby.impl.store.raw.log.Scan;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-13
 */
public class TestThreadPoolTerminal {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,0L, TimeUnit.DAYS,new ArrayBlockingQueue(100));
        executor.submit(()->{
            try {
                System.out.println("111");
                new Scanner(System.in).next();
                System.out.println("222");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executor.submit(()->{
            System.out.println("111");
        });
        executor.shutdown();

    }
}
