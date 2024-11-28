package com.di.constructor.listObjects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListObjects {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstListObjects.xml");

		Student s1 = (Student) app.getBean("StudentObject");
		s1.display();

	}
}
