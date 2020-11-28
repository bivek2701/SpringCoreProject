package com.javawebtutor.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/javawebtutor/lifecycle/LifeCycle-Config.xml");
		
		//Enable shutdown hook
				context.registerShutdownHook();
		Samosa s1 = (Samosa) context.getBean("samosa");
		
		System.out.println(s1);
		
		System.out.println("::::Life cycle by using interface::::");
		
		Pepsi p1=(Pepsi) context.getBean("pepsi");

		System.out.println(p1);
	}

}
