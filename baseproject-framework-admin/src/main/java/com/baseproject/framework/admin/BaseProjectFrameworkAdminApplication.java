package com.baseproject.framework.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan(value = "com.baseproject.framework.admin.model")
@MapperScan(basePackages = { "com.baseproject.framework.admin.dao" })
public class BaseProjectFrameworkAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkAdminApplication.class, args);
	}
}
