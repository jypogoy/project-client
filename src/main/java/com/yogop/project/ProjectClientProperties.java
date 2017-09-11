package com.yogop.project;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 4:38 PM
 */
@Component
@ConfigurationProperties("project.client")
@Data
public class ProjectClientProperties {

   private char[] password;
   private String projectServiceUrl;

}
