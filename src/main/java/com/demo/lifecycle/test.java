package com.demo.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("SamosaConfig.xml");
		Samosa s = con.getBean("samosa", Samosa.class);
		System.out.println(s);
		con.registerShutdownHook();
		
	}

	
}
