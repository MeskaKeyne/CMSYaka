package be.ste.tunsajan.cms.dao;

import java.util.List;

import javax.persistence.Persistence;

import be.ste.tunsajan.cms.beans.CaracteristiquesBeans;
import be.ste.tunsajan.cms.beans.CategorieBeans;
import be.ste.tunsajan.cms.beans.ProduitBeans;
import be.ste.tunsajan.cms.beans.SousCategorieBeans;

public class Dao {
	protected javax.persistence.EntityManager em;
	
	private List<be.ste.tunsajan.cms.beans.CategorieBeans> categories;
	private List<SousCategorieBeans> sousCategories;
	private List<ProduitBeans> produits;
	
	public Dao(String persist_unit) {
		super();
		this.em = Persistence.createEntityManagerFactory(persist_unit).createEntityManager();	
	}
	public List<CategorieBeans> SQLQueryListerLesCategories(){
		System.out.println("QUERY: ListerLesCategories");
			return this.em.createNamedQuery("SQLQueryListerLesCategories", CategorieBeans.class).getResultList();
	}
	public List<SousCategorieBeans> SQLQueryListerLesSousCategories(){
		System.out.println("QUERY: ListerLesSousCategories");
			return this.em.createNamedQuery("SQLQueryListerLesSousCategories", SousCategorieBeans.class).getResultList();
	}
	public List<ProduitBeans> SQLQueryListerLesProduits(){
		System.out.println("QUERY: ListerLesProduits");
		return this.em.createNamedQuery("SQLQueryListerLesProduits", ProduitBeans.class).getResultList();
		
	}
	public List<ProduitBeans> SQLQueryProduitsParSousCategoriesName(String cat_name){
		System.out.println("QUERY: ListerLesProduits");
		return this.em.createNamedQuery("SQLQueryProduitsParSousCategories", ProduitBeans.class)
				.setParameter(1, cat_name)
				.getResultList();
		
	}
	public List<ProduitBeans> SQLQueryProduitsParSousCategoriesID(String id){
		System.out.println("QUERY: ListerLesProduits");
		return this.em.createNamedQuery("SQLQueryProduitsParSousCategoriesID", ProduitBeans.class)
				.setParameter(1, id)
				.getResultList();	
	}
	public List<CaracteristiquesBeans> SQLQueryOneCaracteristiquesByProduits(String produit_id, String propriete_id){
		return this.em.createNamedQuery("SQLQueryOneCaracteristiquesByProduits", CaracteristiquesBeans.class)
				.setParameter(1, produit_id)
				.setParameter(2, propriete_id)
				.getResultList();	
	}
	

}

