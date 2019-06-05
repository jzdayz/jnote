package com.example.jnote;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-04
 */
public class AAA {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Condition condition = lock.newCondition();

        Thread thread = new Thread(() -> {
            try {
                lock.lock();
                System.out.println(" 111 1");
                condition.await();
                System.out.println(" 111 2221");
            } catch (InterruptedException ignored) {

            } finally {
                lock.unlock();
            }
        });
        thread.setName("TEST");
        thread.start();

//        new Thread(()->{
//            try {
//                lock.lock();
//                System.out.println(" 444444");
//                condition.signal();
//                System.out.println(" 555555");
//            } finally {
//                lock.unlock();
//            }
//        }).start();
    }


}
