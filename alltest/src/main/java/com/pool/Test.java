package com.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-03
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Properties po = new Properties();
        po.put("url","jdbc:mysql://182.254.131.140/pes_jd_sub_01?serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");
        po.put("username","wangmeng");
        po.put("password","Ywc201405");
        try (
                SpeedDataSource speedDataSource = new SpeedDataSource(po);
                ){
            Connection connection = speedDataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select count(1) as count from pes_order");
            boolean execute = preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            boolean next = resultSet.next();
            int count = resultSet.getInt("count");
            System.out.println(count);
        }

    }

    @org.junit.Test
    public void show(){

    }
}
