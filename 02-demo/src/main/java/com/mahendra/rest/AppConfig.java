package com.mahendra.rest;

import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/prefix")
public class AppConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classSet = new HashSet<>();
		classSet.add(CustomerResource.class);
		
		return classSet;
	}
}
