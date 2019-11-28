package projPOO01.GestionPersonnes;

import java.util.List;

public class Salarie extends Personne implements IClient {

	private String numeroSecu;
	private String salaire;

	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String numeroSecu, String salaire) {
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
	public boolean testClient() {
		// TODO Auto-generated method stub
		return true;
	}

	

	


}
