package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {

	  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	  
	  Student student=(Student)context.getBean("id1");
	  
	  System.out.println(student);

	  
  }
}
