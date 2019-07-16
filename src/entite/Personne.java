package entite;

import java.util.Date;

public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	
	
	public Personne() {
		
	}
	
	public Personne(String nom, String prenom, String adresse, Date ddn) {
		setNom(nom);
		setPrenom(prenom);
		setAdresse(adresse);
		setDdn(ddn);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDdn() {
		return ddn;
	}

	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ddn=" + ddn + "]";
	}
	
	
	
	
	
}
