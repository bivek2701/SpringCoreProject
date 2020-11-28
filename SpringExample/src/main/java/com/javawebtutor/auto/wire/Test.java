package com.javawebtutor.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javawebtutor.ci.Addition;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/javawebtutor/auto/wire/AutoWire-Config.xml");

		Emp emp = (Emp) context.getBean("emp", Emp.class);
		
		System.out.println(emp);
	}

}
