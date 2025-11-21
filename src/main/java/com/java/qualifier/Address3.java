package com.java.qualifier;

public class Address3 {
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
		return "Address3 [village=" + village + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public Address3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
