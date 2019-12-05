package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Services.Achat;
import projPOO01.Services.Commande;

/**
 * 
 * @author Hocine HAMMAR
 * @version 1.0
 *
 */
public class Fournisseur extends Personne implements IClient, IFournisseur {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Achat> ListAchat;

	public List<Achat> getListAchat() {
		return ListAchat;
	}

	/**
	 * 
	 * @param listAchat
	 * 
	 */
	public void setListAchat(List<Achat> listAchat) {
		ListAchat = listAchat;
	}

	/**
	 * 
	 * @param ListCommande
	 */
	public List<Commande> getListCommande() {
		return ListCommande;
	}

	/**
	 * 
	 * @param listCommande
	 */
	public void setListCommande(List<Commande> listCommande) {
		ListCommande = listCommande;
	}

	/**
	 * @param listCommande
	 */
	private List<Commande> ListCommande;
	String numeroUnique;

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ville
	 * @param codepostal
	 * @param numeroUnique
	 */
	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal,
			String numeroUnique) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numeroUnique = numeroUnique;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return numero unique
	 */
	public String getNumeroUnique() {
		return numeroUnique;
	}

	/**
	 * 
	 * @param numero unique
	 */
	public void setNumeroUnique(String numeroUnique) {
		this.numeroUnique = numeroUnique;
	}

	/**
	 * param liste achat
	 */
	@Override
	public void achete(List<Achat> ListAchat) {
		// this.ListAchat = listA;
		System.out.println("Le fournisseur qui achete");
		// TODO Auto-generated method stub

	}
/**
 * Methode pour montrer que c'est le fournisseur qui paie
 * @return true
 */
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
/**
 * Methode pour montrer que le fournisseur n'est pas client
 * 
 */
	@Override
	public boolean estClient() {

		// TODO Auto-generated method stub
		return false;
	}

	
	/**
	 * Methode pour montrer que le fournisseur est bien fournisseur
	 * 
	 */
	@Override
	public boolean estFournisseur() {
		// TODO Auto-generated method stub
		return true;
	}

}
