package com.jdk;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-13
 */
public class TestReadWriteLock {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

        new Thread(()->{
            System.out.println("入");
            writeLock.lock();
            try {
                TimeUnit.DAYS.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.MILLISECONDS.sleep(1000L);
        readLock.lock();


        /**
         *    1.先获取读锁
         *    2.然后写锁，获取的时候需要所有的读锁都release掉（等待release）
         *    3.所有的读锁释放完之后，唤醒读锁
         *
         *    status -> 高16位代表写锁，获取数量，第十六位，代表读锁获取数量
         *    读写锁互斥
         */
    }
}
