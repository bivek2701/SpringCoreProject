package com.javawebtutor.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/javawebtutor/collections/Collection-Spring-Module.xml");

		Emp obj = (Emp) context.getBean("emp");
		//obj.printEmployee();
		
		System.out.println(obj.getName());
		System.out.println(obj.getPhones());
		System.out.println(obj.getAddress());
	}

}
