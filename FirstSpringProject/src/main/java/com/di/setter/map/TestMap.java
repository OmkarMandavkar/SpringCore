package com.di.setter.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext capp = new ClassPathXmlApplicationContext("DI_SetterMap.xml");
		
		Shop s1= (Shop) capp.getBean("ShopObject"); 
		s1.display();
	}
}
