package com.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestData {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Person p1 = (Person) app.getBean("person");
		p1.display();

		System.out.println("\n-------------------------------");

		Student x2 = (Student) app.getBean("student");
		System.out.println(x2.getName());
		System.out.println(x2.getEmail());
		System.out.println(x2.getAge());

		System.out.println("\n-------------------------------");

		Teacher x3 = (Teacher) app.getBean("teacher");
		x3.display();
	}

}
