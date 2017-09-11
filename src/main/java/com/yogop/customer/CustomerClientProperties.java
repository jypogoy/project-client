package com.yogop.customer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 6:19 PM
 */
@Component
@ConfigurationProperties("customer.client")
@Data
public class CustomerClientProperties {

    private char[] password;
    private String customerServiceUrl;

}
