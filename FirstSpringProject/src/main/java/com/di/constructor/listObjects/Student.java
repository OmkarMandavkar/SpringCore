package com.di.constructor.listObjects;

import java.util.List;

public class Student {

	String name;

	List<Subject> subjects;

	public Student(String name, List<Subject> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("---------- Student ----------");
		System.out.println("Name: " + name);

		System.out.println("\n---------- Subject ----------");
		for (Subject subject : subjects) {
			System.out.println("Subject: " + subject.name);
			System.out.println("Duration: " + subject.days + " days");
			System.out.println("-----------------------------");
		}
	}

}
