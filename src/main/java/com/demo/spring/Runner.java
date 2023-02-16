package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/demo/spring/config.xml");
		University u=context.getBean("uni",University.class);
		System.out.println(u);
	
	}
}
