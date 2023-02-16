package com.demo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/demo/collection/collectionConfig.xml");
		Emp e=context.getBean("emp",Emp.class);
		System.out.println(e.getName());
		System.out.println(e.getAddresses());
		System.out.println(e.getCources());
		System.out.println(e.getPhones());
		System.out.println("+++++++++++++++++++++++++++++");
		Emp e1=context.getBean("emp1",Emp.class);
		System.out.println(e1.getName());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCources());
		System.out.println(e1.getPhones());
	}
	
}
