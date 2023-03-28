package com.mahendra.rest;

import com.mahendra.models.Account;

import jakarta.ws.rs.*;

@Path("/account")
public class AccountResource2 {
	
	@GET
	@Produces("text/plain")
	public String findAccount2() {
		Account acc = findAccount();
		String value = acc.getAccNum()+", "+acc.getCustomer()+", "+acc.getKind();
		return value;
	}
	
	@GET
	@Produces({"application/json","application/xml"})
	public Account findAccount() {
		return new Account("Steve rogers","SB63753537","Savings");
	}
	
	
	@POST
	public String testPOST() {
		return "Invoked HTTP POST request !";
	}
	
	@DELETE 
	public String testDELETE() {
		return "Invoked DELETE request !";
	}
	
	@PUT 
	public String testPUT() {
		return "Invoked PUT request !";
	}
	
	
	
}
