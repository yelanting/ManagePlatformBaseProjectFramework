package com.baseproject.framework.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseProjectFrameworkProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkProducerApplication.class, args);
	}
}