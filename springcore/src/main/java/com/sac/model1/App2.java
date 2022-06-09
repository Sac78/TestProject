package com.sac.model1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sac/model1/Application.cfg.xml");

		Person1 p= context.getBean("person",Person1.class);
		System.out.println(p);
	
		ApplicationContext context1=new ClassPathXmlApplicationContext("com/sac/model1/Application.config.xml");
		
		Person1 p1= context.getBean("person",Person1.class);
		System.out.println(p1);
	}

}
