package com.mahendra.data;

import java.util.*;

import com.mahendra.models.Account;


public class AccountDAO {

	private static AccountDAO dao = new AccountDAO();
	
	public static AccountDAO getInstance () {
		return dao;
	}
	
	private List<Account> accountList = new LinkedList<>();
	
	private AccountDAO() {
		accountList.add(new Account("Tiger","SB3487684684" , "Savings"));
		accountList.add(new Account("Lion","SB33455684684" , "Savings"));
	}
	
	
	public Account[] findAll() {
		if(accountList.isEmpty())
			return null;
		Account accs [] = new Account[accountList.size()];
		return accountList.toArray(accs);
	}
	
	public void add(Account acc) {
		accountList.add(acc);
	}
	
	public Account findByAccNum(String accNum) {
		for(Account ac : accountList) {
			if(ac.getAccNum().equalsIgnoreCase(accNum))
				return ac;
		}
		return null;
	}
	
	public void deleteByAccNum(String accNum) {
		Account acc = findByAccNum(accNum);
		if(acc != null ) {
			accountList.remove(acc);
		}
	}
	
	public void update(Account newAcc) {
		Account oldAcc = findByAccNum(newAcc.getAccNum());
		if( oldAcc == null ) {
			System.out.println("Kindly try creating a record first!");
		}else {
			oldAcc.setCustomer(newAcc.getCustomer());
			oldAcc.setKind(newAcc.getKind());
			oldAcc.setOpeningDate(newAcc.getOpeningDate());
		}
	}
}
