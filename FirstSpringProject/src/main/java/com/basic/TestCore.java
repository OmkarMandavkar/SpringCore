package com.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCore {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("config.xml");
		
		BeanFactory factory = new XmlBeanFactory(r);
		
		
		Student student = (Student) factory.getBean("myStudent");
		student.bunk();
	}
}
