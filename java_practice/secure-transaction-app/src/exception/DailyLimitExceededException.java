package exception;

public class DailyLimitExceededException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1238645347508700682L;

	public DailyLimitExceededException(String message) {
		super(message);
	}
}
