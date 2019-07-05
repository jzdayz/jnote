package com.jdbc.sharding;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlRootShardingConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlShardingRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlTableRuleConfiguration;
import org.apache.shardingsphere.core.yaml.engine.YamlEngine;
import org.apache.shardingsphere.core.yaml.swapper.impl.ShardingRuleConfigurationYamlSwapper;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-20
 */
public class TestSharding {


    @Test
    public void testSharding() throws Exception{
        URL resource = Thread.currentThread().getClass().getResource("/hint-databases-tables.yml");
        DataSource dataSource = createDataSource(new File(resource.toURI()));
        HintManager instance = HintManager.getInstance();

        instance.addDatabaseShardingValue("pes_cs", 81477L);
        instance.addTableShardingValue("pes_cs", DateUtils.parseDate("2019-05-23", "yyyy-MM-dd"));

        instance.addDatabaseShardingValue("pes_name", 81477L);
        instance.addTableShardingValue("pes_name", DateUtils.parseDate("2019-04-23", "yyyy-MM-dd"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String insertSql = "insert into pes_cs (shop_id,name) value (null,'ee')";
        String querySql = "select * from pes_cs";
        int insert = jdbcTemplate.update(insertSql);
        System.out.println(insert);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(
                querySql);
        System.out.println(maps);

        instance.close();
    }

    @Test
    public void testJdbc() throws Exception {
        try (
                Connection connection = DriverManager
                        .getConnection("jdbc:mysql://auzblog.com:3306/test", "root", "auzblog");
        ) {
            Random random = new Random();
            for (int i = 0; i < Long.MAX_VALUE; i++) {

                String sql = "INSERT INTO test.table_name (id, name, count,time) VALUES (null, ?, ?,?)";
                try (
                        PreparedStatement preparedStatement =
                                connection.prepareStatement(sql)
                ){
                    String[] s = new String[]{"武极","对的","ddd"};

                    int i1 = random.nextInt(3);
                    preparedStatement.setString(1,s[i1]);
                    preparedStatement.setInt(2,random.nextInt(100));
                    preparedStatement.setDate(3,new Date(System.currentTimeMillis()));
                    preparedStatement.executeUpdate();
                    System.out.println(preparedStatement.getUpdateCount());
                }
                TimeUnit.MILLISECONDS.sleep(1000L);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("错误");
        }

    }

    /**
     *  test close resource
     *
     *  result : try 里面的资源会倒序释放
     *           就算多个资源报错了，仍旧保证已经申请的资源释放
     */
    @Test
    public void test1(){
        try (
                ResourceA resourceA = new ResourceA();
                ResourceB resourceB = new ResourceB()
                ){
            System.out.println("1");
        }catch (Exception e){

        }
        System.out.println("2");
    }

    public static DataSource createDataSource(final File yamlFile) throws SQLException, IOException {
        YamlRootShardingConfiguration config = YamlEngine.unmarshal(yamlFile, YamlRootShardingConfiguration.class);
        YamlShardingRuleConfiguration shardingRule = config.getShardingRule();
        shardingRule.getBindingTables().forEach(e -> {
            YamlTableRuleConfiguration value = new YamlTableRuleConfiguration();
            shardingRule.getTables().put(e, value);
            value.setDatabaseStrategy(shardingRule.getDefaultDatabaseStrategy());
            value.setTableStrategy(shardingRule.getDefaultTableStrategy());
            value.setKeyGenerator(shardingRule.getDefaultKeyGenerator());
        });

        return ShardingDataSourceFactory.createDataSource(config.getDataSources(), new ShardingRuleConfigurationYamlSwapper().swap(shardingRule), config.getProps());
    }

    private static class ResourceA implements AutoCloseable{

        @Override
        public void close()  {
            System.out.println(this.getClass().getName()+"--close");
        }
    }

    private static class ResourceB implements AutoCloseable{

        public ResourceB() {
            if (1==1)throw new RuntimeException();
        }

        @Override
        public void close() {
            System.out.println(this.getClass().getName()+"--close");
        }
    }


}
