package com.di.setter.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {

		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_SetterList.xml");
		
		Student s1 = (Student) cApp.getBean("StudentList");
		s1.display();
	}

}
