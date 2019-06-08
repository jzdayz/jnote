package com.data.mbp;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.jdbc.PreparedStatementLogger;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.transaction.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * @author huqingfeng
 * @date 2019/4/13
 */
@Component
@Profile("(dev&prod)|aa")
public class SqlConfigurationCustomizer implements ConfigurationCustomizer, EnvironmentAware {

    private Environment environment;

    @Override
    public void customize(Configuration configuration) {
        configuration.addInterceptor(new PrintSqlInterceptor(configuration));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    static class PrintSqlInterceptor implements Interceptor {

        private Configuration configuration;

        PrintSqlInterceptor(Configuration configuration) {
            this.configuration = configuration;
        }

        private  final Logger LOGGER = LoggerFactory.getLogger(PrintSqlInterceptor.class);
        @Override
        public Object intercept(Invocation invocation) throws Throwable {
            // don't invoke
            return null;
        }

        @Override
        public Object plugin(Object target) {
            if (target instanceof CachingExecutor){
                CachingExecutor executor = (CachingExecutor) target;
                Transaction transaction = executor.getTransaction();
                try {
                    Field delegate = target.getClass().getDeclaredField("delegate");
                    ReflectionUtils.makeAccessible(delegate);
                    Object delegateTarget = delegate.get(target);
                    if (delegateTarget.getClass().equals(SimpleExecutor.class))
                        target = new CachingExecutor(new PrintSqlInterceptor.CustomSimpleExecutor(configuration,transaction));
                } catch (Exception e) {
                    LOGGER.error(" print sql error ",e);
                }
            }
            return target;
        }

        @Override
        public void setProperties(Properties properties) {

        }

        static class CustomSimpleExecutor extends SimpleExecutor {

            private static boolean druid = false;

            static {
                try {
                    ClassUtils.forName("com.alibaba.druid.pool.DruidPooledPreparedStatement",null);
                    druid = true;
                }catch (Exception e){
                    //ignore
                }
            }

            private static final Logger LOGGER = LoggerFactory.getLogger(PrintSqlInterceptor.CustomSimpleExecutor.class);

            CustomSimpleExecutor(org.apache.ibatis.session.Configuration configuration, Transaction transaction) {
                super(configuration, transaction);
            }
            @Override
            public int doUpdate(MappedStatement ms, Object parameter) throws SQLException {
                Statement stmt = null;
                try {
                    org.apache.ibatis.session.Configuration configuration = ms.getConfiguration();
                    StatementHandler handler = configuration.newStatementHandler(this, ms, parameter, RowBounds.DEFAULT, null, null);
                    stmt = prepareStatement(handler, ms.getStatementLog());
                    return handler.update(stmt);
                } finally {
                    closeStatement(stmt);
                }
            }

            @Override
            public <E> List<E> doQuery(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
                Statement stmt = null;
                try {
                    org.apache.ibatis.session.Configuration configuration = ms.getConfiguration();
                    StatementHandler handler = configuration.newStatementHandler(wrapper, ms, parameter, rowBounds, resultHandler, boundSql);
                    stmt = prepareStatement(handler, ms.getStatementLog());
                    return handler.query(stmt, resultHandler);
                } finally {
                    closeStatement(stmt);
                }
            }

            @Override
            protected <E> Cursor<E> doQueryCursor(MappedStatement ms, Object parameter, RowBounds rowBounds, BoundSql boundSql) throws SQLException {
                org.apache.ibatis.session.Configuration configuration = ms.getConfiguration();
                StatementHandler handler = configuration.newStatementHandler(wrapper, ms, parameter, rowBounds, null, boundSql);
                Statement stmt = prepareStatement(handler, ms.getStatementLog());
                stmt.closeOnCompletion();
                return handler.queryCursor(stmt);
            }

            @Override
            public List<BatchResult> doFlushStatements(boolean isRollback) {
                return Collections.emptyList();
            }

            private Statement prepareStatement(StatementHandler handler, Log statementLog) throws SQLException {
                Statement stmt;
                java.sql.Connection connection = getConnection(statementLog);
                stmt = handler.prepare(connection, transaction.getTimeout());
                handler.parameterize(stmt);
                if (java.lang.reflect.Proxy.isProxyClass(stmt.getClass())){
                    Field h;
                    try {
                        h = stmt.getClass().getSuperclass().getDeclaredField("h");
                        h.setAccessible(true);
                        Object o = h.get(stmt);
                        String sqlString = null;

                        if (o instanceof PreparedStatementLogger){
                            PreparedStatementLogger state = (PreparedStatementLogger) o;
                            final PreparedStatement preparedStatement = state.getPreparedStatement();
                            if (druid){
//                                if (preparedStatement instanceof DruidPooledPreparedStatement){
//                                    final DruidPooledPreparedStatement st = (DruidPooledPreparedStatement) preparedStatement;
//                                    final PreparedStatementProxyImpl rawPreparedStatement = (PreparedStatementProxyImpl)st.getRawPreparedStatement();
//                                    sqlString = rawPreparedStatement.getRawObject().toString();
//                                }
                            }
                            /*hikariCp*/
                            if (sqlString==null)
                                sqlString = preparedStatement.toString();
                            if (sqlString.contains(":")){
                                sqlString = "\n"+sqlString.substring(sqlString.indexOf(":")+1);
                            }
                            LOGGER.info(" SQL : {} ", sqlString);
                        }
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage(),e);
                    }
                }
                return stmt;
            }

        }
    }
}
