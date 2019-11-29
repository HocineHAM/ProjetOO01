package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Services.Commande;

public interface IFournisseur {
	
	public boolean livre();
	public void commande(List<Commande> c);
	public boolean estFournisseur();

}
