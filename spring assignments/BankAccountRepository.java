package com.bankspring;

public interface BankAccountRepository {

	   public double getBalance(long accountId);
	    public double updateBalance(long accountID,double newBalance);
	
}
