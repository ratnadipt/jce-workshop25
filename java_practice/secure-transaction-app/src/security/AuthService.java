package security;

import utility.InputValidator;
import exception.AccountBlockedException;
public class AuthService {
	private final int correctPin = 1234;
	private int attempts = 0;
	private boolean isBlocked = false;
	
	public boolean authenticate(int pin) throws AccountBlockedException {
		
		InputValidator.validatePin(pin);
		
		if(!isBlocked) {
			if(pin != correctPin) {
				attempts++;
				
				if(attempts >= 3) {
					isBlocked = true;
					throw new AccountBlockedException("Account Blocked due to failed Attempts.");
				}
			}
			else {
				return true; // success
			}
		}
		
		return false; // failed
		
	}
}
