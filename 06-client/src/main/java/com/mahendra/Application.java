package com.mahendra;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Application {

	public static void main(String[] args) {
		// Lightweight HTTP Client
		Client client = ClientBuilder.newClient();
		
		  Customer[] customers = client.target("http://localhost:8090/02-demo/prefix/customers")
		  .request().accept(MediaType.APPLICATION_JSON).get(Customer[].class);
		  
		  for(Customer c: customers){
			  System.out.println(c.getCustomerId()+" "+c.getFirstName()+" "+c.getLastName());
		  }
		  
		 
		/*
		 * Customer c =
		 * client.target("http://localhost:8090/02-demo/prefix/customers/1")
		 * .request().accept(MediaType.APPLICATION_JSON).get(Customer.class);
		 * 
		 * 
		 * System.out.println(c.getCustomerId()+" "+c.getFirstName()+" "+c.getLastName()
		 * );
		 */
		
	}
}
