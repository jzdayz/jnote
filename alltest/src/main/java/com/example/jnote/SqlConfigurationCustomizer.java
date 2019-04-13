package com.example.jnote;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * @author huqingfeng
 * @date 2019/4/13
 */
@Component
public class SqlConfigurationCustomizer implements ConfigurationCustomizer {
    @Override
    public void customize(Configuration configuration) {
        Properties variables = configuration.getVariables();
        String enableSqlPrint = variables.getProperty("sql");
        Boolean enable = Boolean.valueOf(enableSqlPrint == null ? "false" : enableSqlPrint);
        if (enable) {
            configuration.addInterceptor(new PrintSqlInterceptor(configuration));
        }
    }
}
