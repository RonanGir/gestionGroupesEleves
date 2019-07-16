package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entite.Classe;
import entite.Eleve;
import entite.Instituteur;
import entite.Parent;

class TestClasse {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private Eleve e1, e2;
	private Parent p1;
	private Instituteur i;

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Classe Verte";

		i = new Instituteur("Tanguy", "Marcel", "2 rue des charmilles, 44000 Nantes", sdf.parse("28/05/1973"));

		p1 = new Parent("Duchemin", "Remi", "31 impasse Bacot 35000 Rennes", sdf.parse("24/02/1992"));

		e1 = new Eleve("Duchemin", "Louis", "31 impasse Bacot 35000 Rennes", sdf.parse("20/05/2010"));
		e1.setReferent(p1);
		e2 = new Eleve("Duchemin", "Marie", "31 impasse Bacot 35000 Rennes", sdf.parse("21/06/2012"));
		e2.setReferent(p1);
	}

	@Test
	void testConstructorUsingFields() {
		Classe c = new Classe(nom);

		assertNotNull(c);
		assertNotNull(c.getNom());

		assertEquals(nom, c.getNom());
	}

	@Test
	void testInstituteur() {
		Classe c = new Classe(nom);
		c.setInstituteur(i);
		Instituteur c_i = c.getInstituteur();

		assertNotNull(c_i);
		assertEquals(i, c_i);
	}

	@Test
	void testAddEleve() {
		Classe c = new Classe(nom);
		c.addEleve(e1);
		c.addEleve(e2);

		List<Eleve> l = c.getLstEleves();
		assertNotNull(l);
		assertFalse(l.isEmpty());
		assertEquals(2, l.size());
	}

	@Test
	void testRemoveEleve() {
		Classe c = new Classe(nom);
		c.addEleve(e1);
		
		c.removeEleve(e1);
		
		List<Eleve> l = c.getLstEleves();
		assertNotNull(l);
		assertTrue(l.isEmpty());		
	}
	
	@Test
	void testGetEleve() throws Exception {
		Classe c = new Classe(nom);
		c.addEleve(e1);
		c.addEleve(e2);

		Eleve  e = c.getEleve(0);
		assertNotNull(e);
		assertEquals(e1, e);
		
		e = c.getEleve(1);
		assertNotNull(e);
		assertEquals(e2, e);
	}
	
	@Test
	void testGetListParent() {
		Classe c = new Classe(nom);
		c.addEleve(e1);
		
		List<Parent> l = c.getListParent();
		assertNotNull(l);
		assertFalse(l.isEmpty());
		assertEquals(1, l.size());
		
		Parent p = l.get(0);
		assertNotNull(p);
		assertEquals(p1, p);
	}


}
