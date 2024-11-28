package com.di.constructor.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstMap.xml");

		Shop s1 = (Shop) app.getBean("ShopObject");
		s1.display();
	}
}
