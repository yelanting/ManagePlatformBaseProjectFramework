package com.baseproject.framework.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 * @author Administrator
 * @date Jan 15, 2019
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.louis.baseproject-framework"})
public class BaseProjectFrameworkBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkBackupApplication.class, args);
	}
}