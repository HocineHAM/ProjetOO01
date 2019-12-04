package projPOO01.test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Personne;

public class TestPersonne {
	private Personne p;
	private final String nom = "Hammar";
	private final String prenom = "Hocine";
	private final String adresse = "8A rue de Bretagne";
	private final String ville = "Paris";
	private final String codepostal = "75000";

	@Before
	public void init() {
		p = new Personne(nom, prenom, adresse, ville, codepostal);
	}

	@Test
	public void testPersonne() {
	assertNotNull(p);
	}


	@Test
	public void testGetNom() {
		assertEquals(nom, p.getNom());
		this.testSetNom();
	}

	@Test
	public void testSetNom() {
		p.setNom(nom);
		assertEquals(nom, p.getNom());
	}

	@Test
	public void testGetPrenom() {
		assertEquals(prenom, p.getPrenom());
		this.testSetPrenom();
	}

	@Test
	public void testSetPrenom() {
		p.setPrenom(prenom);
		assertEquals(prenom, p.getPrenom());
	}

	@Test
	public void testGetAdresse() {
		assertEquals(adresse, p.getAdresse());
		this.testSetAdresse();
	}

	@Test
	public void testSetAdresse() {
		p.setAdresse(adresse);
		assertEquals(adresse, p.getAdresse());
	}

	@Test
	public void testGetVille() {
		assertEquals(ville, p.getVille());
		this.testSetVille();
	}

	@Test
	public void testSetVille() {
		p.setVille(ville);
		assertEquals(ville, p.getVille());
	}

	@Test
	public void testGetCodepostal() {
		assertEquals(codepostal, p.getCodepostal());
		this.testSetCodepostal();
	}

	@Test
	public void testSetCodepostal() {
		p.setCodepostal(codepostal);
		assertEquals(codepostal, p.getCodepostal());
	}

}
