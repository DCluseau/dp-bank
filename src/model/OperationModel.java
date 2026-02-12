/**
 * 
 */
package model;

import java.time.LocalDate;

/**
 * 
 */
public class OperationModel {

	private int id;
	private int accountId;
	private String type;
	private Double amount;
	private LocalDate  dateOperation;
	/**
	 * 
	 */
	public OperationModel() {
		this.id = 0;
		this.accountId = 0;
		this.type = "";
		this.amount = 0.0;
		this.dateOperation = LocalDate.now();
	}
	
	public OperationModel(int id, int accountId, String type, Double amount, LocalDate dateOperation) {
		this.id = id;
		this.accountId = accountId;
		this.type = type;
		this.amount = amount;
		this.dateOperation = dateOperation;
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
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
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
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the dateOperation
	 */
	public LocalDate getDateOperation() {
		return dateOperation;
	}

	/**
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(LocalDate dateOperation) {
		this.dateOperation = dateOperation;
	}
	

}
