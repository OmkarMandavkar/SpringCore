package com.di.setter.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObject {

	public static void main(String[] args) {

		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_SetterObject.xml");
	
		Person p1 = (Person) cApp.getBean("PersonObject");
		p1.display();

	}

}
