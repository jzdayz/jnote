package com.example.jnote;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-03
 */
public class TestA {

    public static void main(String[] args) {
        System.out.println(new Random().nextInt(10));
//        ExecutorService service = new ThreadPoolExecutor(5,5,1L, TimeUnit.MINUTES,new ArrayBlockingQueue<>(100));
//        Thread thread = Thread.currentThread();
//        AtomicInteger integer = new AtomicInteger();
//        for (int i = 0; i < 100; i++)
//        service.execute(()->{
//            try {
//                TimeUnit.SECONDS.sleep(new Random().nextInt());
//                int i1 = integer.addAndGet(1);
//                System.out.println(i1 + " 正在执行任务 ..... " );
//                if (i1 == 5){
//                    System.out.println(" === ");
//                    LockSupport.unpark(thread);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//
//            }
//        });
//        if (integer.get()<5){
//            LockSupport.park();
//            System.out.println(" 主线程释放 ");
//        }
    }

}
