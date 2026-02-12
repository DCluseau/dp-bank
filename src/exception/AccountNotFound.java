/**
 * 
 */
package exception;

/**
 * 
 */
public class AccountNotFound extends Exception {

	/**
	 * 
	 */
	public AccountNotFound() {
		super("Erreur: Compte introuvable."); 
	}

	/**
	 * @param message
	 */
	public AccountNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
