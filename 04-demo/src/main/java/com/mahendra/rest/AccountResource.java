package com.mahendra.rest;

import com.mahendra.data.AccountDAO;
import com.mahendra.models.Account;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/account")
@Produces("application/json")
public class AccountResource {
	
	private AccountDAO dao = AccountDAO.getInstance();
	
	@GET
	public Account findAccount(@QueryParam("accnum") String accNum) {
		Response response = null;
		if(accNum ==null ||  !accNum.equalsIgnoreCase("SB1111")) {
			throw new RuntimeException("Account "+accNum+" not found!");
		}
		return new Account("Chandrachud", "SB1111", "Savings");
		
	}
	
	
	@POST @Consumes("application/json")
	public String create(Account acc) {
		System.out.println("Update "+acc.getAccNum());
		dao.add(acc);
		return "Updated";
	}
	
	@DELETE 
	public String delete(@QueryParam("accNum") String accNum) {
		System.out.println("Deleting account "+accNum);
		dao.deleteByAccNum(accNum);
		return "Deleted !";
	}
}