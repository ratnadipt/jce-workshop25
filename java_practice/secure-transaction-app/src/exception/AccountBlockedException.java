package exception;

public class AccountBlockedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2037034115137846291L;

	public AccountBlockedException(String message) {
		super(message);
	}
}
