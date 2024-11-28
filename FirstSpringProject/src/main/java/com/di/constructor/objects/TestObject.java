package com.di.constructor.objects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObject {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstObjects.xml");
		
		Car car = (Car) app.getBean("CarObject");
		car.display();
	}

}
