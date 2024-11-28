package com.di.setter.listObjects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListObjects {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_SetterListObject.xml");

		Student s1 = (Student) cApp.getBean("StudentObject");
		s1.display();
	}
}
