package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.application2.Emp;
import com.java.setter.getters.application1.Student;

public class App {
  public static void main(String[] args) {

	  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	  
	  Student student=(Student)context.getBean("id1");
	  
	  System.out.println(student);
	  
	  
	  Emp emp=(Emp)context.getBean("id2");
	  
	  System.out.println(emp);

	  
  }
}
