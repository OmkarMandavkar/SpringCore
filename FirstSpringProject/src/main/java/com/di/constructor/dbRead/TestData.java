package com.di.constructor.dbRead;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("DI_ConstDbRead.xml");
		DBTest db = (DBTest) app.getBean("DBRead");
		
		db.display();
	}
}
