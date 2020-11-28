package com.javawebtutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		Employee obj = (Employee) context.getBean("empbean2");
		//obj.printEmployee();
		
		System.out.println(obj);
	}
}
