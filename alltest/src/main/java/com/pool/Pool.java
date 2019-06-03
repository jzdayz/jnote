package com.pool;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-03
 */
public class Pool implements Closeable {

    private volatile ProxyConnection[] proxyConnectionPools;

    public Pool(Properties properties) {
        int size = (int) properties.getOrDefault("size", Runtime.getRuntime().availableProcessors());
        proxyConnectionPools = new ProxyConnection[size];
        if (!(Boolean) properties.getOrDefault("lazy",false)){
            int index = size;
            while (index>0){
                proxyConnectionPools[--index] = new ProxyConnection(properties);
            }
        }
    }

    public Connection getConnection(long timeOut, TimeUnit timeUnit){

        long time = System.currentTimeMillis();

        while (true){
            for (ProxyConnection proxyConnectionPool : proxyConnectionPools) {
                Connection connection = proxyConnectionPool.getConnection();
                if (connection !=null){
                    return connection;
                }
            }
            if (timeUnit.toSeconds(timeOut)<=(System.currentTimeMillis()-time)){
                // time out
                System.err.println("time out");
                return null;
            }
        }
    }

    @Override
    public void close() throws IOException {
        for (ProxyConnection proxyConnectionPool : proxyConnectionPools) {
            proxyConnectionPool.close();
        }
    }
}
