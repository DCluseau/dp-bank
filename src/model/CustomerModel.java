/**
 * 
 */
package model;

/**
 * 
 */
public class CustomerModel {
	/**
	 * 
	 */
	private int id;
	private String lastname;
	private String firstname;
	private String email;
	private String phone;
	
	/**
	 * 
	 */
	public CustomerModel() {
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.lastname = "";
		this.firstname = "";
		this.email = "";
		this.phone = "00000000";
	}
	
	/**
	 * 
	 * @param id
	 * @param lastname
	 * @param firstname
	 * @param email
	 * @param phone
	 */
	public CustomerModel(int id, String lastname, String firstname, String email, String phone) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.phone = phone;
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
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
