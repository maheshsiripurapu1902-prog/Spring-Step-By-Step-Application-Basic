package com.java.application2;

public class Emp {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String password;
	
	public Emp(int id, String name, String email, String address, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", password="
				+ password + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
