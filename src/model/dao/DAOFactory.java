package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO creatSellerDao() {
		return new SellerDaoJDBC();
	}

}
