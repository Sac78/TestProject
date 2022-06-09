package com.sac.springcore;

import java.time.LocalTime;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sac.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Resource resource=new ClassPathResource("com/sac/model/Personbean.xml");  
    	    BeanFactory factory=new XmlBeanFactory(resource);  
    	
    	    Person p=(Person) factory.getBean("person");
    	    System.out.println(p);
    	
    	   
    	ApplicationContext ap=new ClassPathXmlApplicationContext("com/sac/model/Personbean.xml");
   
    LocalTime lt=LocalTime.now();
   int hour=lt.getHour();
   System.out.println(hour);
    	
    	Person ps=	ap.getBean("person",Person.class);
    if(hour>0 && hour<12) {
    	System.out.println("GoodMorning "+ps.getPname());
    }
    else if(hour>=12 && hour<16) {
    	System.out.println("Good Afternoon "+ps.getPname());
    }
    else if(hour>=16 && hour<19) {
    	System.out.println("Good Evening "+ps.getPname());
    }
    else {
    	System.out.println("Good Night "+ps.getPname());
    }
    }
}
