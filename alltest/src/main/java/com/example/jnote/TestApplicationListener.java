package com.example.jnote;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("test application ");
    }
}
