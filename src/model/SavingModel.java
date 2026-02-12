/**
 * 
 */
package model;

/**
 * 
 */
public class SavingModel extends AccountModel {

	private Double interestRate;
	/**
	 * 
	 */
	public SavingModel() {
		super();
		this.interestRate = 0.0;
	}

	/**
	 * @param id
	 * @param balance
	 * @param type
	 * @param id_customer
	 */
	public SavingModel(int id, Double balance, String type, int id_customer, Double interestRate) {
		super(id, balance, type, id_customer);
		this.interestRate = interestRate;
	}

	/**
	 * @return the interestRate
	 */
	public Double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}
