package com.example.jnote;

import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.stereotype.Component;

@Component
public class A implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        final boolean dev = environment.acceptsProfiles(Profiles.of("!(aa|prod)&dev"));
        System.out.println(dev);
    }
}
