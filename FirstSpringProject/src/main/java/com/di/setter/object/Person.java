package com.di.setter.object;

public class Person {

	private String name;
	private Mobile mobile;
	
	public void display() {
		System.out.println(name + " is using mobile");
		System.out.println(mobile.getBrand());
		mobile.ring();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
}
