package projPOO01.GestionPersonnes;

import java.util.List;

public class Client extends Personne implements IFournisseur, IClient {

	private String numeroUnique;

	public String getNumeroUnique() {
		return numeroUnique;
	}

	public void setNumeroUnique(String numeroUnique) {
		this.numeroUnique = numeroUnique;
	}

	public Client(String nom, String prenom, String adresse, String ville, String codepostal, String numeroUnique) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numeroUnique = numeroUnique;
		// TODO Auto-generated constructor stub
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
	public void achete(List<Achat> listA) {
		// TODO Auto-generated method stub
		System.out.println("Le client qui achete");
	}

	@Override
	public boolean paie() {
		boolean paiement = true;
		System.out.println("Le client qui paie");
		// TODO Auto-generated method stub
		return paiement;
	}

	@Override
	public String toString() {
		return "Client [numeroUnique=" + numeroUnique + ", getNumeroUnique()=" + getNumeroUnique() + ", toString()="
				+ super.toString() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getAdresse()="
				+ getAdresse() + ", getVille()=" + getVille() + ", getCodepostal()=" + getCodepostal() + ", getClass()="
				+ getClass() + "]";
	}

	@Override
	public boolean testClient() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean testFournisseur() {
		// TODO Auto-generated method stub
		return false;
	}

}
