package com.pool;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class ProxyConnection implements Closeable {

    private static final AtomicIntegerFieldUpdater<ProxyConnection> fieldUpdater =
            AtomicIntegerFieldUpdater.newUpdater(ProxyConnection.class, "status");

    private final static int IN_USE = 1;

    private final static int IDLE = 2;

    private Connection connection;

    private Connection target;

    private volatile int status = IDLE;

    public ProxyConnection(Properties properties) {
        try {
            target = DriverManager.getConnection(
                    properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        this.connection = (Connection) Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class[]{Connection.class},(proxy, method, args)->{

                    // todo 可能操作了数据但是没有提交 需要rollBack
                    String methodName = method.getName();
                    // Object proxy, Method method, Object[] args
                    if ("abort".equals(methodName)) {
                        return Void.TYPE;
                    }
                    if ("close".equals(methodName)) {
                        return Void.TYPE;
                    }
                    if ("toString".equals(methodName)) {
                        return getClass().toString();
                    }
                    return method.invoke(target,args);
                });
    }

    public Connection getConnection() {
        if (fieldUpdater.compareAndSet(this,IDLE,IN_USE)){
            return connection;
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        try {
            if (connection!=null) {
                target.close();
                status = IDLE;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}