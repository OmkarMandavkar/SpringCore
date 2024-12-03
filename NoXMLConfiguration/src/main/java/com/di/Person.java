package com.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//VARIABLE INJECTION
@Component
public class Person {

	@Value(value = "Zeus")
	String name;

	@Value(value = "Zeus@gmail.com")
	String email;

	@Value(value = "20")
	int age;

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
	}
}