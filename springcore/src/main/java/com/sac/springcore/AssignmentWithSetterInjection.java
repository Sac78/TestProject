package com.sac.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sac.model1.Person1;

public class AssignmentWithSetterInjection {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("com/sac/model1/Application.config.xml");
		BeanFactory beanFactory=new XmlBeanFactory(res);
		
		Person1 p=beanFactory.getBean("person",Person1.class);

		System.out.println(p);
	}

}
