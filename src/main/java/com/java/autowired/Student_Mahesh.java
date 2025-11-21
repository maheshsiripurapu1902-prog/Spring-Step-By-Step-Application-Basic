package com.java.autowired;

public class Student_Mahesh {

	private int id;
	private String name;
	private Address1 address;
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
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student_Mahesh [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Student_Mahesh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
