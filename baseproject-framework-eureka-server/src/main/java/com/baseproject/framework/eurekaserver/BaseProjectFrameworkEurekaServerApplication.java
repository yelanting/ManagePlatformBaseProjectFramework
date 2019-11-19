/**
 * Project Name: baseproject-framework-eureka-server
 * File Name: BaseProjectFrameworkEurekaServerApplication.java
 * Package Name: com.baseproject.framework.eurekaserver
 * Date: 2019年11月18日 上午8:44:52
 * Copyright (c) 2019, qing121171@gmail.com All Rights Reserved.
 */
package com.baseproject.framework.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : 孙留平
 * @since : 2019年11月18日 上午8:44:52
 * @see :
 */
@SpringBootApplication
@EnableEurekaServer
public class BaseProjectFrameworkEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseProjectFrameworkEurekaServerApplication.class,
		        args);
	}
}