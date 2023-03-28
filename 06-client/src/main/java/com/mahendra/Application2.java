package com.mahendra;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Application2 {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		
		WebTarget request = client.target("http://localhost:8090/03-demo/api/account");
		Account acc = new Account("Rajiv Bhatia","SB565456","Savings");
		
		Entity<Account> reqBody = Entity.entity(acc, MediaType.APPLICATION_JSON);
		Response resp = request.request().post(reqBody);
		System.out.println(resp.getStatus());
		System.out.println(resp.readEntity(String.class));
		System.out.println("Record created");
		

	}

}
