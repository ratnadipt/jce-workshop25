package app;

import java.util.Scanner;

import exception.AccountBlockedException;
import model.BankAccount;
import security.AuthService;
import service.TransactionService;

public class SecureTransactionApp {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		AuthService auth = new AuthService();
		BankAccount account = new BankAccount();
		TransactionService service = new TransactionService();
		
		
		// input pin & validate
		try {
			System.out.print("Enter 4 Digit PIN : ");
			int pin = read.nextInt();
			
			auth.authenticate(pin); // success
			
			while(true) {
				System.out.println("1. Check");
				System.out.println("2. Withdraw");
				System.out.println("3. Deposit");
				System.out.println("4. Check Daily Use");
				System.out.println("0. Exit");
				
				int choice = read.nextInt();
				
				switch(choice) {
				case 1: // balance check
					double bal = account.getBalance();
					System.out.println("Account Balance : " + bal);
					break;
				case 2: // withdraw
					System.out.print("Enter the Amount to Withdraw : ");
					double amt = read.nextDouble();
					service.withdraw(account, amt);
					break;
				case 3: // Deposit
					System.out.print("Enter the Amount to Deposit : ");
					double amt1 = read.nextDouble();
					service.deposit(account, amt1);
					break;
				case 4: // daily use
					System.out.println("Today's Use : " + account.getTodayUse());
					break;
				case 0: // exit
					System.out.println("Thank you! Visit Again!");
					System.exit(0);
				default:
					System.out.println("Invalid Choice! Try Again!");
				}
			}
		}
		catch(AccountBlockedException ex) {
			System.out.println("Account Blocked : " + ex.getMessage());
		}
		finally {
			read.close();
		}
		
	}

}
