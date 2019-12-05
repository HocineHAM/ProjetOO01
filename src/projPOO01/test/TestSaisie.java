package projPOO01.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.Salarie;

public class TestSaisie {
	List<Fournisseur> lFournisseur = new ArrayList<Fournisseur>();
	List<Salarie> lSalarie = new ArrayList<Salarie>();
	List<Client> lClient = new ArrayList<Client>();

	private final String nom = "ertyui";
	private final String prenom = "ertyuioertyui";
	private final String adresse = "zertyuioertyui";
	private final String ville = "ertyuie";
	private final String codepostal = "ertyui";
	private String numeroSecu = "111111111111";
	private final String salaire = "745225851";
	
	Client client1 = new Client(nom, prenom, adresse, ville, codepostal, "124587");
	Client client2 = new Client(nom, prenom, adresse, ville, codepostal, "326598");
	Salarie salarie = new Salarie(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);
	Fournisseur fournisseur1 = new Fournisseur(nom, prenom, adresse, ville, codepostal, "487588888");
	Fournisseur fournisseur2 = new Fournisseur(nom, prenom, adresse, ville, codepostal, "415425");
	public void init() {

		lSalarie.add(salarie);
		lClient.add(client1);
		lClient.add(client2);
		lFournisseur.add(fournisseur1);
		lFournisseur.add(fournisseur2);
	}

	@Test
	public void testSaisieCSalarie() {

		assertNotNull(lSalarie);
		try {
			Salarie.ctrlNumSecu(numeroSecu);

		} catch (ErrNumSecu e) {
			assertThat(e.getMessage(), is("Le nombre de chiffre est different de 15!"));

		}

		try {
			Salarie.ctrlSalaire(salaire);
		} catch (ErreurFormatSalaire e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertThat(e.getMessage(), is("Vous n'avez pas le droit de mettre des lettres"));
		}

	}

	@Test
	public void testSaisieCClient() {
		assertNotNull(lClient);

	}

	@Test
	public void testSaisieCFournisseur() {
		assertNotNull(lFournisseur);
		assertFalse(fournisseur1.equals(fournisseur2));
	}

	@Test
	public void testChoisirClient() {
		assertNotNull(lClient);
		assertTrue(client1 instanceof IClient);
	}

}
