package projPOO01.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.GestionPersonnes.Patron;

public class TestPatron {
	
	private Patron p;
	private final String nom = "kkfkfkf";
	private final String prenom = "jfjfjfj";
	private final String adresse = "54 dfghj 54000";
	private final String ville = "Nancy";
	private final String codepostal = "574581";
	private final String numeroSecu = "111111111111111";
	private String salaire= "753159"; 
	@Before
	public void init() {
		
		p = new Patron(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);
		
	}
	@Test
	public void testCtrlSalaire() {
		assertNotNull(p);
		try {
		Double.valueOf(salaire);
		}catch(Exception e){
			
			assertThat(e.getMessage(), is("Vous n'avez pas le droit de mettre des lettres"));
		}
		
	}

	@Test
	public void testCtrlNumSecu() {
		
		try {
			Patron.ctrlNumSecu(numeroSecu);
		} catch (ErrNumSecu e) {
			// TODO Auto-generated catch block
		assertThat(e.getMessage(), is ("Le nombre de chiffre est different de 15!"));
		}
		
	}

	@Test
	public void testPatron() {
		assertNotNull(p);
	}

	

}
