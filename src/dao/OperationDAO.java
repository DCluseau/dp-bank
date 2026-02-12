package dao;

import model.OperationModel;

public class OperationDAO implements IDAO<OperationModel> {

	public OperationDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(OperationModel operation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OperationModel read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(OperationModel operation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(OperationModel operation) {
		// TODO Auto-generated method stub
		
	}
	
	public OperationModel findByAccountId(int accountId) {
		return new OperationModel();
	}

	public void save(OperationModel operation) {
		
	}
}
