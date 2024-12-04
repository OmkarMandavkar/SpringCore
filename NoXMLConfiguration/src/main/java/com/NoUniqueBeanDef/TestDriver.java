package com.NoUniqueBeanDef;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDriver {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Industry x1 = (Industry) app.getBean("industry");
		x1.budget();
	}
}
