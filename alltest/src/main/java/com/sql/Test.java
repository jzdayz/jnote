package com.sql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.sql.Connection;

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
