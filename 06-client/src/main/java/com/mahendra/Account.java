package com.mahendra;

public class Account{
	private String customer;
	private String accNum;
	
	private String kind;
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String customer, String accNum, String kind) {
		super();
		this.customer = customer;
		this.accNum = accNum;
		
		this.kind = kind;
	}
	
	
}
