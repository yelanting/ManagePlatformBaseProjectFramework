package com.baseproject.framework.admin.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * Mybatis配置
 * 
 * @see 扫描DAO
 * @author Administrator
 * @date Jan 11, 2019
 */
@Configuration
@MapperScan("com.baseproject.framework.**.dao")
public class MybatisConfig {
	@Autowired
	private DataSource dataSource;

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory
		        // 扫描Model
		        .setTypeAliasesPackage("ccom.baseproject.framework.**.model");

		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory.setMapperLocations(
		        // 扫描映射文件
		        resolver.getResources("classpath*:**/sqlmap/*.xml"));

		return sessionFactory.getObject();
	}
}