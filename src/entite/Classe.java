package entite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe {
	
	// Attributs
	private String nom;
	private Instituteur instituteur;
	private List<Eleve> lstEleves;
	private List<Parent> lstParent;
	
	// Constructeurs
	public Classe() {
		
	}
	
	public Classe(String nom) {
		setNom(nom);
		lstEleves = new ArrayList<Eleve>();
		lstParent = new ArrayList<Parent>();
	}
	
	// Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Eleve> getLstEleves() {
		return lstEleves;
	}

	public void setLstEleves(List<Eleve> lstEleves) {
		this.lstEleves = lstEleves;
	}

	public List<Parent> getListParent() {
		for (Eleve e : lstEleves) {
			if (!lstParent.contains(e.getReferent())) {
				lstParent.add(e.getReferent());
			}
		}
		return lstParent;
	}

	public void setListParent(List<Parent> lstParent) {
		this.lstParent = lstParent;
	}

	public Instituteur getInstituteur() {
		return instituteur;
	}

	public void setInstituteur(Instituteur instituteur) {
		this.instituteur = instituteur;
	}

	
	// Méthodes
	public void addEleve(Eleve e) {
		lstEleves.add(e);
	}
	
	public void removeEleve(Eleve e) {
		lstEleves.remove(e);
	}
	
	public Eleve getEleve(Integer i) {
		return lstEleves.get(i);
	}
	
	public void sortListEleve() {
		Collections.sort(lstEleves);
	}
	

	@Override
	public String toString() {
		return "Classe [nom=" + nom + ", instituteur=" + instituteur + ", lstEleves=" + lstEleves + ", lstParent="
				+ lstParent + "]";
	}
	
	
	
	
}
