package com.di.constructor.objects;

public class Car {

	String brand;
	Engine engine;

	public Car(String brand, Engine engine) {
		this.brand = brand;
		this.engine = engine;
	}

	public void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Engine cc: " + engine.cc);
	}
	
}
