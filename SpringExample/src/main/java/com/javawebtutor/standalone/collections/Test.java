package com.javawebtutor.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\javawebtutor\\standalone\\collections\\Standalone-Collection-Config.xml");

		Person obj = (Person) context.getBean("person1",Person.class);
		
		System.out.println(obj);
		
	}

}
