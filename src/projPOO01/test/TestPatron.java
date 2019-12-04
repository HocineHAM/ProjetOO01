package projPOO01.test;

import static org.junit.Assert.*;


import org.junit.Test;

import projPOO01.GestionPersonnes.Patron;

public class TestPatron {
	
	private Patron p;
	private final String nom = "kkfkfkf";
	private final String prenom = "jfjfjfj";
	private final String adresse = "54 dfghj 54000";
	private final String ville = "Nancy";
	private final String codepostal = "574581";
	private final String numeroSecu = "75 3215987415 654";
	private String salaire= "753159"; 
	public void init() {
		
		p = new Patron(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);
		
	}
	@Test
	public void testCtrlSalaire() {
		fail("Not yet implemented");
	}

	@Test
	public void testCtrlNumSecu() {
		
	}

	@Test
	public void testPatron() {
		assertNotNull(p);
	}

	@Test
	public void testEmbauche() {
		fail("Not yet implemented");
	}

	@Test
	public void testLicencie() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaiesalarie() {
		fail("Not yet implemented");
	}

}
