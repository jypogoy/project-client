package com.yogop.customer;

import com.yogop.common.CommonClientProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 6:16 PM
 */
@Component
public class CustomerClient {

    private final RestOperations rest;

    private final String customerServiceUrl;

    public CustomerClient(final RestTemplateBuilder builder, final CommonClientProperties commonProps, final CustomerClientProperties customerProps) {
        this.rest = builder.setReadTimeout(commonProps.getReadTimeout())
                .setConnectTimeout(commonProps.getConnectTimeout())
                .basicAuthorization(commonProps.getUsername(), String.valueOf(customerProps.getPassword()))
                .build();
        this.customerServiceUrl = customerProps.getCustomerServiceUrl();
    }

    public String getAllCustomers() {
        return rest.getForObject(customerServiceUrl, String.class);
    }

}
