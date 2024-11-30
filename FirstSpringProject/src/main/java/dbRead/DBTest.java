package com.di.constructor.dbRead;

public class DBTest {

	String url;
	String userName;
	String password;

	public DBTest() {
	}

	public DBTest(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public void display() {
		System.out.println("URL: " + url);
		System.out.println("USERNAME: " + userName);
		System.out.println("PASSWORD: " + password);
	}

}