package com.yogop;

import com.yogop.customer.CustomerClient;
import com.yogop.project.ProjectClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectClientApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ProjectClientApplication.class);

	@Autowired
	private ProjectClient projectClient;

	@Autowired
	private CustomerClient customerClient;

	public static void main(String[] args) {
		SpringApplication.run(ProjectClientApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		logger.info(">> Calling Project Service");
		logger.info(projectClient.getAllProjects());
		logger.info("<< Finished Calling Project Service");
		logger.info("----------------------------------------");
		logger.info(">> Calling Customer Service");
		logger.info(customerClient.getAllCustomers());
		logger.info("<< Finished Calling Customer Service");
	}
}
