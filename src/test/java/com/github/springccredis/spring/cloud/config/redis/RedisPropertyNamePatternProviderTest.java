package com.github.springccredis.spring.cloud.config.redis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author kumar ( )
 */
public class RedisPropertyNamePatternProviderTest {

    RedisPropertyNamePatternProvider keysUtilities = new RedisPropertyNamePatternProvider();

    @Test
    public void shouldReturnExpectedRedisKey() {
        String expectedKey = "application:default:master:*";

        String actualKey = keysUtilities.generateKeyPattern("application", "default", "master");

        assertThat(actualKey, is(expectedKey));
    }

    @Test
    public void shouldExtractThePropertyNameAndReplaceColonWithPeriod() {
        String expectedPropertyName = "format.date";

        String actualPropertyName = keysUtilities.formatRedisKeyIntoPropertyName("application", "default", "master",
                                                                            "application:default:master:format:date");

        assertThat(actualPropertyName, is(expectedPropertyName));
    }
}