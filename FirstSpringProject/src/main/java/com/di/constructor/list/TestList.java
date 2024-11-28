package com.di.constructor.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstList.xml");
		
		Student s1 = (Student) app.getBean("StudentList");
		
		s1.display();
	}
}
