package com.java.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
		
		Student_Mahesh mahesh=(Student_Mahesh)context.getBean("mahesh");
		System.out.println(mahesh);
	}
}
