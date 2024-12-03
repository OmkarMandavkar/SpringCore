package com.Injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("Injection.xml");

		Student s1 = (Student) app.getBean("student");
		System.out.println("Variable/Field Injection");
		s1.display();

		System.out.println("\n--------------------------------------------");

		Person p1 = (Person) app.getBean("person");
		System.out.println("Setter Injection");
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());

		System.out.println("\n--------------------------------------------");

		Teacher t1 = (Teacher) app.getBean("teacher");
		System.out.println("Constructor Injection");
		t1.display();
	}
}
