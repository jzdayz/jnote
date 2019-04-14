package com.example.jnote;

import org.springframework.boot.jdbc.DatabaseDriver;

public class A {
    public void show(){
        a();
    }



    private void a(){
        System.out.println("AAAA");
    }

    public static void main(String[] args) {


        DatabaseDriver.fromJdbcUrl("jdbc:mysql://182.254.131.140/pes_jd_sub1?serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");

    }
}
