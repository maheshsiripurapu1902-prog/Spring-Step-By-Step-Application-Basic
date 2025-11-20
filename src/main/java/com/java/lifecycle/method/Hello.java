package com.java.lifecycle.method;

public class Hello {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		System.out.println("setting the init");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting the destroy");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void getinit() {
		
		System.out.println("this is init method");
		
	}
	
	public void getDestroy() {
	 System.out.println("this destroy method");
	}

}
