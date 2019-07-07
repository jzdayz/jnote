package org.data.sql;

import java.sql.*;

public class ApacheDerby {
    public static void main(String[] args)throws  Exception{
        try (
                final Connection connection = DriverManager.getConnection(
                        "jdbc:derby:/Users/huqingfeng/Documents/doc/jnote/alltest/src/web/resources/db;create=true;user=sa;password=123")
                ){
            Statement st = connection.createStatement();
//            st.execute("create table foo (FOOID INT NOT NULL,FOONAME VARCHAR(30) NOT NULL)");//创建foo表
//            st.executeUpdate("insert into foo(FOOID,FOONAME) values (1,'chinajash')");//插入一条数据
            ResultSet rs = st.executeQuery("select * from ttt");//读取刚插入的数据
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("id="+id+";name="+name);
            }
            rs.close();
            st.close();
        }

    }
}
