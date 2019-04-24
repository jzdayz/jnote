package com.example.jnote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ApacheDerby {
    public static void main(String[] args)throws  Exception{
        try (
                final Connection connection = DriverManager.getConnection("jdbc:derby:/Users/huqingfeng/Documents/doc/jnote/alltest/src/main/resources/db;create=true ")
                ){
            PreparedStatement sta  = connection.prepareStatement("create table pes_cs" +
                    "(" +
                    "    nick          varchar(45)                              not null " +
                    "        primary key," +
                    "    shop_id       bigint                                   not null ," +
                    "    type          tinyint(2) default 1                     not null ," +
                    "    simple_name   varchar(50)                              null ," +
                    "    lock_time     datetime   default '0000-00-00 00:00:00' null ," +
                    "    cs_status     tinyint(2) default 1                     not null ," +
                    "    modified_date datetime   default '0000-00-00 00:00:00' not null " +
                    ");");
        }

    }
}
