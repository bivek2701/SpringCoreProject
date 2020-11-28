package com.javawebtutor.ci;

public class person {

	private int personId;
	private String name;
	
	public person(String name,int personId)
	{
		this.name=name;
		this.personId=personId;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId;
	}
	
}
