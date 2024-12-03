package com.Injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//SETTER INJECTION
@Component
public class Person {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	@Value(value = "Krypto")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value(value = "18")
	public void setAge(int age) {
		this.age = age;
	}

}