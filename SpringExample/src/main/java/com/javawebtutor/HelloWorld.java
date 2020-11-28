package com.javawebtutor;

public class HelloWorld {
	private String name;
	private int id;

	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public void printHello() {
		System.out.println("Hello ! " + "id:" + id + "name:" +name);
	}
}