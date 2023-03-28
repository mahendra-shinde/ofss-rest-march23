package com.mahendra.rest;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider

// Intercept EVERY REST ENDPOINT in this application !!!
public class MyMapper implements ExceptionMapper<RuntimeException>{

	@Override
	public Response toResponse(RuntimeException ex) {
		System.out.println("Error : "+ex.getMessage());
		return Response.status(Status.NOT_FOUND).build();
	}
	
}
