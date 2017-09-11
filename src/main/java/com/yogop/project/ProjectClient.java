package com.yogop.project;

import com.yogop.common.CommonClientProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 4:36 PM
 */
@Component
public class ProjectClient {

    private final RestOperations rest;

    private final String projectServiceUrl;

    public ProjectClient(final RestTemplateBuilder builder, final CommonClientProperties commonProps, final ProjectClientProperties projectProps) {
        this.rest = builder.setReadTimeout(commonProps.getReadTimeout())
                    .setConnectTimeout(commonProps.getConnectTimeout())
                    .basicAuthorization(commonProps.getUsername(), String.valueOf(projectProps.getPassword()))
                    .build();
        this.projectServiceUrl = projectProps.getProjectServiceUrl();
    }

    public String getAllProjects() {
        return rest.getForObject(projectServiceUrl, String.class);
    }
}
