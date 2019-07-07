package com.ms1;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-11
 */
@Component
public class TestResolver implements EmbeddedValueResolverAware {


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        resolver.resolveStringValue("${file.separator}");
        resolver.resolveStringValue("${file.separator}");
    }
}
