package com.springcore.regex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spel.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\regex\\Exp-config.xml");
		DemoExp d1 = context.getBean("demoExp",DemoExp.class);		
		System.out.println(d1);
	}

}
