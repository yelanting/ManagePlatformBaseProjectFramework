package com.baseproject.framework.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 启动器
 * @author Administrator
 * @date Jan 23, 2019
 */
@EnableTurbine
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class BaseProjectFrameworkHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkHystrixApplication.class, args);
	}
	
}