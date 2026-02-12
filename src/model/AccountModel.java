/**
 * 
 */
package model;

/**
 * 
 */
public abstract class AccountModel {

	private int id;
	private Double balance;
	private String type;
	private int id_customer;
	/**
	 * 
	 */
	public AccountModel() {
		this.id = 0;
		this.balance = 0.0;
		this.type = "";
		this.id_customer = 0;
	}
	
	public AccountModel(int id, Double balance, String type, int id_customer) {
		this.id = id;
		this.balance = balance;
		this.type = type;
		this.id_customer = id_customer;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the id_customer
	 */
	public int getId_customer() {
		return id_customer;
	}

	/**
	 * @param id_customer the id_customer to set
	 */
	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}
	
	

}
