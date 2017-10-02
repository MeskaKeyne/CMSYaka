package be.tunsajan.cms.yaka.interfaces;

public interface ICategorie {
	public String getId();
	public void setId(String id);
	
	public String getNom();
	public void setNom(String nom);
	
	public int getStats();
	public void setStats(int stat);
	
	public boolean estUneSousCategorie();
}
