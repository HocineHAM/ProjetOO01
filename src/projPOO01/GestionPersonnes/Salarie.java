package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.Services.Achat;

public class Salarie extends Personne implements IClient {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroSecu;
	private String salaire;

	/**
	 * Constructeur de la class Salarie
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ville
	 * @param codepostal
	 * @param numeroSecu
	 * @param salaire
	 */
	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String numeroSecu,
			String salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numeroSecu = numeroSecu;
		this.salaire = salaire;
		// TODO Auto-generated constructor stub
	}

	public Salarie() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	public String getNumeroSecu() {
		return numeroSecu;
	}

	/**
	 * 
	 * @param numeroSecu
	 */
	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	/**
	 * 
	 * @return salaire
	 */
	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	@Override
	public void achete(List<Achat> listA) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return true
	 */
	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Salarie [numeroSecu=" + numeroSecu + ", salaire=" + salaire + ", getNumeroSecu()=" + getNumeroSecu()
				+ ", getSalaire()=" + getSalaire() + ", toString()=" + super.toString() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdresse()=" + getAdresse() + ", getVille()=" + getVille()
				+ ", getCodepostal()=" + getCodepostal() + ", getClass()=" + getClass() + "]";
	}

	/**
	 * Methode qui montre que le salarie est client
	 * 
	 * @return true
	 */
	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * methode qui verifie le bon format du salaire elle n'accepte pas les lettres
	 * 
	 * @param z
	 * @throws ErreurFormatSalaire
	 */
	public static void ctrlSalaire(String z) throws ErreurFormatSalaire {
		try {
			Double.valueOf(z);
		} catch (Exception e) {

			throw new ErreurFormatSalaire("Vous n'avez pas le droit de mettre des lettres");
		}

	}

	/**
	 * methode qui inpose 15 chiffres pour le numero de securite sociale
	 * 
	 * @param n
	 * @throws ErrNumSecu
	 */
	public static void ctrlNumSecu(String n) throws ErrNumSecu {
		if (n.length() != 15) {
			throw new ErrNumSecu("Le nombre de chiffre est different de 15!");
		}

	}

}
