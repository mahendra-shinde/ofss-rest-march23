package com.mahendra.rest;

import com.mahendra.data.AccountDAO;
import com.mahendra.exceptions.AccountNotFoundException;
import com.mahendra.exceptions.NoAccountException;
import com.mahendra.models.Account;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Path("/account")
@Produces("application/json")
public class AccountResource {
	
	private AccountDAO dao = AccountDAO.getInstance();
	
	@GET
	public Account findAccount(@QueryParam("accnum") String accNum) {
		Response response = null;
		if(accNum ==null ||  !accNum.equalsIgnoreCase("SB1111")) {
			throw new AccountNotFoundException(accNum);
		}
		return new Account("Chandrachud", "SB1111", "Savings");
		
	}
	
	
	@POST @Consumes("application/json")
	public String create(Account acc) {
		if(acc.getAccNum() ==null ) {
			throw new NoAccountException();
		}
		System.out.println("Update "+acc.getAccNum());
		dao.add(acc);
		return "Updated";
	}
	
	@DELETE 
	@Path("{accNum}") /// DELETE /account/12345
	public String delete(@PathParam("accNum") String accNum) {
		System.out.println("Deleting account "+accNum);
		dao.deleteByAccNum(accNum);
		return "Deleted !";
	}
}
