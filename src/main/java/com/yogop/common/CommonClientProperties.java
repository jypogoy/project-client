package com.yogop.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 8:56 PM
 */
@Component
@ConfigurationProperties("common.client")
@Data
public class CommonClientProperties {

    private int readTimeout;
    private int connectTimeout;
    private String username;

}
