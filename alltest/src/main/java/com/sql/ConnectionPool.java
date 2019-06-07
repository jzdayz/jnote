//package com.sql;
//
//import com.zaxxer.hikari.pool.ProxyConnection;
//
//import javax.sql.DataSource;
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Proxy;
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.concurrent.*;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.LockSupport;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class ConnectionPool {
//
//    private CopyOnWriteArrayList<Entry> list = new CopyOnWriteArrayList<>();
//
//
//    public ConnectionPool() {
//        try {
//            init();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private class Entry{
//        private Connection connection;
//
//        public Entry(Connection connection) {
//            this.connection = connection;
//        }
//    }
//
//    public void init() throws Exception{
//        list.add(new Entry(DriverManager.getConnection("jdbc:mysql://auzblog.com:3306/mysql","root","jkljkljkl")));
//        list.add(new Entry(DriverManager.getConnection("jdbc:mysql://auzblog.com:3306/mysql","root","jkljkljkl")));
//    }
//
//    private static Lock LOCK = new ReentrantLock();
//    private int index = -1;
//
//    public Connection getConnection(){
//        try {
//            LOCK.lockInterruptibly();
//            index++;
//            return list.get(index).connection;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }finally {
//            LOCK.unlock();
//        }
//        throw new RuntimeException("error");
//    }
//
//    public static void main(String[] args)throws Exception {
//
//        ConnectionPool pool = new ConnectionPool();
//        final Connection connection = pool.getConnection();
//        connection.close();
//
//        System.out.println(connection == ClosedConnection.CLOSED_CONNECTION);
//    }
//    private static final class ClosedConnection
//    {
//        static final Connection CLOSED_CONNECTION = getClosedConnection();
//
//        private static Connection getClosedConnection()
//        {
//            InvocationHandler handler = (proxy, method, args) -> {
//                final String methodName = method.getName();
//                if ("isClosed".equals(methodName)) {
//                    return Boolean.TRUE;
//                }
//                else if ("isValid".equals(methodName)) {
//                    return Boolean.FALSE;
//                }
//                if ("abort".equals(methodName)) {
//                    return Void.TYPE;
//                }
//                if ("close".equals(methodName)) {
//                    return Void.TYPE;
//                }
//                else if ("toString".equals(methodName)) {
//                    return ClosedConnection.class.getCanonicalName();
//                }
//
//                throw new SQLException("Connection is closed");
//            };
//
//            return (Connection) Proxy.newProxyInstance(Connection.class.getClassLoader(), new Class[] { Connection.class }, handler);
//        }
//    }
//
//}
