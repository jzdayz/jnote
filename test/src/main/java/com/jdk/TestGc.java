package com.jdk;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-25
 */
public class TestGc {

    private static class Gc {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("gc 回收");
        }
    }


    public static void main(String[] args) throws Exception {

        Gc str = new Gc();
        ThreadLocal<Gc> th = new ThreadLocal<>();
        th.set(str);
        // 取消threadLocal的强引用，让垃圾回收器回收threadLocal对象，但是其value还在
        th = null;

        Thread thread = Thread.currentThread();
        Field threadLocals = thread.getClass().getDeclaredField("threadLocals");
        threadLocals.setAccessible(true);
        Object o = threadLocals.get(thread);
        System.out.println(o);

        System.gc();

        TimeUnit.SECONDS.sleep(1L);

        thread = Thread.currentThread();
        threadLocals = thread.getClass().getDeclaredField("threadLocals");
        threadLocals.setAccessible(true);
        o = threadLocals.get(thread);
        System.out.println(o);


    }


}
