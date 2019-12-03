package projPOO01.Services;

import java.util.Date;


public class Achat {

	private Date dateAchat = new Date();
	private String intitule;
	private int quantite;
	
	public Achat(Date dateAchat, String intitule, int quantite) {
		super();
		this.dateAchat = dateAchat;
		this.intitule = intitule;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Achat [dateAchat=" + dateAchat + ", intitule=" + intitule + ", quantite=" + quantite + "]";
	}
	

}
