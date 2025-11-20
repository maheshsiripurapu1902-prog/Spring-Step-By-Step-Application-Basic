package com.java.reference.application4;

public class Address {
	
	private String village;
	private String city;
	private int pincode;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void getAddress() {
		
		Address address=new  Address();
		address.setVillage(village);
		address.setCity(city);
		address.setPincode(pincode);
		System.out.println(address);
	}
	
	

}
