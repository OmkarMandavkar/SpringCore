package com.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//CONSTRUCTOR INJECTION
@Component
public class Teacher {

	String name;
	String email;
	int age;

	public Teacher(@Value(value = "Krypto") String name, @Value(value = "Krypto@gmail.com") String email, @Value(value = "30") int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
	}
}
