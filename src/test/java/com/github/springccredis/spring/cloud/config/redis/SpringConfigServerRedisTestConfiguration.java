package com.github.springccredis.spring.cloud.config.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kumar ( )
 */
@EnableConfigServerRedis
@SpringBootApplication
public class SpringConfigServerRedisTestConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerRedisTestConfiguration.class, args);
    }
}
