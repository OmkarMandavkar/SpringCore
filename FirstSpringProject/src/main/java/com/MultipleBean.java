package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleBean {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) app.getBean("myStudent");
		student.bunk();
		
		//multiple bean classes inside one configuration file
		Person person = (Person) app.getBean("myPerson"); 
		person.run();
	}
}
