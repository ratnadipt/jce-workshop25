package utility;

import exception.InvalidAmountException;
public class InputValidator {
	// valid - amount
	public static void validateAmount(double amount) {
		//negative
		if(amount < 0) {
			throw new InvalidAmountException("Invalid Amount : negative amount.");
		}
		
		// large amount
		if(amount > 10000) {
			throw new InvalidAmountException("Invalid Amount : amount exceeded!");
		}
	}
	
	// valid - pin - Homework
	public static void validatePin(int pin) {
		// logic
	}
}
