package be.ste.tunsajan.cms.beans;

import java.io.Serializable;

import javax.persistence.Transient;

import org.springframework.data.annotation.Persistent;

public class ProduitBeans implements Serializable {
	
	private String _id;
	private String _nom;
	private String _vignette;
	private String _image;
	private String _descCourte;
	private String _descLongue;
	private String _sCategorie;
	private String _stat;
	@Transient
	private String _categorie;
	

	
	public ProduitBeans() {}


	public String getId(){return _id;}
	public void setId(String _id) {this._id = _id;}
	public String getNom() {return _nom;}
	public void setNom(String _nom) {this._nom = _nom;}
	public String getVignette() {return _vignette;}
	public void setVignette(String _vignette) {this._vignette = _vignette;}
	public String getimage() {return _image;}
	public void setImage(String _image) {this._image = _image;}
	public String getDescCourte() {return _descCourte;}
	public void setDescCourte(String _descCourte) {this._descCourte = _descCourte;}
	public String getDescLongue() {return _descLongue;}
	public void setStat(String stat) {this._stat = stat;}
	public String getSats() {return this._stat;}
	public void setDescLongue(String _descLongue) {this._descLongue = _descLongue;}
	@Override public String toString() {
		return this._id + " "
				+ this._nom + " "
				+ this._sCategorie +" ";				
	}
	
	
	
}
