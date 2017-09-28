package be.ste.tunsajan.cms.beans;

import java.io.Serializable;

public class CaracteristiquesBeans implements Serializable {
	
	private String _id;
	private String _idProduit;
	private String _valeur;
	
	public String getId() {return _id;}
	public void setId(String _id) {this._id = _id;}
	public String getIdProduit() {return _idProduit;}
	public void setIdProduit(String _idProduit){this._idProduit = _idProduit;}
	public List getIdPropriete() {return _idPropriete;}
	public void setIdPropriete(List _idPropriete) {this._idPropriete = _idPropriete;}
	public String getValeur(){return _valeur;}
	public void setValeur(String _valeur) {this._valeur = _valeur;}
	
	

}
