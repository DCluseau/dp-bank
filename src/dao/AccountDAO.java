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
	public void create(AccountModel account) {
		// TODO Auto-generated method stub

	}

	@Override
	public AccountModel read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(AccountModel account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(AccountModel account) {
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

	public AccountModel findByCustomerId(int customer_id) {
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
