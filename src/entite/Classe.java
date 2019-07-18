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
		lstParent = new ArrayList<Parent>();
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
		if (e != null)
			lstEleves.add(e);
	}
	
	public void removeEleve(Eleve e) {
		lstEleves.remove(e);
	}
	
	public Eleve getEleve(Integer i) throws ClasseException {
		try {
			return lstEleves.get(i);
			
		} catch (Exception e) {
			throw new ClasseException("Le nombre d'élève de la classe est de " + lstEleves.size() + " élèves");
		}
	}
	
	public void sortListEleve() {
		Collections.sort(lstEleves);
	}
	

	@Override
	public String toString() {
		StringBuffer stringify = new StringBuffer();
		stringify.append("Classe : ").append(this.getNom()).append("\n");
		stringify.append("\t Instituteur : ")
				 .append(this.instituteur.getPrenom())
				 .append(" ")
				 .append(this.instituteur.getNom());
		for (Eleve e : lstEleves) {
			stringify.append(e.getPrenom())
					 .append(" ")
					 .append(e.getNom())
					 .append("\n");
		}
		return stringify.toString();
	}
	
	
	
	
}
