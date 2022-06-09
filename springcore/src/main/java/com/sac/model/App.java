package com.sac.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
	
		Resource res=new ClassPathResource("com/sac/model/Personbean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(res);
		Person p=beanFactory.getBean("person",Person.class);

		System.out.println(p);
	}

}
