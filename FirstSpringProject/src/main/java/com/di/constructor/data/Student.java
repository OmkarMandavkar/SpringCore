package com.di.constructor.data;

public class Student {

	String name;
	String email;
	int age;

	public Student(String name, String email, int age) {
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
