package be.ste.tunsajan.cms.beans;

import java.io.Serializable;
import java.util.List;

public class CaracteristiquesBeans implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String _id;
	private ProduitBeans _idProduit;
	private ProprietesBeans _idPropriete;
	private String _valeur;
	
	public String getId() {return _id;}
	public void setId(String _id) {this._id = _id;}
	public ProduitBeans getIdProduit() {return _idProduit;}
	public void setIdProduit(ProduitBeans _idProduit){this._idProduit = _idProduit;}
	public ProprietesBeans getIdPropriete() {return _idPropriete;}
	public void setIdPropriete(ProprietesBeans _idPropriete) {this._idPropriete = _idPropriete;}
	public String getValeur(){return _valeur;}
	public void setValeur(String _valeur) {this._valeur = _valeur;}
	@Override public String toString() {
		return this._idProduit
				+ " "  
				+ this._idPropriete.getNom()
				+ this._valeur;
	}
	
	

}
