package com.mahendra.exceptions;

public class AccountNotFoundException extends RuntimeException {
	public AccountNotFoundException(String accNo) {
		super("Account "+accNo+" not found!");
	}
}
