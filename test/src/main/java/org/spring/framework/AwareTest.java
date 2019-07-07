package org.spring.framework;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class AwareTest implements EnvironmentAware , LoadTimeWeaverAware {
    @Override
    public void setEnvironment(Environment environment) {
        final boolean dev = environment.acceptsProfiles(Profiles.of("!(aa|prod)&dev"));
        System.out.println(dev);
    }

    public static void main(String[] args) {
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
        final Set<BeanDefinition> candidateComponents = provider.findCandidateComponents("com.example.jnote");
        System.out.println();
    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
        System.out.println(loadTimeWeaver);
    }
}
