package projPOO01.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Salarie;


public class TestSalarie {
	//private final List<Achat> listA= new ArrayList<Achat>();
	private Salarie s;
	private final String nom = "Gaied";
	private final String prenom = "Bassel";
	private final String adresse = "chareh many tunisie";
	private final String ville = "Tunis";
	private final String codepostal = "57000";
	private final String numeroSecu = "12 9988888888 888";
	private final String salaire = "100000";

	@Before
	public void init() {
		s = new Salarie(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);
	}

	@Test
	public void testSalarie() {
		assertNotNull(s);
	}

	@Test
	public void testGetNumeroSecu() {
		assertEquals(numeroSecu, s.getNumeroSecu());
		this.testSetNumeroSecu();
	}

	@Test
	public void testSetNumeroSecu() {
		s.setNumeroSecu(numeroSecu);
		assertEquals(numeroSecu, s.getNumeroSecu());
	}

	@Test
	public void testGetSalaire() {
		assertEquals(salaire, s.getSalaire());
		this.testSetSalaire();
	}

	@Test
	public void testSetSalaire() {
		s.setSalaire(salaire);
		assertEquals(salaire, s.getSalaire());
	}

	@Test
	public void testAchete() {
	//assertArrayEquals(listA, s.achete(listA));
	}

	@Test
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testCtrlSalaire() {
		fail("Not yet implemented");
	}

	@Test
	public void testCtrlNumSecu() {
		fail("Not yet implemented");
	}

}
