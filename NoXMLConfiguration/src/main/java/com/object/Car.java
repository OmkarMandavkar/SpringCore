package com.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "McLaren")
	String brand;

	//VARIABLE OR FIELD INJECTION
	// @Autowired 
	Engine engine;

	
	//SETTER INJECTION
	// @Autowired 
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// CONSTRUCTOR INJECTION
	@Autowired 
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		System.out.println("Brand: " + brand);
		engine.start();
		System.out.println("Long Drive");
	}
}
