package projPOO01.Services;

import java.util.Date;

public class Commande {

		private Date dateAchat = new Date();
		private String intitule;
		private int quantite;
		
		public Commande(Date dateAchat, String intitule, int quantite) {
			super();
			this.dateAchat = dateAchat;
			this.intitule = intitule;
			this.quantite = quantite;
		}

		@Override
		public String toString() {
			return "Commande [dateAchat=" + dateAchat + ", intitule=" + intitule + ", quantite=" + quantite + "]";
		}

	}

		// TODO Auto-generated constructor stub
	


