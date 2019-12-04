package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.Services.Achat;

public class Salarie extends Personne implements IClient {

	private String numeroSecu;
	private String salaire;

	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String numeroSecu,
			String salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numeroSecu = numeroSecu;
		this.salaire = salaire;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroSecu() {
		return numeroSecu;
	}

	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

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

	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
		return true;
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

}
