package com.java;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.application2.Emp;
import com.java.collections.application3.Product;
import com.java.setter.getters.application1.Student;

public class App {
  public static void main(String[] args) {

	  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	  
	  System.out.println("**************spring setter and getter application****************");
	  
	  System.out.println();
	  Student student=(Student)context.getBean("id1");
	  
	  System.out.println(student);
	  
	  
	  System.out.println();
	  
	  
	  System.out.println("***********   spring constructor   ************");
	  
	  System.out.println();
	  Emp emp=(Emp)context.getBean("id2");
	  
	  System.out.println(emp);

	  
	  System.out.println();
	  
	  
	  System.out.println("***********    spring -collections  ******************");
	  System.out.println();
	  Product product=(Product)context.getBean("id3");
	  
	  System.out.println(product);
	  
  }
}
