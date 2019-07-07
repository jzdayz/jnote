package org.data.sql;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.RandomStringUtils;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public class HikariTest {
    public static void main(String[] args) throws Exception{

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://auzblog.com:3306");
        config.setUsername("root");
        config.setPassword("jkljkljkl");
        config.setMaximumPoolSize(1);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.setRegisterMbeans(true);
        HealthCheckRegistry healthCheckRegistry = new HealthCheckRegistry();
        config.setHealthCheckRegistry(healthCheckRegistry);
        MetricRegistry metricRegistry = new MetricRegistry();
        config.setMetricRegistry(metricRegistry);

        HikariDataSource ds = new HikariDataSource(config);


        metricRegistry.getHistograms();



        final HealthCheck.Result result = healthCheckRegistry.runHealthCheck("HikariPool-1.pool.ConnectivityCheck");
        System.out.println(result);


//
//
        final Connection connection = ds.getConnection();

        final PreparedStatement preparedStatement = connection.prepareStatement("   select 1   ");

        preparedStatement.execute();

        final ResultSet resultSet = preparedStatement.getResultSet();


        System.out.println();


//        connection.close();
//
//        final Connection connection1 = ds.getConnection();
//
//
//
        Thread.sleep(1000100);

//        new HikariTest().show();
    }

    public void show(){
        AtomicBoolean bb = new AtomicBoolean(false);
        Thread t = new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(1500);
                    System.out.println("111111");
                    if (bb.get()){
                        System.out.println("暂停开始");
                        LockSupport.park();
                        System.out.println("暂停结束");
                        bb.set(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        Scanner scanner = new Scanner(System.in);
        while (true){
            final String next = scanner.next();
            if (Objects.equals(next,"stop")){
                bb.set(true);
            }else if (Objects.equals(next,"start")){
                LockSupport.unpark(t);
            }
        }

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
        final ObjectName beanPoolName = new ObjectName("HikariTest.Hello:type=Hello ( AA )");
        mBeanServer.registerMBean(hello,beanPoolName);
        while (true){
            Thread.sleep(10000);
            hello.show();
        }
    }

}
