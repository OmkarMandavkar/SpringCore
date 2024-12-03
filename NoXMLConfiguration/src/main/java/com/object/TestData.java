package com.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.AppConfig;

public class TestData {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Car x1 = (Car) app.getBean("car");
		x1.drive();
	}
}
