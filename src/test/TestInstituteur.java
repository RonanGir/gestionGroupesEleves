package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entite.Instituteur;

class TestInstituteur {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Duchemin";
		prenom = "Remi";
		adresse = "31 impasse Bacot 35000 Rennes";
		ddn = sdf.parse("20/05/2010");
	}

	@Test
	void testConstructorUsingFields() {
		Instituteur i = new Instituteur(nom, prenom, adresse, ddn);

		assertNotNull(i);
		assertNotNull(i.getNom());
		assertNotNull(i.getPrenom());
		assertNotNull(i.getAdresse());
		assertNotNull(i.getDdn());

		assertEquals(nom, i.getNom());
		assertEquals(prenom, i.getPrenom());
		assertEquals(adresse, i.getAdresse());
		assertEquals(ddn, i.getDdn());
	}

}
