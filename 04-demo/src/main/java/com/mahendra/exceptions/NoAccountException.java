package com.mahendra.exceptions;

public class NoAccountException extends RuntimeException {
	public NoAccountException() {
		super("Account details are missing !");
	}
}
