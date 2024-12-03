package com.Injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//VARIABLE INJECTION
@Component
public class Student {

	@Value(value = "ZEUS")
	String name;

	@Value(value = "18")
	int age;

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
