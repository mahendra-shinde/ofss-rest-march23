package com.mahendra.rest;

import java.util.HashSet;
import java.util.Set;

import com.mahendra.data.AccountDAO;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class AppConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resourceSet = new HashSet<>();
		resourceSet.add(AccountResource.class);
		resourceSet.add(CustomerResource.class);
		return resourceSet;
	}


}
