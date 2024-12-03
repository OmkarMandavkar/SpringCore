package com.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//SETTER INJECTION
@Component
public class Student {

	private String name;
	private String email;
	private int age;

	public String getName() {
		return name;
	}

	@Value(value = "Krypto")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Value(value = "Krypto@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	@Value(value = "22")
	public void setAge(int age) {
		this.age = age;
	}
}