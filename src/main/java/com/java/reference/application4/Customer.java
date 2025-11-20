package com.java.reference.application4;

public class Customer {
	
	private int cid;
	private String cname;
	private String pname;
	private String email;
	
	private Address address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", pname=" + pname + ", email=" + email + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void getAddingAll() {
		Customer customer= new Customer();
		customer.setCid(cid);
		customer.setCname(cname);
		customer.setPname(pname);
		customer.setEmail(email);
		
		address.getAddress();
		System.out.println(customer);
		
	}
	
	

}
