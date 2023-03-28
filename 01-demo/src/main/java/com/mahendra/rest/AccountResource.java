package com.mahendra.rest;

import com.mahendra.data.AccountDAO;
import com.mahendra.models.Account;

import jakarta.ws.rs.*;

@Path("/account")
@Produces("application/json")
public class AccountResource {
	
	private AccountDAO dao = AccountDAO.getInstance();
	
	@GET	
	@Path("/all")	///   /account/all [Optional]
	public Account[] listAll() {
		System.out.println("Get all accounts !");
		return dao.findAll();
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
