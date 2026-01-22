package service;

import exception.TransactionFailedException;
import model.BankAccount;
public class TransactionService {
	
	public void withdraw(BankAccount account, double amount) throws TransactionFailedException  {
		try {
			account.debit(amount); // may generate an exception.
			System.out.println("Debited Amount : " + amount);
		}
		catch(Exception ex) {
			throw new TransactionFailedException("Transaction Failed : " + ex.getMessage());
		}
	}
		public void deposit(BankAccount account, double amount) throws TransactionFailedException {
		try {
			account.credit(amount); // may generate an exception.
			System.out.println("Amount Credited : " + amount);
		}
		catch(Exception ex) {
			throw new TransactionFailedException("Transaction Failed : " + ex.getMessage());
		}
	}
}
