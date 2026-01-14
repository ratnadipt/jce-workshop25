package exception;

public class InvalidPinException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -790889802816923763L;

	public InvalidPinException(String message) {
		super(message);
	}
}
