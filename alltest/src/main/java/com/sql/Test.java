package com.sql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.RandomStringUtils;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws Exception{

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://auzblog.com:3306");
        config.setUsername("root");
        config.setPassword("jkljkljkl");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.setRegisterMbeans(true);
        HikariDataSource ds = new HikariDataSource(config);


        final Connection connection = ds.getConnection();



        Thread.sleep(1000100);


    }

    @org.junit.Test
    public void testSynchronousQueue() throws InterruptedException {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,2,1, TimeUnit.DAYS,new LinkedBlockingQueue<>()
        );
        threadPoolExecutor.execute(()->{
            while (true){
                String s = RandomStringUtils.random(2);
                System.out.println(String.format("\n 生产东西：%s \n ",s));
                try {
                    synchronousQueue.put(s);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPoolExecutor.execute(()->{
            while (true){
                try {
                    System.out.println(String.format("\n消费：%s\n",synchronousQueue.take()));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


    interface HelloMXBean{
        int getInt();
    }

    public class Hello implements HelloMXBean{

        private volatile int hello;

        public void setHello(int hello) {
            this.hello = hello;
        }

        @Override
        public int getInt() {
            return hello;
        }

        public void show(){
            System.out.println(" value :  "+hello);
        }

    }

    @org.junit.Test
    public void test() throws Exception{
        final MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        Hello hello = new Hello();
        hello.setHello(100);
        hello.show();
        final ObjectName beanPoolName = new ObjectName("com.sql.Test.Hello:type=Hello ( AA )");
        mBeanServer.registerMBean(hello,beanPoolName);
        while (true){
            Thread.sleep(10000);
            hello.show();
        }
    }

}
