package com.di.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_Setter.xml");
		
		Student s1 = (Student) cApp.getBean("StudentSetter");
		
		System.out.println("----------Student----------");
		System.out.println(s1.getSid());
		System.out.println(s1.getName());
	}

}
