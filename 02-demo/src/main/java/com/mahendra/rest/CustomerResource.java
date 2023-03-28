package com.mahendra.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.LinkedList;
import java.util.List;

import com.mahendra.models.Customer;

@Path("/customers")
public class CustomerResource {

	private List<Customer> customers = new LinkedList<>();

	public CustomerResource() {
		customers.add(new Customer("C1222345", "Amitabh", "Bhattacharya", "5675765765"));
		customers.add(new Customer("C2233642", "Gaurang", "Chakroborthy", "562376533"));
	}

	@GET
	@Produces("application/json")
	
	public List<Customer> getAll() {
		return customers;
	}

	
	@GET
	@Produces("application/json")
	@Path("/1")
	public Customer findCustomer() {
		return customers.get(0);
	}
	
	@GET
	@Produces("text/html")
	public String getAllHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<table><tr><td>Customer ID</td><td>First Name</td><td>Last Name</td><td>Phone Number</td></tr>");

		for (Customer c : customers) {
			sb.append("<tr>");
			sb.append("<td>").append(c.getCustomerId()).append("</td><td>").append(c.getFirstName());
			sb.append("</td><td>").append(c.getLastName()).append("</td><td>");
			sb.append("</td><td>").append(c.getPhone()).append("</td>");
			sb.append("</tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}
}
