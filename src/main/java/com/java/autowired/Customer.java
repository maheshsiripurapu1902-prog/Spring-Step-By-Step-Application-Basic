package com.java.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	private int id;
	private String name;
	@Autowired
	private Address2 address;
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
	public Address2 getAddress() {
		return address;
	}
	public void setAddress(Address2 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
