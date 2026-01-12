package intro;

public class WithdrawApp {

	public static void main(String[] args) {
		int amount = 5000; // user input
		int balance = 2000; // deposit amount
		int minBalance = 1000; // bank constant amount
		
		try {
			//check
			if(amount >= (balance - minBalance) ) {
				throw new InsufficientBalance("No funds!");
			}
			
			System.out.println(amount + " is successfully withdraw!");
			balance -= amount;
			System.out.println("Available Balance = " + balance);
		}
		catch(InsufficientBalance ex) {
			ex.printStackTrace();
		}
		

	}

}


// create custom exception
class InsufficientBalance extends RuntimeException{
	public InsufficientBalance(String msg) {
		super(msg);
	}
}