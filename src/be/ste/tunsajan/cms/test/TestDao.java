package be.ste.tunsajan.cms.test;

import be.ste.tunsajan.cms.beans.CaracteristiquesBeans;
import be.ste.tunsajan.cms.beans.ProduitBeans;
import be.ste.tunsajan.cms.dao.Dao;

public class TestDao {

	public static void main(String[] args) {
		Dao dao = new Dao("yaka_db");
		
		for(CaracteristiquesBeans p :dao.SQLQueryOneCaracteristiquesByProduits("1", "1")) {
			System.out.println(p);
		}

	}

}
