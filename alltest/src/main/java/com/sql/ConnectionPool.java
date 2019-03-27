package com.sql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPool {

    private CopyOnWriteArrayList<Entry> list = new CopyOnWriteArrayList<>();


    public ConnectionPool() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Entry{
        private Connection connection;

        public Entry(Connection connection) {
            this.connection = connection;
        }
    }

    public void init() throws Exception{
        list.add(new Entry(DriverManager.getConnection("jdbc:mysql://auzblog.com:3306/mysql","root","jkljkljkl")));
        list.add(new Entry(DriverManager.getConnection("jdbc:mysql://auzblog.com:3306/mysql","root","jkljkljkl")));
    }

    private static Lock LOCK = new ReentrantLock();
    private int index = -1;

    public Connection getConnection(){
        try {
            LOCK.lockInterruptibly();
            index++;
            return list.get(index).connection;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            LOCK.unlock();
        }
        throw new RuntimeException("error");
    }

    public static void main(String[] args)throws Exception {

        ConnectionPool pool = new ConnectionPool();
        final Connection connection = pool.getConnection();
        final Connection connection1 = pool.getConnection();
        System.out.println(connection == connection1);
        Thread.sleep(100000);
    }

}
