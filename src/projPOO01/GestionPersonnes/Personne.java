package projPOO01.GestionPersonnes;

import java.io.Serializable;

/**
 * @author Hocine HAMMAR
 * @version 1.0
 * 
 *
 */
public class Personne implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String codepostal;

	


/**
 * Constructeur de la classe Personne
 * @param nom
 * @param prenom
 * @param adresse
 * @param ville
 * @param codepostal
 */
	public Personne(String nom, String prenom, String adresse, String ville, String codepostal) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codepostal = codepostal;
	}


	public Personne() {
	// TODO Auto-generated constructor stub
}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom +
				", adresse=" + adresse + ", ville=" + ville
				+ ", codepostal=" + codepostal + "]";
	}


/**
 * 
 * @return nom
 */
	public String getNom() {
		return nom;
	}

/**
 * 
 * @param nom
 * @return nom
 */
	public void setNom(String nom) {
		this.nom = nom;
	}

/**
 * 
 * @return prenom
 */
	public String getPrenom() {
		return prenom;
	}

/**
 * 
 * @return prenom
 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

/**
 * 
 * @return adresse
 */
	public String getAdresse() {
		return adresse;
	}

/**
 * 
 * @param adresse
 * @return adresse
 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

/**
 * 
 * @return ville
 */
	public String getVille() {
		return ville;
	}

/**
 * 
 * @return ville
 */
	public void setVille(String ville) {
		this.ville = ville;
	}

/**
 * 
 * @return codepostal
 */
	public String getCodepostal() {
		return codepostal;
	}

/**
 * 
 * @param codepostal
 */
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	
}
