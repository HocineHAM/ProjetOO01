package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Services.Achat;
import projPOO01.Services.Commande;

public class Fournisseur extends Personne implements IClient, IFournisseur {

	String numeroUnique;

	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal,
			String numeroUnique) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numeroUnique = numeroUnique;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroUnique() {
		return numeroUnique;
	}

	public void setNumeroUnique(String numeroUnique) {
		this.numeroUnique = numeroUnique;
	}

	@Override
	public void achete(List<Achat> listA) {
		System.out.println("Le fournisseur qui achete");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean paie() {
		System.out.println("Le fournisseur qui paie");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean livre() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void commande(List<Commande> c) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Fournisseur [numeroUnique=" + numeroUnique + ", getNumeroUnique()=" + getNumeroUnique()
				+ ", toString()=" + super.toString() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getAdresse()=" + getAdresse() + ", getVille()=" + getVille() + ", getCodepostal()="
				+ getCodepostal() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public boolean estClient() {

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estFournisseur() {
		// TODO Auto-generated method stub
		return true;
	}

}
