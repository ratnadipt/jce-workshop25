package exception;

public class TransactionFailedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4161062156964173513L;

	public TransactionFailedException(String message) {
		super(message);
	}
}
