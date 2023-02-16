package com.demo.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("stereoConfig.xml");
		Student bean = context.getBean("ob",Student.class);
		System.out.println(bean.hashCode());
		Student bean1= context.getBean("ob",Student.class);
		System.out.println(bean1.hashCode());
		
	}
}
