package com.java.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowird.xml");
		
		Customer customer=(Customer)context.getBean("cu");
		System.out.println(customer);
	}

}
