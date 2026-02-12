/**
 * 
 */
package service;
import dao.CustomerDAO;
import model.CustomerModel;
import exception.AccountNotFound;
/**
 * 
 */
public class CustomerService {

	/**
	 * 
	 */
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}

	public void createCustomer(CustomerModel customer) {
		CustomerDAO customerDao = new CustomerDAO();
		customerDao.create(customer);
	}
	
	public CustomerModel getCustomerByNames(String lastname, String firstname) {
		CustomerDAO customerDao = new CustomerDAO();
		CustomerModel customer = new CustomerModel();
		// Find id by using lastname and firstname
		int id = 0;
		customer = customerDao.findById(id);
		return customer;
	}

}
