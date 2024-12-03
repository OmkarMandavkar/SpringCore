package com.Injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//CONSTRUCTOR INJECTION
@Component
public class Teacher {

	String name;
	int id;

	public Teacher() {
	}

	public Teacher(@Value(value = "Poseidon") String name, @Value(value = "18") int id) {
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}
}
