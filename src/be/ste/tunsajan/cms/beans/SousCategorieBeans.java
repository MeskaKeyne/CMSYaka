package be.ste.tunsajan.cms.beans;

import java.io.Serializable;

import be.tunsajan.cms.yaka.interfaces.ICategorie;


public class SousCategorieBeans implements Serializable, ICategorie {
	
	private String _id;
	private String _nom;
	private int _sousCategorie;
	private int _stats;

	public int getSousCategorie() {return this._sousCategorie;}
	public void setSousCategorie(int sousCategorie) {this._sousCategorie= sousCategorie;}
	@Override public String getId() {return this._id;}
	@Override public void setId(String id) {this._id= id;}
	@Override public String getNom() {return this._nom;}
	@Override public void setNom(String nom) { this._nom =nom;}
	@Override public int getStats() {return _stats;}
	@Override public void setStats(int stat) { this._stats = stat;}
	@Override public boolean estUneSousCategorie() {return true;}
	@Override public String toString() {return this.getId() + " " + this.getNom() + " " + this.getStats() + " " + this.getSousCategorie();	}

}
