package com.demo.util.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("uiltCollectionConfig.xml");
		Person bean = context.getBean("person",Person.class);
		System.out.println(bean);
	}
}
