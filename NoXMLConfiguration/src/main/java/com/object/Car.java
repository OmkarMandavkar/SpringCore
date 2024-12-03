package com.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value(value = "McLaren")
	String brand;
	
	@Autowired
	Engine engine;
	
	public void drive() {
		System.out.println("Brand: " + brand);
		engine.start();
		System.out.println("Long Drive");
	}
}
