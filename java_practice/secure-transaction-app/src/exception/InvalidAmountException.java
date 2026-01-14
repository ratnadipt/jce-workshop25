package exception;

public class InvalidAmountException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7449975249478742623L;

	public InvalidAmountException(String message) {
		super(message);
	}
}
