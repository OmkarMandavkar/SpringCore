package com.beanAnnotation;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class AppConfig {

	@Bean(value = "student")
	@Scope(value = "prototype")
	public Student getStudent() {
		return new Student();
	}

	@Bean
	public List<String> getList() {
		return Arrays.asList("Java", "Sql");
	}

	/*
	@Bean
	public Connection getConn() {
		// load the driver
		// create the connection

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("");
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
	*/
}
