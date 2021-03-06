package com.github.springccredis.spring.cloud.config.redis;

import org.springframework.cloud.config.environment.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kumar ( )
 */
public class PropertySourceBuilder {

    private String name;
    private Map<String, String> propertyMap = new HashMap<>();

    public static PropertySourceBuilder aPropertySource() {
        return new PropertySourceBuilder();
    }

    public PropertySourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PropertySourceBuilder withProperty(String key, String value) {
        this.propertyMap.put(key, value);
        return this;
    }

    public PropertySource build() {
        return new PropertySource(name, propertyMap);
    }
}
