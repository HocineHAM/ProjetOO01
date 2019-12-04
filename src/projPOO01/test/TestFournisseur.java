package projPOO01.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import projPOO01.Services.Achat;
import projPOO01.GestionPersonnes.Fournisseur;

public class TestFournisseur {

	private Date dateAchat = new Date();

	List<Achat> la = new ArrayList<Achat>();
	Achat achat = new Achat(dateAchat, "pc", 2);
	Achat achat1 = new Achat(dateAchat, "telephone", 8);
	Achat achat2 = new Achat(dateAchat, "imprim", 5);

	Fournisseur f;
	private final String nom = "edrserz";
	private final String prenom = "ertyui";
	private final String adresse = "rtyuiop";
	private final String ville = "ertyuiokjnbv";
	private final String codepostal = "ertyuifghjkl";
	private final String numeroUnique = "1457842";
	private boolean d = false;
	private boolean e = true;

	@Before
	public void init() {
		la.add(achat);
		la.add(achat1);
		la.add(achat2);
		f = new Fournisseur(nom, prenom, adresse, ville, codepostal, numeroUnique);
	}

	@Test
	public void testFournisseur() {
		assertNotNull(f);
	}

	@Test
	public void testGetNumeroUnique() {
		assertEquals(numeroUnique, f.getNumeroUnique());
		this.testSetNumeroUnique();
	}

	@Test
	public void testSetNumeroUnique() {
		f.setNumeroUnique(numeroUnique);
		assertEquals(numeroUnique, f.getNumeroUnique());
	}

	@Test
	public void testAchete() {
		f.achete(la);
		assertEquals(la, f.getListAchat());
	}

	@Test
	public void testPaie() {
		
	}

	@Test
	public void testLivre() {
		fail("Not yet implemented");
	}

	@Test
	public void testCommande() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
		assertEquals(d, f.estClient());
	}

	@Test
	public void testEstFournisseur() {
		assertEquals(e, f.estFournisseur());
	}

}
