package com.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestData {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Student x1 = (Student) app.getBean("student");
		System.out.println(x1);

		Student x2 = (Student) app.getBean("student");
		System.out.println(x2);

		Student x3 = (Student) app.getBean("student");
		System.out.println(x3);

		Student x4 = (Student) app.getBean("student");
		x4.display();

	}
}
