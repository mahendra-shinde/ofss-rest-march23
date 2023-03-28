package com.mahendra.models;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Account implements java.io.Serializable{
	private String customer;
	private String accNum;
	private Date openingDate;
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
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
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
		this.openingDate = new Date();
		this.kind = kind;
	}
	
	
}
