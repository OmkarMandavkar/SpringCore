package com.basic;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Student x1 = (Student) app.getBean("student");
		x1.play();

		PersonApp x2 = (PersonApp) app.getBean("personObj"); //default bean id for this class is 'personObj'
		x2.dance();

		RCB x3 = (RCB) app.getBean("RCB");
		x3.play();
	}
}