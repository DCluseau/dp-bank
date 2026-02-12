/**
 * 
 */
package dao;

import java.util.ArrayList;

import model.CustomerModel;

/**
 * 
 */
public class CustomerDAO implements IDAO<CustomerModel> {

	/**
	 * 
	 */
	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(CustomerModel customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerModel read() {
		// TODO Auto-generated method stub
		return new CustomerModel();
	}

	@Override
	public void update(CustomerModel customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CustomerModel customer) {
		// TODO Auto-generated method stub
		
	}
	
	public CustomerModel findById(int idCustomer) {
		return new CustomerModel();
	}
	
	public ArrayList<CustomerModel> findAll(){
		return new ArrayList<CustomerModel>();
	}
	
	public CustomerModel save() {
		return new CustomerModel();
	}

}
