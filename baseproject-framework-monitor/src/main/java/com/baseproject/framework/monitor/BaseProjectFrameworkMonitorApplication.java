package com.baseproject.framework.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 启动器
 * @author Administrator
 * @date Jan 15, 2019
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class BaseProjectFrameworkMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkMonitorApplication.class, args);
	}
}