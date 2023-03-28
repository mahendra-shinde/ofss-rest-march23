package com.mahendra.rest;

import java.util.Date;

import com.mahendra.models.Customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/customers")
public class CustomerResource {

	@GET
	@Produces({"application/json","application/xml"})
	public Customer findCustomer() {
		Customer cust = new Customer();
		cust.setCategory("Electronics");
		cust.setItemPurchased("USB Pen drive");
		cust.setPurchaseDate(new Date());
		cust.setName("Nirav");
		
		return cust;
	}
}
