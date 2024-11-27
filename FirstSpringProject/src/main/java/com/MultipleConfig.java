package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleConfig {

	public static void main(String[] args) {
		ApplicationContext app1 = new ClassPathXmlApplicationContext("config.xml");
		
		Student s1 = (Student) app1.getBean("myStudent");
		s1.bunk();
		
		Person p1 = (Person) app1.getBean("myPerson");
		p1.run();
		
		
		ApplicationContext app2 = new ClassPathXmlApplicationContext("config1.xml");
		
		Student s2 = (Student) app2.getBean("Student2");
		s2.bunk();
		
	}
}