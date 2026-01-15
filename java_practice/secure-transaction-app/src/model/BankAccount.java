package model;

import exception.InvalidAmountException;
import exception.DailyLimitExceededException;
import exception.InsufficientBalanceException;
public class BankAccount {
	private double balance = 25000;
	private double dailyLimit = 10000;
	private double todayUsed = 0; // initially
	
	public double getBalance() {
		return this.balance;
	}
	
	public void debit(double amount) throws InvalidAmountException,DailyLimitExceededException,InsufficientBalanceException  {
		// check any type exceptions
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount : Negative.");
		}
		
		if(amount < 100) {
			throw new InvalidAmountException("Amount must be greater than 100!");
		}
		
		if(amount > dailyLimit) {
			throw new DailyLimitExceededException("Amount must be withing Daily Limit : " + dailyLimit);
		}
		
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance.");
		}
		
		// to deduct the amount from the account
		balance -= amount;
		todayUsed += amount;
	}
	
	public double getTodayUse() {
		return this.todayUsed;
	}
	
	public void credit(double amount) throws InvalidAmountException,DailyLimitExceededException  {
		// check any type exceptions
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount : Negative.");
		}
		
		if(amount > 100000) {
			throw new DailyLimitExceededException("Amount must be withing Daily Limit : 100000");
		}
		
		
		// to deduct the amount from the account
		balance += amount;
	}
}
