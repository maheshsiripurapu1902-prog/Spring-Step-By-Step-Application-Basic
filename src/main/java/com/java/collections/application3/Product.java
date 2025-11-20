package com.java.collections.application3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {

	private int pid;
	private String pname;
	private String price;
	private List<Integer>qty;
	private Set<String>Email;
	private Map<Integer, String>items;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public List<Integer> getQty() {
		return qty;
	}
	public void setQty(List<Integer> qty) {
		this.qty = qty;
	}
	public Set<String> getEmail() {
		return Email;
	}
	public void setEmail(Set<String> email) {
		Email = email;
	}
	public Map<Integer, String> getItems() {
		return items;
	}
	public void setItems(Map<Integer, String> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", Email=" + Email
				+ ", items=" + items + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
