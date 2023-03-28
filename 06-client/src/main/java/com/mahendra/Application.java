package com.mahendra;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;

public class Application {

	public static void main(String[] args) {
		// Lightweight HTTP Client
		Client client = ClientBuilder.newClient();
		/*
		 * Response resp =
		 * client.target("http://localhost:8090/02-demo/prefix/customers")
		 * .request(MediaType.APPLICATION_JSON) .buildGet() .invoke();
		 * System.out.println("Response Status : "+ resp.getStatus());
		 * System.out.println("Response entity : "+resp.readEntity(String.class));
		 */
		Customer c = client.target("http://localhost:8090/02-demo/prefix/customers/1")
					.request().accept(MediaType.APPLICATION_JSON).get(Customer.class);
					
					
		System.out.println(c.getCustomerId()+" "+c.getFirstName()+" "+c.getLastName());
		
	}
}
