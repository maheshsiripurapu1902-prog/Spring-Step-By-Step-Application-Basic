package com.java.lifecycle.method;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class hello2 implements InitializingBean,DisposableBean{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "hello2 [id=" + id + ", name=" + name + "]";
	}
	public hello2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("inside the init method()............");
		
	}
	@Override
	public void destroy() throws Exception {
		
		System.out.println("this is destroy method()...........");
	}
	

}
