package com.sac.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.model1.Person1;

public class AssignmentWithConstructorInj {

	public static void main(String[] args) {


	ApplicationContext context=new ClassPathXmlApplicationContext("com/sac/model1/Application.cfg.xml");

	Person1 p1=context.getBean("person",Person1.class);
	System.out.println(p1);
	Person1 p2=context.getBean("person",Person1.class);
	
	System.out.println(p1.hashCode()+" "+p2.hashCode());
	}

}
