package com.java.autowired;

public class Address1 {
	private String village;
	private String city;
	private String pincode;
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address1 [village=" + village + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
