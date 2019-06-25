package com.jdbc.sharding;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlRootShardingConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlShardingRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlTableRuleConfiguration;
import org.apache.shardingsphere.core.yaml.engine.YamlEngine;
import org.apache.shardingsphere.core.yaml.swapper.impl.ShardingRuleConfigurationYamlSwapper;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-20
 */
public class TestSharding {
    public static void main(String[] args) throws Exception{
        URL resource = Thread.currentThread().getClass().getResource("/hint-databases-tables.yml");
        DataSource dataSource = createDataSource(new File(resource.toURI()));
        HintManager instance = HintManager.getInstance();

        instance.addDatabaseShardingValue("pes_cs", 81477L);
        instance.addTableShardingValue("pes_cs", DateUtils.parseDate("2019-05-23","yyyy-MM-dd"));

        instance.addDatabaseShardingValue("pes_name", 81477L);
        instance.addTableShardingValue("pes_name", DateUtils.parseDate("2019-04-23","yyyy-MM-dd"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from pes_cs a , pes_name b where a.shop_id = b.cs_id");
        System.out.println(maps);

        instance.close();

    }

    public static DataSource createDataSource(final File yamlFile) throws SQLException, IOException {
        YamlRootShardingConfiguration config = YamlEngine.unmarshal(yamlFile, YamlRootShardingConfiguration.class);
        YamlShardingRuleConfiguration shardingRule = config.getShardingRule();
        shardingRule.getBindingTables().forEach(e->{
            YamlTableRuleConfiguration value = new YamlTableRuleConfiguration();
            shardingRule.getTables().put(e, value);
            value.setDatabaseStrategy(shardingRule.getDefaultDatabaseStrategy());
            value.setTableStrategy(shardingRule.getDefaultTableStrategy());
            value.setKeyGenerator(shardingRule.getDefaultKeyGenerator());
        });

        return ShardingDataSourceFactory.createDataSource(config.getDataSources(), new ShardingRuleConfigurationYamlSwapper().swap(shardingRule), config.getProps());
    }


}
