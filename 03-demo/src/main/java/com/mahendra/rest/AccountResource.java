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
	
//	@GET	
//	public Response listAll() {
//		System.out.println("Get all accounts !");
//		Account[] accs = dao.findAll();
//		Response response = null;
//		if(accs==null) {
//			response = Response.status(400, "No records found !").header("error", "There are no accounts !").build();
//		}
//		else
//			response = Response.ok(accs).build();
//		return response;
//	}
	
	
	@GET
	public Response findAccount(@QueryParam("accnum") String accNum) {
		Response response = null;
		if(accNum.equalsIgnoreCase("SB1111")) {
			Account acc = new Account("Chandrachud", "SB1111", "Savings");
			response = Response.ok(acc).build();
		}else {
			response = Response.status(404).header("error", "Account not found ").build();
		}
		return response;
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
