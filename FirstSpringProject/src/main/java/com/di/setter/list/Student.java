package com.di.setter.list;

import java.util.List;

public class Student {

	private String name;
	private int sid;
	
	private List<String> subjects;
	
	public void display() {
		System.out.println("----------Student----------");
		System.out.println(name);
		System.out.println(sid);
		
		System.out.println("\n----------Subjects----------");
		for (String sub : subjects) {
			System.out.println(sub);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
}