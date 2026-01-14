package exception;

public class InsufficientBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2929199163022238934L;

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
