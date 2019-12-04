package projPOO01.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Client;
import projPOO01.Services.Achat;

public class TestClient {
	
	Client c;
	private final String nom = "rtyui";
	private final String prenom = "rtyui";
	private final String adresse = "ertyuio";
	private final String ville = "sqdlmjhsd";
	private final String codepostal = "kjsdkjs";
	private final String numeroUnique = "oiqshdoihsqdo";
	private boolean b = true;
	private boolean d = false;
	
	private List<Achat> a = new ArrayList<Achat>();
	private Date dateAchat = new Date();
	Achat achat = new Achat(dateAchat, "pc", 2);
	Achat achat1 = new Achat(dateAchat, "telephone", 8);
	
	@Before
	public void init() {
		
		c = new Client(nom, prenom, adresse, ville, codepostal, numeroUnique);
		a.add(achat);
		a.add(achat1);

	}

	@Test
	public void testGetNumeroUnique() {
		assertEquals(numeroUnique, c.getNumeroUnique());
		this.testSetNumeroUnique();
	}

	@Test
	public void testSetNumeroUnique() {
		c.setNumeroUnique(numeroUnique);
		assertEquals(numeroUnique, c.getNumeroUnique());
	}

	@Test
	public void testClient() {
		assertNotNull(c);
	}

	@Test
	public void testLivre() {
		fail("Not yet implemented");
	}

	@Test
	public void testCommande() {
		fail("Not yet implemented");
	}

//	@Test
//	public void testAchete() {
//		c.achete(a);
//		assertEquals(a, c.getListAchat());
//	}

	@Test
	public void testPaie() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstClient() {
	assertEquals(b, c.estClient());
	}

	@Test
	public void testGetListAchat() {
		fail("Not yet implemented");
	}

	

	@Test
	public void testEstFournisseur() {
		assertEquals(d, c.estFournisseur());
	}

}
