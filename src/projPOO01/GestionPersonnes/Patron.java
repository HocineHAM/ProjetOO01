package projPOO01.GestionPersonnes;



import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;

public class Patron extends Salarie implements IPatron {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Patron(String nom, String prenom, String adresse, String ville, String codepostal, String numeroSecu,
			String salaire) {
		super(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);
		// TODO Auto-generated constructor stub
	}

	
	public Patron() {
		this("", "", "", "", "", "", "");
		// TODO Auto-generated constructor stub
	}


	@Override
	public void embauche() {
		// TODO Auto-generated method stub

	}

	@Override
	public void licencie() {
		// TODO Auto-generated method stub

	}

	@Override
	public void paiesalarie() {
		// TODO Auto-generated method stub

	}

	public static void ctrlSalaire(String z) throws ErreurFormatSalaire {
		try {
			Double.valueOf(z);
		} catch (Exception e) {

			throw new ErreurFormatSalaire("Vous n'avez pas le droit de mettre des lettres");
		}

	}

	public static void ctrlNumSecu(String n) throws ErrNumSecu {
		if (n.length() != 15) {
			throw new ErrNumSecu("Le nombre de chiffre est different de 15!");
		}

	}

	@Override
	public String toString() {
		return "Patron [getNumeroSecu()=" + getNumeroSecu() + ", getSalaire()=" + getSalaire() + ", paie()=" + paie()
				+ ", toString()=" + super.toString() + ", estClient()=" + estClient() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdresse()=" + getAdresse() + ", getVille()=" + getVille()
				+ ", getCodepostal()=" + getCodepostal() + "]";
	}

	

}
