package com.javawebtutor.collections;

import java.util.List;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Emp(String name, List<String> phones, Set<String> address) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
