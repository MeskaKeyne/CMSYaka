package be.ste.tunsajan.cms.beans;

import java.io.Serializable;

import javax.persistence.Transient;

import be.ste.tunsajan.yaka.interfaces.ICategorie;

public class CategorieBeans implements Serializable, ICategorie {
	private String _id;
	private String _nom;
	private int _stats;
	
	public void CategorieBeans() {}
	public void CategorieBeans(String id, String nom, int stats, int sCategorie ) {
		this._id = id;
		this._nom = nom;
		this._stats = stats;;

	}
	public String getNom() {return this._nom;}
	public String getId() {return _id;}
	public void setId(String _id) {this._id = _id;}
	public void setNom(String _nom) {this._nom = _nom;}
	public int getStats(){return _stats;}
	public void setStats(int _stats) {this._stats = _stats;}
	@Override public String toString() {return this.getId() + " " + this.getNom() + " " + this.getStats() ;	}
	@Override public boolean estUneSousCategorie() {return false;}

}
