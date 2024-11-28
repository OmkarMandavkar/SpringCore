package com.di.constructor.listObjects;

public class Subject {

	String name;
	int days;
	
	public Subject(String name, int days) {
		this.name = name;
		this.days = days;
	}
	
    @Override
    public String toString() {
        return "Subject Name: " + name + ", Days: " + days;
    }
}
