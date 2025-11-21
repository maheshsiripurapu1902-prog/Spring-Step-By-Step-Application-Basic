package com.java.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("address")
	private Address3 address;
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
	public Address3 getAddress() {
		return address;
	}
	public void setAddress(Address3 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
