/**
 * 
 */
package exception;

/**
 * 
 */
public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	public InsufficientBalanceException() {
		super("Solde insuffisant.");
	}

	/**
	 * @param message
	 */
	public InsufficientBalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
