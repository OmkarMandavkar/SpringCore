package com.basic;

import org.springframework.stereotype.Component;

@Component(value = "personObj")
public class PersonApp {

	public void dance() {
		System.out.println("Person is dancing");
	}
}
