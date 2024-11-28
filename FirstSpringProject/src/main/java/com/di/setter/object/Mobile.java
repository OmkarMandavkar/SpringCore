package com.di.setter.object;

public class Mobile {
	
	private String brand;
	
	public void ring() {
		System.out.println("Mobile is ringing");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
