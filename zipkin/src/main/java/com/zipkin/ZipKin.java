package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipKin {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(ZipKin.class, args);
        System.out.println();
    }
}
