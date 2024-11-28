package com.di.constructor.data;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstData {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstData.xml");
		
		Student s1 = (Student) app.getBean("StudentObject");
		s1.display();
	}
}
