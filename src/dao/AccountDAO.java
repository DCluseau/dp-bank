/**
 * 
 */
package dao;

import model.AccountModel;
import model.CheckModel;
import model.SavingModel;

/**
 * 
 */
public class AccountDAO implements IDAO<AccountModel>{

	/**
	 * 
	 */
	public AccountDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountModel read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public AccountModel findById() {
		// Init method. To be replaced.
		String type = "";
		if(type == "check"){
			CheckModel account = new CheckModel();
			return account;
		}else {
			SavingModel account = new SavingModel();
			return account;
		}
	}
}
