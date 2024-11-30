package com.postConstruct_preDestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("ConstructAndDestroy.xml");

		Person p1 = (Person) app.getBean("PersonObject");
		app.close();
	}
}
