package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entite.Eleve;
import entite.Parent;

class TestEleve {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	private Parent referent;

	@BeforeEach
	void setUp() throws ParseException {
		nom      = "Duchemin";
		prenom   = "Remi";
		adresse  = "31 impasse Bacot 35000 Rennes";
		ddn      = sdf.parse("20/05/2010");
		referent = new Parent("Duchemin", "Jeanne", "31 impasse Bacot 35000 Rennes", sdf.parse("20/05/1980"));
	}

	@Test
	void testConstructorUsingFields() {
		Eleve e = new Eleve(nom, prenom, adresse, ddn);
		e.setReferent(referent);

		assertNotNull(e);
		assertNotNull(e.getNom());
		assertNotNull(e.getPrenom());
		assertNotNull(e.getAdresse());
		assertNotNull(e.getDdn());
		assertNotNull(e.getReferent());

		assertEquals(nom, e.getNom());
		assertEquals(prenom, e.getPrenom());
		assertEquals(adresse, e.getAdresse());
		assertEquals(ddn, e.getDdn());
		assertEquals(referent, e.getReferent());
		
	}

}
