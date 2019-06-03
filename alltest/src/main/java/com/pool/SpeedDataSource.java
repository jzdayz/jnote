package com.pool;

import javax.sql.DataSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Logger;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-03
 */
public class SpeedDataSource implements DataSource , Closeable {

    private Pool pool;

    private Properties properties;

    public SpeedDataSource(Properties properties) {
        this.properties = properties;
        pool = new Pool(properties);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return pool.getConnection(1,TimeUnit.MINUTES);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public void close() throws IOException {
        pool.close();
    }
}
