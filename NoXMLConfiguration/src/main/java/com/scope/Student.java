package com.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {

	@Value("${name}")
	private String name;

	@Value("${email}")
	private String email;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void display() {
		System.out.println("UserName: " + name);
		System.out.println("Email: " + email);
	}

	public void study() {
		System.out.println("Get Job");
	}
}
