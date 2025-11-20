package com.java.lifecycle.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring4.xml");
		   context.registerShutdownHook();
	    Hello hello=(Hello)context.getBean("hello");
	
	    System.out.println(hello);
	 
	
	    System.out.println();
	    System.out.println("***************************************");
	    hello2 hello2 =(hello2)context.getBean("id5");
	
	    System.out.println(hello2);
	    
	}

}
