package application;

import db.DB;
import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDAO seller = DAOFactory.createSellerDao();
		
		Seller sel = seller.findById(3);
		System.out.println(sel);

	}

}
